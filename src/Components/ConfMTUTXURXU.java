package Components;

import Communication.ComData;
import MainItc.ITC;
import java.awt.Color;

/**
 *
 * @author jaroslaw.strozyk
 */
public class ConfMTUTXURXU extends javax.swing.JPanel {

    /**
     * Creates new form ConfMTUTXURXU
     */
    public ConfMTUTXURXU() {
        initComponents();
        MTU1locked = false;
        MTU4locked = false;
        TXUAlocked = false;
        TXUBlocked = false;
        RXUAlocked = false;
        RXUBlocked = false;
        channelLocked = false;
    }

    private boolean MTU1locked;
    private boolean MTU4locked;
    private boolean TXUAlocked;
    private boolean TXUBlocked;
    private boolean RXUAlocked;
    private boolean RXUBlocked;
    private boolean channelLocked;
    
    public boolean allFieldsAreCorrect()
    {
        if(jTextField1.getBackground().equals(Color.red))
            return false;
        if(jTextField2.getBackground().equals(Color.red))
            return false;
        if(jTextField5.getBackground().equals(Color.red))
            return false;
        if(jTextField6.getBackground().equals(Color.red))
            return false;
        if(jTextField7.getBackground().equals(Color.red))
            return false;
        if(jTextField8.getBackground().equals(Color.red))
            return false;
        if(jTextField9.getBackground().equals(Color.red))
            return false;
        if(jTextField10.getBackground().equals(Color.red))
            return false;
        if(jTextField11.getBackground().equals(Color.red))
            return false;
        if(jTextField12.getBackground().equals(Color.red))
            return false;
        if(jTextField13.getBackground().equals(Color.red))
            return false;
        if(jTextField14.getBackground().equals(Color.red))
            return false;   
        if(jTextField16.getBackground().equals(Color.red))
            return false;   
        return true;
    }
    
    private void lock(String cardName) {
        switch (cardName) {
            case "MTU1":
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField1.setEnabled(false);
                jTextField2.setEnabled(false);
                MTU1locked = true;
                break;
            case "MTU4":
                jTextField5.setText("");
                jTextField8.setText("");
                jTextField5.setEnabled(false);
                jTextField8.setEnabled(false);
                MTU4locked = true;
                break;
            case "TXUA":
                jTextField6.setText("");
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jTextField6.setEnabled(false);
                jCheckBox1.setEnabled(false);
                jCheckBox2.setEnabled(false);
                TXUAlocked = true;
                break;
            case "TXUB":
                jTextField7.setText("");
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jTextField7.setEnabled(false);
                jCheckBox3.setEnabled(false);
                jCheckBox4.setEnabled(false);
                TXUBlocked = true;
                break;
            case "RXUA":
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jCheckBox7.setSelected(false);
                jTextField12.setEnabled(false);
                jTextField13.setEnabled(false);
                jTextField14.setEnabled(false);
                jCheckBox7.setEnabled(false);
                RXUAlocked = true;
                break;
            case "RXUB":
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jCheckBox6.setSelected(false);
                jTextField9.setEnabled(false);
                jTextField10.setEnabled(false);
                jTextField11.setEnabled(false);
                jCheckBox6.setEnabled(false);
                RXUBlocked = true;
                break;
            case "channel":
                jTextField16.setText("");
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
                jTextField16.setEnabled(false);
                jRadioButton1.setEnabled(false);
                jRadioButton2.setEnabled(false);
                channelLocked = true;
                break;
            default:
                break;
        }
    }

    private void unlock(String cardName) {
        switch (cardName) {
            case "MTU1":
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
                MTU1locked = false;
                break;
            case "MTU4":
                jTextField5.setEnabled(true);
                jTextField8.setEnabled(true);
                MTU4locked = false;
                break;
            case "TXUA":
                jTextField6.setEnabled(true);
                jCheckBox1.setEnabled(true);
                jCheckBox2.setEnabled(true);
                TXUAlocked = false;
                break;
            case "TXUB":
                jTextField7.setEnabled(true);
                jCheckBox3.setEnabled(true);
                jCheckBox4.setEnabled(true);
                TXUBlocked = false;
                break;
            case "RXUA":
                jTextField12.setEnabled(true);
                jTextField13.setEnabled(true);
                jTextField14.setEnabled(true);
                jCheckBox7.setEnabled(true);
                RXUAlocked = false;
                break;
            case "RXUB":
                jTextField9.setEnabled(true);
                jTextField10.setEnabled(true);
                jTextField11.setEnabled(true);
                jCheckBox6.setEnabled(true);
                RXUBlocked = false;
                break;
            case "channel":
                jTextField16.setEnabled(true);
                jRadioButton1.setEnabled(true);
                jRadioButton2.setEnabled(true);
                channelLocked = false;
                break;
            default:
                break;
        }
    }

