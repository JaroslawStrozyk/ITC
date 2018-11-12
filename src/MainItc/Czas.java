package MainItc;

import static MainItc.ITC.LOG;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author edatabit
 */
public class Czas {

    private String aktualnyCzas;
    private String aktualnaData;
    private String aktualnyRok;

    public Czas() {
        ZegarUstaw();
    }

    public String podajCzas() {
        return aktualnyCzas;
    }

    public String podajDate() {
        return aktualnaData;
    }

    public String podajRok() {
        return aktualnyRok;
    }

    private void ustawCzas() {
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
        s = s1 + "." + s + "." + Integer.toString(cal.get(Calendar.YEAR));
        aktualnyRok = Integer.toString(cal.get(Calendar.YEAR));
        aktualnaData = s;

        // WYŚWIETLANIE GODZINY
        m = cal.get(Calendar.HOUR_OF_DAY);
        if (m < 10) {
            s = "0" + Integer.toString(m);
        } else {
            s = Integer.toString(m);
        }
        s1 = s;
        m = cal.get(Calendar.MINUTE);
        if (m < 10) {
            s = "0" + Integer.toString(m);
        } else {
            s = Integer.toString(m);
        }
        s1 = s1 + ":" + s;
        m = cal.get(Calendar.SECOND);
        if (m < 10) {
            s = "0" + Integer.toString(m);
        } else {
            s = Integer.toString(m);
        }
        s1 = s1 + ":" + s;
        aktualnyCzas = s1;
    }

    public void ZegarUstaw() {

        Thread clock = new Thread() {
            public void run() {
                LOG.setLog(1, "Thread time starting...");
                for (;;) {
                    ustawCzas();
                    // ================== WYJATEK ====================== //
                    ITC.mainWin.showTime.setText(aktualnyCzas);
                    ITC.mainWin.showData.setText(" [" + aktualnaData + "]");
                    
                    /*if(ITC.idsWin.isVisible()){
                        ITC.idsWin.showData();
                    }*/
                    //ITC.mainWin.getDataToShow();
                    // ================================================= //
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                        LOG.setLog(3, "Thread time problem: " + ex);
                    }
                }
            }
        };
        clock.start();

    }

}
