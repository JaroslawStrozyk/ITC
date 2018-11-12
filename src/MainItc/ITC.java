package MainItc;

import Windows.Summary;
import Windows.RemLogs;
import Windows.Main;
import Configuration.SysConfig;
import Configuration.Config;
import Communication.LogData;
import Communication.ComData;
import Communication.WebData;
import Windows.Backups;
import Windows.CMU_RCU;
import Windows.Status;
import Windows.DMEConfig;
import Windows.DMEReports;
import Windows.DMEReset;
import Windows.HPA_TXU;
import Windows.IDStation;
import Windows.MTU;
import Windows.PSU;
import Windows.RXU;
import Windows.Register;


/**
 *
 * @author edatabit
 */
public class ITC {

    /**
     * Global variables of the program
     */
    public static String ProgramName = "DME Integrated Technical Console.";
    public static String ProgramVersion = "01.00";
    public static String CompilationData = "04.06.2018r.";
    public static int trybPracy = 0; //0 - servis; 1 - klient

    public static Main mainWin;
    public static Summary sumWin;
    public static Status alarmsWin;
    public static DMEConfig dmeconfigWin;
    public static RemLogs logWin;
    public static ComData comData;
    public static WebData webData;
    public static LogData LOG;
    public static IDStation idsWin;
    public static MTU mtuWin;
    public static CMU_RCU cmurcuWin;
    public static HPA_TXU hpatxuWin;
    public static RXU rxuWin;
    public static PSU psuWin;
    public static Backups backUPS;
    public static DMEReports rapDME;
    public static DMEReset resDME;
    /**
     * 
     * @param args
     * Parametry wejsciowe programu - w naszym przypadku nie używane
     */
    public static void main(String[] args) {

        SysConfig.setPath();

        LOG = new LogData(SysConfig.getLogName()); 
        LOG.setLog(1, "Aplication start...");

        Config.ReadConfig();
        trybPracy = License.setCheckLic(Config.ProgramLicense);
        if (trybPracy >= 0) {
            
            LOG.setLog(1, "License ok...");
            // start danych
            comData = new ComData();
            webData = new WebData();

            // OKNO GŁÓWNE
            mainWin = new Main();
            mainWin.setVisible(true);

            sumWin = new Summary();
            sumWin.setVisible(false);

            alarmsWin = new Status();
            alarmsWin.setVisible(false);

            logWin = new RemLogs();
            logWin.setVisible(false);

            dmeconfigWin = new DMEConfig();
            dmeconfigWin.setVisible(false);

            mtuWin = new MTU();
            mtuWin.setVisible(false);

            cmurcuWin = new CMU_RCU();
            cmurcuWin.setVisible(false);

            hpatxuWin = new HPA_TXU();
            hpatxuWin.setVisible(false);

            rxuWin = new RXU();
            rxuWin.setVisible(false);

            psuWin = new PSU();
            psuWin.setVisible(false);
            
            idsWin = new IDStation();
            idsWin.setVisible(false);
            
            backUPS = new Backups();
            backUPS.setVisible(false);

            rapDME = new DMEReports();
            rapDME.setVisible(false);
            
            resDME = new DMEReset();
            resDME.setVisible(false);
            
            Czas timeLok = new Czas();

        } else {
            LOG.setLog(2, "License problem, start registered...");
            // REJESTRACJA LICENCJI !!!
            Register reg = new Register();
            reg.setVisible(true);
        }

    }

}
