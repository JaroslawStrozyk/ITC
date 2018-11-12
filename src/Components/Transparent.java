package Components;

import Communication.ComData;
import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author edatabit
 */
public class Transparent extends javax.swing.JPanel {

    /**
     * Creates new form Transparent
     */
    public Transparent() {
        initComponents();

        UIManager.put("ToggleButton.select", Color.GREEN);
        SwingUtilities.updateComponentTreeUI(jToggleButton1);
        jToggleButton1.setText("???");
        jToggleButton2.setText("???");
        jToggleButton3.setText("???");
        jToggleButton4.setText("???");
        jToggleButton5.setText("???");
        jToggleButton6.setText("???");
        jToggleButton7.setVisible(false);
        jToggleButton8.setVisible(false);
        jLabel1.setText("???");
        jLabel2.setText("???");
        jLabel4.setText("???");
        jButton1.setText("???");

    }

    private void setMainStdby(String s) {
        switch (s) {
            case "TXP A":
                jToggleButton5.setSelected(true);
                jToggleButton5.setText("MAIN");

                jToggleButton6.setSelected(false);
                jToggleButton6.setText("STANDBY");
                break;
            case "TXP B":
                jToggleButton6.setSelected(true);
                jToggleButton6.setText("MAIN");

                jToggleButton5.setSelected(false);
                jToggleButton5.setText("STANDBY");
                break;
            default:
                jToggleButton8.setSelected(true);
                jToggleButton5.setText("Sh/None");
                jToggleButton6.setText("Sh/None");
                break;
        }
    }

    private void setOnAir(String tx) { //ChangeOver
        switch (tx) {
            case "TXP A":
                jToggleButton3.setSelected(true);
                jToggleButton3.setText("ON AIR");
                jToggleButton4.setSelected(false);
                jToggleButton4.setText("OFF AIR");
                break;
            case "TXP B":
                jToggleButton3.setSelected(false);
                jToggleButton3.setText("OFF AIR");
                jToggleButton4.setSelected(true);
                jToggleButton4.setText("ON AIR");
                break;
            default:
                jToggleButton3.setSelected(false);
                jToggleButton3.setText("OFF AIR");
                jToggleButton4.setSelected(false);
                jToggleButton4.setText("OFF AIR");
                jToggleButton7.setSelected(true);
                break;
        }
    }

    private void setOnOff(String tx1, String tx2) {
        if (tx1.equals("ON")) {
            jToggleButton1.setSelected(true);
            jToggleButton1.setText("ON");
        } else {
            jToggleButton1.setSelected(false);
            jToggleButton1.setText("OFF");
        }
        if (tx2.equals("ON")) {
            jToggleButton2.setSelected(true);
            jToggleButton2.setText("ON");
        } else {
            jToggleButton2.setSelected(false);
            jToggleButton2.setText("OFF");
        }
    }

    private void setActiveStdby(String act, String stb) {
        if (act.equals("0")) {
            jLabel1.setText("NORMAL");
            jLabel1.setBackground(UX.PColor.setBackGround("0"));
        } else if (act.equals("1")) {
            jLabel1.setText("WARNING");
            jLabel1.setBackground(UX.PColor.setBackGround("1"));
        } else if (act.equals("2")) {
            jLabel1.setText("ERROR");
            jLabel1.setBackground(UX.PColor.setBackGround("2"));
        }
        if (stb.equals("0")) {
            jLabel2.setText("NORMAL");
            jLabel2.setBackground(UX.PColor.setBackGround("0"));
        } else if (stb.equals("1")) {
            jLabel2.setText("WARNING");
            jLabel2.setBackground(UX.PColor.setBackGround("1"));
        } else if (stb.equals("2")) {
            jLabel2.setText("ERROR");
            jLabel2.setBackground(UX.PColor.setBackGround("2"));
        }
    }