    public void displayMRTConfig() {
        jTextField15.setText(ComData.getTInstConfig(1, 1)); //
        if (ComData.getTLastPoll(7, 2).equals("0")) {
            if (channelLocked) {
                unlock("channel");
            }

            jTextField16.setText(ComData.getTInstConfig(4, 1));
            if (ComData.getTInstConfig(5, 1).equals("0")) {
                jRadioButton1.setSelected(true);
            } else if (ComData.getTInstConfig(5, 1).equals("1")) {
                jRadioButton2.setSelected(true);
            }
        } else if (ComData.getTLastPoll(8, 2).equals("0")) {
            if (channelLocked) {
                unlock("channel");
            }

            jTextField16.setText(ComData.getTInstConfig(12, 1));
            if (ComData.getTInstConfig(13, 1).equals("0")) {
                jRadioButton1.setSelected(true);
            } else if (ComData.getTInstConfig(13, 1).equals("1")) {
                jRadioButton2.setSelected(true);
            }
        } else {
            if (!channelLocked) {
                lock("channel");
            }
        }

        if (ComData.getTLastPoll(3, 2).equals("0")) {
            if (MTU1locked) {
                unlock("MTU1");
            }
            jTextField1.setText(ComData.getTMRTConfig(0, 1));
            jTextField2.setText(ComData.getTMRTConfig(1, 1));
        } else {
            if (!MTU1locked) {
                lock("MTU1");
            }
        }

        if (ComData.getTLastPoll(4, 2).equals("0")) {
            if (MTU4locked) {
                unlock("MTU4");
            }
            jTextField5.setText(ComData.getTMRTConfig(2, 1));
            jTextField8.setText(ComData.getTMRTConfig(3, 1));
        } else {
            if (!MTU4locked) {
                lock("MTU4");
            }
        }

        if (ComData.getTLastPoll(7, 2).equals("0")) {
            if (TXUAlocked) {
                unlock("TXUA");
            }
            if (ComData.getTMRTConfig(4, 1).equals("1")) {
                jCheckBox2.setSelected(true);
            } else {
                jCheckBox2.setSelected(false);
            }
            if (ComData.getTMRTConfig(5, 1).equals("1")) {
                jCheckBox1.setSelected(true);
            } else {
                jCheckBox1.setSelected(false);
            }
            jTextField6.setText(ComData.getTMRTConfig(6, 1));
        } else {
            if (!TXUAlocked) {
                lock("TXUA");
            }
        }

        if (ComData.getTLastPoll(8, 2).equals("0")) {
            if (TXUBlocked) {
                unlock("TXUB");
            }
            if (ComData.getTMRTConfig(7, 1).equals("1")) {
                jCheckBox4.setSelected(true);
            } else {
                jCheckBox4.setSelected(false);
            }
            if (ComData.getTMRTConfig(8, 1).equals("1")) {
                jCheckBox3.setSelected(true);
            } else {
                jCheckBox3.setSelected(false);
            }
            jTextField7.setText(ComData.getTMRTConfig(9, 1));
        } else {
            if (!TXUBlocked) {
                lock("TXUB");
            }
        }

        if (ComData.getTLastPoll(9, 2).equals("0")) {
            if (RXUAlocked) {
                unlock("RXUA");
            }
            if (ComData.getTMRTConfig(10, 1).equals("1")) {
                jCheckBox7.setSelected(true);
            } else {
                jCheckBox7.setSelected(false);
            }
            jTextField12.setText(ComData.getTMRTConfig(11, 1));
            jTextField13.setText(ComData.getTMRTConfig(12, 1));
            jTextField14.setText(ComData.getTMRTConfig(13, 1));
        } else {
            if (!RXUAlocked) {
                lock("RXUA");
            }
        }

        if (ComData.getTLastPoll(10, 2).equals("0")) {
            if (RXUBlocked) {
                unlock("RXUB");
            }
            if (ComData.getTMRTConfig(14, 1).equals("1")) {
                jCheckBox6.setSelected(true);
            } else {
                jCheckBox6.setSelected(false);
            }
            jTextField9.setText(ComData.getTMRTConfig(15, 1));
            jTextField10.setText(ComData.getTMRTConfig(16, 1));
            jTextField11.setText(ComData.getTMRTConfig(17, 1));
        } else {
            if (!RXUBlocked) {
                lock("RXUB");
            }
        }
    }
    
