package Communication;

import MainItc.ITC;
import static MainItc.ITC.LOG;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author edatabit
 */
public class WebData {

    private static Thread uLogs;
    private static String UserName = "";
    private static String Password = "";
    private static String IPAddress = "";
    public static String IPPort = "";
    private static String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.84 Safari/537.36";
    private static Map<String, String> cookies;
    private static String TmpLogEntries[][];
    public static String LogEntries[][];
    public static String startDate;
    public static String endDate;
    public static int index;

    public WebData() {
        //
    }

    public void SettingLog(String IPAddress, String Port, String UserName, String Password, String WPort) {

        this.IPAddress = IPAddress;
        this.UserName = UserName;
        this.Password = Password;
        this.IPPort = WPort;
        this.startDate = "";
        this.endDate = "";
        //webThred();

    }

    public static void webLogin() {
        try {
            Connection.Response resp = Jsoup.connect("http://" + IPAddress + ":" + IPPort + "/login/manage/login?next=/login/manage")
                    .data("username", UserName)
                    .data("password", Password)
                    .data("login", "login")
                    .userAgent(userAgent)
                    .method(Connection.Method.POST)
                    .execute();
            cookies = resp.cookies();
            LOG.setLog(1, "Web Login success... ");
        } catch (IOException ex) {
            LOG.setLog(3, "Web Login problem: " + ex);
        }
    }

    public static void webLogout() {
        try {
            Jsoup.connect("http://" + IPAddress + ":" + IPPort + "/login/manage/login")
                    .cookies(cookies)
                    .post();
            LOG.setLog(1, "Web Logout success... ");
        } catch (IOException ex) {
            LOG.setLog(3, "Web Logout problem: " + ex);
        }
    }

    public static void getLogs() {
        try {
            Document doc = Jsoup.connect("http://" + IPAddress + ":" + IPPort + "/login/manage/Logs/Combined")
                    .cookies(cookies)
                    .data("date_start", startDate)
                    .data("date_end", endDate)
                    .data("submit", "Fetch Logs")
                    .post();
            Elements LogTable = doc.select("td.smallcourier");
            int rows = LogTable.size();

            TmpLogEntries = new String[rows][10];
            LogEntries = new String[rows][10];
            int loop = 0;
            for (Element row : LogTable) {
                int first = 0;
                int last = 0;
                for (int i = 0; i < 9; i++) {
                    last = row.text().indexOf("|", first + 1);
                    TmpLogEntries[loop][i] = row.text().substring(first, last - 1).replaceAll("\\s+", "");
                    first = last + 1;
                }
                TmpLogEntries[loop][9] = row.text().substring(first).replaceAll("\\s+", "");
                loop++;
            }

            TableAdjustment();

        } catch (IOException ex) {
            LOG.setLog(3, "getLogs problem: " + ex);
        }
    }

    private static void TableAdjustment() {
        int i = TmpLogEntries.length;
        for (int j = 0; j < i; j++) {
            LogEntries[j][0] = TmpLogEntries[j][9];
            LogEntries[j][1] = TmpLogEntries[j][7];
            LogEntries[j][2] = TmpLogEntries[j][8];
            LogEntries[j][3] = TmpLogEntries[j][0];
            LogEntries[j][4] = TmpLogEntries[j][1];
            LogEntries[j][5] = TmpLogEntries[j][2];
            LogEntries[j][6] = TmpLogEntries[j][6];
            LogEntries[j][7] = TmpLogEntries[j][3];
            LogEntries[j][8] = TmpLogEntries[j][4];
            LogEntries[j][9] = TmpLogEntries[j][5];
        }

    }

    public static void webThred() {
        index = 0;
        uLogs = new Thread() {
            public void run() {
                LOG.setLog(1, "Thread comm via WEB starting... ");
                while (true) {
                    switch (index) {
                        case 1:
                            LOG.setLog(1, "Start receive log form DME.");
                            ITC.logWin.MessageWindow.setText("Loading data, please wait...");
                            webLogin();
                            getLogs();
                            ITC.logWin.loadDataLog();
                            webLogout();
                            ITC.logWin.MessageWindow.setText("");
                            LOG.setLog(1, "End receive log form DME.");
                            index = 0;
                            break;
                        default:
                            index = 0;
                            break;
                    }

                    try {
                        sleep(500);
                    } catch (InterruptedException ex) {
                        LOG.setLog(3, "Thread comm problem: " + ex);
                    }
                }
            }
        };
        uLogs.start();
    }

    public static void collectLogFromDME() {

        index = 1;

    }

    public String getRemConfig(String adr) {
        //webLogin();
        String s = "";

        try {
            Connection.Response resp = Jsoup.connect("http://" + IPAddress + ":" + IPPort + "/login/manage/config/" + adr) //Save TXUA
                    .userAgent(userAgent)
                    .method(Connection.Method.POST)
                    .execute();
            s = resp.body();

        } catch (IOException ex) {
            LOG.setLog(3, "Web getRemConfig: " + ex);
        }
        //webLogout();
        return s;
    }

    public String getRemReport(String adr) {
        //webLogin();
        String s = "";

        try {
            Connection.Response resp = Jsoup.connect("http://" + IPAddress + ":" + IPPort + "/login/manage/config/" + adr) //Save TXUA
                    .userAgent(userAgent)
                    .method(Connection.Method.POST)
                    .execute();
            s = resp.body();

        } catch (IOException ex) {
            LOG.setLog(3, "Web getRemReport: " + ex);
        }
        //webLogout();
        return s;
    }
}
