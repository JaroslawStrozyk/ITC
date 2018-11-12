package Components;

import Communication.ComData;

/**
 *
 * @author edatabit
 */
public class MTUExecAlarmsTX extends javax.swing.JPanel {

    /**
     * Creates new form MTUExecAlarmsTX
     */
    public MTUExecAlarmsTX() {
        initComponents();
    }

    private String mergeAlarms(String primary, String secondary) {
        if (!primary.equals("0")) {
            return primary;
        } else {
            return secondary;
        }
    }

    public void displayMTUAlarms() {
        
        if(ComData.getTLastPoll(3, 2).equals("0"))
        { 
            jTextField119.setText(ComData.getTMTUAlarm(14, 1));
            jTextField119.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTMTUAlarm(14, 2), ComData.getTMTUAlarm(16, 2))));
            jTextField133.setText(ComData.getTMTUAlarm(18, 1));
            jTextField133.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTMTUAlarm(18, 2), ComData.getTMTUAlarm(20, 2))));
            jTextField121.setText(ComData.getTMTUAlarm(22, 1));
            jTextField121.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(22, 2)));
            jTextField122.setText(ComData.getTMTUAlarm(24, 1));
            jTextField122.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(24, 2)));
            jTextField123.setText(ComData.getTMTUAlarm(26, 1));
            jTextField123.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(26, 2)));
            jTextField124.setText(ComData.getTMTUAlarm(28, 1));
            jTextField124.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(28, 2)));
            jTextField125.setText(ComData.getTMTUAlarm(30, 1));
            jTextField125.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(30, 2)));
            jTextField135.setText(ComData.getTMTUAlarm(32, 1));
            jTextField135.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(32, 2)));
            jTextField136.setText(ComData.getTMTUAlarm(34, 1));
            jTextField136.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(34, 2)));
            jTextField137.setText(ComData.getTMTUAlarm(36, 1));
            jTextField137.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(36, 2)));
            jTextField138.setText(ComData.getTMTUAlarm(38, 1));
            jTextField138.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(38, 2)));
            jTextField139.setText(ComData.getTMTUAlarm(40, 1));
            jTextField139.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(40, 2)));
        }
        else 
        { 
            jTextField119.setText(ComData.getTMTUAlarm(14, 1));
            jTextField119.setBackground(UX.PColor.setBackGround("-2"));
            jTextField133.setText(ComData.getTMTUAlarm(18, 1));
            jTextField133.setBackground(UX.PColor.setBackGround("-2"));
            jTextField121.setText(ComData.getTMTUAlarm(22, 1));
            jTextField121.setBackground(UX.PColor.setBackGround("-2"));
            jTextField122.setText(ComData.getTMTUAlarm(24, 1));
            jTextField122.setBackground(UX.PColor.setBackGround("-2"));
            jTextField123.setText(ComData.getTMTUAlarm(26, 1));
            jTextField123.setBackground(UX.PColor.setBackGround("-2"));
            jTextField124.setText(ComData.getTMTUAlarm(28, 1));
            jTextField124.setBackground(UX.PColor.setBackGround("-2"));
            jTextField125.setText(ComData.getTMTUAlarm(30, 1));
            jTextField125.setBackground(UX.PColor.setBackGround("-2"));
            jTextField135.setText(ComData.getTMTUAlarm(32, 1));
            jTextField135.setBackground(UX.PColor.setBackGround("-2"));
            jTextField136.setText(ComData.getTMTUAlarm(34, 1));
            jTextField136.setBackground(UX.PColor.setBackGround("-2"));
            jTextField137.setText(ComData.getTMTUAlarm(36, 1));
            jTextField137.setBackground(UX.PColor.setBackGround("-2"));
            jTextField138.setText(ComData.getTMTUAlarm(38, 1));
            jTextField138.setBackground(UX.PColor.setBackGround("-2"));
            jTextField139.setText(ComData.getTMTUAlarm(40, 1));
            jTextField139.setBackground(UX.PColor.setBackGround("-2"));
        }
        if(ComData.getTLastPoll(4, 2).equals("0"))
        {        
            jTextField126.setText(ComData.getTMTUAlarm(15, 1));
            jTextField126.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTMTUAlarm(15, 2), ComData.getTMTUAlarm(17, 2))));        
            jTextField140.setText(ComData.getTMTUAlarm(19, 1));
            jTextField140.setBackground(UX.PColor.setBackGround(mergeAlarms(ComData.getTMTUAlarm(19, 2), ComData.getTMTUAlarm(21, 2))));
            jTextField128.setText(ComData.getTMTUAlarm(23, 1));
            jTextField128.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(23, 2)));
            jTextField129.setText(ComData.getTMTUAlarm(25, 1));
            jTextField129.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(25, 2)));
            jTextField130.setText(ComData.getTMTUAlarm(27, 1));
            jTextField130.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(27, 2)));
            jTextField131.setText(ComData.getTMTUAlarm(29, 1));
            jTextField131.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(29, 2)));
            jTextField132.setText(ComData.getTMTUAlarm(31, 1));
            jTextField132.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(31, 2)));
            jTextField142.setText(ComData.getTMTUAlarm(33, 1));
            jTextField142.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(33, 2)));
            jTextField143.setText(ComData.getTMTUAlarm(35, 1));
            jTextField143.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(35, 2)));
            jTextField144.setText(ComData.getTMTUAlarm(37, 1));
            jTextField144.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(37, 2)));
            jTextField145.setText(ComData.getTMTUAlarm(39, 1));
            jTextField145.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(39, 2)));
            jTextField146.setText(ComData.getTMTUAlarm(41, 1));
            jTextField146.setBackground(UX.PColor.setBackGround(ComData.getTMTUAlarm(41, 2)));
        }
        else
        {        
            jTextField126.setText(ComData.getTMTUAlarm(15, 1));
            jTextField126.setBackground(UX.PColor.setBackGround("-2"));       
            jTextField140.setText(ComData.getTMTUAlarm(19, 1));
            jTextField140.setBackground(UX.PColor.setBackGround("-2"));
            jTextField128.setText(ComData.getTMTUAlarm(23, 1));
            jTextField128.setBackground(UX.PColor.setBackGround("-2"));
            jTextField129.setText(ComData.getTMTUAlarm(25, 1));
            jTextField129.setBackground(UX.PColor.setBackGround("-2"));
            jTextField130.setText(ComData.getTMTUAlarm(27, 1));
            jTextField130.setBackground(UX.PColor.setBackGround("-2"));
            jTextField131.setText(ComData.getTMTUAlarm(29, 1));
            jTextField131.setBackground(UX.PColor.setBackGround("-2"));
            jTextField132.setText(ComData.getTMTUAlarm(31, 1));
            jTextField132.setBackground(UX.PColor.setBackGround("-2"));
            jTextField142.setText(ComData.getTMTUAlarm(33, 1));
            jTextField142.setBackground(UX.PColor.setBackGround("-2"));
            jTextField143.setText(ComData.getTMTUAlarm(35, 1));
            jTextField143.setBackground(UX.PColor.setBackGround("-2"));
            jTextField144.setText(ComData.getTMTUAlarm(37, 1));
            jTextField144.setBackground(UX.PColor.setBackGround("-2"));
            jTextField145.setText(ComData.getTMTUAlarm(39, 1));
            jTextField145.setBackground(UX.PColor.setBackGround("-2"));
            jTextField146.setText(ComData.getTMTUAlarm(41, 1));
            jTextField146.setBackground(UX.PColor.setBackGround("-2"));
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

        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jTextField119 = new javax.swing.JTextField();
        jTextField121 = new javax.swing.JTextField();
        jTextField122 = new javax.swing.JTextField();
        jTextField123 = new javax.swing.JTextField();
        jTextField124 = new javax.swing.JTextField();
        jTextField125 = new javax.swing.JTextField();
        jPanel66 = new javax.swing.JPanel();
        jTextField126 = new javax.swing.JTextField();
        jTextField128 = new javax.swing.JTextField();
        jTextField129 = new javax.swing.JTextField();
        jTextField130 = new javax.swing.JTextField();
        jTextField131 = new javax.swing.JTextField();
        jTextField132 = new javax.swing.JTextField();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jTextField133 = new javax.swing.JTextField();
        jTextField135 = new javax.swing.JTextField();
        jTextField136 = new javax.swing.JTextField();
        jTextField137 = new javax.swing.JTextField();
        jTextField138 = new javax.swing.JTextField();
        jTextField139 = new javax.swing.JTextField();
        jPanel69 = new javax.swing.JPanel();
        jTextField140 = new javax.swing.JTextField();
        jTextField142 = new javax.swing.JTextField();
        jTextField143 = new javax.swing.JTextField();
        jTextField144 = new javax.swing.JTextField();
        jTextField145 = new javax.swing.JTextField();
        jTextField146 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(318, 570));
        setMinimumSize(new java.awt.Dimension(318, 570));
        setPreferredSize(new java.awt.Dimension(318, 570));

        jPanel64.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Executive Alarms - TXP A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel65.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField119.setEditable(false);
        jTextField119.setBackground(new java.awt.Color(204, 255, 255));
        jTextField119.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField119.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField119.setText("No Fault?");
        jTextField119.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField119.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField119.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField121.setEditable(false);
        jTextField121.setBackground(new java.awt.Color(204, 255, 255));
        jTextField121.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField121.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField121.setText("No Fault?");
        jTextField121.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField121.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField121.setName(""); // NOI18N
        jTextField121.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField122.setEditable(false);
        jTextField122.setBackground(new java.awt.Color(204, 255, 255));
        jTextField122.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField122.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField122.setText("No Fault?");
        jTextField122.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField122.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField122.setName(""); // NOI18N
        jTextField122.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField123.setEditable(false);
        jTextField123.setBackground(new java.awt.Color(204, 255, 255));
        jTextField123.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField123.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField123.setText("No Fault?");
        jTextField123.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField123.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField123.setName(""); // NOI18N
        jTextField123.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField124.setEditable(false);
        jTextField124.setBackground(new java.awt.Color(204, 255, 255));
        jTextField124.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField124.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField124.setText("No Fault?");
        jTextField124.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField124.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField124.setName(""); // NOI18N
        jTextField124.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField125.setEditable(false);
        jTextField125.setBackground(new java.awt.Color(204, 255, 255));
        jTextField125.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField125.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField125.setText("No Fault?");
        jTextField125.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField125.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField125.setName(""); // NOI18N
        jTextField125.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField119, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel66.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField126.setEditable(false);
        jTextField126.setBackground(new java.awt.Color(204, 255, 255));
        jTextField126.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField126.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField126.setText("No Fault?");
        jTextField126.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField126.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField126.setName(""); // NOI18N
        jTextField126.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField128.setEditable(false);
        jTextField128.setBackground(new java.awt.Color(204, 255, 255));
        jTextField128.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField128.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField128.setText("No Fault?");
        jTextField128.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField128.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField128.setName(""); // NOI18N
        jTextField128.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField129.setEditable(false);
        jTextField129.setBackground(new java.awt.Color(204, 255, 255));
        jTextField129.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField129.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField129.setText("No Fault?");
        jTextField129.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField129.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField129.setName(""); // NOI18N
        jTextField129.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField130.setEditable(false);
        jTextField130.setBackground(new java.awt.Color(204, 255, 255));
        jTextField130.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField130.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField130.setText("No Fault?");
        jTextField130.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField130.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField130.setName(""); // NOI18N
        jTextField130.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField131.setEditable(false);
        jTextField131.setBackground(new java.awt.Color(204, 255, 255));
        jTextField131.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField131.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField131.setText("No Fault?");
        jTextField131.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField131.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField131.setName(""); // NOI18N
        jTextField131.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField132.setEditable(false);
        jTextField132.setBackground(new java.awt.Color(204, 255, 255));
        jTextField132.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField132.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField132.setText("No Fault?");
        jTextField132.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField132.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField132.setName(""); // NOI18N
        jTextField132.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField126, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel67.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Executive Alarms - TXP B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel68.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField133.setEditable(false);
        jTextField133.setBackground(new java.awt.Color(204, 255, 255));
        jTextField133.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField133.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField133.setText("No Fault?");
        jTextField133.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField133.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField133.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField135.setEditable(false);
        jTextField135.setBackground(new java.awt.Color(204, 255, 255));
        jTextField135.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField135.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField135.setText("No Fault?");
        jTextField135.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField135.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField135.setName(""); // NOI18N
        jTextField135.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField136.setEditable(false);
        jTextField136.setBackground(new java.awt.Color(204, 255, 255));
        jTextField136.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField136.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField136.setText("No Fault?");
        jTextField136.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField136.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField136.setName(""); // NOI18N
        jTextField136.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField137.setEditable(false);
        jTextField137.setBackground(new java.awt.Color(204, 255, 255));
        jTextField137.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField137.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField137.setText("No Fault?");
        jTextField137.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField137.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField137.setName(""); // NOI18N
        jTextField137.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField138.setEditable(false);
        jTextField138.setBackground(new java.awt.Color(204, 255, 255));
        jTextField138.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField138.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField138.setText("No Fault?");
        jTextField138.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField138.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField138.setName(""); // NOI18N
        jTextField138.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField139.setEditable(false);
        jTextField139.setBackground(new java.awt.Color(204, 255, 255));
        jTextField139.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField139.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField139.setText("No Fault?");
        jTextField139.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField139.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField139.setName(""); // NOI18N
        jTextField139.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField133, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel69.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField140.setEditable(false);
        jTextField140.setBackground(new java.awt.Color(204, 255, 255));
        jTextField140.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField140.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField140.setText("No Fault?");
        jTextField140.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField140.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField140.setName(""); // NOI18N
        jTextField140.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField142.setEditable(false);
        jTextField142.setBackground(new java.awt.Color(204, 255, 255));
        jTextField142.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField142.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField142.setText("No Fault?");
        jTextField142.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField142.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField142.setName(""); // NOI18N
        jTextField142.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField143.setEditable(false);
        jTextField143.setBackground(new java.awt.Color(204, 255, 255));
        jTextField143.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField143.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField143.setText("No Fault?");
        jTextField143.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField143.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField143.setName(""); // NOI18N
        jTextField143.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField144.setEditable(false);
        jTextField144.setBackground(new java.awt.Color(204, 255, 255));
        jTextField144.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField144.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField144.setText("No Fault?");
        jTextField144.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField144.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField144.setName(""); // NOI18N
        jTextField144.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField145.setEditable(false);
        jTextField145.setBackground(new java.awt.Color(204, 255, 255));
        jTextField145.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField145.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField145.setText("No Fault?");
        jTextField145.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField145.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField145.setName(""); // NOI18N
        jTextField145.setPreferredSize(new java.awt.Dimension(80, 30));

        jTextField146.setEditable(false);
        jTextField146.setBackground(new java.awt.Color(204, 255, 255));
        jTextField146.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField146.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField146.setText("No Fault?");
        jTextField146.setMaximumSize(new java.awt.Dimension(80, 30));
        jTextField146.setMinimumSize(new java.awt.Dimension(80, 30));
        jTextField146.setName(""); // NOI18N
        jTextField146.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField140, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(jTextField142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JTextField jTextField119;
    private javax.swing.JTextField jTextField121;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextField123;
    private javax.swing.JTextField jTextField124;
    private javax.swing.JTextField jTextField125;
    private javax.swing.JTextField jTextField126;
    private javax.swing.JTextField jTextField128;
    private javax.swing.JTextField jTextField129;
    private javax.swing.JTextField jTextField130;
    private javax.swing.JTextField jTextField131;
    private javax.swing.JTextField jTextField132;
    private javax.swing.JTextField jTextField133;
    private javax.swing.JTextField jTextField135;
    private javax.swing.JTextField jTextField136;
    private javax.swing.JTextField jTextField137;
    private javax.swing.JTextField jTextField138;
    private javax.swing.JTextField jTextField139;
    private javax.swing.JTextField jTextField140;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField146;
    // End of variables declaration//GEN-END:variables

}