    public void refreshStatus() {
        setMainStdby(ComData.getTStatusView(8, 1)); //ComData.getTStatusView(0, 1) + " - " + 
        setOnAir(ComData.getTStatusView(1, 1));

        setOnOff(ComData.getTStatusView(5, 1), ComData.getTStatusView(6, 1));

        switch (ComData.getTStatusView(8, 1)) {//1,1
            case "TXP A":
                setActiveStdby(ComData.getTAlarm(6, 2), ComData.getTAlarm(7, 2));
                break;
            case "TXP B":
                setActiveStdby(ComData.getTAlarm(7, 2), ComData.getTAlarm(6, 2));
                break;
            default:

                break;
        }
/*
        if (jToggleButton1.getText().equals("OFF")) {
            //jLabel1.setText("");
           // jLabel1.setBackground(UX.PColor.setBackGround("-2"));
        }

        if (jToggleButton2.getText().equals("OFF")) {
            //jLabel2.setText("");
            //jLabel2.setBackground(UX.PColor.setBackGround("-2"));
        }*/

        jLabel4.setText(ComData.getTStatusView(2, 1));
        jLabel4.setBackground(UX.PColor.setBackGround(ComData.getTStatusView(2, 2)));
        jButton1.setText(ComData.getTStatusView(4, 1));
        jButton1.setBackground(UX.PColor.setBackGround(ComData.getTStatusView(4, 2)));
        jLabel6.setText(ComData.getTStatusView(3, 1));
        jLabel6.setBackground(UX.PColor.setBackGround(ComData.getTStatusView(3, 2)));
        jLabel5.setText(ComData.getTStatusView(7, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_STDBY = new javax.swing.ButtonGroup();
        ONOFF_AIR = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();

        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(200, 460));
        setMinimumSize(new java.awt.Dimension(200, 460));
        setPreferredSize(new java.awt.Dimension(200, 460));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXP A", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(97, 179));
        jPanel1.setMinimumSize(new java.awt.Dimension(97, 179));
        jPanel1.setPreferredSize(new java.awt.Dimension(97, 179));

        jToggleButton1.setText("ON");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.setMaximumSize(new java.awt.Dimension(350, 40));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(35, 19));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(105, 30));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        ONOFF_AIR.add(jToggleButton3);
        jToggleButton3.setText("ON AIR");
        jToggleButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton3.setMaximumSize(new java.awt.Dimension(350, 40));
        jToggleButton3.setMinimumSize(new java.awt.Dimension(35, 19));
        jToggleButton3.setPreferredSize(new java.awt.Dimension(105, 30));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        MAIN_STDBY.add(jToggleButton5);
        jToggleButton5.setText("MAIN");
        jToggleButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton5.setMaximumSize(new java.awt.Dimension(350, 40));
        jToggleButton5.setMinimumSize(new java.awt.Dimension(35, 19));
        jToggleButton5.setPreferredSize(new java.awt.Dimension(105, 30));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXP B", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel2.setToolTipText("");
        jPanel2.setMaximumSize(new java.awt.Dimension(97, 179));
        jPanel2.setMinimumSize(new java.awt.Dimension(97, 179));
        jPanel2.setPreferredSize(new java.awt.Dimension(97, 179));

        jToggleButton2.setText("OFF");
        jToggleButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton2.setMaximumSize(new java.awt.Dimension(350, 40));
        jToggleButton2.setMinimumSize(new java.awt.Dimension(35, 19));
        jToggleButton2.setPreferredSize(new java.awt.Dimension(105, 30));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        ONOFF_AIR.add(jToggleButton4);
        jToggleButton4.setText("OFF AIR");
        jToggleButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton4.setMaximumSize(new java.awt.Dimension(350, 40));
        jToggleButton4.setMinimumSize(new java.awt.Dimension(35, 19));
        jToggleButton4.setPreferredSize(new java.awt.Dimension(105, 30));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        MAIN_STDBY.add(jToggleButton6);
        jToggleButton6.setText("STDBY");
        jToggleButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton6.setMaximumSize(new java.awt.Dimension(350, 40));
        jToggleButton6.setPreferredSize(new java.awt.Dimension(105, 30));
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACTIVE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NORMAL");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setMaximumSize(new java.awt.Dimension(97, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(97, 40));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(97, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STANDBY", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WARNING");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setMaximumSize(new java.awt.Dimension(97, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(97, 40));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(97, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MASTER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel4.setBackground(new java.awt.Color(102, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NORMAL");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setMaximumSize(new java.awt.Dimension(97, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(97, 40));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(97, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BYPASS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jButton1.setText("OFF");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setMaximumSize(new java.awt.Dimension(25, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(25, 30));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DME SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel6.setBackground(new java.awt.Color(102, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NORMAL");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setMaximumSize(new java.awt.Dimension(97, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(97, 40));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(97, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RECYCLE COUNT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("???");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setMaximumSize(new java.awt.Dimension(97, 40));
        jLabel5.setMinimumSize(new java.awt.Dimension(97, 40));
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(97, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/view-refresh.png"))); // NOI18N
        jButton2.setText("RESET COUNT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MAIN_STDBY.add(jToggleButton8);
        jToggleButton8.setText("jToggleButton8");

        ONOFF_AIR.add(jToggleButton7);
        jToggleButton7.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton8))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        ComData.indexSend = 1;
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        ComData.indexSend = 2;
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        ComData.indexSend = 31;
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        ComData.indexSend = 4;
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        ComData.indexSend = 32;
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText().equals("ON")) {
            ComData.indexBypass = 1;
        } else {
            ComData.indexBypass = 0;
        }
        ComData.indexSend = 6;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        ComData.indexSend = 5;
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ComData.indexSend = 7;
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MAIN_STDBY;
    private javax.swing.ButtonGroup ONOFF_AIR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
