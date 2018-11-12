package Components;

import Communication.ComData;
import static Communication.ComData.tSummary;
import static Communication.ComData.tSummaryThreshold;
import static Communication.ComData.tNominalValues;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

/**
 *
 * @author edatabit
 */
public class Sum_System extends javax.swing.JPanel {

    public Sum_System() {
        initComponents();
    }

    public void setTitle(String s) {
        this.setBorder(BorderFactory.createTitledBorder(null, s, TitledBorder.LEFT, TitledBorder.ABOVE_TOP));
    }

    public void displaySummary(int SystemNr) { // 1: SYSTEM A; 2: SYSTEM B !!!
        int Modul = 0;

        resetSummary();

        if (ComData.getTStatusView(1, 1).equals("TXP A") && (SystemNr == 1)) {
            Modul = 1;
        }
        if (ComData.getTStatusView(1, 1).equals("TXP A") && (SystemNr == 2)) {
            Modul = 2;
        }
        if (ComData.getTStatusView(1, 1).equals("TXP B") && (SystemNr == 1)) {
            Modul = 3;
        }
        if (ComData.getTStatusView(1, 1).equals("TXP B") && (SystemNr == 2)) {
            Modul = 4;
        }

        switch (Modul) {
            case 1:
                if (ComData.getTStatusView(5, 1).equals("ON")) {
                    if(ComData.getTLastPoll(3, 2).equals("0"))
                    {  
                        jTextField1.setText(ComData.getTSummary(0, 1));
                        jTextField1.setBackground(UX.PColor.setBackGround(ComData.getTSummary(0, 2)));
                        jTextField2.setText(ComData.getTSummary(1, 1));
                        jTextField2.setBackground(UX.PColor.setBackGround(ComData.getTSummary(1, 2)));
                        jTextField3.setText(ComData.getTSummary(2, 1));
                        jTextField3.setBackground(UX.PColor.setBackGround(ComData.getTSummary(2, 2)));
                        jTextField4.setText(ComData.getTSummary(3, 1));
                        jTextField4.setBackground(UX.PColor.setBackGround(ComData.getTSummary(3, 2)));
                        jTextField5.setText(ComData.getTSummary(4, 1));
                        jTextField5.setBackground(UX.PColor.setBackGround(ComData.getTSummary(4, 2)));
                        jTextField6.setText(ComData.getTSummary(20, 1));
                        jTextField6.setBackground(UX.PColor.setBackGround(ComData.getTSummary(20, 2)));
                        jTextField7.setText(ComData.getTSummary(21, 1));
                        jTextField7.setBackground(UX.PColor.setBackGround(ComData.getTSummary(21, 2)));
                        jTextField8.setText(ComData.getTSummary(22, 1));
                        jTextField8.setBackground(UX.PColor.setBackGround(ComData.getTSummary(22, 2)));
                        jTextField9.setText(ComData.getTSummary(23, 1));
                        jTextField9.setBackground(UX.PColor.setBackGround(ComData.getTSummary(23, 2)));
                    }
                    if(ComData.getTLastPoll(4, 2).equals("0"))
                    {           
                        jTextField10.setText(ComData.getTSummary(10, 1));
                        jTextField10.setBackground(UX.PColor.setBackGround(ComData.getTSummary(10, 2)));
                        jTextField11.setText(ComData.getTSummary(11, 1));
                        jTextField11.setBackground(UX.PColor.setBackGround(ComData.getTSummary(11, 2)));
                        jTextField12.setText(ComData.getTSummary(12, 1));
                        jTextField12.setBackground(UX.PColor.setBackGround(ComData.getTSummary(12, 2)));
                        jTextField13.setText(ComData.getTSummary(13, 1));
                        jTextField13.setBackground(UX.PColor.setBackGround(ComData.getTSummary(13, 2)));
                        jTextField14.setText(ComData.getTSummary(14, 1));
                        jTextField14.setBackground(UX.PColor.setBackGround(ComData.getTSummary(14, 2)));
                        jTextField15.setText(ComData.getTSummary(24, 1));
                        jTextField15.setBackground(UX.PColor.setBackGround(ComData.getTSummary(24, 2)));
                        jTextField16.setText(ComData.getTSummary(25, 1));
                        jTextField16.setBackground(UX.PColor.setBackGround(ComData.getTSummary(25, 2)));
                        jTextField17.setText(ComData.getTSummary(26, 1));
                        jTextField17.setBackground(UX.PColor.setBackGround(ComData.getTSummary(26, 2)));
                        jTextField18.setText(ComData.getTSummary(27, 1));
                        jTextField18.setBackground(UX.PColor.setBackGround(ComData.getTSummary(27, 2)));
                    }
                }
                // }else{                            ??? Dlaczego nie dziala ???
                //    resetSummary();
                //}
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ComData.getTStatusView(6, 1).equals("ON")) {
                    if(ComData.getTLastPoll(3, 2).equals("0"))
                    {  
                        jTextField1.setText(ComData.getTSummary(5, 1));
                        jTextField1.setBackground(UX.PColor.setBackGround(ComData.getTSummary(5, 2)));
                        jTextField2.setText(ComData.getTSummary(6, 1));
                        jTextField2.setBackground(UX.PColor.setBackGround(ComData.getTSummary(6, 2)));
                        jTextField3.setText(ComData.getTSummary(7, 1));
                        jTextField3.setBackground(UX.PColor.setBackGround(ComData.getTSummary(7, 2)));
                        jTextField4.setText(ComData.getTSummary(8, 1));
                        jTextField4.setBackground(UX.PColor.setBackGround(ComData.getTSummary(8, 2)));
                        jTextField5.setText(ComData.getTSummary(9, 1));
                        jTextField5.setBackground(UX.PColor.setBackGround(ComData.getTSummary(9, 2)));
                        jTextField6.setText(ComData.getTSummary(20, 1));
                        jTextField6.setBackground(UX.PColor.setBackGround(ComData.getTSummary(20, 2)));
                        jTextField7.setText(ComData.getTSummary(21, 1));
                        jTextField7.setBackground(UX.PColor.setBackGround(ComData.getTSummary(21, 2)));
                        jTextField8.setText(ComData.getTSummary(22, 1));
                        jTextField8.setBackground(UX.PColor.setBackGround(ComData.getTSummary(22, 2)));
                        jTextField9.setText(ComData.getTSummary(23, 1));
                        jTextField9.setBackground(UX.PColor.setBackGround(ComData.getTSummary(23, 2)));
                    }         
                    if(ComData.getTLastPoll(4, 2).equals("0"))
                    {             
                        jTextField10.setText(ComData.getTSummary(15, 1));
                        jTextField10.setBackground(UX.PColor.setBackGround(ComData.getTSummary(15, 2)));
                        jTextField11.setText(ComData.getTSummary(16, 1));
                        jTextField11.setBackground(UX.PColor.setBackGround(ComData.getTSummary(16, 2)));
                        jTextField12.setText(ComData.getTSummary(17, 1));
                        jTextField12.setBackground(UX.PColor.setBackGround(ComData.getTSummary(17, 2)));
                        jTextField13.setText(ComData.getTSummary(18, 1));
                        jTextField13.setBackground(UX.PColor.setBackGround(ComData.getTSummary(18, 2)));
                        jTextField14.setText(ComData.getTSummary(19, 1));
                        jTextField14.setBackground(UX.PColor.setBackGround(ComData.getTSummary(19, 2)));
                        jTextField15.setText(ComData.getTSummary(24, 1));
                        jTextField15.setBackground(UX.PColor.setBackGround(ComData.getTSummary(24, 2)));
                        jTextField16.setText(ComData.getTSummary(25, 1));
                        jTextField16.setBackground(UX.PColor.setBackGround(ComData.getTSummary(25, 2)));
                        jTextField17.setText(ComData.getTSummary(26, 1));
                        jTextField17.setBackground(UX.PColor.setBackGround(ComData.getTSummary(26, 2)));
                        jTextField18.setText(ComData.getTSummary(27, 1));
                        jTextField18.setBackground(UX.PColor.setBackGround(ComData.getTSummary(27, 2)));
                    }
                }
                break;
            default:
        }
    }

    public void resetSummary() {
        jTextField1.setText("");
        jTextField1.setBackground(UX.PColor.setBackGround("-2"));
        jTextField2.setText("");
        jTextField2.setBackground(UX.PColor.setBackGround("-2"));
        jTextField3.setText("");
        jTextField3.setBackground(UX.PColor.setBackGround("-2"));
        jTextField4.setText("");
        jTextField4.setBackground(UX.PColor.setBackGround("-2"));
        jTextField5.setText("");
        jTextField5.setBackground(UX.PColor.setBackGround("-2"));
        jTextField6.setText("");
        jTextField6.setBackground(UX.PColor.setBackGround("-2"));
        jTextField7.setText("");
        jTextField7.setBackground(UX.PColor.setBackGround("-2"));
        jTextField8.setText("");
        jTextField8.setBackground(UX.PColor.setBackGround("-2"));
        jTextField9.setText("");
        jTextField9.setBackground(UX.PColor.setBackGround("-2"));
        jTextField10.setText("");
        jTextField10.setBackground(UX.PColor.setBackGround("-2"));
        jTextField11.setText("");
        jTextField11.setBackground(UX.PColor.setBackGround("-2"));
        jTextField12.setText("");
        jTextField12.setBackground(UX.PColor.setBackGround("-2"));
        jTextField13.setText("");
        jTextField13.setBackground(UX.PColor.setBackGround("-2"));
        jTextField14.setText("");
        jTextField14.setBackground(UX.PColor.setBackGround("-2"));
        jTextField15.setText("");
        jTextField15.setBackground(UX.PColor.setBackGround("-2"));
        jTextField16.setText("");
        jTextField16.setBackground(UX.PColor.setBackGround("-2"));
        jTextField17.setText("");
        jTextField17.setBackground(UX.PColor.setBackGround("-2"));
        jTextField18.setText("");
        jTextField18.setBackground(UX.PColor.setBackGround("-2"));
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
                s = data.substring(0, data.length() - precision) + "." + data.substring(data.length() - precision, data.length()) + " " + unit;
            } else {
                s = "0.";
                for (int i = data.length(); i < precision; i++) {
                    s += "0";
                }
                s += data + " " + unit;
            }
            if (negative) {
                s = "-" + s;
            }
        } else {
            s = data + " " + unit;
        }
        return s;
    }

    public static void convertSummaryView() {
        tSummary[0][1] = convertMeasurment(tSummary[0][1], 3, "µs");
        tSummary[1][1] = convertMeasurment(tSummary[1][1], 3, "µs");
        tSummary[2][1] = convertMeasurment(tSummary[2][1], 0, "%");
        tSummary[3][1] = convertMeasurment(tSummary[3][1], 1, "W");
        tSummary[4][1] = convertMeasurment(tSummary[4][1], 2, "dB");
        tSummary[5][1] = convertMeasurment(tSummary[5][1], 3, "µs");
        tSummary[6][1] = convertMeasurment(tSummary[6][1], 3, "µs");
        tSummary[7][1] = convertMeasurment(tSummary[7][1], 0, "%");
        tSummary[8][1] = convertMeasurment(tSummary[8][1], 1, "W");
        tSummary[9][1] = convertMeasurment(tSummary[9][1], 2, "dB");
        tSummary[10][1] = convertMeasurment(tSummary[10][1], 3, "µs");
        tSummary[11][1] = convertMeasurment(tSummary[11][1], 3, "µs");
        tSummary[12][1] = convertMeasurment(tSummary[12][1], 0, "%");
        tSummary[13][1] = convertMeasurment(tSummary[13][1], 1, "W");
        tSummary[14][1] = convertMeasurment(tSummary[14][1], 2, "dB");
        tSummary[15][1] = convertMeasurment(tSummary[15][1], 3, "µs");
        tSummary[16][1] = convertMeasurment(tSummary[16][1], 3, "µs");
        tSummary[17][1] = convertMeasurment(tSummary[17][1], 0, "%");
        tSummary[18][1] = convertMeasurment(tSummary[18][1], 1, "W");
        tSummary[19][1] = convertMeasurment(tSummary[19][1], 2, "dB");
        tSummary[20][1] = convertMeasurment(tSummary[20][1], 1, "W");
        tSummary[21][1] = convertMeasurment(tSummary[21][1], 0, "PPPS");
        tSummary[24][1] = convertMeasurment(tSummary[24][1], 1, "W");
        tSummary[25][1] = convertMeasurment(tSummary[25][1], 0, "PPPS");

        for(int i = 0; i < tSummary.length; i++)
        {
            switch (tSummary[i][7]) {
                case "LOW":
                    tSummary[i][2] = checkLowLimit(tSummary[i][1], tSummaryThreshold[Integer.parseInt(tSummary[i][3])-1][1],tSummaryThreshold[Integer.parseInt(tSummary[i][4])-1][1]);
                    break;
                case "HIGH":
                    tSummary[i][2] = checkHighLimit(tSummary[i][1], tSummaryThreshold[Integer.parseInt(tSummary[i][6])-1][1],tSummaryThreshold[Integer.parseInt(tSummary[i][5])-1][1]);
                    break;
                case "BOTH":
                    tSummary[i][2] = checkLowLimit(tSummary[i][1], tSummaryThreshold[Integer.parseInt(tSummary[i][3])-1][1],tSummaryThreshold[Integer.parseInt(tSummary[i][4])-1][1]);
                    if (tSummary[i][2].equals("0"))
                        tSummary[i][2] = checkHighLimit(tSummary[i][1], tSummaryThreshold[Integer.parseInt(tSummary[i][6])-1][1],tSummaryThreshold[Integer.parseInt(tSummary[i][5])-1][1]);    
                    break;
                case "RANGE":
                    if (ComData.getTLastPoll(7, 2).equals("0")) {    
                        if (ComData.getTInstConfig(5, 1).equals("0")) {
                            tSummary[i][2] = checkRange(tSummary[i][1], tSummaryThreshold[Integer.parseInt(tSummary[i][3])-1][1],tSummaryThreshold[Integer.parseInt(tSummary[i][4])-1][1],tNominalValues[Integer.parseInt(tSummary[i][5])-1]);
                        } else if (ComData.getTInstConfig(5, 1).equals("1")) {
                            tSummary[i][2] = checkRange(tSummary[i][1], tSummaryThreshold[Integer.parseInt(tSummary[i][3])-1][1],tSummaryThreshold[Integer.parseInt(tSummary[i][4])-1][1],tNominalValues[Integer.parseInt(tSummary[i][5])+3]);
                        }
                    }
                    else if (ComData.getTLastPoll(8, 2).equals("0")) {    
                        if (ComData.getTInstConfig(13, 1).equals("0")) {
                            tSummary[i][2] = checkRange(tSummary[i][1], tSummaryThreshold[Integer.parseInt(tSummary[i][3])-1][1],tSummaryThreshold[Integer.parseInt(tSummary[i][4])-1][1],tNominalValues[Integer.parseInt(tSummary[i][5])-1]);
                        } else if (ComData.getTInstConfig(13, 1).equals("1")) {
                            tSummary[i][2] = checkRange(tSummary[i][1], tSummaryThreshold[Integer.parseInt(tSummary[i][3])-1][1],tSummaryThreshold[Integer.parseInt(tSummary[i][4])-1][1],tNominalValues[Integer.parseInt(tSummary[i][5])+3]);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        
        switch (tSummary[22][1]) {
            case "0":
                tSummary[22][1] = "Fail";
                tSummary[22][2] = "2";
                break;
            case "1":
                tSummary[22][1] = "OK";
                tSummary[22][2] = "0";
                break;
            default:
                break;
        }
        switch (tSummary[26][1]) {
            case "0":
                tSummary[26][1] = "Fail";
                tSummary[26][2] = "2";
                break;
            case "1":
                tSummary[26][1] = "OK";
                tSummary[26][2] = "0";
                break;
            default:
                break;
        }
        switch (tSummary[23][1]) {
            case "":
                tSummary[23][2] = "2";
                break;
            case "TST":
                tSummary[23][2] = "1";
                break;
            default:
                tSummary[23][2] = "0";
                break;
        }
        switch (tSummary[27][1]) {
            case "":
                tSummary[27][2] = "2";
                break;
            case "TST":
                tSummary[27][2] = "1";
                break;
            default:
                tSummary[27][2] = "0";
                break;
        }
    }
    
private static String checkLowLimit (String meas, String alarm, String alert)
    {
        if(meas.startsWith("-"))
            return checkLowLimit(meas.substring(1),alarm.substring(1),alert.substring(1));
        meas = meas.substring(0, meas.indexOf(" "));
        double doubleMeas = Double.parseDouble(meas);
        double doubleAlarm = Double.parseDouble(alarm);
        double doubleAlert = Double.parseDouble(alert);
        if(doubleMeas < doubleAlarm)        
            return "2";
        if(doubleMeas < doubleAlert)
            return "1";        
        return "0";
    }
    
    private static String checkHighLimit (String meas, String alarm, String alert)
    {
        if(meas.startsWith("-"))
            return checkHighLimit(meas.substring(1),alarm.substring(1),alert.substring(1));
        meas = meas.substring(0, meas.indexOf(" "));
        double doubleMeas = Double.parseDouble(meas);
        double doubleAlarm = Double.parseDouble(alarm);
        double doubleAlert = Double.parseDouble(alert);
        if(doubleMeas > doubleAlarm)         
            return "2";
        if(doubleMeas > doubleAlert)
            return "1";        
        return "0";
    }
    
    private static String checkRange(String meas, String alarm, String alert, String nominal)
    {
        meas = meas.substring(0, meas.indexOf(" "));
        double doubleMeas = Double.parseDouble(meas);
        double doubleAlarm = Double.parseDouble(alarm);
        double doubleAlert = Double.parseDouble(alert);
        double doubleNominal = Double.parseDouble(nominal);
        if(Math.abs(doubleMeas - doubleNominal)  > doubleAlarm)            
            return "2";
        if(Math.abs(doubleMeas - doubleNominal)  > doubleAlert)
            return "1";        
        return "0";
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Test", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(400, 350));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Beacon Delay:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Pulse Pair Spacing:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Efficiency:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Transmitted Power:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Pulse Power Variation:");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Radiated Power:");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Transmission Rate:");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Ident Status:");
        jLabel45.setToolTipText("");

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Ident Code:");
        jLabel54.setToolTipText("");

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("???");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("???");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("???");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("???");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(102, 255, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("???");

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(102, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("???");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(102, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("???");

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 255, 255));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("???");

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(102, 255, 255));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("???");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField3)
            .addComponent(jTextField4)
            .addComponent(jTextField5)
            .addComponent(jTextField6)
            .addComponent(jTextField7)
            .addComponent(jTextField8)
            .addComponent(jTextField9)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(102, 255, 255));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("???");

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(102, 255, 255));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("???");

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(102, 255, 255));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("???");

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(102, 255, 255));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("???");

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(102, 255, 255));
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("???");

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(102, 255, 255));
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("???");

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(102, 255, 255));
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("???");

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(102, 255, 255));
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("???");

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(102, 255, 255));
        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("???");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField10)
            .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField12)
            .addComponent(jTextField13)
            .addComponent(jTextField14)
            .addComponent(jTextField15)
            .addComponent(jTextField16)
            .addComponent(jTextField17)
            .addComponent(jTextField18)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
