package Configuration;

import static MainItc.ITC.LOG;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edatabit
 */
public class Config {

    private static Connection conSqlite = null;
    // Table snmp:=>                ver: pro: name: pass:
    public static String[] Snmp;
    // List station for connection    Table station:=>  name: ip: port: user: pass:
    public static String[][] Stations;
    public static String[] StationsName;
    public static Integer indexConnection = -1;
    public static String ProgramLicense = "";

    /**
     * StartConDB: uruchamia JDBC dla połączenia sqlite z plikiem
     * konfiguracyjnym.
     *
     */
    private static void StartConDB() {

        String confFile = "jdbc:sqlite:" + SysConfig.confDir + "itc.conf_db";

        try {
            Class.forName("org.sqlite.JDBC");
            conSqlite = DriverManager.getConnection(confFile);

        } catch (Exception e) {
            LOG.setLog(3, "StartConDB:" + e);
            conSqlite = null;
        }
    }

    private static void StopConDB() {
        try {
            conSqlite.close();
            conSqlite = null;
        } catch (Exception e) {
            LOG.setLog(3, "StopConDB:" + e);
        }
    }

    public static void WriteStations(DefaultTableModel dtm) {

        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Config.Stations = new String[nRow][nCol];
        Config.StationsName = new String[nRow];
        for (int i = 0; i < nRow; i++) {
            Config.StationsName[i] = dtm.getValueAt(i, 0).toString();
            for (int j = 0; j < nCol; j++) {
                Config.Stations[i][j] = dtm.getValueAt(i, j).toString();
            }
        };

        //int nRow = Stations.length;
        StartConDB();
        try {
            String sql = "DELETE FROM _Stations";
            PreparedStatement st = conSqlite.prepareStatement(sql);
            st.executeUpdate();

            sql = "DELETE FROM sqlite_sequence WHERE name='_Stations'";
            st = conSqlite.prepareStatement(sql);
            st.executeUpdate();

            for (int i = 0; i < nRow; i++) {
                sql = "INSERT INTO _Stations(name,ipadress,port,user,password, wport) VALUES(?,?,?,?,?,?)";
                st = conSqlite.prepareStatement(sql);
                st.setString(1, Stations[i][0]);
                st.setString(2, Stations[i][1]);
                st.setString(3, Stations[i][2]);
                st.setString(4, Stations[i][3]);
                st.setString(5, Stations[i][4]);
                st.setString(6, Stations[i][5]);
                st.executeUpdate();
            };

        } catch (Exception e) {
            LOG.setLog(3, "WriteStations: " + e);
        }

        StopConDB();
    }

    public static void ReadConfig() {

        StartConDB();

        ReadSnmp();
        ReadStations();
        ReadLicenses();
        ReadStatusView();
        Communication.ComData.tIDStation = ReadTable("IDStation");
        Communication.ComData.tSummary = ReadTable4("Summary");
        Communication.ComData.tAlarms = ReadTable("Alarms");
        Communication.ComData.tMTUAlarms = ReadTable("MTUAlarms");
        Communication.ComData.tCMUAlarms = ReadTable("CMUAlarms");
        Communication.ComData.tTXUAlarms = ReadTable("TXUAlarms");
        Communication.ComData.tRXUAlarms = ReadTable("RXUAlarms");
        Communication.ComData.tHPAAlarms = ReadTable("HPAAlarms");
        Communication.ComData.tRCUAlarms = ReadTable("RCUAlarms");
        Communication.ComData.tPSUAlarms = ReadTable("PSUAlarms");
        Communication.ComData.tVoltage = ReadTable("Voltage");
        Communication.ComData.tPulseShape = ReadTable4("PulseShape");
        Communication.ComData.tLastPoll = ReadTable("LastPoll");
        Communication.ComData.tGeneralStatus = ReadTable("GeneralStatus");
        Communication.ComData.tMTUStatus = ReadTable4("MTUStatus");
        Communication.ComData.tTXUStatus = ReadTable2("TXUStatus");
        Communication.ComData.tRXUStatus = ReadTable("RXUStatus");
        Communication.ComData.tHPAStatus = ReadTable2("HPAStatus");

        Communication.ComData.tSummaryThreshold = ReadThreshold("SummaryThreshold");
        Communication.ComData.tVoltageThreshold = ReadThreshold("VoltageThreshold");
        Communication.ComData.tPulseShapeThreshold = ReadThreshold("PulseShapeThreshold");
        Communication.ComData.tMTUThreshold = ReadThreshold("MTUThreshold");
        Communication.ComData.tHPAThreshold = ReadThreshold("HPAThreshold");
        Communication.ComData.tTXUThreshold = ReadThreshold("TXUThreshold");

        Communication.ComData.tMRTConfig = ReadTableConf("MRTConfig");
        Communication.ComData.tRCUConfig = ReadTableConf("RCUConfig");
        Communication.ComData.tResetConfig = ReadTableConf("ResetConfig");
        Communication.ComData.tInstConfig = ReadTableConf("InstConfig");
        Communication.ComData.tNominalValues = new String[8];

        StopConDB();

    }

