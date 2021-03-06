package Components;

import Communication.ComData;

/**
 *
 * @author jaroslaw.strozyk
 */
public class SVRxu extends javax.swing.JPanel {

    /**
     * Creates new form SVRxu
     */
    public SVRxu() {
        initComponents();
    }

    public void displayRXUStatus() {
        
        if(ComData.getTLastPoll(9, 2).equals("0"))
        {  
            jTextField314.setText(ComData.getTRXUStatus(0, 1));
            jTextField314.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(0, 2)));
            jTextField315.setText(ComData.getTRXUStatus(1, 1));
            jTextField315.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(1, 2)));
            jTextField316.setText(ComData.getTRXUStatus(2, 1));
            jTextField316.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(2, 2)));
            jTextField317.setText(ComData.getTRXUStatus(3, 1));
            jTextField317.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(3, 2)));
            jTextField318.setText(ComData.getTRXUStatus(4, 1));
            jTextField318.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(4, 2)));
            jTextField319.setText(ComData.getTRXUStatus(5, 1));
            jTextField319.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(5, 2)));
            jTextField320.setText(ComData.getTRXUStatus(6, 1));
            jTextField320.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(6, 2)));
        }
        else
        {
            jTextField314.setText("");
            jTextField314.setBackground(UX.PColor.setBackGround("-2"));
            jTextField315.setText("");
            jTextField315.setBackground(UX.PColor.setBackGround("-2"));
            jTextField316.setText("");
            jTextField316.setBackground(UX.PColor.setBackGround("-2"));
            jTextField317.setText("");
            jTextField317.setBackground(UX.PColor.setBackGround("-2"));
            jTextField318.setText("");
            jTextField318.setBackground(UX.PColor.setBackGround("-2"));
            jTextField319.setText("");
            jTextField319.setBackground(UX.PColor.setBackGround("-2"));
            jTextField320.setText("");
            jTextField320.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if(ComData.getTLastPoll(10, 2).equals("0"))
        {  
            jTextField302.setText(ComData.getTRXUStatus(7, 1));
            jTextField302.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(7, 2)));
            jTextField307.setText(ComData.getTRXUStatus(8, 1));
            jTextField307.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(8, 2)));
            jTextField308.setText(ComData.getTRXUStatus(9, 1));
            jTextField308.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(9, 2)));
            jTextField309.setText(ComData.getTRXUStatus(10, 1));
            jTextField309.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(10, 2)));
            jTextField310.setText(ComData.getTRXUStatus(11, 1));
            jTextField310.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(11, 2)));
            jTextField311.setText(ComData.getTRXUStatus(12, 1));
            jTextField311.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(12, 2)));
            jTextField312.setText(ComData.getTRXUStatus(13, 1));
            jTextField312.setBackground(UX.PColor.setBackGround(ComData.getTRXUStatus(13, 2)));
        }
        else
        {
            jTextField302.setText("");
            jTextField302.setBackground(UX.PColor.setBackGround("-2"));
            jTextField307.setText("");
            jTextField307.setBackground(UX.PColor.setBackGround("-2"));
            jTextField308.setText("");
            jTextField308.setBackground(UX.PColor.setBackGround("-2"));
            jTextField309.setText("");
            jTextField309.setBackground(UX.PColor.setBackGround("-2"));
            jTextField310.setText("");
            jTextField310.setBackground(UX.PColor.setBackGround("-2"));
            jTextField311.setText("");
            jTextField311.setBackground(UX.PColor.setBackGround("-2"));
            jTextField312.setText("");
            jTextField312.setBackground(UX.PColor.setBackGround("-2"));
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

        jPanel105 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        jTextField302 = new javax.swing.JTextField();
        jTextField307 = new javax.swing.JTextField();
        jTextField308 = new javax.swing.JTextField();
        jTextField309 = new javax.swing.JTextField();
        jTextField310 = new javax.swing.JTextField();
        jTextField311 = new javax.swing.JTextField();
        jTextField312 = new javax.swing.JTextField();
        jPanel107 = new javax.swing.JPanel();
        jTextField314 = new javax.swing.JTextField();
        jTextField315 = new javax.swing.JTextField();
        jTextField316 = new javax.swing.JTextField();
        jTextField317 = new javax.swing.JTextField();
        jTextField318 = new javax.swing.JTextField();
        jTextField319 = new javax.swing.JTextField();
        jTextField320 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        jPanel105.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel122.setText("Received Pulses:");

        jPanel106.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField302.setEditable(false);
        jTextField302.setBackground(new java.awt.Color(102, 255, 255));
        jTextField302.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField302.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField302.setText("???");

        jTextField307.setEditable(false);
        jTextField307.setBackground(new java.awt.Color(102, 255, 255));
        jTextField307.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField307.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField307.setText("???");

        jTextField308.setEditable(false);
        jTextField308.setBackground(new java.awt.Color(102, 255, 255));
        jTextField308.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField308.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField308.setText("???");

        jTextField309.setEditable(false);
        jTextField309.setBackground(new java.awt.Color(102, 255, 255));
        jTextField309.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField309.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField309.setText("???");

        jTextField310.setEditable(false);
        jTextField310.setBackground(new java.awt.Color(102, 255, 255));
        jTextField310.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField310.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField310.setText("???");

        jTextField311.setEditable(false);
        jTextField311.setBackground(new java.awt.Color(102, 255, 255));
        jTextField311.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField311.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField311.setText("???");

        jTextField312.setEditable(false);
        jTextField312.setBackground(new java.awt.Color(102, 255, 255));
        jTextField312.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField312.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField312.setText("???");

        javax.swing.GroupLayout jPanel106Layout = new javax.swing.GroupLayout(jPanel106);
        jPanel106.setLayout(jPanel106Layout);
        jPanel106Layout.setHorizontalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField302)
            .addComponent(jTextField307, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField308)
            .addComponent(jTextField309)
            .addComponent(jTextField310)
            .addComponent(jTextField311)
            .addComponent(jTextField312)
        );
        jPanel106Layout.setVerticalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel106Layout.createSequentialGroup()
                .addComponent(jTextField302, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField307, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField308, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField309, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField310, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField311, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField312, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel107.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField314.setEditable(false);
        jTextField314.setBackground(new java.awt.Color(102, 255, 255));
        jTextField314.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField314.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField314.setText("???");

        jTextField315.setEditable(false);
        jTextField315.setBackground(new java.awt.Color(102, 255, 255));
        jTextField315.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField315.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField315.setText("???");

        jTextField316.setEditable(false);
        jTextField316.setBackground(new java.awt.Color(102, 255, 255));
        jTextField316.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField316.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField316.setText("???");

        jTextField317.setEditable(false);
        jTextField317.setBackground(new java.awt.Color(102, 255, 255));
        jTextField317.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField317.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField317.setText("???");

        jTextField318.setEditable(false);
        jTextField318.setBackground(new java.awt.Color(102, 255, 255));
        jTextField318.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField318.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField318.setText("???");

        jTextField319.setEditable(false);
        jTextField319.setBackground(new java.awt.Color(102, 255, 255));
        jTextField319.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField319.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField319.setText("???");

        jTextField320.setEditable(false);
        jTextField320.setBackground(new java.awt.Color(102, 255, 255));
        jTextField320.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField320.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField320.setText("???");

        javax.swing.GroupLayout jPanel107Layout = new javax.swing.GroupLayout(jPanel107);
        jPanel107.setLayout(jPanel107Layout);
        jPanel107Layout.setHorizontalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField314)
            .addComponent(jTextField315, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField316)
            .addComponent(jTextField317)
            .addComponent(jTextField318)
            .addComponent(jTextField319)
            .addComponent(jTextField320)
        );
        jPanel107Layout.setVerticalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel107Layout.createSequentialGroup()
                .addComponent(jTextField314, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField315, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField316, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField317, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField318, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField319, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField320, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel123.setText("Received Interrogations:");

        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel124.setText("SDES - Suppresed Pulses:");

        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel125.setText("LDES - Suppressed Interrogations:");

        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel126.setText("Dead-Time Supperssed Interrogations:");

        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel127.setText("Fully Decoded Interrogations:");

        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel128.setText("Minimum Threshold Level:");

        javax.swing.GroupLayout jPanel105Layout = new javax.swing.GroupLayout(jPanel105);
        jPanel105.setLayout(jPanel105Layout);
        jPanel105Layout.setHorizontalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel105Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel105Layout.setVerticalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel105Layout.createSequentialGroup()
                .addGroup(jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel105Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel105Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel105Layout.createSequentialGroup()
                .addGroup(jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler23;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JTextField jTextField302;
    private javax.swing.JTextField jTextField307;
    private javax.swing.JTextField jTextField308;
    private javax.swing.JTextField jTextField309;
    private javax.swing.JTextField jTextField310;
    private javax.swing.JTextField jTextField311;
    private javax.swing.JTextField jTextField312;
    private javax.swing.JTextField jTextField314;
    private javax.swing.JTextField jTextField315;
    private javax.swing.JTextField jTextField316;
    private javax.swing.JTextField jTextField317;
    private javax.swing.JTextField jTextField318;
    private javax.swing.JTextField jTextField319;
    private javax.swing.JTextField jTextField320;
    // End of variables declaration//GEN-END:variables

}
