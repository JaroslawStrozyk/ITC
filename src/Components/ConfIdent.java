package Components;

import Communication.ComData;
import MainItc.ITC;
import java.awt.Color;

/**
 *
 * @author jaroslaw.strozyk
 */
public class ConfIdent extends javax.swing.JPanel {

    /**
     * Creates new form ConfInstalation
     */
    public ConfIdent() {
        initComponents();
        locked = false;
    }
    
    private boolean locked;
    
    public boolean allFieldsAreCorrect()
    {
        if(jTextField11.getBackground().equals(Color.red))
            return false;
        if(jTextField12.getBackground().equals(Color.red))
            return false;
        if(jTextField13.getBackground().equals(Color.red))
            return false;
        if(jTextField14.getBackground().equals(Color.red))
            return false;
        if(jTextField15.getBackground().equals(Color.red))
            return false;
        return true;
    }
        
    private void lock()
    {
        jRadioButton11.setSelected(false);
        jRadioButton12.setSelected(false);
        jRadioButton13.setSelected(false);
        jRadioButton14.setSelected(false);
        jRadioButton15.setSelected(false);
        jRadioButton31.setSelected(false);
        jRadioButton32.setSelected(false);
        jRadioButton33.setSelected(false);
        jRadioButton34.setSelected(false);
        jRadioButton35.setSelected(false);
        jRadioButton11.setEnabled(false);
        jRadioButton12.setEnabled(false);
        jRadioButton13.setEnabled(false);
        jRadioButton14.setEnabled(false);
        jRadioButton15.setEnabled(false);
        jRadioButton31.setEnabled(false);
        jRadioButton32.setEnabled(false);
        jRadioButton33.setEnabled(false);
        jRadioButton34.setEnabled(false);
        jRadioButton35.setEnabled(false);
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField11.setEnabled(false);
        jTextField12.setEnabled(false);
        jTextField13.setEnabled(false);
        jTextField14.setEnabled(false);
        jTextField15.setEnabled(false);   
        locked = true;
    }
       
    private void unlock()
    {
        jRadioButton11.setEnabled(false);
        jRadioButton12.setEnabled(true);
        jRadioButton13.setEnabled(true);
        jRadioButton14.setEnabled(true);
        jRadioButton15.setEnabled(true);
        jRadioButton31.setEnabled(true);
        jRadioButton32.setEnabled(true);
        jRadioButton33.setEnabled(true);
        jRadioButton34.setEnabled(true);
        jRadioButton35.setEnabled(true);
        jTextField11.setEnabled(true);
        jTextField12.setEnabled(true);
        jTextField13.setEnabled(true);
        jTextField14.setEnabled(true);
        jTextField15.setEnabled(true); 
        locked = false;
    }
    
    public void displayInstConfig()
    {
        if(ComData.getTLastPoll(7, 2).equals("0"))
        {
            if(locked)
                unlock();
            switch (ComData.getTInstConfig(60, 1)) {
                case "0":
                    jRadioButton11.setSelected(true);
                    break;
                case "1":
                    jRadioButton12.setSelected(true);
                    break;
                case "2":
                    jRadioButton13.setSelected(true);
                    break;
                default:
                    break;
            }
            if(ComData.getTInstConfig(61, 1).equals("0"))
                jRadioButton14.setSelected(true);
            else if(ComData.getTInstConfig(61, 1).equals("1"))
                jRadioButton15.setSelected(true);
            switch (ComData.getTInstConfig(63, 1)) {
                case "0":
                    jRadioButton31.setSelected(true);
                    break;
                case "1":
                    jRadioButton32.setSelected(true);
                    break;
                case "2":
                    jRadioButton35.setSelected(true);
                    break;
                case "3":
                    jRadioButton33.setSelected(true);
                    break;
                case "4":
                    jRadioButton34.setSelected(true);
                    break;
                default:
                    break;
            }            
            jTextField11.setText(ComData.getTInstConfig(64, 1));
            jTextField12.setText(ComData.getTInstConfig(66, 1)); 
            jTextField13.setText(ComData.getTInstConfig(68, 1)); 
            jTextField14.setText(ComData.getTInstConfig(70, 1)); 
            jTextField15.setText(ComData.getTInstConfig(71, 1));
        }
        else if(ComData.getTLastPoll(8, 2).equals("0"))
        {
            if(locked)
                unlock();
            switch (ComData.getTInstConfig(72, 1)) {
                case "0":
                    jRadioButton11.setSelected(true);
                    break;
                case "1":
                    jRadioButton12.setSelected(true);
                    break;
                case "2":
                    jRadioButton13.setSelected(true);
                    break;
                default:
                    break;
            }
            if(ComData.getTInstConfig(73, 1).equals("0"))
                jRadioButton14.setSelected(true);
            else if(ComData.getTInstConfig(73, 1).equals("1"))
                jRadioButton15.setSelected(true);
            switch (ComData.getTInstConfig(75, 1)) {
                case "0":
                    jRadioButton31.setSelected(true);
                    break;
                case "1":
                    jRadioButton32.setSelected(true);
                    break;
                case "2":
                    jRadioButton35.setSelected(true);
                    break;
                case "3":
                    jRadioButton33.setSelected(true);
                    break;
                case "4":
                    jRadioButton34.setSelected(true);
                    break;
                default:
                    break;
            } 
            jTextField11.setText(ComData.getTInstConfig(76, 1));
            jTextField12.setText(ComData.getTInstConfig(78, 1)); 
            jTextField13.setText(ComData.getTInstConfig(80, 1)); 
            jTextField14.setText(ComData.getTInstConfig(82, 1)); 
            jTextField15.setText(ComData.getTInstConfig(83, 1));            
        }
        else
        {
            if(!locked)
                lock();
        }

    }
    