    private static void ReadSnmp() {
        try {
            String sql = "SELECT * FROM _Snmp";
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            rs.next();

            Snmp = new String[4];

            Snmp[0] = rs.getString("version");
            Snmp[1] = rs.getString("proto");
            Snmp[2] = rs.getString("name");
            Snmp[3] = rs.getString("pass");

            st.close();
            rs.close();

        } catch (Exception e) {
            LOG.setLog(3, "ReadSNMP: " + e);
        }
    }

    private static void ReadStations() {
        int i = 0;
        try {
            String sql = "select count(1) as NR from _Stations";
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            i = rs.getInt("NR");

            Stations = new String[i][6];
            StationsName = new String[i];

            st.close();
            rs.close();

            sql = "SELECT * FROM _Stations";
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            i = 0;
            while (rs.next()) {

                Stations[i][0] = rs.getString("name");
                Stations[i][1] = rs.getString("ipadress");
                Stations[i][2] = rs.getString("port");
                Stations[i][3] = rs.getString("user");
                Stations[i][4] = rs.getString("password");
                Stations[i][5] = rs.getString("wport");
                
                StationsName[i] = rs.getString("name");
                i = i + 1;
            };
            st.close();
            rs.close();

        } catch (Exception e) {
            LOG.setLog(3, "ReadStations: " + e);
        }
    }

    private static void ReadLicenses() {
        try {
            String sql = "SELECT * FROM _Licenses";
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            rs.next();
            ProgramLicense = rs.getString("license");
            st.close();
            rs.close();

        } catch (Exception e) {
            LOG.setLog(3, "ReadLicenses: " + e);
        }
    }

    private static void ReadStatusView() {
        int i = 0;
        try {
            String sql = "select count(1) as NR from StatusView";
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            i = rs.getInt("NR");
            Communication.ComData.tStatusView = new String[i][5];

            st.close();
            rs.close();

            sql = "SELECT * FROM StatusView";
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            i = 0;
            while (rs.next()) {

                Communication.ComData.tStatusView[i][0] = rs.getString("oid");
                Communication.ComData.tStatusView[i][1] = rs.getString("dana");
                Communication.ComData.tStatusView[i][2] = rs.getString("status");
                Communication.ComData.tStatusView[i][3] = rs.getString("stan");
                Communication.ComData.tStatusView[i][4] = rs.getString("opis");

                i = i + 1;
            };
            st.close();
            rs.close();

        } catch (Exception e) {
            LOG.setLog(3, "ReadStatusView:" + e);
        }
    }

    private static String[][] ReadTable(String name) {
        int i = 0;
        try {
            String sql = "select count(1) as NR from " + name;
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            i = rs.getInt("NR");
            String[][] table = new String[i][3];

            st.close();
            rs.close();

            sql = "SELECT * FROM " + name;
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            i = 0;
            while (rs.next()) {

                table[i][0] = rs.getString("oid");
                table[i][1] = rs.getString("dana");
                table[i][2] = rs.getString("status");
                i = i + 1;
            };
            st.close();
            rs.close();
            return table;

        } catch (Exception e) {
            LOG.setLog(3, "Read" + name + ": " + e);
        }
        return null;
    }

