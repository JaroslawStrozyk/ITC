package Components;

import Communication.ComData;
import MainItc.ITC;
import java.awt.Color;

/**
 *
 * @author jaroslaw.strozyk
 */
public class ConfOffset extends javax.swing.JPanel {

    /**
     * Creates new form ConfInstalation
     */
    public ConfOffset() {
        initComponents();
        MTU1locked = false;
        MTU4locked = false;
        TXUAlocked = false;
        TXUBlocked = false;
    }

    private boolean MTU1locked;
    private boolean MTU4locked;
    private boolean TXUAlocked;
    private boolean TXUBlocked;

    public boolean allFieldsAreCorrect()
    {
        if(jTextField8.getBackground().equals(Color.red))
            return false;
        if(jTextField10.getBackground().equals(Color.red))
            return false;
        if(jTextField12.getBackground().equals(Color.red))
            return false;
        if(jTextField13.getBackground().equals(Color.red))
            return false;
        if(jTextField14.getBackground().equals(Color.red))
            return false;
        if(jTextField15.getBackground().equals(Color.red))
            return false;
        if(jTextField16.getBackground().equals(Color.red))
            return false;
        if(jTextField17.getBackground().equals(Color.red))
            return false;
        if(jTextField18.getBackground().equals(Color.red))
            return false;
        if(jTextField19.getBackground().equals(Color.red))
            return false;
        if(jTextField20.getBackground().equals(Color.red))
            return false;
        if(jTextField21.getBackground().equals(Color.red))
            return false;   
        if(jTextField9.getBackground().equals(Color.red))
            return false;
        if(jTextField22.getBackground().equals(Color.red))
            return false;
        if(jTextField23.getBackground().equals(Color.red))
            return false;
        if(jTextField24.getBackground().equals(Color.red))
            return false;
        if(jTextField33.getBackground().equals(Color.red))
            return false;
        if(jTextField34.getBackground().equals(Color.red))
            return false;
        if(jTextField35.getBackground().equals(Color.red))
            return false;
        if(jTextField36.getBackground().equals(Color.red))
            return false;
        return true;
    }

    private void lock(String cardName) {
        switch (cardName) {
            case "MTU1":
                jTextField9.setEnabled(false);
                jTextField22.setEnabled(false);
                jTextField23.setEnabled(false);
                jTextField24.setEnabled(false);
                jRadioButton5.setEnabled(false);
                jRadioButton6.setEnabled(false);
                jTextField9.setText("");
                ;
                jTextField22.setText("");
                jTextField23.setText("");
                jTextField24.setText("");
                jRadioButton5.setSelected(false);
                jRadioButton6.setSelected(false);
                MTU1locked = true;
                break;
            case "MTU4":
                jTextField33.setEnabled(false);
                jTextField34.setEnabled(false);
                jTextField35.setEnabled(false);
                jTextField36.setEnabled(false);
                jRadioButton7.setEnabled(false);
                jRadioButton8.setEnabled(false);
                jTextField33.setText("");
                jTextField34.setText("");
                jTextField35.setText("");
                jTextField36.setText("");
                jRadioButton7.setSelected(false);
                jRadioButton8.setSelected(false);
                MTU4locked = true;
                break;
            case "TXUA":
                jTextField8.setEnabled(false);
                jTextField10.setEnabled(false);
                jTextField12.setEnabled(false);
                jTextField13.setEnabled(false);
                jTextField14.setEnabled(false);
                jTextField15.setEnabled(false);
                jTextField8.setText("");
                jTextField10.setText("");
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                TXUAlocked = true;
                break;
            case "TXUB":
                jTextField16.setEnabled(false);
                jTextField17.setEnabled(false);
                jTextField18.setEnabled(false);
                jTextField19.setEnabled(false);
                jTextField20.setEnabled(false);
                jTextField21.setEnabled(false);
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField18.setText("");
                jTextField19.setText("");
                jTextField20.setText("");
                jTextField21.setText("");
                TXUBlocked = true;
                break;
            default:
                break;
        }
    }

