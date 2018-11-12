package Configuration;

import MainItc.ITC;
import static MainItc.ITC.LOG;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author edatabit
 */
public class SysConfig {

    public static String znak = "";
    public static String userDir = "";
    public static String confDir = "";
    public static String dataDir = "";
    public static String helpDir = "";
    public static String logDir = "";
    public static String iconFile = "";
    public static String SystemName = "";
    public static String SerialBIOS = "";
    public static String SerialSystem = "";
    public static String LicenseFor = "PAŻP PO";
    public static Integer IdSystem = 0;
    public static String IdProgram = "???";
    public static String IdLicense = "???";

    /**
     * <b>Opis idSystem(): Metoda t aspełnia dwie funkcje. Po pierwsze
     * identyfikuje system operacyjny ( do wyboru są: Windows, Linux/Unix, Mac
     * OS, i Solaris ). Po drugie w zależności od systemu ustawia znacznik
     * separatora w ścieżce ( "\" dla Windowsa i "/" dla reszty).</b>
     */
    private static void idSystem() {

        String OS = System.getProperty("os.name").toLowerCase();
        Integer i = 0;

        if (OS.indexOf("win") >= 0) {
            i = 1;
        };
        if (OS.indexOf("mac") >= 0) {
            i = 2;
        };
        if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0) {
            i = 3;
        };
        if (OS.indexOf("sunos") >= 0) {
            i = 4;
        };

        if (i == 1) { // Windoza
            znak = "\\";
        } else {
            znak = "/";
        }

        SystemName = OS;
        IdSystem = i;

        winSerial(); //tylko dla windozy!!!
    }

    public static void winSerial() {
        String s = "";
        String sw = "";
        int x = 0;

        try {
            Process p = Runtime.getRuntime().exec("wmic BIOS get SerialNumber");//dmidecode -t system
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            while ((s = stdInput.readLine()) != null) {
                if (!s.equals("")) {
                    if (x > 0) {
                        sw = sw + s;
                    }
                }
                x++;
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        SerialBIOS = sw;
        s = "";
        sw = "";
        x = 0;
        try {
            Process p = Runtime.getRuntime().exec("wmic OS get SerialNumber");//dmidecode -t system
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            while ((s = stdInput.readLine()) != null) {
                if (!s.equals("")) {
                    if (x > 0) {
                        sw = sw + s;
                    }
                }
                x++;
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        SerialSystem = sw;
    }

    /**
     * <b>Opis</b>: Ustawia podczas startu programu wszystkie niezbędne ścieżki
     * dla programu oraz pozycjonuje katalog roboczy.
     */
    public static void setPath() {

        try {
            idSystem();
            userDir = new java.io.File(".").getCanonicalPath();
            userDir = userDir + znak;
            iconFile = userDir + "PIC" + znak + "Flow_block.png";
            confDir = userDir + "CONF" + znak;
            dataDir = userDir + "DATA" + znak;
            logDir = userDir + "LOG" + znak;
            helpDir = userDir + "HELP" + znak;
        } catch (IOException ex) {
            System.out.println(ex);
            userDir = "";
        }

    }

    public static String getLogName() {
        String out = "";
        String s = "";
        String s1 = "";
        int m = 0;

        Calendar cal = new GregorianCalendar();

        m = cal.get(Calendar.MONTH);
        m = m + 1;
        if (m < 10) {
            s = "0" + Integer.toString(m);
        } else {
            s = Integer.toString(m);
        }
        m = cal.get(Calendar.DATE);
        if (m < 10) {
            s1 = "0" + Integer.toString(m);
        } else {
            s1 = Integer.toString(m);
        }
        s = logDir + s1 + "-" + s + "-" + Integer.toString(cal.get(Calendar.YEAR)) + ".log";
        return s;
    }

    public static String getBackupName(String name) {
        String out = "";
        String s = "";
        String s1 = "";
        int m = 0;

        Calendar cal = new GregorianCalendar();

        m = cal.get(Calendar.MONTH);
        m = m + 1;
        if (m < 10) {
            s = "0" + Integer.toString(m);
        } else {
            s = Integer.toString(m);
        }
        m = cal.get(Calendar.DATE);
        if (m < 10) {
            s1 = "0" + Integer.toString(m);
        } else {
            s1 = Integer.toString(m);
        }
        s1 = dataDir + s1 + "-" + s + "-" + Integer.toString(cal.get(Calendar.YEAR));

        File theDir = new File(s1);
        if (!theDir.exists()) {

            theDir.mkdir();

        }

        s = s1 + znak + name;

        return s;
    }

    public static String saveBackupFile(String type, String filename) {
        PrintWriter out = null;
        String dt = "";
        try {
            out = new PrintWriter(SysConfig.getBackupName(filename));
            dt = ITC.webData.getRemConfig(type);
            out.println(dt);

        } catch (FileNotFoundException ex) {
            LOG.setLog(3, "Backup - write file error: " + ex);
        } finally {
            out.close();
        }

        return dt;
    }

    public static String saveReportFile(String type, String filename) {
        PrintWriter out = null;
        String dt = "";
        try {
            out = new PrintWriter(SysConfig.getBackupName(filename));
            dt = ITC.webData.getRemReport(type);
            out.println(dt);

        } catch (FileNotFoundException ex) {
            LOG.setLog(3, "Report - write file error: " + ex);
        } finally {
            out.close();
        }

        return dt;
    }

    public static Boolean saveRemLog(int lenTab) {
        Boolean b = true;
        String eol = System.getProperty("line.separator");
        String s = eol + "Start date: " + ITC.webData.startDate + "    End date: " + ITC.webData.endDate + eol + eol;
        s = s + String.format("|%10s|", "Result") + String.format("%15s|", "Old") + String.format("%15s|", "New") + String.format("%11s|", "Date") + String.format("%9s|", "Time") + String.format("%7s|", "Module") + String.format("%8s|", "Orig") + String.format("%5s|", "Type") + String.format("%8s|", "User") + String.format("%30s|", "Parameter") + eol;
        s = s + "================================================================================================================================="+eol;
        for (int i = 0; i < lenTab; i++) {
            s = s + String.format("|%10s|", ITC.webData.LogEntries[i][0]) + String.format("%15s|", ITC.webData.LogEntries[i][1]) + String.format("%15s|", ITC.webData.LogEntries[i][2]) + String.format("%11s|", ITC.webData.LogEntries[i][3]) + String.format("%9s|", ITC.webData.LogEntries[i][4]) + String.format("%7s|", ITC.webData.LogEntries[i][5]) + String.format("%8s|", ITC.webData.LogEntries[i][7]) + String.format("%5s|", ITC.webData.LogEntries[i][8]) + String.format("%8s|", ITC.webData.LogEntries[i][9]) + String.format("%30s|", ITC.webData.LogEntries[i][6]) + eol;
        }
        s = s + "================================================================================================================================="+eol;
        try {
            PrintWriter writer = new PrintWriter(getBackupName("DME_"+ITC.webData.startDate + "_" + ITC.webData.endDate + ".log"), "UTF-8");
            writer.println(s);
            writer.close();

        } catch (FileNotFoundException ex) {
            LOG.setLog(3, "RemLog - write file error: " + ex);
            b = false;
        } catch (UnsupportedEncodingException ex) {
            LOG.setLog(3, "RemLog - write file error: " + ex);
            b = false;
        }

        return b;
    }
}
