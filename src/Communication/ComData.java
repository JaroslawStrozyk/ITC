package Communication;

import java.io.IOException;
import java.net.InetAddress;
import org.snmp4j.PDU;
import org.snmp4j.ScopedPDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.UserTarget;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.security.AuthSHA;
import org.snmp4j.security.SecurityLevel;
import org.snmp4j.security.SecurityModels;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.security.USM;
import org.snmp4j.security.UsmUser;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import Configuration.Config;
import MainItc.ITC;
import static MainItc.ITC.LOG;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.snmp4j.smi.Integer32;

/**
 *
 * @author edatabit
 */
public class ComData {

    private static String UserName = "";
    private static String Password = "";
    private static String IPAddress = "";
    private static int Port = 0;
    /**
     * Uchwyt wątku komunikacyjnego: Odbiór danych
     */
    private static Thread updateData;
    /**
     * Uchwyt wątku komunikacyjnego: Wysyłanie danych
     */
    //private static Thread sendData;
    public static int indexSend = 0;
    public static int indexBypass = 0;
    public static int indexReset = 0;
    public static String[][] MRTDataToSend;
    public static String[] RCUDataToSend;
    public static String[][] IdentDataToSend;
    public static String[] OffsetDataToSend;
    public static String[] MTUThresDataToSend;

    public static String[][] tIDStation;
    public static String[][] tStatusView;
    public static String[][] tAlarms;
    public static String[][] tMTUAlarms;
    public static String[][] tCMUAlarms;
    public static String[][] tRXUAlarms;
    public static String[][] tTXUAlarms;
    public static String[][] tHPAAlarms;
    public static String[][] tRCUAlarms;
    public static String[][] tPSUAlarms;
    public static String[][] tSummary;
    public static String[][] tVoltage;
    public static String[][] tPulseShape;
    public static String[][] tLastPoll;
    public static String[][] tGeneralStatus;
    public static String[][] tHPAStatus;
    public static String[][] tMTUStatus;
    public static String[][] tRXUStatus;
    public static String[][] tTXUStatus;
    public static String[][] tSummaryThreshold;
    public static String[][] tVoltageThreshold;
    public static String[][] tPulseShapeThreshold;
    public static String[][] tMTUThreshold;
    public static String[][] tHPAThreshold;
    public static String[][] tTXUThreshold;
    public static String[][] tMRTConfig;
    public static String[][] tRCUConfig;
    public static String[][] tResetConfig;
    public static String[][] tInstConfig;

    public static String[] tNominalValues;

    public final static int PRIM_SEC = 0;
    public final static int PRIM = 1;
    public final static int SEC = 2;

    private static String[] oidsToGetID;
    private static String[] oidsToGet;
    private static String[] oidsToGetSV;
    private static String[] oidsToGetAl;
    private static String[] oidsToGetMTUAl;
    private static String[] oidsToGetCMUAl;
    private static String[] oidsToGetHPAAl;
    private static String[] oidsToGetTXUAl;
    private static String[] oidsToGetRXUAl;
    private static String[] oidsToGetRCUAl;
    private static String[] oidsToGetPSUAl;
    private static String[] oidsToGetVoltage;
    private static String[] oidsToGetPulseShape;
    private static String[] oidsToGetLastPoll;
    private static String[] oidsToGetGeneralSt;
    private static String[] oidsToGetMTUSt;
    private static String[] oidsToGetHPASt;
    private static String[] oidsToGetTXUSt;
    private static String[] oidsToGetRXUSt;
    private static String[] oidsToGetMRTCo;
    private static String[] oidsToGetRCUCo;
    private static String[] oidsToGetInstCo;
    //
    private static String[] oidsToGetT;
    private static String[] oidsToGetVoltT;
    private static String[] oidsToGetPulseShapeT;
   private static String[] oidsToGetMTUT;
    private static String[] oidsToGetHPAT;
    private static String[] oidsToGetTXUT;
    //
    private static String[] oidsToGetMRTCoC;
    private static String[] oidsToGetRCUCoC;
    private static String[] oidsToGetInstCoC;
    //
    private static ResponseEvent respA;
    private static ResponseEvent respS;
    private static ResponseEvent respI;
    //
    private static UserTarget target;
    private static Snmp snmp;
    /**
     * Zmienna ConfDataSwitch odpowiada za jednorazowe pobieranie danych do okna
     * DMEConfig. Możliwe stany: 0 - stan spoczynku, dane nie są pobierane 1 -
     * stan aktywny, po jednorazowym pobraniu danych zmienna wraca do wartości
     * 0.
     */
    public static int ConfDataSwitch = 0;

    /**
     * Jednorazowe wysyłanie danych
     */
    public static int putDataDME = 0;

    /**
     * Konstruktor klasy, bardzo ważna sprawa w tej aplikacji :)
     */
    public ComData() {
        this.UserName = Config.Snmp[2];
        this.Password = Config.Snmp[3];
    }