    private void unlock(String cardName) {
        switch (cardName) {
            case "MTU1":
                jTextField9.setEnabled(true);
                jTextField22.setEnabled(true);
                jTextField23.setEnabled(true);
                jTextField24.setEnabled(true);
                jRadioButton5.setEnabled(true);
                jRadioButton6.setEnabled(true);
                MTU1locked = false;
                break;
            case "MTU4":
                jTextField33.setEnabled(true);
                jTextField34.setEnabled(true);
                jTextField35.setEnabled(true);
                jTextField36.setEnabled(true);
                jRadioButton7.setEnabled(true);
                jRadioButton8.setEnabled(true);
                MTU4locked = false;
                break;
            case "TXUA":
                jTextField8.setEnabled(true);
                jTextField10.setEnabled(true);
                jTextField12.setEnabled(true);
                jTextField13.setEnabled(true);
                jTextField14.setEnabled(true);
                jTextField15.setEnabled(true);
                TXUAlocked = false;
                break;
            case "TXUB":
                jTextField16.setEnabled(true);
                jTextField17.setEnabled(true);
                jTextField18.setEnabled(true);
                jTextField19.setEnabled(true);
                jTextField20.setEnabled(true);
                jTextField21.setEnabled(true);
                TXUBlocked = false;
                break;
            default:
                break;
        }
    }

    public void displayInstConfig() {
        if (ComData.getTLastPoll(7, 2).equals("0")) {
            if (TXUAlocked) {
                unlock("TXUA");
            }

            jTextField8.setText(ComData.getTInstConfig(18, 1));
            jTextField10.setText(ComData.getTInstConfig(19, 1));
            jTextField12.setText(ComData.getTInstConfig(20, 1));
            jTextField13.setText(ComData.getTInstConfig(21, 1));
            jTextField14.setText(ComData.getTInstConfig(22, 1));
            jTextField15.setText(ComData.getTInstConfig(23, 1));
        } else {
            if (!TXUAlocked) {
                lock("TXUA");
            }
        }

        if (ComData.getTLastPoll(8, 2).equals("0")) {
            if (TXUBlocked) {
                unlock("TXUB");
            }

            jTextField16.setText(ComData.getTInstConfig(24, 1));
            jTextField17.setText(ComData.getTInstConfig(25, 1));
            jTextField18.setText(ComData.getTInstConfig(26, 1));
            jTextField19.setText(ComData.getTInstConfig(27, 1));
            jTextField20.setText(ComData.getTInstConfig(28, 1));
            jTextField21.setText(ComData.getTInstConfig(29, 1));
        } else {
            if (!TXUBlocked) {
                lock("TXUB");
            }
        }

        if (ComData.getTLastPoll(3, 2).equals("0")) {
            if (MTU1locked) {
                unlock("MTU1");
            }

            jTextField9.setText(ComData.getTInstConfig(30, 1));
            jTextField22.setText(ComData.getTInstConfig(31, 1));
            jTextField23.setText(ComData.getTInstConfig(32, 1));
            jTextField24.setText(ComData.getTInstConfig(33, 1));
            if (ComData.getTInstConfig(34, 1).equals("0")) {
                jRadioButton5.setSelected(true);
            } else if (ComData.getTInstConfig(34, 1).equals("1")) {
                jRadioButton6.setSelected(true);
            }
        } else {
            if (!MTU1locked) {
                lock("MTU1");
            }
        }

        if (ComData.getTLastPoll(4, 2).equals("0")) {
            if (MTU4locked) {
                unlock("MTU4");
            }

            jTextField33.setText(ComData.getTInstConfig(35, 1));
            jTextField34.setText(ComData.getTInstConfig(36, 1));
            jTextField35.setText(ComData.getTInstConfig(37, 1));
            jTextField36.setText(ComData.getTInstConfig(38, 1));
            if (ComData.getTInstConfig(39, 1).equals("0")) {
                jRadioButton7.setSelected(true);
            } else if (ComData.getTInstConfig(39, 1).equals("1")) {
                jRadioButton8.setSelected(true);
            }
        } else {
            if (!MTU4locked) {
                lock("MTU4");
            }
        }
    }

