package Components;

import Communication.ComData;

/**
 *
 * @author edatabit
 */
public class BiteAlarms extends javax.swing.JPanel {

    /**
     * Creates new form BiteAlarms
     */
    public BiteAlarms() {
        initComponents();
    }


    private String mergeAlarms(String primary, String secondary) {
        if (!primary.equals("0")) {
            return primary;
        } else {
            return secondary;
        }
    }

    public void displayBiteAlarms() {

        if(!ComData.getTLastPoll(3, 2).equals("-2"))
        {
            jTextField1.setText(ComData.getTAlarm(12, 1));
            jTextField1.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(12, 2), ComData.getTAlarm(14, 2))));
            jTextField3.setText(ComData.getTAlarm(16, 1));
            jTextField3.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(16, 2), ComData.getTAlarm(18, 2))));      
        }
        else
        {
            jTextField1.setText(ComData.getTAlarm(12, 1));
            jTextField1.setBackground(UX.PColor.setBackGround("-2"));
            jTextField3.setText(ComData.getTAlarm(16, 1));
            jTextField3.setBackground(UX.PColor.setBackGround("-2"));            
        }

        
        if(!ComData.getTLastPoll(4, 2).equals("-2"))
        {
            jTextField2.setText(ComData.getTAlarm(13, 1));
            jTextField2.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(13, 2), ComData.getTAlarm(15, 2))));       
            jTextField4.setText(ComData.getTAlarm(17, 1));
            jTextField4.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(17, 2), ComData.getTAlarm(19, 2)))); 
        }
        else
        {
            jTextField2.setText(ComData.getTAlarm(13, 1));
            jTextField2.setBackground(UX.PColor.setBackGround("-2"));
            jTextField4.setText(ComData.getTAlarm(17, 1));
            jTextField4.setBackground(UX.PColor.setBackGround("-2"));            
        }        
       
        if(!ComData.getTLastPoll(1, 2).equals("-2"))
        {        
            jTextField5.setText(ComData.getTAlarm(20, 1));
            jTextField5.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(20, 2), ComData.getTAlarm(22, 2))));
        }
        else
        {
            jTextField5.setText(ComData.getTAlarm(20, 1));
            jTextField5.setBackground(UX.PColor.setBackGround("-2"));
            
        } 
        if(!ComData.getTLastPoll(2, 2).equals("-2"))
        {        
            jTextField6.setText(ComData.getTAlarm(21, 1));
            jTextField6.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(21, 2), ComData.getTAlarm(23, 2))));
 
        }
        else
        {
            jTextField6.setText(ComData.getTAlarm(21, 1));
            jTextField6.setBackground(UX.PColor.setBackGround("-2"));         
        }   
        if(!ComData.getTLastPoll(9, 2).equals("-2"))
        {               
            jTextField7.setText(ComData.getTAlarm(24, 1));
            jTextField7.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(24, 2), ComData.getTAlarm(26, 2))));
        }
        else
        {
            jTextField7.setText(ComData.getTAlarm(24, 1));
            jTextField7.setBackground(UX.PColor.setBackGround("-2"));          
        }
        if(!ComData.getTLastPoll(10, 2).equals("-2"))
        {          
            jTextField8.setText(ComData.getTAlarm(25, 1));
            jTextField8.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(25, 2), ComData.getTAlarm(27, 2))));
        }
        else
        {
            jTextField8.setText(ComData.getTAlarm(25, 1));
            jTextField8.setBackground(UX.PColor.setBackGround("-2"));          
        }
        if(!ComData.getTLastPoll(7, 2).equals("-2"))
        {          
            jTextField9.setText(ComData.getTAlarm(28, 1));
            jTextField9.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(28, 2), ComData.getTAlarm(30, 2))));
        }
        else
        {
            jTextField9.setText(ComData.getTAlarm(28, 1));
            jTextField9.setBackground(UX.PColor.setBackGround("-2"));          
        }
        if(!ComData.getTLastPoll(8, 2).equals("-2"))
        {        
            jTextField10.setText(ComData.getTAlarm(29, 1));
            jTextField10.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(29, 2), ComData.getTAlarm(31, 2))));
        }
        else
        {
            jTextField10.setText(ComData.getTAlarm(29, 1));
            jTextField10.setBackground(UX.PColor.setBackGround("-2"));          
        }
        if(!ComData.getTLastPoll(5, 2).equals("-2"))
        {         
            jTextField11.setText(ComData.getTAlarm(32, 1));
            jTextField11.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(32, 2), ComData.getTAlarm(34, 2))));
        }
        else
        {
            jTextField11.setText(ComData.getTAlarm(32, 1));
            jTextField11.setBackground(UX.PColor.setBackGround("-2"));          
        }
        if(!ComData.getTLastPoll(6, 2).equals("-2"))
        {          
            jTextField12.setText(ComData.getTAlarm(33, 1));
            jTextField12.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(33, 2), ComData.getTAlarm(35, 2))));
        }
        else
        {
            jTextField12.setText(ComData.getTAlarm(33, 1));
            jTextField12.setBackground(UX.PColor.setBackGround("-2"));          
        }
        if(!ComData.getTLastPoll(11, 2).equals("-2"))
        {        
            jTextField13.setText(ComData.getTAlarm(36, 1));
            jTextField13.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(36, 2), ComData.getTAlarm(38, 2))));     
        }
        else
        {
            jTextField13.setText(ComData.getTAlarm(36, 1));
            jTextField13.setBackground(UX.PColor.setBackGround("-2"));          
        }
        if(!ComData.getTLastPoll(12, 2).equals("-2"))
        {         
            jTextField14.setText(ComData.getTAlarm(37, 1));
            jTextField14.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(37, 2), ComData.getTAlarm(39, 2))));
        }
        else
        {
            jTextField14.setText(ComData.getTAlarm(37, 1));
            jTextField14.setBackground(UX.PColor.setBackGround("-2"));          
        }
        if(!ComData.getTLastPoll(0, 2).equals("-2"))
        {            
            jTextField15.setText(ComData.getTAlarm(40, 1));
            jTextField15.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTAlarm(40, 2), ComData.getTAlarm(41, 2))));
        }
        else
        {
            jTextField15.setText(ComData.getTAlarm(40, 1));
            jTextField15.setBackground(UX.PColor.setBackGround("-2"));          
        }        
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel28 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BITE Alarms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        setMaximumSize(new java.awt.Dimension(318, 329));
        setMinimumSize(new java.awt.Dimension(318, 329));
        setPreferredSize(new java.awt.Dimension(318, 329));

        jPanel28.setMaximumSize(new java.awt.Dimension(150, 556));
        jPanel28.setMinimumSize(new java.awt.Dimension(150, 556));
        jPanel28.setPreferredSize(new java.awt.Dimension(150, 556));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 255, 255));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("No Fault?");
        jTextField9.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField9.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField9.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(204, 255, 255));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("No Fault?");
        jTextField11.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField11.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField11.setName(""); // NOI18N
        jTextField11.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 255, 255));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("No Fault?");
        jTextField13.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField13.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField13.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("No Fault?");
        jTextField1.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField1.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField1.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("No Fault?");
        jTextField3.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField3.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField3.setName(""); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 255, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("No Fault?");
        jTextField5.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField5.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField5.setName(""); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(204, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("No Fault?");
        jTextField7.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField7.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField7.setName(""); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setMaximumSize(new java.awt.Dimension(150, 556));
        jPanel29.setMinimumSize(new java.awt.Dimension(150, 556));
        jPanel29.setPreferredSize(new java.awt.Dimension(150, 556));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("No Fault?");
        jTextField2.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField2.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField2.setName(""); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("No Fault?");
        jTextField4.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField4.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField4.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(204, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("No Fault?");
        jTextField6.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField6.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField6.setName(""); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 255, 255));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("No Fault?");
        jTextField8.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField8.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField8.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(204, 255, 255));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("No Fault?");
        jTextField10.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField10.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField10.setName(""); // NOI18N
        jTextField10.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(204, 255, 255));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("No Fault?");
        jTextField12.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField12.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField12.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(204, 255, 255));
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("No Fault?");
        jTextField14.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField14.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField14.setName(""); // NOI18N
        jTextField14.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(204, 255, 255));
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("No Fault?");
        jTextField15.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField15.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField15.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
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