    public String[][] getDataToSend()
    {
        String[][] data = new String[21][2];
        data[0][0] = jTextField15.getText();
        data[0][1] = "0";
        for(int i =1;i<21;i++)
            data[i][0]="";
        data[1][1] = ITC.dmeconfigWin.stringToOidData(jTextField16.getText(),0);
        if(jRadioButton1.isSelected())
            data[2][1] = "0";
        else if(jRadioButton2.isSelected())
            data[2][1]= "1";
        data[3][1] = ITC.dmeconfigWin.stringToOidData(jTextField1.getText(),0);
        data[4][1] = ITC.dmeconfigWin.stringToOidData(jTextField2.getText(),0);
        data[5][1] = ITC.dmeconfigWin.stringToOidData(jTextField5.getText(),0);
        data[6][1] = ITC.dmeconfigWin.stringToOidData(jTextField8.getText(),0);  
        if(jCheckBox2.isSelected())
            data[7][1] = "1";
        else
            data[7][1]= "0"; 
        if(jCheckBox1.isSelected())
            data[8][1] = "1";
        else
            data[8][1]= "0";
        data[9][1] = ITC.dmeconfigWin.stringToOidData(jTextField6.getText(),0);        
        if(jCheckBox4.isSelected())
            data[10][1] = "1";
        else
            data[10][1]= "0"; 
        if(jCheckBox3.isSelected())
            data[11][1] = "1";
        else
            data[11][1]= "0";
        data[12][1] = ITC.dmeconfigWin.stringToOidData(jTextField7.getText(),0);                     
        if(jCheckBox7.isSelected())
            data[13][1] = "1";
        else
            data[13][1]= "0";
        data[14][1] = ITC.dmeconfigWin.stringToOidData(jTextField12.getText(),0);
        data[15][1] = ITC.dmeconfigWin.stringToOidData(jTextField13.getText(),2);
        data[16][1] = ITC.dmeconfigWin.stringToOidData(jTextField14.getText(),2);
        if(jCheckBox6.isSelected())
            data[17][1] = "1";
        else
            data[17][1]= "0";
        data[18][1] = ITC.dmeconfigWin.stringToOidData(jTextField9.getText(),0);
        data[19][1] = ITC.dmeconfigWin.stringToOidData(jTextField10.getText(),2);
        data[20][1] = ITC.dmeconfigWin.stringToOidData(jTextField11.getText(),2);       
        return data;
    }

    public static Boolean parserField(String s, int Type) {
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("???");
        jTextField1.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField1.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField1.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField1PropertyChange(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("???");
        jTextField2.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField2.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField2.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });

        jLabel3.setText("ppps (20÷60)");
        jLabel3.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel4.setText("(0÷10)");
        jLabel4.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Interrogation Rate:");
        jLabel7.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel7.setPreferredSize(new java.awt.Dimension(110, 25));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("ID Volume Control:");
        jLabel11.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel11.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel11.setPreferredSize(new java.awt.Dimension(110, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("???");
        jTextField5.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField5.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField5.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField5CaretUpdate(evt);
            }
        });

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField8.setText("???");
        jTextField8.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField8.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField8.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField8CaretUpdate(evt);
            }
        });

        jLabel12.setText("ppps (20÷60)");
        jLabel12.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel12.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel12.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel14.setText("(0÷10)");
        jLabel14.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel14.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel14.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Interrogation Rate:");
        jLabel15.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel15.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel15.setPreferredSize(new java.awt.Dimension(110, 25));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("ID Volume Control:");
        jLabel16.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel16.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel16.setPreferredSize(new java.awt.Dimension(110, 25));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU A", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField6.setText("???");
        jTextField6.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField6.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField6.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField6CaretUpdate(evt);
            }
        });

        jLabel8.setText("ppps (0÷1270)");
        jLabel8.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel8.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel8.setName(""); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 25));

        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setLabel("Squitter:");
        jCheckBox1.setMaximumSize(new java.awt.Dimension(101, 25));
        jCheckBox1.setMinimumSize(new java.awt.Dimension(101, 25));
        jCheckBox1.setPreferredSize(new java.awt.Dimension(101, 25));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Squitter Rate:");
        jLabel9.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel9.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel9.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox2.setLabel("Ident:");
        jCheckBox2.setMaximumSize(new java.awt.Dimension(101, 25));
        jCheckBox2.setMinimumSize(new java.awt.Dimension(101, 25));
        jCheckBox2.setPreferredSize(new java.awt.Dimension(101, 25));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU B", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.setText("???");
        jTextField7.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField7.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField7.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField7CaretUpdate(evt);
            }
        });

        jLabel10.setText("ppps (0÷1270)");
        jLabel10.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel10.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 25));

        jCheckBox3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox3.setLabel("Squitter:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Squitter Rate:");
        jLabel13.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel13.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel13.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox4.setLabel("Ident:");
        jCheckBox4.setMaximumSize(new java.awt.Dimension(101, 25));
        jCheckBox4.setMinimumSize(new java.awt.Dimension(101, 25));
        jCheckBox4.setPreferredSize(new java.awt.Dimension(101, 25));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU B", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField9.setText("???");
        jTextField9.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField9.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField9.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField9CaretUpdate(evt);
            }
        });

        jLabel17.setText("ppps (2400÷5000)");
        jLabel17.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel17.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel17.setPreferredSize(new java.awt.Dimension(110, 25));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("ASC Threshold:");
        jLabel18.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel18.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel18.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox6.setText("Automatic Sensitivity Control:");
        jCheckBox6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Sensitivity Level:");
        jLabel19.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel19.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel19.setPreferredSize(new java.awt.Dimension(80, 25));

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setText("???");
        jTextField10.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField10.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField10.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField10CaretUpdate(evt);
            }
        });

        jLabel20.setText("dBm (-100÷-30)");
        jLabel20.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel20.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel20.setPreferredSize(new java.awt.Dimension(110, 25));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Sensitivity Control Step:");
        jLabel21.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel21.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel21.setPreferredSize(new java.awt.Dimension(80, 25));

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField11.setText("???");
        jTextField11.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField11.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField11.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField11CaretUpdate(evt);
            }
        });

        jLabel22.setText("dB (0.0÷1.0)");
        jLabel22.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel22.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel22.setPreferredSize(new java.awt.Dimension(110, 25));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU A", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField12.setText("???");
        jTextField12.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField12.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField12.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField12CaretUpdate(evt);
            }
        });

        jLabel23.setText("ppps (2400÷5000)");
        jLabel23.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel23.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel23.setPreferredSize(new java.awt.Dimension(110, 25));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("ASC Threshold:");
        jLabel24.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel24.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel24.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox7.setText("Automatic Sensitivity Control:");
        jCheckBox7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Sensitivity Level:");
        jLabel25.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel25.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel25.setPreferredSize(new java.awt.Dimension(80, 25));

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField13.setText("???");
        jTextField13.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField13.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField13.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField13CaretUpdate(evt);
            }
        });

        jLabel26.setText("dBm (-100÷-30)");
        jLabel26.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel26.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel26.setPreferredSize(new java.awt.Dimension(110, 25));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Sensitivity Control Step:");
        jLabel27.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel27.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel27.setPreferredSize(new java.awt.Dimension(80, 25));

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField14.setText("???");
        jTextField14.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField14.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField14.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField14CaretUpdate(evt);
            }
        });

        jLabel28.setText("dB (0.0÷1.0)");
        jLabel28.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel28.setMinimumSize(new java.awt.Dimension(110, 25));
        jLabel28.setPreferredSize(new java.awt.Dimension(110, 25));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jCheckBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Navaid Name:");
        jLabel29.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel29.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel29.setPreferredSize(new java.awt.Dimension(80, 25));

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("???");
        jTextField15.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField15.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField15.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Operative Channel:");
        jLabel5.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(34, 25));

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField16.setText("???");
        jTextField16.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField16.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField16.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField16CaretUpdate(evt);
            }
        });

        jLabel30.setText("(1÷126)");
        jLabel30.setToolTipText("");
        jLabel30.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel30.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel30.setName(""); // NOI18N
        jLabel30.setPreferredSize(new java.awt.Dimension(80, 25));

        jRadioButton1.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("X");
        jRadioButton1.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton1.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton1.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton2.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Y");
        jRadioButton2.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton2.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton2.setPreferredSize(new java.awt.Dimension(65, 25));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1CaretPositionChanged
        //
    }//GEN-LAST:event_jTextField1CaretPositionChanged

    private void jTextField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField1PropertyChange
        //
    }//GEN-LAST:event_jTextField1PropertyChange


    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField1.getText(),20,60) == 1) {
            jTextField1.setBackground(Color.white);
            jTextField1.setForeground(Color.BLACK);
        } else {
            jTextField1.setBackground(Color.red);
            jTextField1.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField2.getText(),0,10) == 1) {
            jTextField2.setBackground(Color.white);
            jTextField2.setForeground(Color.BLACK);
        } else {
            jTextField2.setBackground(Color.red);
            jTextField2.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField2CaretUpdate

    private void jTextField5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField5CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField5.getText(),20,60) == 1) {
            jTextField5.setBackground(Color.white);
            jTextField5.setForeground(Color.BLACK);
        } else {
            jTextField5.setBackground(Color.red);
            jTextField5.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField5CaretUpdate

    private void jTextField8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField8CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField8.getText(),0,10) == 1) {
            jTextField8.setBackground(Color.white);
            jTextField8.setForeground(Color.BLACK);
        } else {
            jTextField8.setBackground(Color.red);
            jTextField8.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField8CaretUpdate

    private void jTextField16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField16CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField16.getText(),1,126)==1){
            jTextField16.setBackground(Color.white);
            jTextField16.setForeground(Color.BLACK);
        }else{
            jTextField16.setBackground(Color.red);
            jTextField16.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField16CaretUpdate

    private void jTextField6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField6CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField6.getText(),0,1270)==1){
            jTextField6.setBackground(Color.white);
            jTextField6.setForeground(Color.BLACK);
        }else{
            jTextField6.setBackground(Color.red);
            jTextField6.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField6CaretUpdate

    private void jTextField7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField7CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField7.getText(),0,1270)==1){
            jTextField7.setBackground(Color.white);
            jTextField7.setForeground(Color.BLACK);
        }else{
            jTextField7.setBackground(Color.red);
            jTextField7.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField7CaretUpdate

    private void jTextField12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField12CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField12.getText(), 2400, 5000)==1){
            jTextField12.setBackground(Color.white);
            jTextField12.setForeground(Color.BLACK);
        }else{
            jTextField12.setBackground(Color.red);
            jTextField12.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField12CaretUpdate

    private void jTextField9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField9CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField9.getText(), 2400, 5000)==1){
            jTextField9.setBackground(Color.white);
            jTextField9.setForeground(Color.BLACK);
        }else{
            jTextField9.setBackground(Color.red);
            jTextField9.setForeground(Color.yellow);
        } 
    }//GEN-LAST:event_jTextField9CaretUpdate

    private void jTextField13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField13CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField13.getText(), -100, 30)>0){
            jTextField13.setBackground(Color.white);
            jTextField13.setForeground(Color.BLACK);
        }else{
            jTextField13.setBackground(Color.red);
            jTextField13.setForeground(Color.yellow);
        } 
    }//GEN-LAST:event_jTextField13CaretUpdate

    private void jTextField10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField10CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField10.getText(), -100, 30)>0){
            jTextField10.setBackground(Color.white);
            jTextField10.setForeground(Color.BLACK);
        }else{
            jTextField10.setBackground(Color.red);
            jTextField10.setForeground(Color.yellow);
        } 
    }//GEN-LAST:event_jTextField10CaretUpdate

    private void jTextField14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField14CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField14.getText(), 0.0, 1.0)>0){
            jTextField14.setBackground(Color.white);
            jTextField14.setForeground(Color.BLACK);
        }else{
            jTextField14.setBackground(Color.red);
            jTextField14.setForeground(Color.yellow);
        } 
    }//GEN-LAST:event_jTextField14CaretUpdate

    private void jTextField11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField11.getText(), 0.0, 1.0)>0){
            jTextField11.setBackground(Color.white);
            jTextField11.setForeground(Color.BLACK);
        }else{
            jTextField11.setBackground(Color.red);
            jTextField11.setForeground(Color.yellow);
        } 
    }//GEN-LAST:event_jTextField11CaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
