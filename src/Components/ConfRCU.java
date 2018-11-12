package Components;

import Communication.ComData;
import MainItc.ITC;
import java.awt.Color;

/**
 *
 * @author jaroslaw.strozyk
 */
public class ConfRCU extends javax.swing.JPanel {

    /**
     * Creates new form ConfRCU
     */
    public ConfRCU() {
        initComponents();
        locked = false;
    }

    private boolean locked;

    public boolean allFieldsAreCorrect()
    {
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
        return true;
    }
    
    private void lock() {
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        //jButton1.setEnabled(false);
        jTextField6.setEnabled(false);
        jTextField7.setEnabled(false);
        jTextField8.setEnabled(false);
        jTextField9.setEnabled(false);
        jTextField10.setEnabled(false);
        jTextField11.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        jRadioButton5.setEnabled(false);
        jRadioButton6.setEnabled(false);
        jRadioButton7.setEnabled(false);
        jRadioButton8.setEnabled(false);
        jRadioButton9.setEnabled(false);
        jRadioButton10.setEnabled(false);
        jRadioButton11.setEnabled(false);
        jRadioButton12.setEnabled(false);
        jRadioButton13.setEnabled(false);
        jRadioButton14.setEnabled(false);

        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);

        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton8.setSelected(false);
        jRadioButton9.setSelected(false);
        jRadioButton10.setSelected(false);
        jRadioButton11.setSelected(false);
        jRadioButton12.setSelected(false);
        jRadioButton13.setSelected(false);
        jRadioButton14.setEnabled(false);