    public String[][] getDataToSend()
    {
        String[][] data = new String[8][2];
        
        data[0][0] = "";    
        if(jRadioButton11.isSelected())
            data[0][1] = "0";
        else if(jRadioButton12.isSelected())
            data[0][1]= "1";        
        else if(jRadioButton13.isSelected())
            data[0][1]= "2";        
        
        data[1][0] = "";    
        if(jRadioButton14.isSelected())
            data[1][1] = "0";
        else if(jRadioButton15.isSelected())
            data[1][1]= "1";        

        data[2][0] = "";    
        if(jRadioButton31.isSelected())
            data[2][1] = "0";
        else if(jRadioButton32.isSelected())
            data[2][1] = "1";        
        else if(jRadioButton33.isSelected())
            data[2][1] = "2";         
        else if(jRadioButton34.isSelected())
            data[2][1] = "3";
        else if(jRadioButton35.isSelected())
            data[2][1] = "4"; 
        
        data[3][0] = jTextField11.getText();
        data[3][1] = "0";
        data[4][0] = jTextField12.getText();
        data[4][1] = "0";
        data[5][0] = jTextField13.getText();
        data[5][1] = "0";        
        
        data[6][0] = ""; 
        data[6][1] = ITC.dmeconfigWin.stringToOidData(jTextField14.getText(),0);
        data[7][0] = ""; 
        data[7][1] = ITC.dmeconfigWin.stringToOidData(jTextField15.getText(),0);
                        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jTextField11 = new javax.swing.JTextField();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ident", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Ident Mode:");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 25));

        jRadioButton11.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setText("Normal");
        jRadioButton11.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton11.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton11.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton12.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setText("Test");
        jRadioButton12.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton12.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton12.setPreferredSize(new java.awt.Dimension(65, 25));

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("???");
        jTextField11.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField11.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField11.setPreferredSize(new java.awt.Dimension(60, 25));

        jRadioButton13.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setText("Continuous");
        jRadioButton13.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton13.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton13.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton14.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup2.add(jRadioButton14);
        jRadioButton14.setText("Code 1");
        jRadioButton14.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton14.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton14.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton15.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup2.add(jRadioButton15);
        jRadioButton15.setText("Code 2");
        jRadioButton15.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton15.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton15.setPreferredSize(new java.awt.Dimension(65, 25));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID Code Selection:");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ident Association Mode:");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ID Code 1:");
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("ID Code 2:");
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ID Test Code:");
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Symbol Length:");
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Keydown Period:");
        jLabel14.setPreferredSize(new java.awt.Dimension(100, 25));

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("???");
        jTextField12.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField12.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField12.setPreferredSize(new java.awt.Dimension(60, 25));

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("???");
        jTextField13.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField13.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField13.setPreferredSize(new java.awt.Dimension(60, 25));

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

        jLabel1.setText("ms (100-160)");

        jLabel2.setText("s (30-45)");

        jPanel6.setBackground(new java.awt.Color(200, 200, 200));

        jRadioButton31.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton31);
        jRadioButton31.setText("Independent");
        jRadioButton31.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton31.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton31.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton32.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton32);
        jRadioButton32.setText("Code Sender");
        jRadioButton32.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton32.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton32.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton33.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton33);
        jRadioButton33.setText("Code Receiver");
        jRadioButton33.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton33.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton33.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton34.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton34);
        jRadioButton34.setText("Trigger Receiver");
        jRadioButton34.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton34.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton34.setPreferredSize(new java.awt.Dimension(65, 25));

        jRadioButton35.setBackground(new java.awt.Color(200, 200, 200));
        buttonGroup3.add(jRadioButton35);
        jRadioButton35.setText("Trigger Sender");
        jRadioButton35.setMaximumSize(new java.awt.Dimension(65, 25));
        jRadioButton35.setMinimumSize(new java.awt.Dimension(65, 25));
        jRadioButton35.setPreferredSize(new java.awt.Dimension(65, 25));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jRadioButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField14CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField14.getText(), 100, 160) == 1) {
            jTextField14.setBackground(Color.white);
            jTextField14.setForeground(Color.BLACK);
        } else {
            jTextField14.setBackground(Color.red);
            jTextField14.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField14CaretUpdate

    private void jTextField15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField15CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField15.getText(), 30, 45) == 1) {
            jTextField15.setBackground(Color.white);
            jTextField15.setForeground(Color.BLACK);
        } else {
            jTextField15.setBackground(Color.red);
            jTextField15.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField15CaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    // End of variables declaration//GEN-END:variables
}