    private static String[][] ReadTableConf(String name) {
        int i = 0;
        try {
            String sql = "select count(1) as NR from " + name;
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            i = rs.getInt("NR");
            String[][] table = new String[i][4];

            st.close();
            rs.close();

            sql = "SELECT * FROM " + name;
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            i = 0;
            while (rs.next()) {

                table[i][0] = rs.getString("oid");
                table[i][1] = rs.getString("dana");
                table[i][2] = rs.getString("status");
                table[i][3] = rs.getString("shadow");
                i = i + 1;
            };
            st.close();
            rs.close();
            return table;

        } catch (Exception e) {
            LOG.setLog(3, "Read" + name + ": " + e);
        }
        return null;
    }

    private static String[][] ReadTable2(String name) {
        int i = 0;
        try {
            String sql = "select count(1) as NR from " + name;
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            i = rs.getInt("NR");
            String[][] table = new String[i][6];

            st.close();
            rs.close();

            sql = "SELECT * FROM " + name;
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            i = 0;
            while (rs.next()) {

                table[i][0] = rs.getString("oid");
                table[i][1] = rs.getString("dana");
                table[i][2] = rs.getString("status");
                table[i][3] = rs.getString("arg1");
                table[i][4] = rs.getString("arg2");
                table[i][5] = rs.getString("typ_limitu");
                i = i + 1;
            };
            st.close();
            rs.close();
            return table;

        } catch (Exception e) {
            LOG.setLog(3, "Read" + name + ": " + e);
        }
        return null;
    }

    private static String[][] ReadTable4(String name) {
        int i = 0;
        try {
            String sql = "select count(1) as NR from " + name;
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            i = rs.getInt("NR");
            String[][] table = new String[i][8];

            st.close();
            rs.close();

            sql = "SELECT * FROM " + name;
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            i = 0;
            while (rs.next()) {

                table[i][0] = rs.getString("oid");
                table[i][1] = rs.getString("dana");
                table[i][2] = rs.getString("status");
                table[i][3] = rs.getString("arg1");
                table[i][4] = rs.getString("arg2");
                table[i][5] = rs.getString("arg3");
                table[i][6] = rs.getString("arg4");
                table[i][7] = rs.getString("typ_limitu");
                i = i + 1;
            };
            st.close();
            rs.close();
            return table;

        } catch (Exception e) {
            LOG.setLog(3, "Read" + name + ": " + e);
        }
        return null;
    }

    private static String[][] ReadThreshold(String name) {
        int i = 0;
        try {
            String sql = "select count(1) as NR from " + name;
            PreparedStatement st = conSqlite.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            i = rs.getInt("NR");
            String[][] table = new String[i][2];

            st.close();
            rs.close();

            sql = "SELECT * FROM " + name;
            st = conSqlite.prepareStatement(sql);
            rs = st.executeQuery();

            i = 0;
            while (rs.next()) {

                table[i][0] = rs.getString("oid");
                table[i][1] = rs.getString("dana");

                i = i + 1;
            };
            st.close();
            rs.close();
            return table;

        } catch (Exception e) {
            LOG.setLog(3, "Read" + name + ": " + e);
        }
        return null;
    }

    

    public static void showSnmp() {
        System.out.println(Arrays.deepToString(Snmp));
    }

    public static void showStations() {
        System.out.println(Arrays.deepToString(Stations));
    }

    public static void showStatusView() {
        System.out.println(Arrays.deepToString(Communication.ComData.tStatusView));
    }

    public static void showAlarms() {
        System.out.println(Arrays.deepToString(Communication.ComData.tAlarms));
    }

    public static void showSummary() {
        System.out.println(Arrays.deepToString(Communication.ComData.tSummary));
    }

    public static void showIDStation() {
        System.out.println(Arrays.deepToString(Communication.ComData.tIDStation));
    }
}
