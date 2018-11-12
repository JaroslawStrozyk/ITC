/**
 * Konfiguracja Logger'y, Appender'y,Layout'y.
 * Poziomy:
 * FATAL: Poważne błędy powodujące przedwczesne zakończenie działania aplikacji;
 * ERROR: Błędy wykonania;
 * WARN: Przy użyciu przestarzałych komponentów, w sytuacjach niespodziewanych nie wpływających na wadliwe działanie;
 * INFO: W celu śledzenia wykonania;
 * DEBUG: Szczegółowe info. dotyczące przepływu w działaniu aplikacji, w celach diagnostycznych;
 * TRACE: Bardziej szczegółowe info;
 * ALL / OFF: Wszystkie poziomy / wyłączenie logów.
 *
 * PatternLayout:
 * %% - pojedynczy znak %
 * %c - kategoria zdarzenia
 * %C - nazwa klasy, z której został wysłany wpis
 * %d - data zdarzenia
 * %m - treść komunikatu
 * %n - separator linii
 * %p - priorytet zdarzenia
 * %r - liczba milisekund, które upłynęły od momentu uruchomienia aplikacji
 * %t - nazwa wątku, z którego został wysłany wpis
 * %x - kontekst diagnostyczny powiązany z wątkiem
 * %M - nazwa metody, z której został wysłany wpis !
 * %L - numer linii, z której pochodzi zdarzenie   !
 * %F - nazwa pliku, z którego pochodzi zdarzenie  !
 * %l – lokalizacja, z której został wysłany wpis  !
 *
 * HTMLLayout:
 */
package Communication;

import static MainItc.ITC.LOG;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LogData {

    private static Logger logger = null;
    private static Appender app = null;
    private static Layout lay = null;
    private static String pathLog = null;
    private static String[][] tableLog;
    private static String[][] tableRemLog;

    private static void confLog(String pathFile) {
        pathLog = pathFile;
        lay = new PatternLayout("%5p | %d{yyyy-MM-dd | HH:mm:ss} | %m %n"); //   [%rms]
        try {
            app = new FileAppender(lay, pathLog);
        } catch (IOException ex) {
            System.out.println("Proglem z plikiem logu !!!");
        }
        BasicConfigurator.configure(app);
        logger = Logger.getRootLogger();
    }

    public LogData(String pathFile) {
        confLog(pathFile);
    }

    public static void setLog(int level, String message) {
        switch (level) {
            case 0:
                logger.debug(message);
                break;
            case 1:
                logger.info(message);
                break;
            case 2:
                logger.warn(message);
                break;
            case 3:
                logger.error(message);
                break;
            case 4:
                logger.fatal(message);
                break;
            default:
                break;
        }
    }

    public static void readFileLog(String file) {
        int i = 0;

        try {
            i = (int) (long) Files.lines(Paths.get(file)).count();
            tableLog = new String[i][4];
            //System.out.println(i);

            BufferedReader br = new BufferedReader(new FileReader(new File(file)));

            String line = null;
            i = 0;
            while ((line = br.readLine()) != null) {
                tableLog[i][0] = line.split("\\|")[0].trim();
                tableLog[i][1] = line.split("\\|")[1].trim();
                tableLog[i][2] = line.split("\\|")[2].trim();
                tableLog[i][3] = line.split("\\|")[3].trim();
                i++;
            }

        } catch (IOException ex) {
            LOG.setLog(3, "Program log - open file problem...");
        }

    }

    public static void testTableLog() {
        for (int i = 0; i < tableLog.length; i++) {
            System.out.println("[" + tableLog[i][0] + "][" + tableLog[i][1] + "][" + tableLog[i][2] + "][" + tableLog[i][3] + "]");
        }
    }

    public static String[][] readTableLog() {
        return tableLog;
    }

    public static void initRemLog() {
        tableRemLog = new String[1][10];
    }

    public static String[][] readRemLog() {
        return tableRemLog;
    }
}
