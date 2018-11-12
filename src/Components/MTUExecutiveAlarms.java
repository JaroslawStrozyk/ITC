package Components;

import Communication.ComData;

/**
 *
 * @author edatabit
 */
public class MTUExecutiveAlarms extends javax.swing.JPanel {

    /**
     * Creates new form MTUExecutiveAlarms
     */
    public MTUExecutiveAlarms() {
        initComponents();
    }

    public void displayMTUAlarms() {
        
        if(ComData.getTLastPoll(3, 2).equals("0"))
        { 
            jTextField81.setText(ComData.getTMTUAlarm(0, 1));
            jTextField81.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(0, 2)));
            jTextField82.setText(ComData.getTMTUAlarm(2, 1));
            jTextField82.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(2, 2)));
            jTextField83.setText(ComData.getTMTUAlarm(4, 1));
            jTextField83.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(4, 2)));
            jTextField84.setText(ComData.getTMTUAlarm(6, 1));
            jTextField84.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(6, 2)));
            jTextField89.setText(ComData.getTMTUAlarm(8, 1));
            jTextField89.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(8, 2)));

            jTextField101.setText(ComData.getTMTUAlarm(10, 1));
            jTextField101.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTMTUAlarm(10, 2), ComData.getTMTUAlarm(12, 2))));
            jTextField111.setText(ComData.getTMTUAlarm(42, 1));
            jTextField111.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(42, 2)));
            jTextField112.setText(ComData.getTMTUAlarm(44, 1));
            jTextField112.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(44, 2)));
            jTextField113.setText(ComData.getTMTUAlarm(46, 1));
            jTextField113.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(46, 2)));

            jTextField97.setText(ComData.getTMTUAlarm(48, 1));
            jTextField97.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(48, 2)));
            jTextField98.setText(ComData.getTMTUAlarm(50, 1));
            jTextField98.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(50, 2)));
        }
        else
        { 
            jTextField81.setText(ComData.getTMTUAlarm(0, 1));
            jTextField81.setBackground(UX.PColor.setBackGround("-2"));
            jTextField82.setText(ComData.getTMTUAlarm(2, 1));
            jTextField82.setBackground(UX.PColor.setBackGround("-2"));
            jTextField83.setText(ComData.getTMTUAlarm(4, 1));
            jTextField83.setBackground(UX.PColor.setBackGround("-2"));
            jTextField84.setText(ComData.getTMTUAlarm(6, 1));
            jTextField84.setBackground(UX.PColor.setBackGround("-2"));
            jTextField89.setText(ComData.getTMTUAlarm(8, 1));
            jTextField89.setBackground(UX.PColor.setBackGround("-2"));

            jTextField101.setText(ComData.getTMTUAlarm(10, 1));
            jTextField101.setBackground(UX.PColor.setBackGround("-2"));
            jTextField111.setText(ComData.getTMTUAlarm(42, 1));
            jTextField111.setBackground(UX.PColor.setBackGround("-2"));
            jTextField112.setText(ComData.getTMTUAlarm(44, 1));
            jTextField112.setBackground(UX.PColor.setBackGround("-2"));
            jTextField113.setText(ComData.getTMTUAlarm(46, 1));
            jTextField113.setBackground(UX.PColor.setBackGround("-2"));

            jTextField97.setText(ComData.getTMTUAlarm(48, 1));
            jTextField97.setBackground(UX.PColor.setBackGround("-2"));
            jTextField98.setText(ComData.getTMTUAlarm(50, 1));
            jTextField98.setBackground(UX.PColor.setBackGround("-2"));
        }
            if(ComData.getTLastPoll(4, 2).equals("0"))
        {   
            jTextField90.setText(ComData.getTMTUAlarm(1, 1));
            jTextField90.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(1, 2)));
            jTextField91.setText(ComData.getTMTUAlarm(3, 1));
            jTextField91.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(3, 2)));
            jTextField92.setText(ComData.getTMTUAlarm(5, 1));
            jTextField92.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(5, 2)));
            jTextField93.setText(ComData.getTMTUAlarm(7, 1));
            jTextField93.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(7, 2)));
            jTextField94.setText(ComData.getTMTUAlarm(9, 1));
            jTextField94.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(9, 2)));

            jTextField114.setText(ComData.getTMTUAlarm(11, 1));
            jTextField114.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTMTUAlarm(11, 2), ComData.getTMTUAlarm(13, 2))));
            jTextField116.setText(ComData.getTMTUAlarm(43, 1));
            jTextField116.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(43, 2)));
            jTextField117.setText(ComData.getTMTUAlarm(45, 1));
            jTextField117.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(45, 2)));
            jTextField118.setText(ComData.getTMTUAlarm(47, 1));
            jTextField118.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(47, 2)));

            jTextField99.setText(ComData.getTMTUAlarm(49, 1));
            jTextField99.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(49, 2)));
            jTextField100.setText(ComData.getTMTUAlarm(51, 1));
            jTextField100.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(51, 2)));
        }
        else
        {   
            jTextField90.setText(ComData.getTMTUAlarm(1, 1));
            jTextField90.setBackground(UX.PColor.setBackGround("-2"));
            jTextField91.setText(ComData.getTMTUAlarm(3, 1));
            jTextField91.setBackground(UX.PColor.setBackGround("-2"));
            jTextField92.setText(ComData.getTMTUAlarm(5, 1));
            jTextField92.setBackground(UX.PColor.setBackGround("-2"));
            jTextField93.setText(ComData.getTMTUAlarm(7, 1));
            jTextField93.setBackground(UX.PColor.setBackGround("-2"));
            jTextField94.setText(ComData.getTMTUAlarm(9, 1));
            jTextField94.setBackground(UX.PColor.setBackGround("-2"));

            jTextField114.setText(ComData.getTMTUAlarm(11, 1));
            jTextField114.setBackground(UX.PColor.setBackGround("-2"));
            jTextField116.setText(ComData.getTMTUAlarm(43, 1));
            jTextField116.setBackground(UX.PColor.setBackGround("-2"));
            jTextField117.setText(ComData.getTMTUAlarm(45, 1));
            jTextField117.setBackground(UX.PColor.setBackGround("-2"));
            jTextField118.setText(ComData.getTMTUAlarm(47, 1));
            jTextField118.setBackground(UX.PColor.setBackGround("-2"));

            jTextField99.setText(ComData.getTMTUAlarm(49, 1));
            jTextField99.setBackground(UX.PColor.setBackGround("-2"));
            jTextField100.setText(ComData.getTMTUAlarm(51, 1));
            jTextField100.setBackground(UX.PColor.setBackGround("-2"));
        }        

    }

    private String mergeAlarms(String primary, String secondary) {
        if (!primary.equals("0")) {
            return primary;
        } else {
            return secondary;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jTextField101 = new javax.swing.JTextField();
        jTextField111 = new javax.swing.JTextField();
        jTextField112 = new javax.swing.JTextField();
        jTextField113 = new javax.swing.JTextField();
        jPanel63 = new javax.swing.JPanel();
        jTextField114 = new javax.swing.JTextField();
        jTextField116 = new javax.swing.JTextField();
        jTextField117 = new javax.swing.JTextField();
        jTextField118 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jTextField81 = new javax.swing.JTextField();
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jTextField89 = new javax.swing.JTextField();
        jPanel53 = new javax.swing.JPanel();
        jTextField90 = new javax.swing.JTextField();
        jTextField91 = new javax.swing.JTextField();
        jTextField92 = new javax.swing.JTextField();
        jTextField93 = new javax.swing.JTextField();
        jTextField94 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jTextField97 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jPanel56 = new javax.swing.JPanel();
        jTextField99 = new javax.swing.JTextField();
        jTextField100 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(320, 600));
        setMinimumSize(new java.awt.Dimension(320, 600));
        setPreferredSize(new java.awt.Dimension(320, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Executive Alarms", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel62.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField101.setEditable(false);
        jTextField101.setBackground(new java.awt.Color(204, 255, 255));
        jTextField101.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField101.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField101.setText("No Fault?");
        jTextField101.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField101.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField101.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField111.setEditable(false);
        jTextField111.setBackground(new java.awt.Color(204, 255, 255));
        jTextField111.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField111.setText("No Fault?");
        jTextField111.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField111.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField111.setName(""); // NOI18N
        jTextField111.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField112.setEditable(false);
        jTextField112.setBackground(new java.awt.Color(204, 255, 255));
        jTextField112.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField112.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField112.setText("No Fault?");
        jTextField112.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField112.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField112.setName(""); // NOI18N
        jTextField112.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField113.setEditable(false);
        jTextField113.setBackground(new java.awt.Color(204, 255, 255));
        jTextField113.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField113.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField113.setText("No Fault?");
        jTextField113.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField113.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField113.setName(""); // NOI18N
        jTextField113.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField101, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel63.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField114.setEditable(false);
        jTextField114.setBackground(new java.awt.Color(204, 255, 255));
        jTextField114.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField114.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField114.setText("No Fault?");
        jTextField114.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField114.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField114.setName(""); // NOI18N
        jTextField114.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField116.setEditable(false);
        jTextField116.setBackground(new java.awt.Color(204, 255, 255));
        jTextField116.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField116.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField116.setText("No Fault?");
        jTextField116.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField116.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField116.setName(""); // NOI18N
        jTextField116.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField117.setEditable(false);
        jTextField117.setBackground(new java.awt.Color(204, 255, 255));
        jTextField117.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField117.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField117.setText("No Fault?");
        jTextField117.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField117.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField117.setName(""); // NOI18N
        jTextField117.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField118.setEditable(false);
        jTextField118.setBackground(new java.awt.Color(204, 255, 255));
        jTextField118.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField118.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField118.setText("No Fault?");
        jTextField118.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField118.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField118.setName(""); // NOI18N
        jTextField118.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField114, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
            .addComponent(jTextField116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Local Alarms", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField81.setEditable(false);
        jTextField81.setBackground(new java.awt.Color(204, 255, 255));
        jTextField81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField81.setText("No Fault?");
        jTextField81.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField81.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField81.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField82.setEditable(false);
        jTextField82.setBackground(new java.awt.Color(204, 255, 255));
        jTextField82.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField82.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField82.setText("No Fault?");
        jTextField82.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField82.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField82.setName(""); // NOI18N
        jTextField82.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField83.setEditable(false);
        jTextField83.setBackground(new java.awt.Color(204, 255, 255));
        jTextField83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField83.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField83.setText("No Fault?");
        jTextField83.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField83.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField83.setName(""); // NOI18N
        jTextField83.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField84.setEditable(false);
        jTextField84.setBackground(new java.awt.Color(204, 255, 255));
        jTextField84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField84.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField84.setText("No Fault?");
        jTextField84.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField84.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField84.setName(""); // NOI18N
        jTextField84.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField89.setEditable(false);
        jTextField89.setBackground(new java.awt.Color(204, 255, 255));
        jTextField89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField89.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField89.setText("No Fault?");
        jTextField89.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField89.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField89.setName(""); // NOI18N
        jTextField89.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField81, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField90.setEditable(false);
        jTextField90.setBackground(new java.awt.Color(204, 255, 255));
        jTextField90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField90.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField90.setText("No Fault?");
        jTextField90.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField90.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField90.setName(""); // NOI18N
        jTextField90.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField91.setEditable(false);
        jTextField91.setBackground(new java.awt.Color(204, 255, 255));
        jTextField91.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField91.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField91.setText("No Fault?");
        jTextField91.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField91.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField91.setName(""); // NOI18N
        jTextField91.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField92.setEditable(false);
        jTextField92.setBackground(new java.awt.Color(204, 255, 255));
        jTextField92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField92.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField92.setText("No Fault?");
        jTextField92.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField92.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField92.setName(""); // NOI18N
        jTextField92.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField93.setEditable(false);
        jTextField93.setBackground(new java.awt.Color(204, 255, 255));
        jTextField93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField93.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField93.setText("No Fault?");
        jTextField93.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField93.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField93.setName(""); // NOI18N
        jTextField93.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField94.setEditable(false);
        jTextField94.setBackground(new java.awt.Color(204, 255, 255));
        jTextField94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField94.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField94.setText("No Fault?");
        jTextField94.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField94.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField94.setName(""); // NOI18N
        jTextField94.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField90, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Autodiagnosis Alarms", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel55.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField97.setEditable(false);
        jTextField97.setBackground(new java.awt.Color(204, 255, 255));
        jTextField97.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField97.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField97.setText("No Fault?");
        jTextField97.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField97.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField97.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField98.setEditable(false);
        jTextField98.setBackground(new java.awt.Color(204, 255, 255));
        jTextField98.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField98.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField98.setText("No Fault?");
        jTextField98.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField98.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField98.setName(""); // NOI18N
        jTextField98.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField97, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField99.setEditable(false);
        jTextField99.setBackground(new java.awt.Color(204, 255, 255));
        jTextField99.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField99.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField99.setText("No Fault?");
        jTextField99.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField99.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField99.setName(""); // NOI18N
        jTextField99.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField100.setEditable(false);
        jTextField100.setBackground(new java.awt.Color(204, 255, 255));
        jTextField100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField100.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField100.setText("No Fault?");
        jTextField100.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField100.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField100.setName(""); // NOI18N
        jTextField100.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField99, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField111;
    private javax.swing.JTextField jTextField112;
    private javax.swing.JTextField jTextField113;
    private javax.swing.JTextField jTextField114;
    private javax.swing.JTextField jTextField116;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField118;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    // End of variables declaration//GEN-END:variables
}
