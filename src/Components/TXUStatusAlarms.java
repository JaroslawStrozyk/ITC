package Components;

import Communication.ComData;

/**
 *
 * @author edatabit
 */
public class TXUStatusAlarms extends javax.swing.JPanel {

    /**
     * Creates new form TXUStatusAlarms
     */
    public TXUStatusAlarms() {
        initComponents();
    }

    public void displayTXUAlarms() {
        
        if(ComData.getTLastPoll(7, 2).equals("0"))
        {  
            jTextField179.setText(ComData.getTTXUAlarm(0, 1));
            jTextField179.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(0, 2)));
            jTextField180.setText(ComData.getTTXUAlarm(2, 1));
            jTextField180.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(2, 2)));
            jTextField181.setText(ComData.getTTXUAlarm(4, 1));
            jTextField181.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(4, 2)));
            jTextField182.setText(ComData.getTTXUAlarm(6, 1));
            jTextField182.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(6, 2)));
            jTextField183.setText(ComData.getTTXUAlarm(8, 1));
            jTextField183.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(8, 2)));
            jTextField184.setText(ComData.getTTXUAlarm(10, 1));
            jTextField184.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(10, 2)));
            jTextField185.setText(ComData.getTTXUAlarm(12, 1));
            jTextField185.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(12, 2)));
            jTextField186.setText(ComData.getTTXUAlarm(14, 1));
            jTextField186.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(14, 2)));
        }
        else
        {  
            jTextField179.setText(ComData.getTTXUAlarm(0, 1));
            jTextField179.setBackground(UX.PColor.setBackGround("-2"));
            jTextField180.setText(ComData.getTTXUAlarm(2, 1));
            jTextField180.setBackground(UX.PColor.setBackGround("-2"));
            jTextField181.setText(ComData.getTTXUAlarm(4, 1));
            jTextField181.setBackground(UX.PColor.setBackGround("-2"));
            jTextField182.setText(ComData.getTTXUAlarm(6, 1));
            jTextField182.setBackground(UX.PColor.setBackGround("-2"));
            jTextField183.setText(ComData.getTTXUAlarm(8, 1));
            jTextField183.setBackground(UX.PColor.setBackGround("-2"));
            jTextField184.setText(ComData.getTTXUAlarm(10, 1));
            jTextField184.setBackground(UX.PColor.setBackGround("-2"));
            jTextField185.setText(ComData.getTTXUAlarm(12, 1));
            jTextField185.setBackground(UX.PColor.setBackGround("-2"));
            jTextField186.setText(ComData.getTTXUAlarm(14, 1));
            jTextField186.setBackground(UX.PColor.setBackGround("-2"));
        }            
        
        if(ComData.getTLastPoll(8, 2).equals("0"))
        {  
            jTextField187.setText(ComData.getTTXUAlarm(1, 1));
            jTextField187.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(1, 2)));
            jTextField188.setText(ComData.getTTXUAlarm(3, 1));
            jTextField188.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(3, 2)));
            jTextField189.setText(ComData.getTTXUAlarm(5, 1));
            jTextField189.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(5, 2)));
            jTextField190.setText(ComData.getTTXUAlarm(7, 1));
            jTextField190.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(7, 2)));
            jTextField191.setText(ComData.getTTXUAlarm(9, 1));
            jTextField191.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(9, 2)));
            jTextField192.setText(ComData.getTTXUAlarm(11, 1));
            jTextField192.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(11, 2)));
            jTextField193.setText(ComData.getTTXUAlarm(13, 1));
            jTextField193.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(13, 2)));
            jTextField194.setText(ComData.getTTXUAlarm(15, 1));
            jTextField194.setBackground(UX.PColor.setBackGround(ComData.getTTXUAlarm(15, 2)));
        }
        else
        {  
            jTextField187.setText(ComData.getTTXUAlarm(1, 1));
            jTextField187.setBackground(UX.PColor.setBackGround("-2"));
            jTextField188.setText(ComData.getTTXUAlarm(3, 1));
            jTextField188.setBackground(UX.PColor.setBackGround("-2"));
            jTextField189.setText(ComData.getTTXUAlarm(5, 1));
            jTextField189.setBackground(UX.PColor.setBackGround("-2"));
            jTextField190.setText(ComData.getTTXUAlarm(7, 1));
            jTextField190.setBackground(UX.PColor.setBackGround("-2"));
            jTextField191.setText(ComData.getTTXUAlarm(9, 1));
            jTextField191.setBackground(UX.PColor.setBackGround("-2"));
            jTextField192.setText(ComData.getTTXUAlarm(11, 1));
            jTextField192.setBackground(UX.PColor.setBackGround("-2"));
            jTextField193.setText(ComData.getTTXUAlarm(13, 1));
            jTextField193.setBackground(UX.PColor.setBackGround("-2"));
            jTextField194.setText(ComData.getTTXUAlarm(15, 1));
            jTextField194.setBackground(UX.PColor.setBackGround("-2"));
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

        jPanel77 = new javax.swing.JPanel();
        jTextField179 = new javax.swing.JTextField();
        jTextField180 = new javax.swing.JTextField();
        jTextField181 = new javax.swing.JTextField();
        jTextField182 = new javax.swing.JTextField();
        jTextField183 = new javax.swing.JTextField();
        jTextField184 = new javax.swing.JTextField();
        jTextField185 = new javax.swing.JTextField();
        jTextField186 = new javax.swing.JTextField();
        jPanel78 = new javax.swing.JPanel();
        jTextField187 = new javax.swing.JTextField();
        jTextField188 = new javax.swing.JTextField();
        jTextField189 = new javax.swing.JTextField();
        jTextField190 = new javax.swing.JTextField();
        jTextField191 = new javax.swing.JTextField();
        jTextField192 = new javax.swing.JTextField();
        jTextField193 = new javax.swing.JTextField();
        jTextField194 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU Status Alarms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel77.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU A", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel77.setPreferredSize(new java.awt.Dimension(155, 327));

        jTextField179.setEditable(false);
        jTextField179.setBackground(new java.awt.Color(204, 255, 255));
        jTextField179.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField179.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField179.setText("No Fault?");
        jTextField179.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField179.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField179.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField180.setEditable(false);
        jTextField180.setBackground(new java.awt.Color(204, 255, 255));
        jTextField180.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField180.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField180.setText("No Fault?");
        jTextField180.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField180.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField180.setName(""); // NOI18N
        jTextField180.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField181.setEditable(false);
        jTextField181.setBackground(new java.awt.Color(204, 255, 255));
        jTextField181.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField181.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField181.setText("No Fault?");
        jTextField181.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField181.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField181.setName(""); // NOI18N
        jTextField181.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField182.setEditable(false);
        jTextField182.setBackground(new java.awt.Color(204, 255, 255));
        jTextField182.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField182.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField182.setText("No Fault?");
        jTextField182.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField182.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField182.setName(""); // NOI18N
        jTextField182.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField183.setEditable(false);
        jTextField183.setBackground(new java.awt.Color(204, 255, 255));
        jTextField183.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField183.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField183.setText("No Fault?");
        jTextField183.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField183.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField183.setName(""); // NOI18N
        jTextField183.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField184.setEditable(false);
        jTextField184.setBackground(new java.awt.Color(204, 255, 255));
        jTextField184.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField184.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField184.setText("No Fault?");
        jTextField184.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField184.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField184.setName(""); // NOI18N
        jTextField184.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField185.setEditable(false);
        jTextField185.setBackground(new java.awt.Color(204, 255, 255));
        jTextField185.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField185.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField185.setText("No Fault?");
        jTextField185.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField185.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField185.setName(""); // NOI18N
        jTextField185.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField186.setEditable(false);
        jTextField186.setBackground(new java.awt.Color(204, 255, 255));
        jTextField186.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField186.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField186.setText("No Fault?");
        jTextField186.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField186.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField186.setName(""); // NOI18N
        jTextField186.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField179, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
            .addComponent(jTextField180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField181, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField179, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField182, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField183, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField185, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel78.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU B", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel78.setPreferredSize(new java.awt.Dimension(155, 327));

        jTextField187.setEditable(false);
        jTextField187.setBackground(new java.awt.Color(204, 255, 255));
        jTextField187.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField187.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField187.setText("No Fault?");
        jTextField187.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField187.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField187.setName(""); // NOI18N
        jTextField187.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField188.setEditable(false);
        jTextField188.setBackground(new java.awt.Color(204, 255, 255));
        jTextField188.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField188.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField188.setText("No Fault?");
        jTextField188.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField188.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField188.setName(""); // NOI18N
        jTextField188.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField189.setEditable(false);
        jTextField189.setBackground(new java.awt.Color(204, 255, 255));
        jTextField189.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField189.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField189.setText("No Fault?");
        jTextField189.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField189.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField189.setName(""); // NOI18N
        jTextField189.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField190.setEditable(false);
        jTextField190.setBackground(new java.awt.Color(204, 255, 255));
        jTextField190.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField190.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField190.setText("No Fault?");
        jTextField190.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField190.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField190.setName(""); // NOI18N
        jTextField190.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField191.setEditable(false);
        jTextField191.setBackground(new java.awt.Color(204, 255, 255));
        jTextField191.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField191.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField191.setText("No Fault?");
        jTextField191.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField191.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField191.setName(""); // NOI18N
        jTextField191.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField192.setEditable(false);
        jTextField192.setBackground(new java.awt.Color(204, 255, 255));
        jTextField192.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField192.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField192.setText("No Fault?");
        jTextField192.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField192.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField192.setName(""); // NOI18N
        jTextField192.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField193.setEditable(false);
        jTextField193.setBackground(new java.awt.Color(204, 255, 255));
        jTextField193.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField193.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField193.setText("No Fault?");
        jTextField193.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField193.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField193.setName(""); // NOI18N
        jTextField193.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField194.setEditable(false);
        jTextField194.setBackground(new java.awt.Color(204, 255, 255));
        jTextField194.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField194.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField194.setText("No Fault?");
        jTextField194.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField194.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField194.setName(""); // NOI18N
        jTextField194.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField187, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
            .addComponent(jTextField188, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField189, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField190, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField191, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField193, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField194, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField190, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField191, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
            .addComponent(jPanel78, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JTextField jTextField179;
    private javax.swing.JTextField jTextField180;
    private javax.swing.JTextField jTextField181;
    private javax.swing.JTextField jTextField182;
    private javax.swing.JTextField jTextField183;
    private javax.swing.JTextField jTextField184;
    private javax.swing.JTextField jTextField185;
    private javax.swing.JTextField jTextField186;
    private javax.swing.JTextField jTextField187;
    private javax.swing.JTextField jTextField188;
    private javax.swing.JTextField jTextField189;
    private javax.swing.JTextField jTextField190;
    private javax.swing.JTextField jTextField191;
    private javax.swing.JTextField jTextField192;
    private javax.swing.JTextField jTextField193;
    private javax.swing.JTextField jTextField194;
    // End of variables declaration//GEN-END:variables
}
