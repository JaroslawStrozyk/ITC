/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainItc;

import static MainItc.ITC.LOG;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author edatabit
 */
public class License {

    public static int setCheckLic(String s) {
        int i = -1;
        if (s.equals("1971")) { // number of life
            LOG.setLog(1, "License \"service number\"...");
            i = 0;
        } else {
            /*if (checkLicense()) {
                LOG.setLog(1, "Set commercial license...");
                i = 1;
            };*/
            if (s.equals("1970")) {
                LOG.setLog(1, "Set commercial license...");
                i = 1;
            };
        }
        return i;
    }

    /**
     * Opis hashLic(String message, String algorithm):
     * 
     * @param message 
     * Ciąg do szyfrowania
     * @param algorithm
     * Identyfikastor algorytmu szyfrującego
     * @return
     * Wyjście zaszyfrowanego ciągu
     */
    public static String hashLic(String message, String algorithm) {

        try {
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            byte[] hashedBytes = digest.digest(message.getBytes("UTF-8"));
            message = convertByteArrayToLicString(hashedBytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            LOG.setLog(3, "hashLic: " + ex);
            //System.out.println(ex);
            message = "";
        }

        return message.toUpperCase();
    }
    /**
     * Opis convertByteArrayToHexString(byte[] arrayBytes):
     */
    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16).substring(1));

        }
        return stringBuffer.toString();
    }
    /**
    * Opis convertByteArrayToLicString(byte[] arrayBytes):
    */
    private static String convertByteArrayToLicString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16).substring(1));
            if (i == 3 || i == 7 || i == 11) {
                stringBuffer.append(" - ");
            }
        }
        return stringBuffer.toString();
    }    
    /**
     * Opis checkLicense():
     * 
     * @return 
     * wyjście ciągu string licencji
     */
    public static Boolean checkLicense() {
        return false;
    }    
}
