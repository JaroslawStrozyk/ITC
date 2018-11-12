package Components;

import Communication.ComData;

/**
 *
 * @author edatabit
 */
public class HPAStatusAlarms extends javax.swing.JPanel {

    /**
     * Creates new form HPAStatusAlarms
     */
    public HPAStatusAlarms() {
        initComponents();
    }
    
    public void displayHPAAlarms() {
        if(ComData.getTLastPoll(5, 2).equals("0"))
        {  
            jTextField163.setText(ComData.getTHPAAlarm(0, 1));
            jTextField163.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(0, 2)));
            jTextField164.setText(ComData.getTHPAAlarm(2, 1));
            jTextField164.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(2, 2)));        
            jTextField165.setText(ComData.getTHPAAlarm(4, 1));
            jTextField165.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(4, 2)));        
            jTextField166.setText(ComData.getTHPAAlarm(6, 1));
            jTextField166.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(6, 2)));
            jTextField167.setText(ComData.getTHPAAlarm(8, 1));
            jTextField167.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(8, 2)));        
            jTextField168.setText(ComData.getTHPAAlarm(10, 1));
            jTextField168.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(10, 2)));        
            jTextField169.setText(ComData.getTHPAAlarm(12, 1));
            jTextField169.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(12, 2)));
            jTextField170.setText(ComData.getTHPAAlarm(14, 1));
            jTextField170.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(14, 2)));
        }
        else
        {  
            jTextField163.setText(ComData.getTHPAAlarm(0, 1));
            jTextField163.setBackground(UX.PColor.setBackGround("-2"));
            jTextField164.setText(ComData.getTHPAAlarm(2, 1));
            jTextField164.setBackground(UX.PColor.setBackGround("-2"));     
            jTextField165.setText(ComData.getTHPAAlarm(4, 1));
            jTextField165.setBackground(UX.PColor.setBackGround("-2"));
            jTextField166.setText(ComData.getTHPAAlarm(6, 1));
            jTextField166.setBackground(UX.PColor.setBackGround("-2"));
            jTextField167.setText(ComData.getTHPAAlarm(8, 1));
            jTextField167.setBackground(UX.PColor.setBackGround("-2"));     
            jTextField168.setText(ComData.getTHPAAlarm(10, 1));
            jTextField168.setBackground(UX.PColor.setBackGround("-2"));   
            jTextField169.setText(ComData.getTHPAAlarm(12, 1));
            jTextField169.setBackground(UX.PColor.setBackGround("-2"));
            jTextField170.setText(ComData.getTHPAAlarm(14, 1));
            jTextField170.setBackground(UX.PColor.setBackGround("-2"));
        }
        if(ComData.getTLastPoll(6, 2).equals("0"))
        {          
            jTextField171.setText(ComData.getTHPAAlarm(1, 1));
            jTextField171.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(1, 2)));
            jTextField172.setText(ComData.getTHPAAlarm(3, 1));
            jTextField172.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(3, 2)));
            jTextField173.setText(ComData.getTHPAAlarm(5, 1));
            jTextField173.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(5, 2)));
            jTextField174.setText(ComData.getTHPAAlarm(7, 1));
            jTextField174.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(7, 2)));
            jTextField175.setText(ComData.getTHPAAlarm(9, 1));
            jTextField175.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(9, 2)));
            jTextField176.setText(ComData.getTHPAAlarm(11, 1));
            jTextField176.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(11, 2)));
            jTextField177.setText(ComData.getTHPAAlarm(13, 1));
            jTextField177.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(13, 2)));
            jTextField178.setText(ComData.getTHPAAlarm(15, 1));
            jTextField178.setBackground(UX.PColor.setBackGround(ComData.getTHPAAlarm(15, 2)));
        }
        else
        {          
            jTextField171.setText(ComData.getTHPAAlarm(1, 1));
            jTextField171.setBackground(UX.PColor.setBackGround("-2"));
            jTextField172.setText(ComData.getTHPAAlarm(3, 1));
            jTextField172.setBackground(UX.PColor.setBackGround("-2"));
            jTextField173.setText(ComData.getTHPAAlarm(5, 1));
            jTextField173.setBackground(UX.PColor.setBackGround("-2"));
            jTextField174.setText(ComData.getTHPAAlarm(7, 1));
            jTextField174.setBackground(UX.PColor.setBackGround("-2"));
            jTextField175.setText(ComData.getTHPAAlarm(9, 1));
            jTextField175.setBackground(UX.PColor.setBackGround("-2"));
            jTextField176.setText(ComData.getTHPAAlarm(11, 1));
            jTextField176.setBackground(UX.PColor.setBackGround("-2"));
            jTextField177.setText(ComData.getTHPAAlarm(13, 1));
            jTextField177.setBackground(UX.PColor.setBackGround("-2"));
            jTextField178.setText(ComData.getTHPAAlarm(15, 1));
            jTextField178.setBackground(UX.PColor.setBackGround("-2"));
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

        jPanel74 = new javax.swing.JPanel();
        jTextField163 = new javax.swing.JTextField();
        jTextField164 = new javax.swing.JTextField();
        jTextField165 = new javax.swing.JTextField();
        jTextField166 = new javax.swing.JTextField();
        jTextField167 = new javax.swing.JTextField();
        jTextField168 = new javax.swing.JTextField();
        jTextField169 = new javax.swing.JTextField();
        jTextField170 = new javax.swing.JTextField();
        jPanel75 = new javax.swing.JPanel();
        jTextField171 = new javax.swing.JTextField();
        jTextField172 = new javax.swing.JTextField();
        jTextField173 = new javax.swing.JTextField();
        jTextField174 = new javax.swing.JTextField();
        jTextField175 = new javax.swing.JTextField();
        jTextField176 = new javax.swing.JTextField();
        jTextField177 = new javax.swing.JTextField();
        jTextField178 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA Status Alarms", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        setMaximumSize(new java.awt.Dimension(318, 352));
        setMinimumSize(new java.awt.Dimension(318, 352));

        jPanel74.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA A", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField163.setEditable(false);
        jTextField163.setBackground(new java.awt.Color(204, 255, 255));
        jTextField163.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField163.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField163.setText("No Fault?");
        jTextField163.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField163.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField163.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField164.setEditable(false);
        jTextField164.setBackground(new java.awt.Color(204, 255, 255));
        jTextField164.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField164.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField164.setText("No Fault?");
        jTextField164.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField164.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField164.setName(""); // NOI18N
        jTextField164.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField165.setEditable(false);
        jTextField165.setBackground(new java.awt.Color(204, 255, 255));
        jTextField165.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField165.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField165.setText("No Fault?");
        jTextField165.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField165.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField165.setName(""); // NOI18N
        jTextField165.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField166.setEditable(false);
        jTextField166.setBackground(new java.awt.Color(204, 255, 255));
        jTextField166.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField166.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField166.setText("No Fault?");
        jTextField166.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField166.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField166.setName(""); // NOI18N
        jTextField166.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField167.setEditable(false);
        jTextField167.setBackground(new java.awt.Color(204, 255, 255));
        jTextField167.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField167.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField167.setText("No Fault?");
        jTextField167.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField167.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField167.setName(""); // NOI18N
        jTextField167.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField168.setEditable(false);
        jTextField168.setBackground(new java.awt.Color(204, 255, 255));
        jTextField168.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField168.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField168.setText("No Fault?");
        jTextField168.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField168.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField168.setName(""); // NOI18N
        jTextField168.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField169.setEditable(false);
        jTextField169.setBackground(new java.awt.Color(204, 255, 255));
        jTextField169.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField169.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField169.setText("No Fault?");
        jTextField169.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField169.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField169.setName(""); // NOI18N
        jTextField169.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField170.setEditable(false);
        jTextField170.setBackground(new java.awt.Color(204, 255, 255));
        jTextField170.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField170.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField170.setText("No Fault?");
        jTextField170.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField170.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField170.setName(""); // NOI18N
        jTextField170.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField163, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField165, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField166, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField167, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField170, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField164, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField170, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel75.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA B", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField171.setEditable(false);
        jTextField171.setBackground(new java.awt.Color(204, 255, 255));
        jTextField171.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField171.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField171.setText("No Fault?");
        jTextField171.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField171.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField171.setName(""); // NOI18N
        jTextField171.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField172.setEditable(false);
        jTextField172.setBackground(new java.awt.Color(204, 255, 255));
        jTextField172.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField172.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField172.setText("No Fault?");
        jTextField172.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField172.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField172.setName(""); // NOI18N
        jTextField172.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField173.setEditable(false);
        jTextField173.setBackground(new java.awt.Color(204, 255, 255));
        jTextField173.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField173.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField173.setText("No Fault?");
        jTextField173.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField173.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField173.setName(""); // NOI18N
        jTextField173.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField174.setEditable(false);
        jTextField174.setBackground(new java.awt.Color(204, 255, 255));
        jTextField174.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField174.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField174.setText("No Fault?");
        jTextField174.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField174.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField174.setName(""); // NOI18N
        jTextField174.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField175.setEditable(false);
        jTextField175.setBackground(new java.awt.Color(204, 255, 255));
        jTextField175.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField175.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField175.setText("No Fault?");
        jTextField175.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField175.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField175.setName(""); // NOI18N
        jTextField175.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField176.setEditable(false);
        jTextField176.setBackground(new java.awt.Color(204, 255, 255));
        jTextField176.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField176.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField176.setText("No Fault?");
        jTextField176.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField176.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField176.setName(""); // NOI18N
        jTextField176.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField177.setEditable(false);
        jTextField177.setBackground(new java.awt.Color(204, 255, 255));
        jTextField177.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField177.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField177.setText("No Fault?");
        jTextField177.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField177.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField177.setName(""); // NOI18N
        jTextField177.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField178.setEditable(false);
        jTextField178.setBackground(new java.awt.Color(204, 255, 255));
        jTextField178.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField178.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField178.setText("No Fault?");
        jTextField178.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField178.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField178.setName(""); // NOI18N
        jTextField178.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField172, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField177, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField178, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JTextField jTextField163;
    private javax.swing.JTextField jTextField164;
    private javax.swing.JTextField jTextField165;
    private javax.swing.JTextField jTextField166;
    private javax.swing.JTextField jTextField167;
    private javax.swing.JTextField jTextField168;
    private javax.swing.JTextField jTextField169;
    private javax.swing.JTextField jTextField170;
    private javax.swing.JTextField jTextField171;
    private javax.swing.JTextField jTextField172;
    private javax.swing.JTextField jTextField173;
    private javax.swing.JTextField jTextField174;
    private javax.swing.JTextField jTextField175;
    private javax.swing.JTextField jTextField176;
    private javax.swing.JTextField jTextField177;
    private javax.swing.JTextField jTextField178;
    // End of variables declaration//GEN-END:variables
}