    public static boolean testLAN(String ipAddress, int port) {
        Socket socket = null;
        boolean b = false;
        //String s = "";
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(ipAddress, port), 500);
            if (socket != null) {
                socket.close();
            };
            b = true;
        } catch (IOException e) {
            b = false;
        };
        return b;
    }

    ;

    public static String getTIDStation(int row, int col) {
        return tIDStation[row][col];
    }

    public static String getTAlarm(int row, int col) {
        return tAlarms[row][col];
    }

    public static String getTStatusView(int row, int col) {
        return tStatusView[row][col];
    }

    public static String getTSummary(int row, int col) {
        return tSummary[row][col];
    }

    public static String getTMTUAlarm(int row, int col) {
        return tMTUAlarms[row][col];
    }

    public static String getTCMUAlarm(int row, int col) {
        return tCMUAlarms[row][col];
    }

    public static String getTHPAAlarm(int row, int col) {
        return tHPAAlarms[row][col];
    }

    public static String getTTXUAlarm(int row, int col) {
        return tTXUAlarms[row][col];
    }

    public static String getTRXUAlarm(int row, int col) {
        return tRXUAlarms[row][col];
    }

    public static String getTRCUAlarm(int row, int col) {
        return tRCUAlarms[row][col];
    }

    public static String getTPSUAlarm(int row, int col) {
        return tPSUAlarms[row][col];
    }

    public static String getTVoltage(int row, int col) {
        return tVoltage[row][col];
    }

    public static String getTPulseShape(int row, int col) {
        return tPulseShape[row][col];
    }

    public static String getTLastPoll(int row, int col) {
        return tLastPoll[row][col];
    }

    public static String getTGeneralStatus(int row, int col) {
        return tGeneralStatus[row][col];
    }

    public static String getTMTUStatus(int row, int col) {
        return tMTUStatus[row][col];
    }

    public static String getTHPAStatus(int row, int col) {
        return tHPAStatus[row][col];
    }

    public static String getTRXUStatus(int row, int col) {
        return tRXUStatus[row][col];
    }

    public static String getTTXUStatus(int row, int col) {
        return tTXUStatus[row][col];
    }

    public static String getTMRTConfig(int row, int col) {
        return tMRTConfig[row][col];
    }

    public static String getTRCUConfig(int row, int col) {
        return tRCUConfig[row][col];
    }

    public static String getTResetConfig(int row, int col) {
        return tResetConfig[row][col];
    }

    public static String getTInstConfig(int row, int col) {
        return tInstConfig[row][col];
    }

    public static String getPulseShapeThresholdConfig(int row, int col) {
        return tPulseShapeThreshold[row][col];
    }

    public static String getMTUThresholdConfig(int row, int col) {
        return tMTUThreshold[row][col];
    }

    public static String getSummaryThresholdConfig(int row, int col) {
        return tSummaryThreshold[row][col];
    }

    /**
     *
     * Metody do komunikacji z urzadzeniem: SettingDME() [public] - ustawianie
     * parametrów komunikacyjnych, getOID() [private] - pobieranie danych w
     * formie tabeli collectDataFromDME() [public] - wywołanie wątku w którym
     * przygotowuje się zestaw OID do wysłania, wysyła i odbiera wyniki lądujące
     * w tabeli stopCollectDataFromDME() [public] - zatrzymanie wątku
     *
     * @param IPAddress Adres IP urządzenia
     * @param Port Port urządzenia
     * @param UserName Nazwa użytkownika
     * @param Password Hasdło użytkownika
     */
    public void SettingDME(String IPAddress, String Port, String UserName, String Password) {

        this.IPAddress = IPAddress;
        this.Port = Integer.parseInt(Port);

    }

    // ***************************** ODBIERANIE ********************************
    private static void ConnGetOID(){
        
        try {
            TransportMapping transport = new DefaultUdpTransportMapping();
            snmp = new Snmp(transport);
            USM usm = new USM(SecurityProtocols.getInstance(), new OctetString(MPv3.createLocalEngineID()), 0);
            SecurityModels.getInstance().addSecurityModel(usm);
            transport.listen();
            snmp.getUSM().addUser(new OctetString(UserName), new UsmUser(new OctetString(UserName), AuthSHA.ID, new OctetString(Password), null, null));

            target = new UserTarget();
            target.setAddress(new UdpAddress(InetAddress.getByName(IPAddress), Port));
            target.setRetries(5);    //0
            target.setTimeout(1000); //3000
            target.setVersion(SnmpConstants.version3);
            target.setSecurityLevel(SecurityLevel.AUTH_NOPRIV);
            target.setSecurityName(new OctetString(UserName));
            
        } catch (IOException ex) {
            LOG.setLog(3, "Communication error - settings: " + ex);
        }
    }
    
    private static ResponseEvent getOID(String[] tOID) {

        try {
            /*
            TransportMapping transport = new DefaultUdpTransportMapping();
            Snmp snmp = new Snmp(transport);
            USM usm = new USM(SecurityProtocols.getInstance(), new OctetString(MPv3.createLocalEngineID()), 0);
            SecurityModels.getInstance().addSecurityModel(usm);
            transport.listen();
            snmp.getUSM().addUser(new OctetString(UserName), new UsmUser(new OctetString(UserName), AuthSHA.ID, new OctetString(Password), null, null));

            UserTarget target = new UserTarget();
            target.setAddress(new UdpAddress(InetAddress.getByName(IPAddress), Port));
            target.setRetries(5);    //0
            target.setTimeout(1000); //3000
            target.setVersion(SnmpConstants.version3);
            target.setSecurityLevel(SecurityLevel.AUTH_NOPRIV);
            target.setSecurityName(new OctetString(UserName));
            */

            PDU pdu = new ScopedPDU();
            for (int i = 0; i < tOID.length; i++) {
                pdu.add(new VariableBinding(new OID(tOID[i])));
            }
            pdu.setType(PDU.GET);
            //ResponseEvent response = snmp.send(pdu, target);

            return snmp.send(pdu, target);
        } catch (IOException ex) {
            LOG.setLog(3, "Communication error - settings: " + ex);

            return null;
        }
    }

    private static String[] getOIDList(String[][] table) {
        String[] result = new String[table.length];
        for (int i = 0; i < table.length; i++) {
            result[i] = table[i][0];
        }

        return result;
    }

    private static void getSnmpAlarmResponse(String[] OIDList, String[][] table) throws Exception {
        respA = getOID(OIDList);
        //////////////////////sprawdzenie poprawności odpowiedzi ///////////
        if (respA == null) {
            //  System.out.println("Brak odpowiedzi z serwera SNMP");
            LOG.setLog(3, "SnmpAlarm - No response from the SNMP server");
        } else if (respA.getResponse().getErrorStatus() != PDU.noError) {
            // System.out.println("Blad komunikacji: " + resp.getResponse().getErrorStatusText() + " ,OID: " + table[resp.getResponse().getErrorIndex() - 1][0]);
            LOG.setLog(3, "SnmpAlarm - Communication error: " + respA.getResponse().getErrorStatusText() + " ,OID: " + table[respA.getResponse().getErrorIndex() - 1][0]);
        }
        ////////////////////////////////////////////////////////////////////
        for (int i = 0; i < OIDList.length; i++) {
            table[i][2] = respA.getResponse().get(i).getVariable().toString();
        }
    }

    private static void getSnmpStatusResponse(String[] OIDList, String[][] table) throws Exception {
        respS = getOID(OIDList);
        //////////////////////sprawdzenie poprawności odpowiedzi ///////////
        if (respS == null) {
            // System.out.println("Brak odpowiedzi z serwera SNMP");
            LOG.setLog(3, "SnmpStatus - No response from the SNMP server");
        } else if (respS.getResponse().getErrorStatus() != PDU.noError) {
            // System.out.println("Blad komunikacji: " + resp.getResponse().getErrorStatusText() + " ,OID: " + table[resp.getResponse().getErrorIndex() - 1][0]);
            LOG.setLog(3, "SnmpStatus - Communication error: " + respS.getResponse().getErrorStatusText() + " ,OID: " + table[respS.getResponse().getErrorIndex() - 1][0]);
        }
        ////////////////////////////////////////////////////////////////////
        for (int i = 0; i < OIDList.length; i++) {
            table[i][1] = respS.getResponse().get(i).getVariable().toString();
        }
    }

    private static void getSnmpIDStationResponse(String[] OIDList, String[][] table) throws Exception {
        respI = getOID(OIDList);
        //////////////////////sprawdzenie poprawności odpowiedzi ///////////
        if (respI == null) {
            // System.out.println("Brak odpowiedzi z serwera SNMP");
            LOG.setLog(3, "SnmpIDStation - No response from the SNMP server");
        } else if (respI.getResponse().getErrorStatus() != PDU.noError) {
            // System.out.println("Blad komunikacji: " + resp.getResponse().getErrorStatusText() + " ,OID: " + table[resp.getResponse().getErrorIndex() - 1][0]);
            LOG.setLog(3, "SnmpIDStation - Communication error: " + respI.getResponse().getErrorStatusText() + " ,OID: " + table[respI.getResponse().getErrorIndex() - 1][0]);
        }
        ////////////////////////////////////////////////////////////////////
        for (int i = 0; i < OIDList.length; i++) {
            table[i][2] = respI.getResponse().get(i).getVariable().toString();
        }
    }

    public static void collectDataFromDME() {

        updateData = new Thread() {
            public void run() {
                LOG.setLog(1, "Thread comm starting ...");
                ConnGetOID();
                ITC.mainWin.descriptions.setText("Loading thresholds ...");
                getThresholdsFromDME();
                getConfigFromDME();
                ITC.mainWin.descriptions.setText("Loading data ...");

                oidsToGetID = getOIDList(tIDStation);
                oidsToGet = getOIDList(tSummary);
                oidsToGetSV = getOIDList(tStatusView);
                oidsToGetAl = getOIDList(tAlarms);
                oidsToGetMTUAl = getOIDList(tMTUAlarms);
                oidsToGetCMUAl = getOIDList(tCMUAlarms);
                oidsToGetHPAAl = getOIDList(tHPAAlarms);
                oidsToGetTXUAl = getOIDList(tTXUAlarms);
                oidsToGetRXUAl = getOIDList(tRXUAlarms);
                oidsToGetRCUAl = getOIDList(tRCUAlarms);
                oidsToGetPSUAl = getOIDList(tPSUAlarms);
                oidsToGetVoltage = getOIDList(tVoltage);
                oidsToGetPulseShape = getOIDList(tPulseShape);
                oidsToGetLastPoll = getOIDList(tLastPoll);
                oidsToGetGeneralSt = getOIDList(tGeneralStatus);
                oidsToGetMTUSt = getOIDList(tMTUStatus);
                oidsToGetHPASt = getOIDList(tHPAStatus);
                oidsToGetTXUSt = getOIDList(tTXUStatus);
                oidsToGetRXUSt = getOIDList(tRXUStatus);
                oidsToGetMRTCo = getOIDList(tMRTConfig);
                oidsToGetRCUCo = getOIDList(tRCUConfig);
                oidsToGetInstCo = getOIDList(tInstConfig);
                // !!!!!!!!!!!!!!!!!!!!!!!!!
                //ConnGetOID();
                // !!!!!!!!!!!!!!!!!!!!!!!!!
                while (true) {

                    try {

                        getSnmpStatusResponse(oidsToGetSV, tStatusView);
                        convertOperatingStatusView();

                        getSnmpStatusResponse(oidsToGet, tSummary);
                        convertSummaryView();

                        getSnmpAlarmResponse(oidsToGetAl, tAlarms);
                        convertSystemAlarmsView();

                        getSnmpAlarmResponse(oidsToGetLastPoll, tLastPoll);
                        convertLastPollView();

                        if (ITC.idsWin != null) {
                            if (ITC.idsWin.isVisible() == true) {

                                getSnmpIDStationResponse(oidsToGetID, tIDStation);
                                convertIDStationView();
                                ITC.idsWin.MessageWindow.setText("");
                                ITC.idsWin.displayStatus(1);
                            }
                        }

                        if (ITC.mtuWin != null) {
                            if (ITC.mtuWin.isVisible() == true) {
                                getSnmpAlarmResponse(oidsToGetMTUAl, tMTUAlarms);
                                convertMTUAlarmsView();
                                ITC.mtuWin.MessageWindow.setText("");
                            }
                        }

                        if (ITC.cmurcuWin != null) {
                            if (ITC.cmurcuWin.isVisible() == true) {
                                getSnmpAlarmResponse(oidsToGetCMUAl, tCMUAlarms);
                                convertCMUAlarmsView();
                                getSnmpAlarmResponse(oidsToGetRCUAl, tRCUAlarms);
                                convertRCUAlarmsView();
                                ITC.cmurcuWin.MessageWindow.setText("");
                            }
                        }

                        if (ITC.hpatxuWin != null) {
                            if (ITC.hpatxuWin.isVisible() == true) {
                                getSnmpAlarmResponse(oidsToGetHPAAl, tHPAAlarms);
                                convertHPAAlarmsView();
                                getSnmpAlarmResponse(oidsToGetTXUAl, tTXUAlarms);
                                convertTXUAlarmsView();
                                ITC.hpatxuWin.MessageWindow.setText("");
                            }
                        }

                        if (ITC.rxuWin != null) {
                            if (ITC.rxuWin.isVisible() == true) {
                                getSnmpAlarmResponse(oidsToGetRXUAl, tRXUAlarms);
                                convertRXUAlarmsView();
                                ITC.rxuWin.MessageWindow.setText("");
                            }
                        }

                        if (ITC.psuWin != null) {
                            if (ITC.psuWin.isVisible() == true) {
                                getSnmpAlarmResponse(oidsToGetPSUAl, tPSUAlarms);
                                convertPSUAlarmsView();
                                ITC.psuWin.MessageWindow.setText("");
                            }
                        }

                        if (ITC.alarmsWin != null) {
                            if (MainItc.ITC.alarmsWin.isVisible()) {

                                if (MainItc.ITC.alarmsWin.TabIndex == 1) {
                                    getSnmpStatusResponse(oidsToGetPulseShape, tPulseShape);
                                    convertPulseShapeView();
                                }

                                if (MainItc.ITC.alarmsWin.TabIndex == 2) {
                                    getSnmpStatusResponse(oidsToGetMTUSt, tMTUStatus);
                                    convertMTUStatusView();
                                }

                                if (MainItc.ITC.alarmsWin.TabIndex == 3) {
                                    getSnmpStatusResponse(oidsToGetHPASt, tHPAStatus);
                                    convertHPAStatusView();
                                    getSnmpStatusResponse(oidsToGetTXUSt, tTXUStatus);
                                    convertTXUStatusView();
                                }

                                if (MainItc.ITC.alarmsWin.TabIndex == 4) {
                                    getSnmpStatusResponse(oidsToGetRXUSt, tRXUStatus);
                                    convertRXUStatusView();
                                }

                                if (MainItc.ITC.alarmsWin.TabIndex == 5) {
                                    getSnmpStatusResponse(oidsToGetVoltage, tVoltage);
                                    convertVoltageView();
                                }

                                ITC.alarmsWin.MessageWindow.setText("");
                            }
                        }

                        if (ITC.dmeconfigWin != null) {
                            if (MainItc.ITC.dmeconfigWin.isVisible()) {
                                if (ConfDataSwitch == 0) {
                                    ITC.dmeconfigWin.MessageWindow.setText("Loading data, please wait...");

                                    getSnmpStatusResponse(oidsToGetMRTCo, tMRTConfig);
                                    convertMRTConfigView();
                                    getSnmpStatusResponse(oidsToGetInstCo, tInstConfig);
                                    convertInstConfigView();
                                    getSnmpStatusResponse(oidsToGetRCUCo, tRCUConfig);
                                    convertRCUConfigView();

                                    ITC.dmeconfigWin.MessageWindow.setText("");
                                    ConfDataSwitch = 1;
                                    ITC.dmeconfigWin.showData();
                                }
                            } else {
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                ConfDataSwitch = 0;
                            }
                        }

                        // Wysyłanie komend
                        switch (indexSend) {
                            case 0:
                                break;
                            case 1:
                                onoffTXPA();
                                indexSend = 0;
                                break;
                            case 2:
                                onoffTXPB();
                                indexSend = 0;
                                break;
                            case 31:
                                changeOver(1);
                                indexSend = 0;
                                break;
                            case 32:
                                changeOver(2);
                                indexSend = 0;
                                break;
                            case 4:
                                setTXMain("TXP A");
                                indexSend = 0;
                                break;
                            case 5:
                                setTXMain("TXP B");
                                indexSend = 0;
                                break;
                            case 6:
                                setBypass(indexBypass);
                                indexSend = 0;
                                break;
                            case 7:
                                resetCount();
                                indexSend = 0;
                                break;
                            case 8:
                                resetEqu(indexReset);
                                indexSend = 0;
                                break;
                            case 9:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyGeneralConfig(false);
                                indexSend = 0;
                                getConfigFromDME();
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 10:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyGeneralConfig(true);
                                indexSend = 0;
                                getConfigFromDME();
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 11:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyRCUConfig(false);
                                indexSend = 0;
                                getConfigFromDME();
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 12:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyRCUConfig(true);
                                indexSend = 0;
                                getConfigFromDME();
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 13:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyIdentConfig(false);
                                indexSend = 0;
                                getConfigFromDME();
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 14:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyIdentConfig(true);
                                indexSend = 0;
                                getConfigFromDME();
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 15:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyOffsetConfig(false);
                                indexSend = 0;
                                getConfigFromDME();
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 16:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyOffsetConfig(true);
                                indexSend = 0;
                                getConfigFromDME();
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 17:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyMTUThresConfig(false);
                                getThresholdsFromDME();
                                indexSend = 0;
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            case 18:
                                ITC.dmeconfigWin.MessageWindow.setText("Sending data, please wait...");
                                applyMTUThresConfig(true);
                                getThresholdsFromDME();
                                indexSend = 0;
                                ITC.dmeconfigWin.MessageWindow.setText("");
                                break;
                            default:
                                indexSend = 0;
                                break;
                        }

                        MainItc.ITC.mainWin.getDataToShow();  //przerzucic do ITC.czas

                        MainItc.ITC.mainWin.setConnView("0");
                        MainItc.ITC.mainWin.viewWork();

                    } catch (Exception e) {
                        MainItc.ITC.mainWin.setConnView("2");
                        LOG.setLog(3, "collectDataFromDME - Communication error: " + e);

                    }

                    try {
                        sleep(500);
                    } catch (InterruptedException ex) {
                        LOG.setLog(3, "Thread comm problem: " + ex);
                    }
                }
            }

        };
        updateData.start();
    }

    public static void stopCollectDataFromDME() {
        updateData.stop();
    }

    public static void getThresholdsFromDME() {
        try {
            oidsToGetT = getOIDList(tSummaryThreshold);
            getSnmpStatusResponse(oidsToGetT, tSummaryThreshold);
            oidsToGetVoltT = getOIDList(tVoltageThreshold);
            getSnmpStatusResponse(oidsToGetVoltT, tVoltageThreshold);
            oidsToGetPulseShapeT = getOIDList(tPulseShapeThreshold);
            getSnmpStatusResponse(oidsToGetPulseShapeT, tPulseShapeThreshold);
            oidsToGetMTUT = getOIDList(tMTUThreshold);
            getSnmpStatusResponse(oidsToGetMTUT, tMTUThreshold);
            oidsToGetHPAT = getOIDList(tHPAThreshold);
            getSnmpStatusResponse(oidsToGetHPAT, tHPAThreshold);
            oidsToGetTXUT = getOIDList(tTXUThreshold);
            getSnmpStatusResponse(oidsToGetTXUT, tTXUThreshold);

        } catch (Exception e) {
            MainItc.ITC.mainWin.setConnView("2");
            LOG.setLog(3, "getThresholdFromDME - Communication error: " + e);
        }
        for (int i = 0; i < 4; i++) {
            tSummaryThreshold[i][1] = convertMeasurment(tSummaryThreshold[i][1], 3, null);
        }
        for (int i = 6; i < 8; i++) {
            tSummaryThreshold[i][1] = convertMeasurment(tSummaryThreshold[i][1], 1, null);
        }
        for (int i = 8; i < 10; i++) {
            tSummaryThreshold[i][1] = convertMeasurment(tSummaryThreshold[i][1], 2, null);
        }
        for (int i = 10; i < 14; i++) {
            tSummaryThreshold[i][1] = convertMeasurment(tSummaryThreshold[i][1], 3, null);
        }
        for (int i = 16; i < 18; i++) {
            tSummaryThreshold[i][1] = convertMeasurment(tSummaryThreshold[i][1], 1, null);
        }
        for (int i = 18; i < 20; i++) {
            tSummaryThreshold[i][1] = convertMeasurment(tSummaryThreshold[i][1], 2, null);
        }
        for (int i = 20; i < 22; i++) {
            tSummaryThreshold[i][1] = convertMeasurment(tSummaryThreshold[i][1], 1, null);
        }
        for (int i = 26; i < 28; i++) {
            tSummaryThreshold[i][1] = convertMeasurment(tSummaryThreshold[i][1], 1, null);
        }

        for (int i = 0; i < tVoltageThreshold.length; i++) {
            tVoltageThreshold[i][1] = convertMeasurment(tVoltageThreshold[i][1], 3, null);
        }

        for (int i = 0; i < 24; i++) {
            tPulseShapeThreshold[i][1] = convertMeasurment(tPulseShapeThreshold[i][1], 3, null);
        }

        for (int i = 0; i < tMTUThreshold.length; i++) {
            if (i > 7 && i < 12) {
                continue;
            }
            if (i > 19 && i < 24) {
                continue;
            }
            tMTUThreshold[i][1] = convertMeasurment(tMTUThreshold[i][1], 3, null);
        }

        for (int i = 4; i < 8; i++) {
            tHPAThreshold[i][1] = convertMeasurment(tHPAThreshold[i][1], 2, null);
        }

        for (int i = 4; i < 12; i++) {
            tTXUThreshold[i][1] = convertMeasurment(tTXUThreshold[i][1], 2, null);
        }
    }

    public static void getConfigFromDME() {
        oidsToGetMRTCoC = getOIDList(tMRTConfig);
        oidsToGetRCUCoC = getOIDList(tRCUConfig);
        oidsToGetInstCoC = getOIDList(tInstConfig);
        try {
            getSnmpStatusResponse(oidsToGetMRTCoC, tMRTConfig);
            convertMRTConfigView();
            getSnmpStatusResponse(oidsToGetInstCoC, tInstConfig);
            convertInstConfigView();
            getSnmpStatusResponse(oidsToGetRCUCoC, tRCUConfig);
            convertRCUConfigView();
        } catch (Exception e) {
            MainItc.ITC.mainWin.setConnView("2");
            LOG.setLog(3, "getConfigFromDME - Communication error: " + e);
        }
        setNominalValues();
    }
    
    private static void setNominalValues() {

        //tryb X
        Communication.ComData.tNominalValues[0] = "50.000";
        //if(Communication.ComData.getTLastPoll(3, 2).equals("0"))
            Communication.ComData.tNominalValues[0] = String.valueOf(Double.parseDouble(Communication.ComData.tNominalValues[0]) + Double.parseDouble(Communication.ComData.tInstConfig[30][1]));
        Communication.ComData.tNominalValues[1] = "50.000";
        //if(Communication.ComData.getTLastPoll(4, 2).equals("0"))
            Communication.ComData.tNominalValues[1] = String.valueOf(Double.parseDouble(Communication.ComData.tNominalValues[1]) + Double.parseDouble(Communication.ComData.tInstConfig[30][1]));
        Communication.ComData.tNominalValues[2] = "12.000"; 
        Communication.ComData.tNominalValues[3] = "0";      
        //tryb Y
        Communication.ComData.tNominalValues[4] = "56.000";
        //if(Communication.ComData.getTLastPoll(3, 2).equals("0"))
            Communication.ComData.tNominalValues[4] = String.valueOf(Double.parseDouble(Communication.ComData.tNominalValues[4]) + Double.parseDouble(Communication.ComData.tInstConfig[35][1]));
        Communication.ComData.tNominalValues[5] = "56.000";
        //if(Communication.ComData.getTLastPoll(4, 2).equals("0"))
            Communication.ComData.tNominalValues[5] = String.valueOf(Double.parseDouble(Communication.ComData.tNominalValues[5]) + Double.parseDouble(Communication.ComData.tInstConfig[35][1]));
        Communication.ComData.tNominalValues[6] = "30.000";
        Communication.ComData.tNominalValues[7] = "0";
        
    }

