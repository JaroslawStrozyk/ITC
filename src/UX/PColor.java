package UX;

import java.awt.Color;

/**
 *
 * @author edatabit
 */
public class PColor {

    public static Color setBackGround(String s) {
        int r = 0;
        int g = 0;
        int b = 0;
        if (s.equals("3")) { // czerwony
            r = 255;
            g = 70;
            b = 70;
        };
        if (s.equals("2")) { // czerwony
            r = 255;
            g = 70;
            b = 70;
        };
        if (s.equals("1")) { // żółty
            r = 255;
            g = 255;
            b = 70;
        };
        if (s.equals("0")) { // zielony
            r = 70;
            g = 255;
            b = 70;
        };
        if (s.equals("-1")) { //niebieski
            r = 70;
            g = 255;
            b = 255;
        };
        if (s.equals("-2")) { //szary - kolor aplikacji
            r = 240;
            g = 240;
            b = 240;
        };

        return new Color(r, g, b);
    }

}
