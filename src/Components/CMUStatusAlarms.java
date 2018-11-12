package Components;

import Communication.ComData;

/**
 *
 * @author edatabit
 */
public class CMUStatusAlarms extends javax.swing.JPanel {

    /**
     * Creates new form CMUStatusAlarms
     */
    public CMUStatusAlarms() {
        initComponents();
    }

    public void displayCMUAlarms() {
        if(ComData.getTLastPoll(1, 2).equals("0"))
        {
        jTextField147.setText(ComData.getTCMUAlarm(0, 1));
        jTextField147.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(0, 2)));
        jTextField148.setText(ComData.getTCMUAlarm(2, 1));
        jTextField148.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(2, 2)));
        jTextField149.setText(ComData.getTCMUAlarm(4, 1));
        jTextField149.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(4, 2)));
        jTextField150.setText(ComData.getTCMUAlarm(6, 1));
        jTextField150.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(6, 2)));
        jTextField151.setText(ComData.getTCMUAlarm(8, 1));
        jTextField151.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(8, 2)));
        jTextField152.setText(ComData.getTCMUAlarm(10, 1));
        jTextField152.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(10, 2)));
        jTextField153.setText(ComData.getTCMUAlarm(12, 1));
        jTextField153.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(12, 2)));
        jTextField154.setText(ComData.getTCMUAlarm(14, 1));
        jTextField154.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(14, 2)));
        }
        else
        {
        jTextField147.setText(ComData.getTCMUAlarm(0, 1));
        jTextField147.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField148.setText(ComData.getTCMUAlarm(2, 1));
        jTextField148.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField149.setText(ComData.getTCMUAlarm(4, 1));
        jTextField149.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField150.setText(ComData.getTCMUAlarm(6, 1));
        jTextField150.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField151.setText(ComData.getTCMUAlarm(8, 1));
        jTextField151.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField152.setText(ComData.getTCMUAlarm(10, 1));
        jTextField152.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField153.setText(ComData.getTCMUAlarm(12, 1));
        jTextField153.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField154.setText(ComData.getTCMUAlarm(14, 1));
        jTextField154.setBackground(UX.PColor.setBackGround("-2")); 
        }           
        if(ComData.getTLastPoll(2, 2).equals("0"))
        {
        jTextField155.setText(ComData.getTCMUAlarm(1, 1));
        jTextField155.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(1, 2)));
        jTextField156.setText(ComData.getTCMUAlarm(3, 1));
        jTextField156.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(3, 2)));
        jTextField157.setText(ComData.getTCMUAlarm(5, 1));
        jTextField157.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(5, 2)));
        jTextField158.setText(ComData.getTCMUAlarm(7, 1));
        jTextField158.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(7, 2)));
        jTextField159.setText(ComData.getTCMUAlarm(9, 1));
        jTextField159.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(9, 2)));
        jTextField160.setText(ComData.getTCMUAlarm(11, 1));
        jTextField160.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(11, 2)));
        jTextField161.setText(ComData.getTCMUAlarm(13, 1));
        jTextField161.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(13, 2)));
        jTextField162.setText(ComData.getTCMUAlarm(15, 1));
        jTextField162.setBackground(UX.PColor.setBackGround(ComData.getTCMUAlarm(15, 2)));        
        }
        else
        {
        jTextField155.setText(ComData.getTCMUAlarm(1, 1));
        jTextField155.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField156.setText(ComData.getTCMUAlarm(3, 1));
        jTextField156.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField157.setText(ComData.getTCMUAlarm(5, 1));
        jTextField157.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField158.setText(ComData.getTCMUAlarm(7, 1));
        jTextField158.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField159.setText(ComData.getTCMUAlarm(9, 1));
        jTextField159.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField160.setText(ComData.getTCMUAlarm(11, 1));
        jTextField160.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField161.setText(ComData.getTCMUAlarm(13, 1));
        jTextField161.setBackground(UX.PColor.setBackGround("-2")); 
        jTextField162.setText(ComData.getTCMUAlarm(15, 1));
        jTextField162.setBackground(UX.PColor.setBackGround("-2")); 
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

        jPanel71 = new javax.swing.JPanel();
        jTextField147 = new javax.swing.JTextField();
        jTextField148 = new javax.swing.JTextField();
        jTextField149 = new javax.swing.JTextField();
        jTextField150 = new javax.swing.JTextField();
        jTextField151 = new javax.swing.JTextField();
        jTextField152 = new javax.swing.JTextField();
        jTextField153 = new javax.swing.JTextField();
        jTextField154 = new javax.swing.JTextField();
        jPanel72 = new javax.swing.JPanel();
        jTextField155 = new javax.swing.JTextField();
        jTextField156 = new javax.swing.JTextField();
        jTextField157 = new javax.swing.JTextField();
        jTextField158 = new javax.swing.JTextField();
        jTextField159 = new javax.swing.JTextField();
        jTextField160 = new javax.swing.JTextField();
        jTextField161 = new javax.swing.JTextField();
        jTextField162 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CMU Status Alarms", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        setMaximumSize(new java.awt.Dimension(318, 352));
        setMinimumSize(new java.awt.Dimension(318, 352));

        jPanel71.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CMU A", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField147.setEditable(false);
        jTextField147.setBackground(new java.awt.Color(204, 255, 255));
        jTextField147.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField147.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField147.setText("No Fault?");
        jTextField147.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField147.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField147.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField148.setEditable(false);
        jTextField148.setBackground(new java.awt.Color(204, 255, 255));
        jTextField148.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField148.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField148.setText("No Fault?");
        jTextField148.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField148.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField148.setName(""); // NOI18N
        jTextField148.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField149.setEditable(false);
        jTextField149.setBackground(new java.awt.Color(204, 255, 255));
        jTextField149.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField149.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField149.setText("No Fault?");
        jTextField149.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField149.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField149.setName(""); // NOI18N
        jTextField149.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField150.setEditable(false);
        jTextField150.setBackground(new java.awt.Color(204, 255, 255));
        jTextField150.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField150.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField150.setText("No Fault?");
        jTextField150.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField150.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField150.setName(""); // NOI18N
        jTextField150.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField151.setEditable(false);
        jTextField151.setBackground(new java.awt.Color(204, 255, 255));
        jTextField151.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField151.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField151.setText("No Fault?");
        jTextField151.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField151.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField151.setName(""); // NOI18N
        jTextField151.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField152.setEditable(false);
        jTextField152.setBackground(new java.awt.Color(204, 255, 255));
        jTextField152.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField152.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField152.setText("No Fault?");
        jTextField152.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField152.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField152.setName(""); // NOI18N
        jTextField152.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField153.setEditable(false);
        jTextField153.setBackground(new java.awt.Color(204, 255, 255));
        jTextField153.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField153.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField153.setText("No Fault?");
        jTextField153.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField153.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField153.setName(""); // NOI18N
        jTextField153.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField154.setEditable(false);
        jTextField154.setBackground(new java.awt.Color(204, 255, 255));
        jTextField154.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField154.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField154.setText("No Fault?");
        jTextField154.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField154.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField154.setName(""); // NOI18N
        jTextField154.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField147, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField152, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel72.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CMU B", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField155.setEditable(false);
        jTextField155.setBackground(new java.awt.Color(204, 255, 255));
        jTextField155.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField155.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField155.setText("No Fault?");
        jTextField155.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField155.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField155.setName(""); // NOI18N
        jTextField155.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField156.setEditable(false);
        jTextField156.setBackground(new java.awt.Color(204, 255, 255));
        jTextField156.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField156.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField156.setText("No Fault?");
        jTextField156.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField156.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField156.setName(""); // NOI18N
        jTextField156.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField157.setEditable(false);
        jTextField157.setBackground(new java.awt.Color(204, 255, 255));
        jTextField157.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField157.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField157.setText("No Fault?");
        jTextField157.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField157.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField157.setName(""); // NOI18N
        jTextField157.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField158.setEditable(false);
        jTextField158.setBackground(new java.awt.Color(204, 255, 255));
        jTextField158.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField158.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField158.setText("No Fault?");
        jTextField158.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField158.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField158.setName(""); // NOI18N
        jTextField158.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField159.setEditable(false);
        jTextField159.setBackground(new java.awt.Color(204, 255, 255));
        jTextField159.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField159.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField159.setText("No Fault?");
        jTextField159.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField159.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField159.setName(""); // NOI18N
        jTextField159.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField160.setEditable(false);
        jTextField160.setBackground(new java.awt.Color(204, 255, 255));
        jTextField160.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField160.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField160.setText("No Fault?");
        jTextField160.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField160.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField160.setName(""); // NOI18N
        jTextField160.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField161.setEditable(false);
        jTextField161.setBackground(new java.awt.Color(204, 255, 255));
        jTextField161.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField161.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField161.setText("No Fault?");
        jTextField161.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField161.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField161.setName(""); // NOI18N
        jTextField161.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField162.setEditable(false);
        jTextField162.setBackground(new java.awt.Color(204, 255, 255));
        jTextField162.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField162.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField162.setText("No Fault?");
        jTextField162.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField162.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField162.setName(""); // NOI18N
        jTextField162.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField155, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField158, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField160, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JTextField jTextField147;
    private javax.swing.JTextField jTextField148;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField150;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField153;
    private javax.swing.JTextField jTextField154;
    private javax.swing.JTextField jTextField155;
    private javax.swing.JTextField jTextField156;
    private javax.swing.JTextField jTextField157;
    private javax.swing.JTextField jTextField158;
    private javax.swing.JTextField jTextField159;
    private javax.swing.JTextField jTextField160;
    private javax.swing.JTextField jTextField161;
    private javax.swing.JTextField jTextField162;
    // End of variables declaration//GEN-END:variables
}