        public String[] getDataToSend()
    {
        String[] data = new String[22];
        

        data[0] = ITC.dmeconfigWin.stringToOidData(jTextField8.getText(),3);
        data[1] = ITC.dmeconfigWin.stringToOidData(jTextField10.getText(),3);       
        data[2] = ITC.dmeconfigWin.stringToOidData(jTextField12.getText(),2);
        data[3] = ITC.dmeconfigWin.stringToOidData(jTextField13.getText(),0); 
        data[4] = ITC.dmeconfigWin.stringToOidData(jTextField14.getText(),0);
        data[5] = ITC.dmeconfigWin.stringToOidData(jTextField15.getText(),2); 
        data[6] = ITC.dmeconfigWin.stringToOidData(jTextField16.getText(),3);
        data[7] = ITC.dmeconfigWin.stringToOidData(jTextField17.getText(),3); 
        data[8] = ITC.dmeconfigWin.stringToOidData(jTextField18.getText(),2);
        data[9] = ITC.dmeconfigWin.stringToOidData(jTextField19.getText(),0);        
        data[10] = ITC.dmeconfigWin.stringToOidData(jTextField20.getText(),0);
        data[11] = ITC.dmeconfigWin.stringToOidData(jTextField21.getText(),2); 
        
        data[12] = ITC.dmeconfigWin.stringToOidData(jTextField9.getText(),3);
        data[13] = ITC.dmeconfigWin.stringToOidData(jTextField22.getText(),2); 
        data[14] = ITC.dmeconfigWin.stringToOidData(jTextField23.getText(),2);
        data[15] = ITC.dmeconfigWin.stringToOidData(jTextField24.getText(),2); 
         if(jRadioButton5.isSelected())
            data[16] = "0";
        else if(jRadioButton6.isSelected())
            data[16]= "1";
               
        data[17] = ITC.dmeconfigWin.stringToOidData(jTextField33.getText(),3);
        data[18] = ITC.dmeconfigWin.stringToOidData(jTextField34.getText(),2);        
        data[19] = ITC.dmeconfigWin.stringToOidData(jTextField35.getText(),2);
        data[20] = ITC.dmeconfigWin.stringToOidData(jTextField36.getText(),2); 
        if(jRadioButton7.isSelected())
            data[21] = "0";
        else if(jRadioButton8.isSelected())
            data[21]= "1";
 
        return data;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();

        setMaximumSize(new java.awt.Dimension(567, 491));
        setMinimumSize(new java.awt.Dimension(567, 491));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offsets & Adjustments", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("X Channel Reply Delay Offset:");
        jLabel16.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel16.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Y Channel Reply Delay Offset:");
        jLabel17.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel17.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Operative Power Adj.:");
        jLabel19.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel19.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Low Power Pulse Width Adj.:");
        jLabel21.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel21.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("High Power Pulse Width Adj.:");
        jLabel22.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel22.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Output Power Offset:");
        jLabel23.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel23.setPreferredSize(new java.awt.Dimension(34, 25));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

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

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField15.setText("???");
        jTextField15.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField15.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField15.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField15CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

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

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField17.setText("???");
        jTextField17.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField17.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField17.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField17CaretUpdate(evt);
            }
        });

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField18.setText("???");
        jTextField18.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField18.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField18.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField18.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField18CaretUpdate(evt);
            }
        });

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField19.setText("???");
        jTextField19.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField19.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField19.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField19.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField19CaretUpdate(evt);
            }
        });

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField20.setText("???");
        jTextField20.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField20.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField20.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField20.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField20CaretUpdate(evt);
            }
        });

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField21.setText("???");
        jTextField21.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField21.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField21.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField21.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField21CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel18.setText("µs (0.00÷70.00)");
        jLabel18.setToolTipText("");
        jLabel18.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel18.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel18.setName(""); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel24.setText("µs (0.00÷70.00)");
        jLabel24.setToolTipText("");
        jLabel24.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel24.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel24.setName(""); // NOI18N
        jLabel24.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel25.setText("dB (0.00÷1.50)");
        jLabel25.setToolTipText("");
        jLabel25.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel25.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel25.setName(""); // NOI18N
        jLabel25.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel26.setText("% (-42÷42)");
        jLabel26.setToolTipText("");
        jLabel26.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel26.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel26.setName(""); // NOI18N
        jLabel26.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel27.setText("% (-42÷42)");
        jLabel27.setToolTipText("");
        jLabel27.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel27.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel27.setName(""); // NOI18N
        jLabel27.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel28.setText("dB (-4.00÷0.00)");
        jLabel28.setToolTipText("");
        jLabel28.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel28.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel28.setName(""); // NOI18N
        jLabel28.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Reply Delay Offset:");
        jLabel29.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel29.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Antenna Cable Losses:");
        jLabel30.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel30.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Transmitted Power Offset:");
        jLabel31.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel31.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Radiated Power Offset:");
        jLabel32.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel32.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Efficency Test User Power Offset:");
        jLabel33.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel33.setPreferredSize(new java.awt.Dimension(34, 25));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setText("???");
        jTextField9.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField9.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField9.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField9CaretUpdate(evt);
            }
        });

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField22.setText("???");
        jTextField22.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField22.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField22.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField22CaretUpdate(evt);
            }
        });

        jTextField23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField23.setText("???");
        jTextField23.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField23.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField23.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField23.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField23CaretUpdate(evt);
            }
        });

        jTextField24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField24.setText("???");
        jTextField24.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField24.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField24.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField24.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField24CaretUpdate(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup4.add(jRadioButton5);
        jRadioButton5.setText("6dB");
        jRadioButton5.setMaximumSize(new java.awt.Dimension(50, 25));
        jRadioButton5.setMinimumSize(new java.awt.Dimension(50, 25));
        jRadioButton5.setPreferredSize(new java.awt.Dimension(50, 25));

        jRadioButton6.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup4.add(jRadioButton6);
        jRadioButton6.setText("15dB");
        jRadioButton6.setMaximumSize(new java.awt.Dimension(50, 25));
        jRadioButton6.setMinimumSize(new java.awt.Dimension(50, 25));
        jRadioButton6.setPreferredSize(new java.awt.Dimension(50, 25));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
            .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel35.setText("µs (-15.00÷30.00)");
        jLabel35.setToolTipText("");
        jLabel35.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel35.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel35.setName(""); // NOI18N
        jLabel35.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel36.setText("dB (0.0÷150.0)");
        jLabel36.setToolTipText("");
        jLabel36.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel36.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel36.setName(""); // NOI18N
        jLabel36.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel37.setText("dB (-2.0÷2.0)");
        jLabel37.setToolTipText("");
        jLabel37.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel37.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel37.setName(""); // NOI18N
        jLabel37.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel38.setText("dB (-2.0÷2.0)");
        jLabel38.setToolTipText("");
        jLabel38.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel38.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel38.setName(""); // NOI18N
        jLabel38.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel39.setToolTipText("");
        jLabel39.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel39.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel39.setName(""); // NOI18N
        jLabel39.setPreferredSize(new java.awt.Dimension(80, 25));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField33.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField33.setText("???");
        jTextField33.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField33.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField33.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField33.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField33CaretUpdate(evt);
            }
        });

        jTextField34.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField34.setText("???");
        jTextField34.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField34.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField34.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField34.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField34CaretUpdate(evt);
            }
        });

        jTextField35.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField35.setText("???");
        jTextField35.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField35.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField35.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField35.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField35CaretUpdate(evt);
            }
        });

        jTextField36.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField36.setText("???");
        jTextField36.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField36.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField36.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField36.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField36CaretUpdate(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup5.add(jRadioButton7);
        jRadioButton7.setText("6dB");
        jRadioButton7.setMaximumSize(new java.awt.Dimension(50, 25));
        jRadioButton7.setMinimumSize(new java.awt.Dimension(50, 25));
        jRadioButton7.setPreferredSize(new java.awt.Dimension(50, 25));

        jRadioButton8.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup5.add(jRadioButton8);
        jRadioButton8.setText("15dB");
        jRadioButton8.setMaximumSize(new java.awt.Dimension(50, 25));
        jRadioButton8.setMinimumSize(new java.awt.Dimension(50, 25));
        jRadioButton8.setPreferredSize(new java.awt.Dimension(50, 25));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
            .addComponent(jTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 491, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField8CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField8.getText(), 0.00, 70.00) > 0) {
            jTextField8.setBackground(Color.white);
            jTextField8.setForeground(Color.BLACK);
        } else {
            jTextField8.setBackground(Color.red);
            jTextField8.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField8CaretUpdate

    private void jTextField10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField10CaretUpdate
          if (ITC.dmeconfigWin.parseField(jTextField10.getText(), 0.00, 70.00) > 0) {
            jTextField10.setBackground(Color.white);
            jTextField10.setForeground(Color.BLACK);
        } else {
            jTextField10.setBackground(Color.red);
            jTextField10.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField10CaretUpdate

    private void jTextField16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField16CaretUpdate
          if (ITC.dmeconfigWin.parseField(jTextField16.getText(), 0.00, 70.00) > 0) {
            jTextField16.setBackground(Color.white);
            jTextField16.setForeground(Color.BLACK);
        } else {
            jTextField16.setBackground(Color.red);
            jTextField16.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField16CaretUpdate

    private void jTextField17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField17CaretUpdate
          if (ITC.dmeconfigWin.parseField(jTextField17.getText(), 0.00, 70.00) > 0) {
            jTextField17.setBackground(Color.white);
            jTextField17.setForeground(Color.BLACK);
        } else {
            jTextField17.setBackground(Color.red);
            jTextField17.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField17CaretUpdate

    private void jTextField12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField12CaretUpdate
          if (ITC.dmeconfigWin.parseField(jTextField12.getText(), 0.00, 1.50) > 0) {
            jTextField12.setBackground(Color.white);
            jTextField12.setForeground(Color.BLACK);
        } else {
            jTextField12.setBackground(Color.red);
            jTextField12.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField12CaretUpdate

    private void jTextField18CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField18CaretUpdate
         if (ITC.dmeconfigWin.parseField(jTextField18.getText(), 0.00, 1.50) > 0) {
            jTextField18.setBackground(Color.white);
            jTextField18.setForeground(Color.BLACK);
        } else {
            jTextField18.setBackground(Color.red);
            jTextField18.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField18CaretUpdate

    private void jTextField13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField13CaretUpdate
          if (ITC.dmeconfigWin.parseField(jTextField13.getText(), -42, 42) > 0) {
            jTextField13.setBackground(Color.white);
            jTextField13.setForeground(Color.BLACK);
        } else {
            jTextField13.setBackground(Color.red);
            jTextField13.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField13CaretUpdate

    private void jTextField19CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField19CaretUpdate
          if (ITC.dmeconfigWin.parseField(jTextField19.getText(), -42, 42) > 0) {
            jTextField19.setBackground(Color.white);
            jTextField19.setForeground(Color.BLACK);
        } else {
            jTextField19.setBackground(Color.red);
            jTextField19.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField19CaretUpdate

    private void jTextField14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField14CaretUpdate
         if (ITC.dmeconfigWin.parseField(jTextField14.getText(), -42, 42) > 0) {
            jTextField14.setBackground(Color.white);
            jTextField14.setForeground(Color.BLACK);
        } else {
            jTextField14.setBackground(Color.red);
            jTextField14.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField14CaretUpdate

    private void jTextField20CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField20CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField20.getText(), -42, 42) > 0) {
            jTextField20.setBackground(Color.white);
            jTextField20.setForeground(Color.BLACK);
        } else {
            jTextField20.setBackground(Color.red);
            jTextField20.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField20CaretUpdate

    private void jTextField15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField15CaretUpdate
         if (ITC.dmeconfigWin.parseField(jTextField15.getText(), -4, 0) > 0) {
            jTextField15.setBackground(Color.white);
            jTextField15.setForeground(Color.BLACK);
        } else {
            jTextField15.setBackground(Color.red);
            jTextField15.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField15CaretUpdate

    private void jTextField21CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField21CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField21.getText(), -4.00, 0.00) > 0) {
            jTextField21.setBackground(Color.white);
            jTextField21.setForeground(Color.BLACK);
        } else {
            jTextField21.setBackground(Color.red);
            jTextField21.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField21CaretUpdate

    private void jTextField9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField9CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField9.getText(), -15.00, 30.00) > 0) {
            jTextField9.setBackground(Color.white);
            jTextField9.setForeground(Color.BLACK);
        } else {
            jTextField9.setBackground(Color.red);
            jTextField9.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField9CaretUpdate

    private void jTextField33CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField33CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField33.getText(), -15.00, 30.00) > 0) {
            jTextField33.setBackground(Color.white);
            jTextField33.setForeground(Color.BLACK);
        } else {
            jTextField33.setBackground(Color.red);
            jTextField33.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField33CaretUpdate

    private void jTextField22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField22CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField22.getText(), 0.00, 150.00) > 0) {
            jTextField22.setBackground(Color.white);
            jTextField22.setForeground(Color.BLACK);
        } else {
            jTextField22.setBackground(Color.red);
            jTextField22.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField22CaretUpdate

    private void jTextField34CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField34CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField34.getText(), 0.00, 150.00) > 0) {
            jTextField34.setBackground(Color.white);
            jTextField34.setForeground(Color.BLACK);
        } else {
            jTextField34.setBackground(Color.red);
            jTextField34.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField34CaretUpdate

    private void jTextField23CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField23CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField23.getText(), -2.00, 2.00) > 0) {
            jTextField23.setBackground(Color.white);
            jTextField23.setForeground(Color.BLACK);
        } else {
            jTextField23.setBackground(Color.red);
            jTextField23.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField23CaretUpdate

    private void jTextField35CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField35CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField35.getText(), -2.00, 2.00) > 0) {
            jTextField35.setBackground(Color.white);
            jTextField35.setForeground(Color.BLACK);
        } else {
            jTextField35.setBackground(Color.red);
            jTextField35.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField35CaretUpdate

    private void jTextField24CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField24CaretUpdate
         if (ITC.dmeconfigWin.parseField(jTextField24.getText(), -2.00, 2.00) > 0) {
            jTextField24.setBackground(Color.white);
            jTextField24.setForeground(Color.BLACK);
        } else {
            jTextField24.setBackground(Color.red);
            jTextField24.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField24CaretUpdate

    private void jTextField36CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField36CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField36.getText(), -2.00, 2.00) > 0) {
            jTextField36.setBackground(Color.white);
            jTextField36.setForeground(Color.BLACK);
        } else {
            jTextField36.setBackground(Color.red);
            jTextField36.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField36CaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