        locked = true;
    }

    private void unlock() {
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        //jButton1.setEnabled(true);
        jTextField6.setEnabled(true);
        jTextField7.setEnabled(true);
        jTextField8.setEnabled(true);
        jTextField9.setEnabled(true);
        jTextField10.setEnabled(true);
        jTextField11.setEnabled(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        jRadioButton5.setEnabled(true);
        jRadioButton6.setEnabled(true);
        jRadioButton7.setEnabled(true);
        jRadioButton8.setEnabled(true);
        jRadioButton9.setEnabled(true);
        jRadioButton10.setEnabled(true);
        jRadioButton11.setEnabled(true);
        jRadioButton12.setEnabled(true);
        jRadioButton13.setEnabled(true);
        jRadioButton14.setEnabled(true);

        locked = false;
    }

    public void displayRCUConfig() {
        if (ComData.getTLastPoll(0, 2).equals("0")) {
            if (locked) {
                unlock();
            }

            if (ComData.getTRCUConfig(0, 1).equals("1")) {
                jCheckBox2.setSelected(true);
            } else {
                jCheckBox2.setSelected(false);
            }
            if (ComData.getTRCUConfig(1, 1).equals("1")) {
                jCheckBox1.setSelected(true);
            } else {
                jCheckBox1.setSelected(false);
            }
            ///
            jTextField6.setText(ComData.getTRCUConfig(3, 1));
            jTextField7.setText(ComData.getTRCUConfig(4, 1));
            jTextField8.setText(ComData.getTRCUConfig(5, 1));
            jTextField9.setText(ComData.getTRCUConfig(6, 1));
            if (ComData.getTRCUConfig(7, 1).equals("1")) {
                jCheckBox4.setSelected(true);
            } else {
                jCheckBox4.setSelected(false);
            }
            if (ComData.getTRCUConfig(8, 1).equals("1")) {
                jCheckBox3.setSelected(true);
            } else {
                jCheckBox3.setSelected(false);
            }
            if (ComData.getTRCUConfig(9, 1).equals("0")) {
                jRadioButton1.setSelected(true);
            } else if (ComData.getTRCUConfig(9, 1).equals("1")) {
                jRadioButton2.setSelected(true);
            }
            switch (ComData.getTRCUConfig(10, 1)) {
                case "0":
                    jRadioButton3.setSelected(true);
                    break;
                case "1":
                    jRadioButton4.setSelected(true);
                    break;
                case "2":
                    jRadioButton5.setSelected(true);
                    break;
                case "3":
                    jRadioButton6.setSelected(true);
                    break;
                default:
                    break;
            }
            switch (ComData.getTRCUConfig(11, 1)) {
                case "0":
                    jRadioButton7.setSelected(true);
                    break;
                case "1":
                    jRadioButton8.setSelected(true);
                    break;
                case "2":
                    jRadioButton9.setSelected(true);
                    break;
                case "3":
                    jRadioButton10.setSelected(true);
                    break;
                default:
                    break;
            }
            if (ComData.getTRCUConfig(12, 1).equals("0")) {
                jRadioButton11.setSelected(true);
            } else if (ComData.getTRCUConfig(12, 1).equals("1")) {
                jRadioButton12.setSelected(true);
            }
            if (ComData.getTRCUConfig(13, 1).equals("0")) {
                jRadioButton13.setSelected(true);
            } else if (ComData.getTRCUConfig(13, 1).equals("1")) {
                jRadioButton14.setSelected(true);
            }
            if (ComData.getTRCUConfig(14, 1).equals("1")) {
                jCheckBox5.setSelected(true);
            } else {
                jCheckBox5.setSelected(false);
            }
            jTextField10.setText(ComData.getTRCUConfig(15, 1));
            jTextField11.setText(ComData.getTRCUConfig(16, 1));
        } else {
            if (!locked) {
                lock();
            }
        }
    }
    
    public String[] getDataToSend()
    {
        String[] data = new String[16];
        
        if(jCheckBox2.isSelected())
            data[0] = "1";
        else
            data[0]= "0";       
        
        if(jCheckBox1.isSelected())
            data[1] = "1";
        else
            data[1]= "0";                  
        
        data[2] = ITC.dmeconfigWin.stringToOidData(jTextField6.getText(),0);
        data[3] = ITC.dmeconfigWin.stringToOidData(jTextField7.getText(),0);        
        data[4] = ITC.dmeconfigWin.stringToOidData(jTextField8.getText(),1);
        data[5] = ITC.dmeconfigWin.stringToOidData(jTextField9.getText(),1);  
        
        if(jCheckBox4.isSelected())
            data[6] = "1";
        else
            data[6]= "0";  
        
        if(jCheckBox3.isSelected())
            data[7] = "1";
        else
            data[7]= "0";
        
        if(jRadioButton1.isSelected())
            data[8] = "0";
        else if(jRadioButton2.isSelected())
            data[8]= "1";
        
        if(jRadioButton3.isSelected())
            data[9] = "0";
        else if(jRadioButton4.isSelected())
            data[9]= "1";
        else if(jRadioButton5.isSelected())
            data[9] = "2";
        else if(jRadioButton6.isSelected())
            data[9]= "3";        
  
        if(jRadioButton7.isSelected())
            data[10] = "0";
        else if(jRadioButton8.isSelected())
            data[10]= "1";
        else if(jRadioButton9.isSelected())
            data[10] = "2";
        else if(jRadioButton10.isSelected())
            data[10]= "3";       
        
        if(jRadioButton11.isSelected())
            data[11] = "0";
        else if(jRadioButton12.isSelected())
            data[11]= "1";

        if(jRadioButton13.isSelected())
            data[12] = "0";
        else if(jRadioButton14.isSelected())
            data[12]= "1";
        
        if(jCheckBox5.isSelected())
            data[13] = "1";
        else
            data[13]= "0";  
        
        data[14] = ITC.dmeconfigWin.stringToOidData(jTextField10.getText(),0);
        data[15] = ITC.dmeconfigWin.stringToOidData(jTextField11.getText(),0);  
                  
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
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recycle Count", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

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

        jLabel8.setText("(0÷10)");
        jLabel8.setToolTipText("");
        jLabel8.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel8.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel8.setName(""); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox1.setText("Absolute Recycle Limit :");
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setMaximumSize(new java.awt.Dimension(151, 25));
        jCheckBox1.setMinimumSize(new java.awt.Dimension(151, 25));
        jCheckBox1.setPreferredSize(new java.awt.Dimension(151, 25));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Recycle Count Limit:");
        jLabel9.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel9.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel9.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox2.setLabel("Relative Recycle Limit:");
        jCheckBox2.setMaximumSize(new java.awt.Dimension(151, 25));
        jCheckBox2.setMinimumSize(new java.awt.Dimension(151, 25));
        jCheckBox2.setPreferredSize(new java.awt.Dimension(151, 25));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Recycle Delay Period:");
        jLabel10.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel10.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 25));

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

        jLabel11.setText("sec (5÷300)");
        jLabel11.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel11.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel11.setName(""); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel13.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel13.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel13.setName(""); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alarms", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

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

        jLabel14.setText("sec (0.5÷12.6)");
        jLabel14.setToolTipText("");
        jLabel14.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel14.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel14.setName(""); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox3.setText("Secondary BITE Alarm Inhibit:");
        jCheckBox3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox3.setMaximumSize(new java.awt.Dimension(151, 25));
        jCheckBox3.setMinimumSize(new java.awt.Dimension(151, 25));
        jCheckBox3.setPreferredSize(new java.awt.Dimension(151, 25));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Executive Alarm Filter Time:");
        jLabel15.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel15.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel15.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox4.setText("Secondary Exec Alarm Inhibit:");
        jCheckBox4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox4.setMaximumSize(new java.awt.Dimension(151, 25));
        jCheckBox4.setMinimumSize(new java.awt.Dimension(151, 25));
        jCheckBox4.setPreferredSize(new java.awt.Dimension(151, 25));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("BITE Alarm Filter Time:");
        jLabel16.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel16.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel16.setPreferredSize(new java.awt.Dimension(80, 25));

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

        jLabel17.setText("sec (0.5÷12.6)");
        jLabel17.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel17.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel17.setName(""); // NOI18N
        jLabel17.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Assignment", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("MTU Assignment Policy:");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("MTU 1 Static Assignment:");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("MTU 4 Static Assignment:");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 25));

        jRadioButton1.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Dynamic");
        jRadioButton1.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton1.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton1.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton2.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Static");
        jRadioButton2.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton2.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton2.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton3.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Off");
        jRadioButton3.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton3.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton3.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton4.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("TXP A");
        jRadioButton4.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton4.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton4.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton5.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("TXP B");
        jRadioButton5.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton5.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton5.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton6.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Both");
        jRadioButton6.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton6.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton6.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton7.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setText("Off");
        jRadioButton7.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton7.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton7.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton8.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("TXP A");
        jRadioButton8.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton8.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton8.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton9.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("TXP B");
        jRadioButton9.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton9.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton9.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton10.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setText("Both");
        jRadioButton10.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton10.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton10.setPreferredSize(new java.awt.Dimension(65, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alarms Voting", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("TXP A Alarm Voting:");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TXP B Alarm Voting:");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 25));

        jRadioButton11.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup4.add(jRadioButton11);
        jRadioButton11.setText("AND");
        jRadioButton11.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton11.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton11.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton12.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setText("OR");
        jRadioButton12.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton12.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton12.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton13.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup5.add(jRadioButton13);
        jRadioButton13.setText("AND");
        jRadioButton13.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton13.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton13.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton14.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup5.add(jRadioButton14);
        jRadioButton14.setText("OR");
        jRadioButton14.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton14.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton14.setPreferredSize(new java.awt.Dimension(65, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buzzer", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

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

        jLabel18.setText("sec (0÷255)");
        jLabel18.setToolTipText("");
        jLabel18.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel18.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel18.setName(""); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(80, 25));

        jCheckBox5.setText("Buzzer:");
        jCheckBox5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox5.setMaximumSize(new java.awt.Dimension(151, 25));
        jCheckBox5.setMinimumSize(new java.awt.Dimension(151, 25));
        jCheckBox5.setPreferredSize(new java.awt.Dimension(151, 25));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Primary Alarm Buzzer Duration:");
        jLabel19.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel19.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel19.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Secondary Alarm Buzzer Duration:");
        jLabel20.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel20.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel20.setPreferredSize(new java.awt.Dimension(80, 25));

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

        jLabel21.setText("sec (0÷255)");
        jLabel21.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel21.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel21.setName(""); // NOI18N
        jLabel21.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField6CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField6.getText(), 0, 10) == 1) {
            jTextField6.setBackground(Color.white);
            jTextField6.setForeground(Color.BLACK);
        } else {
            jTextField6.setBackground(Color.red);
            jTextField6.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField6CaretUpdate

    private void jTextField7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField7CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField7.getText(), 5, 300) == 1) {
            jTextField7.setBackground(Color.white);
            jTextField7.setForeground(Color.BLACK);
        } else {
            jTextField7.setBackground(Color.red);
            jTextField7.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField7CaretUpdate

    private void jTextField8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField8CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField8.getText(), 0.5, 12.6) > 0) {
            jTextField8.setBackground(Color.white);
            jTextField8.setForeground(Color.BLACK);
        } else {
            jTextField8.setBackground(Color.red);
            jTextField8.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField8CaretUpdate

    private void jTextField9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField9CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField9.getText(), 0.5, 12.6) > 0) {
            jTextField9.setBackground(Color.white);
            jTextField9.setForeground(Color.BLACK);
        } else {
            jTextField9.setBackground(Color.red);
            jTextField9.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField9CaretUpdate

    private void jTextField10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField10CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField10.getText(), 0, 255) == 1) {
            jTextField10.setBackground(Color.white);
            jTextField10.setForeground(Color.BLACK);
        } else {
            jTextField10.setBackground(Color.red);
            jTextField10.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField10CaretUpdate

    private void jTextField11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField11.getText(), 0, 255) == 1) {
            jTextField11.setBackground(Color.white);
            jTextField11.setForeground(Color.BLACK);
        } else {
            jTextField11.setBackground(Color.red);
            jTextField11.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField11CaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