//    
// ***************************** WYSYLANIE *********************************
//
    /**
     * Załącz/wyłacz TXP A. OID: .1.3.6.1.4.1.32275.2.1.2.3.17.7.0 Wyłącz = [0]
     * Włącz = [1]
     */
    public static void onoffTXPA() {
        if (ComData.getTStatusView(5, 1).equals("ON")) {
            ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.7.0", "", 0);
        } else {
            ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.7.0", "", 1);
        }
    }

    /**
     * Załącz/wyłacz TXP B. OID: .1.3.6.1.4.1.32275.2.1.2.3.17.8.0 Wyłącz = [0]
     * Włącz = [1]
     */
    public static void onoffTXPB() {
        if (ComData.getTStatusView(6, 1).equals("ON")) {
            ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.8.0", "", 0);
        } else {
            ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.8.0", "", 1);
        }
    }

    /**
     * Zmiana nadajników. OID: .1.3.6.1.4.1.32275.2.1.2.3.17.9.0 Przełącz = [1]
     * (po każdej jedynce zestawy się przełączają).
     */
    public static void changeOver(int txp) {

        switch (ComData.getTStatusView(1, 1)) {
            case "TXP A":

                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.9.0", "", 1);
                break;
            case "TXP B":
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.9.0", "", 1);
                break;
            case "None":
                if (txp == 1 && ComData.getTStatusView(5, 1).equals("ON")) {
                    ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.9.0", "", 1);
                } else if (txp == 2 && ComData.getTStatusView(6, 1).equals("ON")) {
                    ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.9.0", "", 1);
                }
                break;
            default:

                break;
        }
    }

    /**
     * Ustawianie nadakników main/standby. OID:
     * .1.3.6.1.4.1.32275.2.1.2.3.17.2.0 TXP A = [0] TXP B = [1]
     */
    private static void setTXMain(String s) {
        switch (s) {
            case "TXP A":
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.2.0", "", 0);
                break;
            case "TXP B":
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.2.0", "", 1);
                break;
            default:

                break;
        }
    }

    /**
     * Ustawianie Bypass
     *
     * @param indexBypass Stan 1 - załączony, 0 - wyłączony
     */
    private static void setBypass(int indexBypass) {
        switch (indexBypass) {
            case 0:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.6.0", "", 1);
                break;
            case 1:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.6.0", "", 0);
                break;
            default:
                break;
        }
    }

    private static void resetCount() {
        ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.36.0", "", 1);
    }

    private static void resetEqu(int indexReset) {
        switch (indexReset) {
            case 0:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.13.1.0", "", 1);  // [ALL] Do sprawdzenia oba OID wywołują ten sam efekt razem wywołane - urządzenie sie buntuje...
                //ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.14.1.0", "", 1);
                break;
            case 1:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.20.0", "", 1); //CMU A
                break;
            case 2:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.21.0", "", 1); //CMU A
                break;
            case 3:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.22.0", "", 1); //TXP A
                break;
            case 4:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.23.0", "", 1); //TXP B
                break;
            case 5:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.24.0", "", 1); //MTU 1
                break;
            case 6:
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.27.0", "", 1); //MTU 4
                break;
            default:
                break;
        }

    }

    public static void applyGeneralConfig(boolean writeToFlash) {
        sendSimpleOID(tInstConfig[1][0], MRTDataToSend[0][0], Integer.parseInt(MRTDataToSend[0][1]));
        if ((ComData.getTLastPoll(3, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[2][0], MRTDataToSend[1][0], Integer.parseInt(MRTDataToSend[1][1]));
            sendSimpleOID(tInstConfig[3][0], MRTDataToSend[2][0], Integer.parseInt(MRTDataToSend[2][1]));
            sendSimpleOID(tMRTConfig[0][0], MRTDataToSend[3][0], Integer.parseInt(MRTDataToSend[3][1]));
            sendSimpleOID(tMRTConfig[1][0], MRTDataToSend[4][0], Integer.parseInt(MRTDataToSend[4][1]));
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.5.21.0", "", 1);
            }

        }
        if ((ComData.getTLastPoll(7, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[4][0], MRTDataToSend[1][0], Integer.parseInt(MRTDataToSend[1][1]));
            sendSimpleOID(tInstConfig[5][0], MRTDataToSend[2][0], Integer.parseInt(MRTDataToSend[2][1]));
            sendSimpleOID(tMRTConfig[4][0], MRTDataToSend[7][0], Integer.parseInt(MRTDataToSend[7][1]));
            sendSimpleOID(tMRTConfig[5][0], MRTDataToSend[8][0], Integer.parseInt(MRTDataToSend[8][1]));
            sendSimpleOID(tMRTConfig[6][0], MRTDataToSend[9][0], Integer.parseInt(MRTDataToSend[9][1]));
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.9.34.0", "", 1);
            }

        }
        if ((ComData.getTLastPoll(5, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[6][0], MRTDataToSend[1][0], Integer.parseInt(MRTDataToSend[1][1]));
            sendSimpleOID(tInstConfig[7][0], MRTDataToSend[2][0], Integer.parseInt(MRTDataToSend[2][1]));
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.3.26.0", "", 1);
            }

        }
        if ((ComData.getTLastPoll(9, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[8][0], MRTDataToSend[1][0], Integer.parseInt(MRTDataToSend[1][1]));
            sendSimpleOID(tInstConfig[9][0], MRTDataToSend[2][0], Integer.parseInt(MRTDataToSend[2][1]));
            sendSimpleOID(tMRTConfig[10][0], MRTDataToSend[13][0], Integer.parseInt(MRTDataToSend[13][1]));
            sendSimpleOID(tMRTConfig[11][0], MRTDataToSend[14][0], Integer.parseInt(MRTDataToSend[14][1]));
            sendSimpleOID(tMRTConfig[12][0], MRTDataToSend[15][0], Integer.parseInt(MRTDataToSend[15][1]));
            sendSimpleOID(tMRTConfig[13][0], MRTDataToSend[16][0], Integer.parseInt(MRTDataToSend[16][1]));
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.11.26.0", "", 1);
            }

        }
        if ((ComData.getTLastPoll(4, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[10][0], MRTDataToSend[1][0], Integer.parseInt(MRTDataToSend[1][1]));
            sendSimpleOID(tInstConfig[11][0], MRTDataToSend[2][0], Integer.parseInt(MRTDataToSend[2][1]));
            sendSimpleOID(tMRTConfig[2][0], MRTDataToSend[5][0], Integer.parseInt(MRTDataToSend[5][1]));
            sendSimpleOID(tMRTConfig[3][0], MRTDataToSend[6][0], Integer.parseInt(MRTDataToSend[6][1]));
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.8.21.0", "", 1);
            }
        }
        if ((ComData.getTLastPoll(8, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[12][0], MRTDataToSend[1][0], Integer.parseInt(MRTDataToSend[1][1]));
            sendSimpleOID(tInstConfig[13][0], MRTDataToSend[2][0], Integer.parseInt(MRTDataToSend[2][1]));
            sendSimpleOID(tMRTConfig[7][0], MRTDataToSend[10][0], Integer.parseInt(MRTDataToSend[10][1]));
            sendSimpleOID(tMRTConfig[8][0], MRTDataToSend[11][0], Integer.parseInt(MRTDataToSend[11][1]));
            sendSimpleOID(tMRTConfig[9][0], MRTDataToSend[12][0], Integer.parseInt(MRTDataToSend[12][1]));
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.10.34.0", "", 1);
            }

        }
        if ((ComData.getTLastPoll(6, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[14][0], MRTDataToSend[1][0], Integer.parseInt(MRTDataToSend[1][1]));
            sendSimpleOID(tInstConfig[15][0], MRTDataToSend[2][0], Integer.parseInt(MRTDataToSend[2][1]));
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.4.26.0", "", 1);
            }

        }
        if ((ComData.getTLastPoll(10, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[16][0], MRTDataToSend[1][0], Integer.parseInt(MRTDataToSend[1][1]));
            sendSimpleOID(tInstConfig[17][0], MRTDataToSend[2][0], Integer.parseInt(MRTDataToSend[2][1]));
            sendSimpleOID(tMRTConfig[14][0], MRTDataToSend[17][0], Integer.parseInt(MRTDataToSend[17][1]));
            sendSimpleOID(tMRTConfig[15][0], MRTDataToSend[18][0], Integer.parseInt(MRTDataToSend[18][1]));
            sendSimpleOID(tMRTConfig[16][0], MRTDataToSend[19][0], Integer.parseInt(MRTDataToSend[19][1]));
            sendSimpleOID(tMRTConfig[17][0], MRTDataToSend[20][0], Integer.parseInt(MRTDataToSend[20][1]));
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.12.26.0", "", 1);
            }

        }
        //ConfDataSwitch = 0;
    }

    public static void applyRCUConfig(boolean writeToFlash) {
        if ((ComData.getTLastPoll(0, 2).equals("0"))) {
            sendSimpleOID(tRCUConfig[0][0], "", Integer.parseInt(RCUDataToSend[0]));
            sendSimpleOID(tRCUConfig[1][0], "", Integer.parseInt(RCUDataToSend[1]));
            for (int i = 2; i < 16; i++) {
                sendSimpleOID(tRCUConfig[i + 1][0], "", Integer.parseInt(RCUDataToSend[i]));
            }
            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.17.37.0", "", 1);
            }
        }
        // ConfDataSwitch = 0;
    }

    public static void applyIdentConfig(boolean writeToFlash) {

        if ((ComData.getTLastPoll(3, 2).equals("0"))) {

            if (IdentDataToSend[0][1].equals("1")) {
                sendSimpleOID(tInstConfig[62][0], "", 2);
            } else {
                sendSimpleOID(tInstConfig[62][0], IdentDataToSend[1][0], Integer.parseInt(IdentDataToSend[1][1]));
            }

            sendSimpleOID(tInstConfig[65][0], IdentDataToSend[3][0], Integer.parseInt(IdentDataToSend[3][1]));
            sendSimpleOID(tInstConfig[67][0], IdentDataToSend[4][0], Integer.parseInt(IdentDataToSend[4][1]));
            sendSimpleOID(tInstConfig[69][0], IdentDataToSend[5][0], Integer.parseInt(IdentDataToSend[5][1]));

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.5.21.0", "", 1);
            }

        }
        if ((ComData.getTLastPoll(7, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[60][0], IdentDataToSend[0][0], Integer.parseInt(IdentDataToSend[0][1]));
            sendSimpleOID(tInstConfig[61][0], IdentDataToSend[1][0], Integer.parseInt(IdentDataToSend[1][1]));
            sendSimpleOID(tInstConfig[63][0], IdentDataToSend[2][0], Integer.parseInt(IdentDataToSend[2][1]));
            sendSimpleOID(tInstConfig[64][0], IdentDataToSend[3][0], Integer.parseInt(IdentDataToSend[3][1]));
            sendSimpleOID(tInstConfig[66][0], IdentDataToSend[4][0], Integer.parseInt(IdentDataToSend[4][1]));
            sendSimpleOID(tInstConfig[68][0], IdentDataToSend[5][0], Integer.parseInt(IdentDataToSend[5][1]));
            sendSimpleOID(tInstConfig[70][0], IdentDataToSend[6][0], Integer.parseInt(IdentDataToSend[6][1]));
            sendSimpleOID(tInstConfig[71][0], IdentDataToSend[7][0], Integer.parseInt(IdentDataToSend[7][1]));

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.9.34.0", "", 1);
            }
        }
        if ((ComData.getTLastPoll(4, 2).equals("0"))) {
            if (IdentDataToSend[0][1].equals("1")) {
                sendSimpleOID(tInstConfig[74][0], "", 2);
            } else {
                sendSimpleOID(tInstConfig[74][0], IdentDataToSend[1][0], Integer.parseInt(IdentDataToSend[1][1]));
            }

            sendSimpleOID(tInstConfig[77][0], IdentDataToSend[3][0], Integer.parseInt(IdentDataToSend[3][1]));
            sendSimpleOID(tInstConfig[79][0], IdentDataToSend[4][0], Integer.parseInt(IdentDataToSend[4][1]));
            sendSimpleOID(tInstConfig[81][0], IdentDataToSend[5][0], Integer.parseInt(IdentDataToSend[5][1]));

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.8.21.0", "", 1);
            }
        }
        if ((ComData.getTLastPoll(8, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[72][0], IdentDataToSend[0][0], Integer.parseInt(IdentDataToSend[0][1]));
            sendSimpleOID(tInstConfig[73][0], IdentDataToSend[1][0], Integer.parseInt(IdentDataToSend[1][1]));
            sendSimpleOID(tInstConfig[75][0], IdentDataToSend[2][0], Integer.parseInt(IdentDataToSend[2][1]));
            sendSimpleOID(tInstConfig[76][0], IdentDataToSend[3][0], Integer.parseInt(IdentDataToSend[3][1]));
            sendSimpleOID(tInstConfig[78][0], IdentDataToSend[4][0], Integer.parseInt(IdentDataToSend[4][1]));
            sendSimpleOID(tInstConfig[80][0], IdentDataToSend[5][0], Integer.parseInt(IdentDataToSend[5][1]));
            sendSimpleOID(tInstConfig[82][0], IdentDataToSend[6][0], Integer.parseInt(IdentDataToSend[6][1]));
            sendSimpleOID(tInstConfig[83][0], IdentDataToSend[7][0], Integer.parseInt(IdentDataToSend[7][1]));

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.10.34.0", "", 1);
            }
        }

        //ConfDataSwitch = 0;
    }

    public static void applyOffsetConfig(boolean writeToFlash) {

        if ((ComData.getTLastPoll(3, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[30][0], "", Integer.parseInt(OffsetDataToSend[12]));
            sendSimpleOID(tInstConfig[31][0], "", Integer.parseInt(OffsetDataToSend[13]));
            sendSimpleOID(tInstConfig[32][0], "", Integer.parseInt(OffsetDataToSend[14]));
            sendSimpleOID(tInstConfig[33][0], "", Integer.parseInt(OffsetDataToSend[15]));
            sendSimpleOID(tInstConfig[34][0], "", Integer.parseInt(OffsetDataToSend[16]));

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.5.21.0", "", 1);
            }

        }
        if ((ComData.getTLastPoll(7, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[18][0], "", Integer.parseInt(OffsetDataToSend[0]));
            sendSimpleOID(tInstConfig[19][0], "", Integer.parseInt(OffsetDataToSend[1]));
            sendSimpleOID(tInstConfig[20][0], "", Integer.parseInt(OffsetDataToSend[2]));
            sendSimpleOID(tInstConfig[21][0], "", Integer.parseInt(OffsetDataToSend[3]));
            sendSimpleOID(tInstConfig[22][0], "", Integer.parseInt(OffsetDataToSend[4]));
            sendSimpleOID(tInstConfig[23][0], "", Integer.parseInt(OffsetDataToSend[5]));

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.9.34.0", "", 1);
            }
        }
        if ((ComData.getTLastPoll(4, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[35][0], "", Integer.parseInt(OffsetDataToSend[17]));
            sendSimpleOID(tInstConfig[36][0], "", Integer.parseInt(OffsetDataToSend[18]));
            sendSimpleOID(tInstConfig[37][0], "", Integer.parseInt(OffsetDataToSend[19]));
            sendSimpleOID(tInstConfig[38][0], "", Integer.parseInt(OffsetDataToSend[20]));
            sendSimpleOID(tInstConfig[39][0], "", Integer.parseInt(OffsetDataToSend[21]));

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.8.21.0", "", 1);
            }
        }
        if ((ComData.getTLastPoll(8, 2).equals("0"))) {
            sendSimpleOID(tInstConfig[24][0], "", Integer.parseInt(OffsetDataToSend[6]));
            sendSimpleOID(tInstConfig[25][0], "", Integer.parseInt(OffsetDataToSend[7]));
            sendSimpleOID(tInstConfig[26][0], "", Integer.parseInt(OffsetDataToSend[8]));
            sendSimpleOID(tInstConfig[27][0], "", Integer.parseInt(OffsetDataToSend[9]));
            sendSimpleOID(tInstConfig[28][0], "", Integer.parseInt(OffsetDataToSend[10]));
            sendSimpleOID(tInstConfig[29][0], "", Integer.parseInt(OffsetDataToSend[11]));

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.10.34.0", "", 1);
            }
        }

        //ConfDataSwitch = 0;
    }

    public static void applyMTUThresConfig(boolean writeToFlash) {

        if ((ComData.getTLastPoll(3, 2).equals("0"))) {
            for (int i = 0; i < 10; i++) {
                sendSimpleOID(tSummaryThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i]));
            }
            for (int i = 20; i < 26; i++) {
                sendSimpleOID(tSummaryThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i]));
            }

            for (int i = 0; i < 12; i++) {
                sendSimpleOID(tPulseShapeThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i + 32]));
            }
            for (int i = 24; i < 26; i++) {
                sendSimpleOID(tPulseShapeThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i + 32]));
            }

            for (int i = 8; i < 12; i++) {
                sendSimpleOID(tMTUThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i - 8 + 60]));
            }
            for (int i = 14; i < 20; i++) {
                sendSimpleOID(tMTUThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i - 8 + 60]));
            }

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.5.21.0", "", 1);
            }
        }

        if ((ComData.getTLastPoll(4, 2).equals("0"))) {
            for (int i = 10; i < 20; i++) {
                sendSimpleOID(tSummaryThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i]));
            }
            for (int i = 26; i < 32; i++) {
                sendSimpleOID(tSummaryThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i]));
            }

            for (int i = 12; i < 24; i++) {
                sendSimpleOID(tPulseShapeThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i + 32]));
            }
            for (int i = 26; i < 28; i++) {
                sendSimpleOID(tPulseShapeThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i + 32]));
            }

            for (int i = 20; i < 24; i++) {
                sendSimpleOID(tMTUThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i - 8 + 60]));
            }
            for (int i = 26; i < 32; i++) {
                sendSimpleOID(tMTUThreshold[i][0], "", Integer.parseInt(MTUThresDataToSend[i - 8 + 60]));
            }

            if (writeToFlash) {
                ComData.sendSimpleOID(".1.3.6.1.4.1.32275.2.1.2.3.8.21.0", "", 1);
            }
        }

        // ConfDataSwitch = 0;
    }

    public static void sendSimpleOID(String sOID, String sdana, int idana) {

        try {
            TransportMapping transport = new DefaultUdpTransportMapping();
            Snmp snmp = new Snmp(transport);
            USM usm = new USM(SecurityProtocols.getInstance(), new OctetString(MPv3.createLocalEngineID()), 0);
            SecurityModels.getInstance().addSecurityModel(usm);
            transport.listen();
            snmp.getUSM().addUser(new OctetString(UserName), new UsmUser(new OctetString(UserName), AuthSHA.ID, new OctetString(Password), null, null));

            UserTarget target = new UserTarget();
            target.setAddress(new UdpAddress(InetAddress.getByName(IPAddress), Port));
            target.setRetries(5);    //0
            target.setTimeout(1000); //3000
            target.setVersion(SnmpConstants.version3);
            target.setSecurityLevel(SecurityLevel.AUTH_NOPRIV);
            target.setSecurityName(new OctetString(UserName));

            PDU pdu = new ScopedPDU();

            if (sdana.equals("")) {
                pdu.add(new VariableBinding(new OID(sOID), new Integer32(idana)));
            } else {
                pdu.add(new VariableBinding(new OID(sOID), new OctetString(sdana)));
            }

            pdu.setType(PDU.SET);
            ResponseEvent event = snmp.send(pdu, target);

            //Debugger
            //System.out.print("Wysylam pod OID: "+ sOID + " wartosc: " + idana + sdana);
            if (event != null) {

                pdu = event.getResponse();

                if (pdu.getErrorStatus() == PDU.noError) {
                    //System.out.println(" OK!");
                    //System.out.println("SNMPv3 SET Successful!");
                } else {
                    //System.out.println(" Error!");
                    LOG.setLog(3, "SNMPv3 SET Unsuccessful.");

                }
            } else {
                //System.out.println(" Brak odpowiedzi!");                
                LOG.setLog(3, "SNMP send unsuccessful.");

            }

        } catch (IOException ex) {
            LOG.setLog(3, "Communication error - settings: " + ex);

        }
    }

    /*
    Obróbka danych odebranych
    
     */
    public static String AlarmSum(String AlarmTable[][]) {
        String[][] table = AlarmTable;
        String sum = "-2";
        for (int i = 0; i < table.length; i++) {
            if (table[i][2].equals("1")) {
                sum = "1";
            } else if (table[i][2].equals("2")) {
                sum = "2";
                break;
            }
        }
        return sum;
    }

    private static void convertOperatingStatusView() {
        switch (tStatusView[0][1]) {
            case "0":
                tStatusView[0][1] = "Main";
                tStatusView[0][2] = "0";
                break;
            case "1":
                tStatusView[0][1] = "Standby";
                tStatusView[0][2] = "0";
                break;
            case "2":
                tStatusView[0][1] = "Shutdown";
                tStatusView[0][2] = "1";
                break;
            case "3":
                tStatusView[0][1] = "Off";
                tStatusView[0][2] = "2";
                break;
            default:
                break;
        }
        //System.out.println("Przed : "+tStatusView[1][1]);

        switch (tStatusView[1][1]) {

            case "0":
                tStatusView[1][1] = "None";
                break;
            case "1":
                tStatusView[1][1] = "TXP A";
                break;
            case "2":
                tStatusView[1][1] = "TXP B";
                break;
            default:
                break;
        }
        // System.out.println("Po kon: "+tStatusView[1][1]);
        // System.out.println("Po cal: " + ComData.getTStatusView(0, 1) + " - " + ComData.getTStatusView(1, 1));

        switch (tStatusView[2][1]) {        // Transparent MASTER
            case "0":
                tStatusView[2][1] = "CMU A";
                tStatusView[2][2] = "0";
                break;
            case "1":
                tStatusView[2][1] = "CMU B";
                tStatusView[2][2] = "0";
                break;
            case "2":
                tStatusView[2][1] = "Shutdown";
                tStatusView[2][2] = "1";
                break;
            case "3":
                tStatusView[2][1] = "Off";
                tStatusView[2][2] = "2";
                break;
            default:
                break;
        }

        switch (tStatusView[3][1]) {             // Status zbiorczy
            case "0":
                tStatusView[3][1] = "NORMAL";
                tStatusView[3][2] = "0";
                break;
            case "1":
                tStatusView[3][1] = "ERROR";
                tStatusView[3][2] = "2";
                break;
            case "2":
                tStatusView[3][1] = "WARNING";
                tStatusView[3][2] = "1";
                break;
            default:
                break;
        }
        switch (tStatusView[4][1]) {             // Bypass
            case "0":
                tStatusView[4][1] = "OFF";
                tStatusView[4][2] = "0";
                break;
            case "1":
                tStatusView[4][1] = "ON";
                tStatusView[4][2] = "1";
                break;
            default:
                break;
        }
        switch (tStatusView[5][1]) {
            case "0":
                tStatusView[5][1] = "OFF";
                tStatusView[5][2] = "-2";
                break;
            case "1":
                tStatusView[5][1] = "ON";
                tStatusView[5][2] = "0";
                break;
            default:
                break;
        }
        switch (tStatusView[6][1]) {
            case "0":
                tStatusView[6][1] = "OFF";
                tStatusView[6][2] = "-2";
                break;
            case "1":
                tStatusView[6][1] = "ON";
                tStatusView[6][2] = "0";
                break;
            default:
                break;
        }

        switch (tStatusView[8][1]) {
            case "0":
                tStatusView[8][1] = "TXP A";
                tStatusView[8][2] = "0";
                break;
            case "1":
                tStatusView[8][1] = "TXP B";
                tStatusView[8][2] = "0";
                break;
            default:
                break;
        }
        // System.out.println("Main TXP: " + tStatusView[8][1]);
    }

    private static String convertMeasurment(String data, int precision, String unit) {
        String s;
        boolean negative = false;
        if (precision != 0) {
            if (data.startsWith("-")) {
                negative = true;
                data = data.substring(1);
            }
            if (precision < data.length()) {
                s = data.substring(0, data.length() - precision) + "." + data.substring(data.length() - precision, data.length());
            } else {
                s = "0.";
                for (int i = data.length(); i < precision; i++) {
                    s += "0";
                }
                s += data;
            }
            if (negative) {
                s = "-" + s;
            }
        } else {
            s = data;
        }
        if (unit != null) {
            s += " " + unit;
        }
        return s;
    }

    private static void convertSummaryView() {

        ITC.mainWin.convertSummaryView();

    }

    private static void convertSystemAlarmsView() {
        for (int i = 0; i < 12; i++) {
            tAlarms[i][2] = convertAlarmStatus(PRIM_SEC, tAlarms[i][2]);
        }

        tAlarms[12][2] = convertAlarmStatus(PRIM, tAlarms[12][2]);
        tAlarms[13][2] = convertAlarmStatus(PRIM, tAlarms[13][2]);
        tAlarms[14][2] = convertAlarmStatus(SEC, tAlarms[14][2]);
        tAlarms[15][2] = convertAlarmStatus(SEC, tAlarms[15][2]);
        tAlarms[16][2] = convertAlarmStatus(PRIM, tAlarms[16][2]);
        tAlarms[17][2] = convertAlarmStatus(PRIM, tAlarms[17][2]);
        tAlarms[18][2] = convertAlarmStatus(SEC, tAlarms[18][2]);
        tAlarms[19][2] = convertAlarmStatus(SEC, tAlarms[19][2]);
        tAlarms[20][2] = convertAlarmStatus(PRIM, tAlarms[20][2]);
        tAlarms[21][2] = convertAlarmStatus(PRIM, tAlarms[21][2]);
        tAlarms[22][2] = convertAlarmStatus(SEC, tAlarms[22][2]);
        tAlarms[23][2] = convertAlarmStatus(SEC, tAlarms[23][2]);
        tAlarms[24][2] = convertAlarmStatus(PRIM, tAlarms[24][2]);
        tAlarms[25][2] = convertAlarmStatus(PRIM, tAlarms[25][2]);
        tAlarms[26][2] = convertAlarmStatus(SEC, tAlarms[26][2]);
        tAlarms[27][2] = convertAlarmStatus(SEC, tAlarms[27][2]);
        tAlarms[28][2] = convertAlarmStatus(PRIM, tAlarms[28][2]);
        tAlarms[29][2] = convertAlarmStatus(PRIM, tAlarms[29][2]);
        tAlarms[30][2] = convertAlarmStatus(SEC, tAlarms[30][2]);
        tAlarms[31][2] = convertAlarmStatus(SEC, tAlarms[31][2]);
        tAlarms[32][2] = convertAlarmStatus(PRIM, tAlarms[32][2]);
        tAlarms[33][2] = convertAlarmStatus(PRIM, tAlarms[33][2]);
        tAlarms[34][2] = convertAlarmStatus(SEC, tAlarms[34][2]);
        tAlarms[35][2] = convertAlarmStatus(SEC, tAlarms[35][2]);
        tAlarms[36][2] = convertAlarmStatus(PRIM, tAlarms[36][2]);
        tAlarms[37][2] = convertAlarmStatus(PRIM, tAlarms[37][2]);
        tAlarms[38][2] = convertAlarmStatus(SEC, tAlarms[38][2]);
        tAlarms[39][2] = convertAlarmStatus(SEC, tAlarms[39][2]);
        tAlarms[40][2] = convertAlarmStatus(PRIM, tAlarms[40][2]);
        tAlarms[41][2] = convertAlarmStatus(SEC, tAlarms[41][2]);
    }

    private static void convertMTUAlarmsView() {

        tMTUAlarms[0][2] = convertAlarmStatus(PRIM_SEC, tMTUAlarms[0][2]);
        tMTUAlarms[1][2] = convertAlarmStatus(PRIM_SEC, tMTUAlarms[1][2]);
        tMTUAlarms[2][2] = convertAlarmStatus(PRIM, tMTUAlarms[2][2]);
        tMTUAlarms[3][2] = convertAlarmStatus(PRIM, tMTUAlarms[3][2]);
        tMTUAlarms[4][2] = convertAlarmStatus(PRIM, tMTUAlarms[4][2]);
        tMTUAlarms[5][2] = convertAlarmStatus(PRIM, tMTUAlarms[5][2]);
        tMTUAlarms[6][2] = convertAlarmStatus(PRIM_SEC, tMTUAlarms[6][2]);
        tMTUAlarms[7][2] = convertAlarmStatus(PRIM_SEC, tMTUAlarms[7][2]);
        tMTUAlarms[8][2] = convertAlarmStatus(SEC, tMTUAlarms[8][2]);
        tMTUAlarms[9][2] = convertAlarmStatus(SEC, tMTUAlarms[9][2]);
        tMTUAlarms[10][2] = convertAlarmStatus(PRIM, tMTUAlarms[10][2]);
        tMTUAlarms[11][2] = convertAlarmStatus(PRIM, tMTUAlarms[11][2]);
        tMTUAlarms[12][2] = convertAlarmStatus(SEC, tMTUAlarms[12][2]);
        tMTUAlarms[13][2] = convertAlarmStatus(SEC, tMTUAlarms[13][2]);
        tMTUAlarms[14][2] = convertAlarmStatus(PRIM, tMTUAlarms[14][2]);
        tMTUAlarms[15][2] = convertAlarmStatus(PRIM, tMTUAlarms[15][2]);
        tMTUAlarms[16][2] = convertAlarmStatus(SEC, tMTUAlarms[16][2]);
        tMTUAlarms[17][2] = convertAlarmStatus(SEC, tMTUAlarms[17][2]);
        tMTUAlarms[18][2] = convertAlarmStatus(PRIM, tMTUAlarms[18][2]);
        tMTUAlarms[19][2] = convertAlarmStatus(PRIM, tMTUAlarms[19][2]);
        tMTUAlarms[20][2] = convertAlarmStatus(SEC, tMTUAlarms[12][2]);
        tMTUAlarms[21][2] = convertAlarmStatus(SEC, tMTUAlarms[21][2]);
        for (int i = 22; i < 52; i++) {
            tMTUAlarms[i][2] = convertAlarmStatus(PRIM_SEC, tMTUAlarms[i][2]);
        }
    }

    private static void convertCMUAlarmsView() {

        for (int i = 0; i < 10; i++) {
            tCMUAlarms[i][2] = convertAlarmStatus(PRIM_SEC, tCMUAlarms[i][2]);
        }
        for (int i = 10; i < 16; i++) {
            tCMUAlarms[i][2] = convertAlarmStatus(PRIM, tCMUAlarms[i][2]);
        }
    }

    private static void convertHPAAlarmsView() {

        for (int i = 0; i < 12; i++) {
            tHPAAlarms[i][2] = convertAlarmStatus(PRIM_SEC, tHPAAlarms[i][2]);
        }
        for (int i = 12; i < 16; i++) {
            tHPAAlarms[i][2] = convertAlarmStatus(SEC, tHPAAlarms[i][2]);
        }
    }

    private static void convertTXUAlarmsView() {

        for (int i = 0; i < 12; i++) {
            tTXUAlarms[i][2] = convertAlarmStatus(PRIM_SEC, tTXUAlarms[i][2]);
        }
        for (int i = 12; i < 16; i++) {
            tTXUAlarms[i][2] = convertAlarmStatus(SEC, tTXUAlarms[i][2]);
        }
    }

    private static void convertRXUAlarmsView() {

        tRXUAlarms[0][2] = convertAlarmStatus(PRIM_SEC, tRXUAlarms[0][2]);
        tRXUAlarms[1][2] = convertAlarmStatus(PRIM_SEC, tRXUAlarms[1][2]);
        for (int i = 2; i < 6; i++) {
            tRXUAlarms[i][2] = convertAlarmStatus(PRIM, tRXUAlarms[i][2]);
        }
        tRXUAlarms[6][2] = convertAlarmStatus(SEC, tRXUAlarms[6][2]);
        tRXUAlarms[7][2] = convertAlarmStatus(SEC, tRXUAlarms[7][2]);
        tRXUAlarms[8][2] = convertAlarmStatus(PRIM_SEC, tRXUAlarms[8][2]);
        tRXUAlarms[9][2] = convertAlarmStatus(PRIM_SEC, tRXUAlarms[9][2]);
        tRXUAlarms[10][2] = convertAlarmStatus(SEC, tRXUAlarms[10][2]);
        tRXUAlarms[11][2] = convertAlarmStatus(SEC, tRXUAlarms[11][2]);
    }

    private static void convertRCUAlarmsView() {

        tRCUAlarms[0][2] = convertAlarmStatus(PRIM_SEC, tRCUAlarms[0][2]);
        tRCUAlarms[1][2] = convertAlarmStatus(PRIM, tRCUAlarms[1][2]);
        tRCUAlarms[2][2] = convertAlarmStatus(PRIM_SEC, tRCUAlarms[2][2]);
        tRCUAlarms[3][2] = convertAlarmStatus(PRIM_SEC, tRCUAlarms[3][2]);
        tRCUAlarms[4][2] = convertAlarmStatus(SEC, tRCUAlarms[4][2]);
        tRCUAlarms[5][2] = convertAlarmStatus(PRIM, tRCUAlarms[5][2]);
        tRCUAlarms[6][2] = convertAlarmStatus(SEC, tRCUAlarms[6][2]);
        tRCUAlarms[7][2] = convertAlarmStatus(PRIM, tRCUAlarms[7][2]);
        tRCUAlarms[8][2] = convertAlarmStatus(SEC, tRCUAlarms[8][2]);
    }

    private static void convertPSUAlarmsView() {

        for (int i = 0; i < 4; i++) {
            tPSUAlarms[i][2] = convertAlarmStatus(PRIM, tPSUAlarms[i][2]);
        }
        tPSUAlarms[4][2] = convertAlarmStatus(PRIM_SEC, tPSUAlarms[4][2]);
        tPSUAlarms[5][2] = convertAlarmStatus(PRIM_SEC, tPSUAlarms[5][2]);
        tPSUAlarms[6][2] = convertAlarmStatus(PRIM, tPSUAlarms[6][2]);
        tPSUAlarms[7][2] = convertAlarmStatus(PRIM, tPSUAlarms[7][2]);
        tPSUAlarms[8][2] = convertAlarmStatus(PRIM_SEC, tPSUAlarms[8][2]);
        tPSUAlarms[9][2] = convertAlarmStatus(PRIM_SEC, tPSUAlarms[9][2]);
    }

    private static String convertAlarmStatus(int type, String s) {
        if (type == PRIM_SEC && s.equals("1")) {
            return "2";
        } else if (type == PRIM_SEC && s.equals("2")) {
            return "1";
        } else if (type == PRIM && s.equals("1")) {
            return "2";
        } else {
            return s;
        }
    }

    private static void convertVoltageView() {
        for (int i = 0; i < 72; i++) {
            tVoltage[i][1] = convertMeasurment(tVoltage[i][1], 3, "V");
            tVoltage[i][2] = checkLowLimit(tVoltage[i][1], tVoltageThreshold[4 * i][1], tVoltageThreshold[4 * i + 1][1]);
            if (tVoltage[i][2].equals("0")) {
                tVoltage[i][2] = checkHighLimit(tVoltage[i][1], tVoltageThreshold[4 * i + 3][1], tVoltageThreshold[4 * i + 2][1]);
            }
        }

        tVoltage[72][1] = convertMeasurment(tVoltage[72][1], 0, "V");
        tVoltage[73][1] = convertMeasurment(tVoltage[73][1], 3, "V");
        tVoltage[74][1] = convertMeasurment(tVoltage[74][1], 3, "A");
        tVoltage[75][1] = convertMeasurment(tVoltage[75][1], 3, "V");
        tVoltage[76][1] = convertMeasurment(tVoltage[76][1], 3, "A");
        tVoltage[77][1] = convertMeasurment(tVoltage[77][1], 0, "°C");
        tVoltage[79][1] = convertMeasurment(tVoltage[79][1], 1, "h");
        tVoltage[80][1] = convertMeasurment(tVoltage[80][1], 2, "%");
        tVoltage[81][1] = convertMeasurment(tVoltage[81][1], 2, "%");
        tVoltage[82][1] = convertMeasurment(tVoltage[82][1], 0, "V");
        tVoltage[83][1] = convertMeasurment(tVoltage[83][1], 3, "V");
        tVoltage[84][1] = convertMeasurment(tVoltage[84][1], 3, "A");
        tVoltage[85][1] = convertMeasurment(tVoltage[85][1], 3, "V");
        tVoltage[86][1] = convertMeasurment(tVoltage[86][1], 3, "A");
        tVoltage[87][1] = convertMeasurment(tVoltage[87][1], 0, "°C");
        tVoltage[89][1] = convertMeasurment(tVoltage[89][1], 1, "h");
        tVoltage[90][1] = convertMeasurment(tVoltage[90][1], 2, "%");
        tVoltage[91][1] = convertMeasurment(tVoltage[91][1], 2, "%");
    }

    private static void convertPulseShapeView() {
        for (int i = 0; i < 48; i++) {
            tPulseShape[i][1] = convertMeasurment(tPulseShape[i][1], 3, "µs");
        }
        for (int i = 48; i < 56; i++) {
            tPulseShape[i][1] = convertMeasurment(tPulseShape[i][1], 0, "ppm");
        }

        for (int i = 0; i < tPulseShape.length; i++) {
            switch (tPulseShape[i][7]) {
                case "LOW":
                    tPulseShape[i][2] = checkLowLimit(tPulseShape[i][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][3]) - 1][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][4]) - 1][1]);
                    break;
                case "HIGH":
                    tPulseShape[i][2] = checkHighLimit(tPulseShape[i][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][6]) - 1][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][5]) - 1][1]);
                    break;
                case "BOTH":
                    tPulseShape[i][2] = checkLowLimit(tPulseShape[i][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][3]) - 1][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][4]) - 1][1]);
                    if (tPulseShape[i][2].equals("0")) {
                        tPulseShape[i][2] = checkHighLimit(tPulseShape[i][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][6]) - 1][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][5]) - 1][1]);
                    }
                    break;
                /*case "RANGE":
                    if (ComData.getTLastPoll(7, 2).equals("0")) {
                        if (ComData.getTInstConfig(5, 1).equals("0")) {
                            tPulseShape[i][2] = checkRange(tPulseShape[i][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][3]) - 1][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][4]) - 1][1], tNominalValues[Integer.parseInt(tPulseShape[i][5]) - 1]);
                        } else if (ComData.getTInstConfig(5, 1).equals("1")) {
                            tPulseShape[i][2] = checkRange(tPulseShape[i][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][3]) - 1][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][4]) - 1][1], tNominalValues[Integer.parseInt(tPulseShape[i][5]) + 2]);
                        }
                    } else if (ComData.getTLastPoll(8, 2).equals("0")) {
                        if (ComData.getTInstConfig(13, 1).equals("0")) {
                            tPulseShape[i][2] = checkRange(tPulseShape[i][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][3]) - 1][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][4]) - 1][1], tNominalValues[Integer.parseInt(tPulseShape[i][5]) - 1]);
                        } else if (ComData.getTInstConfig(13, 1).equals("1")) {
                            tPulseShape[i][2] = checkRange(tPulseShape[i][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][3]) - 1][1], tPulseShapeThreshold[Integer.parseInt(tPulseShape[i][4]) - 1][1], tNominalValues[Integer.parseInt(tPulseShape[i][5]) + 2]);
                        }
                    }
                    break;*/
                default:
                    break;
            }
        }
    }

    private static void convertLastPollView() {
        for (int i = 0; i < tLastPoll.length; i++) {
            if (tLastPoll[i][2].equals("1")) //OK
            {
                tLastPoll[i][2] = "0";
            } else if (tLastPoll[i][2].equals("3")) //Unknown
            {
                tLastPoll[i][2] = "1";
            } else if (tLastPoll[i][2].equals("2")) //Not Fitted
            {
                tLastPoll[i][2] = "-2";
            } else {
                tLastPoll[i][2] = "2"; //Fail 
            }
        }

    }

    private static void convertGeneralStatusView() {
        for (int i = 1; i < 4; i = i + 2) {
            switch (tGeneralStatus[i][1]) {        // do sprawdzenia kodów
                case "0":
                    tGeneralStatus[i][1] = "No";
                    break;
                case "1":
                    tGeneralStatus[i][1] = "Yes";
                    break;
                default:
                    break;
            }
        }
        for (int i = 4; i < 7; i++) {
            switch (tGeneralStatus[i][1]) {        // do sprawdzenia kodów
                case "0":
                    tGeneralStatus[i][1] = "No";
                    break;
                case "1":
                    tGeneralStatus[i][1] = "Yes";
                    break;
                default:
                    break;
            }
        }
    }

    private static void convertMTUStatusView() {
        for (int i = 0; i < 8; i++) {
            tMTUStatus[i][1] = convertMeasurment(tMTUStatus[i][1], 3, "µs");
        }

        tMTUStatus[8][1] = convertMeasurment(tMTUStatus[8][1], 0, "µs");
        tMTUStatus[9][1] = convertMeasurment(tMTUStatus[9][1], 0, "ms");
        tMTUStatus[10][1] = convertMeasurment(tMTUStatus[10][1], 0, "ms");
        tMTUStatus[11][1] = convertMeasurment(tMTUStatus[11][1], 3, "s");
        tMTUStatus[12][1] = convertMeasurment(tMTUStatus[12][1], 3, "s");
        tMTUStatus[13][1] = convertMeasurment(tMTUStatus[13][1], 3, "s");
        tMTUStatus[14][1] = convertMeasurment(tMTUStatus[14][1], 0, "µs");
        tMTUStatus[15][1] = convertMeasurment(tMTUStatus[15][1], 0, "ms");
        tMTUStatus[16][1] = convertMeasurment(tMTUStatus[16][1], 0, "ms");
        tMTUStatus[17][1] = convertMeasurment(tMTUStatus[17][1], 3, "s");
        tMTUStatus[18][1] = convertMeasurment(tMTUStatus[18][1], 3, "s");
        tMTUStatus[19][1] = convertMeasurment(tMTUStatus[19][1], 3, "s");

        for (int i = 0; i < tMTUStatus.length; i++) {
            switch (tMTUStatus[i][7]) {
                case "HIGH":
                    tMTUStatus[i][2] = checkHighLimit(tMTUStatus[i][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][6]) - 1][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][5]) - 1][1]);
                    break;
                case "BOTH":
                    tMTUStatus[i][2] = checkLowLimit(tMTUStatus[i][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][3]) - 1][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][4]) - 1][1]);
                    if (tMTUStatus[i][2].equals("0")) {
                        tMTUStatus[i][2] = checkHighLimit(tMTUStatus[i][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][6]) - 1][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][5]) - 1][1]);
                    }
                    break;
                /*case "RANGE":
                    if (ComData.getTLastPoll(7, 2).equals("0")) {
                        if (ComData.getTInstConfig(5, 1).equals("0")) {
                            tMTUStatus[i][2] = checkRange(tMTUStatus[i][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][3]) - 1][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][4]) - 1][1], tNominalValues[Integer.parseInt(tMTUStatus[i][5]) - 1]);
                        
                        } else if (ComData.getTInstConfig(5, 1).equals("1")) {
                            tMTUStatus[i][2] = checkRange(tMTUStatus[i][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][3]) - 1][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][4]) - 1][1], tNominalValues[Integer.parseInt(tMTUStatus[i][5]) + 2]);
                        }    
                    } else if (ComData.getTLastPoll(8, 2).equals("0")) {
                        if (ComData.getTInstConfig(13, 1).equals("0")) {
                            tMTUStatus[i][2] = checkRange(tMTUStatus[i][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][3]) - 1][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][4]) - 1][1], tNominalValues[Integer.parseInt(tMTUStatus[i][5]) - 1]);
                            
                        } else if (ComData.getTInstConfig(13, 1).equals("1")) {
                            tMTUStatus[i][2] = checkRange(tMTUStatus[i][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][3]) - 1][1], tMTUThreshold[Integer.parseInt(tMTUStatus[i][4]) - 1][1], tNominalValues[Integer.parseInt(tMTUStatus[i][5]) + 2]);
                        }
                    }

                    break;*/
                default:
                    break;
            }
        }
    }

    private static void convertRXUStatusView() {
        for (int i = 0; i < 6; i++) {
            tRXUStatus[i][1] = convertMeasurment(tRXUStatus[i][1], 0, "ppps");
        }

        tRXUStatus[6][1] = convertMeasurment(tRXUStatus[6][1], 2, "dBm");

        for (int i = 7; i < 13; i++) {
            tRXUStatus[i][1] = convertMeasurment(tRXUStatus[i][1], 0, "ppps");
        }

        tRXUStatus[13][1] = convertMeasurment(tRXUStatus[13][1], 2, "dBm");
    }

    private static void convertHPAStatusView() {
        switch (tHPAStatus[0][1]) {
            case "0":
                tHPAStatus[0][1] = "OFF";
                break;
            case "1":
                tHPAStatus[0][1] = "ON";
                break;
            default:
                break;
        }
        tHPAStatus[1][1] = convertMeasurment(tHPAStatus[1][1], 2, "dBm");
        tHPAStatus[2][1] = convertMeasurment(tHPAStatus[2][1], 0, "°C");
        tHPAStatus[3][1] = convertMeasurment(tHPAStatus[3][1], 0, "ppps");
        switch (tHPAStatus[4][1]) {
            case "0":
                tHPAStatus[4][1] = "OFF";
                break;
            case "1":
                tHPAStatus[4][1] = "ON";
                break;
            default:
                break;
        }
        tHPAStatus[5][1] = convertMeasurment(tHPAStatus[5][1], 2, "dBm");
        tHPAStatus[6][1] = convertMeasurment(tHPAStatus[6][1], 0, "°C");
        tHPAStatus[7][1] = convertMeasurment(tHPAStatus[7][1], 0, "ppps");

        for (int i = 0; i < tHPAStatus.length; i++) {
            switch (tHPAStatus[i][5]) {
                case "LOW":
                    tHPAStatus[i][2] = checkLowLimit(tHPAStatus[i][1], tHPAThreshold[Integer.parseInt(tHPAStatus[i][3]) - 1][1], tHPAThreshold[Integer.parseInt(tHPAStatus[i][4]) - 1][1]);
                    break;
                case "HIGH":
                    tHPAStatus[i][2] = checkHighLimit(tHPAStatus[i][1], tHPAThreshold[Integer.parseInt(tHPAStatus[i][3]) - 1][1], tHPAThreshold[Integer.parseInt(tHPAStatus[i][4]) - 1][1]);
                    break;
                default:
                    break;
            }
        }

    }

    private static void convertTXUStatusView() {
        for (int i = 0; i < 2; i++) {
            switch (tTXUStatus[i][1]) {
                case "0":
                    tTXUStatus[i][1] = "OFF";
                    break;
                case "1":
                    tTXUStatus[i][1] = "ON";
                    break;
                default:
                    break;
            }
        }

        tTXUStatus[2][1] = convertMeasurment(tTXUStatus[2][1], 2, "dBm");
        tTXUStatus[3][1] = convertMeasurment(tTXUStatus[3][1], 0, "°C");
        tTXUStatus[4][1] = convertMeasurment(tTXUStatus[4][1], 0, "ppps");
        tTXUStatus[5][1] = convertMeasurment(tTXUStatus[5][1], 0, "ppps");
        tTXUStatus[6][1] = convertMeasurment(tTXUStatus[6][1], 0, "ppps");

        for (int i = 8; i < 10; i++) {
            switch (tTXUStatus[i][1]) {
                case "0":
                    tTXUStatus[i][1] = "OFF";
                    break;
                case "1":
                    tTXUStatus[i][1] = "ON";
                    break;
                default:
                    break;
            }
        }

        tTXUStatus[10][1] = convertMeasurment(tTXUStatus[10][1], 2, "dBm");
        tTXUStatus[11][1] = convertMeasurment(tTXUStatus[11][1], 0, "°C");
        tTXUStatus[12][1] = convertMeasurment(tTXUStatus[12][1], 0, "ppps");
        tTXUStatus[13][1] = convertMeasurment(tTXUStatus[13][1], 0, "ppps");
        tTXUStatus[14][1] = convertMeasurment(tTXUStatus[14][1], 0, "ppps");

        for (int i = 16; i < 20; i++) {
            switch (tTXUStatus[i][1]) {
                case "0":
                    tTXUStatus[i][1] = "NO";
                    break;
                case "1":
                    tTXUStatus[i][1] = "YES";
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < tTXUStatus.length; i++) {
            switch (tTXUStatus[i][5]) {
                case "HPAA":
                    if (tTXUStatus[1][1].equals("ON")) {
                        tTXUStatus[i][2] = checkLowLimit(tTXUStatus[i][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][3]) - 1][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][4]) - 1][1]);
                    } else {
                        tTXUStatus[i][2] = checkLowLimit(tTXUStatus[i][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][3]) + 1][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][4]) + 1][1]);
                    }
                    break;
                case "HPAB":
                    if (tTXUStatus[9][1].equals("ON")) {
                        tTXUStatus[i][2] = checkLowLimit(tTXUStatus[i][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][3]) - 1][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][4]) - 1][1]);
                    } else {
                        tTXUStatus[i][2] = checkLowLimit(tTXUStatus[i][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][3]) + 1][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][4]) + 1][1]);
                    }
                    break;
                case "HIGH":
                    tTXUStatus[i][2] = checkHighLimit(tTXUStatus[i][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][3]) - 1][1], tTXUThreshold[Integer.parseInt(tTXUStatus[i][4]) - 1][1]);
                    break;
                default:
                    break;
            }
        }
    }

    private static void convertMRTConfigView() {
        tMRTConfig[12][1] = convertMeasurment(tMRTConfig[12][1], 2, null);
        tMRTConfig[13][1] = convertMeasurment(tMRTConfig[13][1], 2, null);
        tMRTConfig[16][1] = convertMeasurment(tMRTConfig[16][1], 2, null);
        tMRTConfig[17][1] = convertMeasurment(tMRTConfig[17][1], 2, null);
    }

    private static void convertRCUConfigView() {
        tRCUConfig[5][1] = convertMeasurment(tRCUConfig[5][1], 1, null);
        tRCUConfig[6][1] = convertMeasurment(tRCUConfig[6][1], 1, null);
    }

    private static void convertInstConfigView() {
        tInstConfig[18][1] = convertMeasurment(tInstConfig[18][1], 3, null);
        tInstConfig[19][1] = convertMeasurment(tInstConfig[19][1], 3, null);
        tInstConfig[20][1] = convertMeasurment(tInstConfig[20][1], 2, null);
        tInstConfig[23][1] = convertMeasurment(tInstConfig[23][1], 2, null);
        tInstConfig[24][1] = convertMeasurment(tInstConfig[24][1], 3, null);
        tInstConfig[25][1] = convertMeasurment(tInstConfig[25][1], 3, null);
        tInstConfig[26][1] = convertMeasurment(tInstConfig[26][1], 2, null);
        tInstConfig[29][1] = convertMeasurment(tInstConfig[29][1], 2, null);
        tInstConfig[30][1] = convertMeasurment(tInstConfig[30][1], 3, null);
        tInstConfig[31][1] = convertMeasurment(tInstConfig[31][1], 2, null);
        tInstConfig[32][1] = convertMeasurment(tInstConfig[32][1], 2, null);
        tInstConfig[33][1] = convertMeasurment(tInstConfig[33][1], 2, null);
        tInstConfig[35][1] = convertMeasurment(tInstConfig[35][1], 3, null);
        tInstConfig[36][1] = convertMeasurment(tInstConfig[36][1], 2, null);
        tInstConfig[37][1] = convertMeasurment(tInstConfig[37][1], 2, null);
        tInstConfig[38][1] = convertMeasurment(tInstConfig[38][1], 2, null);
        tInstConfig[42][1] = convertMeasurment(tInstConfig[42][1], 2, null);
        tInstConfig[43][1] = convertMeasurment(tInstConfig[43][1], 2, null);
        tInstConfig[44][1] = convertMeasurment(tInstConfig[44][1], 3, null);
        tInstConfig[49][1] = convertMeasurment(tInstConfig[49][1], 2, null);
        tInstConfig[50][1] = convertMeasurment(tInstConfig[50][1], 2, null);
        tInstConfig[51][1] = convertMeasurment(tInstConfig[51][1], 3, null);
        tInstConfig[84][1] = convertMeasurment(tInstConfig[84][1], 3, null);
        tInstConfig[87][1] = convertMeasurment(tInstConfig[87][1], 3, null);
    }

    private static void convertIDStationView() {

        if (tIDStation[6][2].equals("0")) {
            tIDStation[6][2] = "X";
        } else {
            tIDStation[6][2] = "Y";
        }

        if (tIDStation[2][2].equals("1")) {
            tIDStation[2][2] = "OK";
        } else {
            tIDStation[2][2] = "";
        }

        if (tIDStation[4][2].equals("1")) {
            tIDStation[4][2] = "OK";
        } else {
            tIDStation[4][2] = "";
        }
    }

    private static String checkLowLimit(String meas, String alarm, String alert) {
        if (meas.startsWith("-")) {
            return checkLowLimit(meas.substring(1), alarm.substring(1), alert.substring(1));
        }
        meas = meas.substring(0, meas.indexOf(" "));
        double doubleMeas = Double.parseDouble(meas);
        double doubleAlarm = Double.parseDouble(alarm);
        double doubleAlert = Double.parseDouble(alert);
        if (doubleMeas < doubleAlarm) {
            return "2";
        }
        if (doubleMeas < doubleAlert) {
            return "1";
        }
        return "0"; //return "0";
    }

    private static String checkHighLimit(String meas, String alarm, String alert) {
        if (meas.startsWith("-")) {
            return checkHighLimit(meas.substring(1), alarm.substring(1), alert.substring(1));
        }
        meas = meas.substring(0, meas.indexOf(" "));
        double doubleMeas = Double.parseDouble(meas);
        double doubleAlarm = Double.parseDouble(alarm);
        double doubleAlert = Double.parseDouble(alert);
        if (doubleMeas > doubleAlarm) {
            return "2";
        }
        if (doubleMeas > doubleAlert) {
            return "1";
        }
        return "0"; //return "0";
    }

    private static String checkRange(String meas, String alarm, String alert, String nominal) {
        meas = meas.substring(0, meas.indexOf(" "));
        double doubleMeas = Double.parseDouble(meas);
        double doubleAlarm = Double.parseDouble(alarm);
        double doubleAlert = Double.parseDouble(alert);
        double doubleNominal = Double.parseDouble(nominal);
        if (Math.abs(doubleMeas - doubleNominal) > doubleAlarm) {
            return "2";
        }
        if (Math.abs(doubleMeas - doubleNominal) > doubleAlert) {
            return "1";
        }
        return "0"; //return "0";
    }

}
