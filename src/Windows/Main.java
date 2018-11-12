package Windows;

import Configuration.SysConfig;
import Communication.ComData;
import java.awt.Image;
import java.awt.Toolkit;
import MainItc.ITC;
import static MainItc.ITC.LOG;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author edatabit
 */
public class Main extends javax.swing.JFrame {

    private String TXPOnAir = "";
    private String TXPEnabled = "";
    private static int indViewWork = -1;

    public int getActiveTab() {
        return jTabbedPane1.getSelectedIndex();
    }

    public static void viewWork() {
        indViewWork++;
        switch (indViewWork) {
            case 0:
                viewWork.setText("|");
                break;
            case 1:
                viewWork.setText("/");
                break;
            case 2:
                viewWork.setText("-");
                break;
            case 3:
                viewWork.setText("\\");
                indViewWork = -1;
                break;
        }
    }

    public void doHide() {

        MenuConnect.setEnabled(true);
        MenuDisconect.setEnabled(false);

        ButtonSummary.setEnabled(false);
        ButtonConfiguration.setEnabled(false);
        ButtonIDStation.setEnabled(false);
        ButtonLogs.setEnabled(false);
        ButtonStatus.setEnabled(false);
        ButtonMTU.setEnabled(false);
        ButtonCMURCU.setEnabled(false);
        ButtonCMURCU.setEnabled(false);
        ButtonHPATXU.setEnabled(false);
        ButtonRXU.setEnabled(false);
        ButtonPSU.setEnabled(false);
        ButtonReset.setEnabled(false);

        jMenu1.setEnabled(true);
        jMenu2.setEnabled(false);
        jMenu3.setEnabled(false);
        jMenu4.setEnabled(true);

        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        ConnectedView.setVisible(false);
    }

    public void doShow() {

        MenuConnect.setEnabled(false);
        MenuDisconect.setEnabled(true);

        /*
        ButtonSummary.setEnabled(true);
        ButtonConfiguration.setEnabled(true);
        ButtonIDStation.setEnabled(true);
        ButtonLogs.setEnabled(true);
        ButtonStatus.setEnabled(true);
        ButtonMTU.setEnabled(true);
        ButtonCMURCU.setEnabled(true);
        ButtonHPATXU.setEnabled(true);
        ButtonRXU.setEnabled(true);
        ButtonPSU.setEnabled(true);
        ButtonReset.setEnabled(true);
        jPanel2.setVisible(true);
         */
        jMenu1.setEnabled(true);
        jMenu2.setEnabled(true);
        jMenu3.setEnabled(true);
        jMenu4.setEnabled(true);

        jPanel1.setVisible(true);

        ConnectedView.setVisible(true);
    }

    public void doShowMenu() {
        ButtonSummary.setEnabled(true);
        ButtonConfiguration.setEnabled(true);
        ButtonIDStation.setEnabled(true);
        ButtonLogs.setEnabled(true);
        ButtonStatus.setEnabled(true);
        ButtonMTU.setEnabled(true);
        ButtonCMURCU.setEnabled(true);
        ButtonHPATXU.setEnabled(true);
        ButtonRXU.setEnabled(true);
        ButtonPSU.setEnabled(true);
        ButtonReset.setEnabled(true);
        jPanel2.setVisible(true);
    }

    private void closeApplication() {

        Object[] options = {"YES", "NO"};
        int n = JOptionPane.showOptionDialog(this,
                "Do you want close this Appplication?", "Warning !!!",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (n == 0) {
            LOG.setLog(1, "Aplication stop...");
            System.exit(0);
        };

    }

    public void getDataToShow() {

        displayStatusView();
        displaySummary();
        ITC.sumWin.displaySummary();

        displayAlarms();
        ITC.mtuWin.showData();
        ITC.cmurcuWin.showData();
        ITC.hpatxuWin.showData();
        ITC.rxuWin.showData();
        ITC.psuWin.showData();
        ITC.idsWin.showData();

        ITC.alarmsWin.showData();
        // ITC.dmeconfigWin.showData();

    }

    private static void displayAlarms() {
        systemAlarms1.displaySystemAlarms();
        biteAlarms1.displayBiteAlarms();
    }

    private String mergeAlarms(String primary, String secondary) {
        if (!primary.equals("0")) {
            return primary;
        } else {
            return secondary;
        }
    }

    public static void convertSummaryView() {
        sum_System1.convertSummaryView();
    }

    private void displaySummary() {

        sum_System1.displaySummary(1);
        sum_System2.displaySummary(2);

    }

    private void displayStatusView() {

        kTransparent1.refreshStatus();

    }

    public static void setConnView(String s) {
        ConnectedView.setBackground(UX.PColor.setBackGround(s));
        switch (s) {
            case "-1":
                ConnectedView.setText("???");

                progress.setVisible(true);
                descriptions.setVisible(true);

                kTransparent1.setVisible(false);
                break;
            case "0":
                jPanel1.setVisible(true);
                ConnectedView.setText("Connected");
                progress.setVisible(false);
                descriptions.setVisible(false);
                kTransparent1.setVisible(true);
                jPanel2.setVisible(true);
                MainItc.ITC.mainWin.doShowMenu();
                break;
            case "2":
                jPanel1.setVisible(false);
                jPanel2.setVisible(false);
                ConnectedView.setText("Not Connected !!!");
                break;
            default:
                ConnectedView.setText("???");
                break;
        };
    }

    public Main() {
        initComponents();
        Image iconImage = Toolkit.getDefaultToolkit().getImage(SysConfig.iconFile);
        this.setIconImage(iconImage);
        this.setTitle(ITC.ProgramName);

        viewVersion.setText("ver. " + ITC.ProgramVersion + " [" + ITC.CompilationData + "]");
        doHide();

        viewStation.setText("    Station: ???");
        setConnView("-1");

        sum_System1.setTitle("SYSTEM A");
        sum_System2.setTitle("SYSTEM B");
        if (ITC.trybPracy != 0) {
            ButtonConfiguration.setVisible(false);
            ButtonReset.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StatusViewGB1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        ButtonSummary = new javax.swing.JButton();
        ButtonStatus = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        ButtonConfiguration = new javax.swing.JButton();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        ButtonIDStation = new javax.swing.JButton();
        ButtonLogs = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        ButtonMTU = new javax.swing.JButton();
        ButtonCMURCU = new javax.swing.JButton();
        ButtonHPATXU = new javax.swing.JButton();
        ButtonRXU = new javax.swing.JButton();
        ButtonPSU = new javax.swing.JButton();
        ButtonReset = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        ButtonExit = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel7 = new javax.swing.JPanel();
        viewVersion = new javax.swing.JLabel();
        showTime = new javax.swing.JLabel();
        viewStation = new javax.swing.JLabel();
        showData = new javax.swing.JLabel();
        ConnectedView = new javax.swing.JLabel();
        viewWork = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        kTransparent1 = new Components.Transparent();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        progress = new javax.swing.JLabel();
        descriptions = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        systemAlarms1 = new Components.SystemAlarms();
        biteAlarms1 = new Components.BiteAlarms();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel42 = new javax.swing.JPanel();
        sum_System1 = new Components.Sum_System();
        sum_System2 = new Components.Sum_System();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuConnect = new javax.swing.JMenuItem();
        MenuDisconect = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        MenuSettings = new javax.swing.JMenuItem();
        MenuProgLog = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jBackup = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuAbout = new javax.swing.JMenuItem();
        MenuInfo = new javax.swing.JMenuItem();
        MenuHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(filler2);

        ButtonSummary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/hardinfo.png"))); // NOI18N
        ButtonSummary.setText("Summary");
        ButtonSummary.setToolTipText("");
        ButtonSummary.setFocusable(false);
        ButtonSummary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSummary.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonSummary.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonSummary.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonSummary.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSummaryActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonSummary);

        ButtonStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/gnome-swell-foop.png"))); // NOI18N
        ButtonStatus.setText("Status");
        ButtonStatus.setFocusable(false);
        ButtonStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonStatus.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonStatus.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonStatus.setName(""); // NOI18N
        ButtonStatus.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonStatus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonStatus);
        jToolBar1.add(filler5);

        ButtonConfiguration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/cs-general.png"))); // NOI18N
        ButtonConfiguration.setText("Configuration");
        ButtonConfiguration.setFocusable(false);
        ButtonConfiguration.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonConfiguration.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonConfiguration.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonConfiguration.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonConfiguration.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonConfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfigurationActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonConfiguration);
        jToolBar1.add(filler20);

        ButtonIDStation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/software-properties.png"))); // NOI18N
        ButtonIDStation.setText("ID Station");
        ButtonIDStation.setFocusable(false);
        ButtonIDStation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonIDStation.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonIDStation.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonIDStation.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonIDStation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonIDStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIDStationActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonIDStation);

        ButtonLogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/application-x-glade.png"))); // NOI18N
        ButtonLogs.setText("Logs");
        ButtonLogs.setFocusable(false);
        ButtonLogs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonLogs.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonLogs.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonLogs.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonLogs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogsActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonLogs);
        jToolBar1.add(filler4);

        ButtonMTU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/ghex.png"))); // NOI18N
        ButtonMTU.setText("MTU");
        ButtonMTU.setFocusable(false);
        ButtonMTU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonMTU.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonMTU.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonMTU.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonMTU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonMTU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMTUActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonMTU);

        ButtonCMURCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/applications-system.png"))); // NOI18N
        ButtonCMURCU.setText("CMU/RCU");
        ButtonCMURCU.setFocusable(false);
        ButtonCMURCU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonCMURCU.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonCMURCU.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonCMURCU.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonCMURCU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonCMURCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCMURCUActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonCMURCU);

        ButtonHPATXU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/spotify.png"))); // NOI18N
        ButtonHPATXU.setText("HPA/TXU");
        ButtonHPATXU.setFocusable(false);
        ButtonHPATXU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonHPATXU.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonHPATXU.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonHPATXU.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonHPATXU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonHPATXU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHPATXUActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonHPATXU);

        ButtonRXU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/nm-signal-75.png"))); // NOI18N
        ButtonRXU.setText("RXU");
        ButtonRXU.setFocusable(false);
        ButtonRXU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonRXU.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonRXU.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonRXU.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonRXU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonRXU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRXUActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonRXU);

        ButtonPSU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/gnome-power-manager.png"))); // NOI18N
        ButtonPSU.setText("PSU");
        ButtonPSU.setFocusable(false);
        ButtonPSU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonPSU.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonPSU.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonPSU.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonPSU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonPSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPSUActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonPSU);

        ButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/system-reboot.png"))); // NOI18N
        ButtonReset.setText("Reset EQU");
        ButtonReset.setFocusable(false);
        ButtonReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonReset.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonReset.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonReset.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonReset.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonReset);
        jToolBar1.add(filler1);

        ButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/32/gnome-shutdown.png"))); // NOI18N
        ButtonExit.setText("Exit");
        ButtonExit.setFocusable(false);
        ButtonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonExit.setMaximumSize(new java.awt.Dimension(100, 57));
        ButtonExit.setMinimumSize(new java.awt.Dimension(100, 57));
        ButtonExit.setPreferredSize(new java.awt.Dimension(100, 57));
        ButtonExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });
        jToolBar1.add(ButtonExit);
        jToolBar1.add(filler3);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(255, 255, 204));
        jPanel7.setToolTipText("");
        jPanel7.setName(""); // NOI18N

        viewVersion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewVersion.setForeground(new java.awt.Color(153, 153, 0));
        viewVersion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        viewVersion.setText("jLabel1");
        viewVersion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        showTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showTime.setForeground(new java.awt.Color(0, 153, 153));
        showTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showTime.setText("jLabel2");
        showTime.setToolTipText("");

        viewStation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewStation.setForeground(new java.awt.Color(153, 153, 153));
        viewStation.setText("jLabel3");
        viewStation.setName(""); // NOI18N

        showData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showData.setForeground(new java.awt.Color(255, 255, 255));
        showData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showData.setText("jLabel12");

        ConnectedView.setBackground(new java.awt.Color(102, 255, 255));
        ConnectedView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConnectedView.setText("???");
        ConnectedView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        ConnectedView.setOpaque(true);

        viewWork.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewWork.setForeground(new java.awt.Color(204, 204, 204));
        viewWork.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        viewWork.setText("|");
        viewWork.setMaximumSize(new java.awt.Dimension(14, 14));
        viewWork.setMinimumSize(new java.awt.Dimension(14, 14));
        viewWork.setPreferredSize(new java.awt.Dimension(14, 14));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(ConnectedView, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewWork, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewStation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewVersion, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showTime, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ConnectedView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewWork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(showTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewStation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        jPanel8.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status View", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.setMaximumSize(new java.awt.Dimension(250, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(205, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(205, 309));

        progress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/loading.gif"))); // NOI18N

        descriptions.setBackground(new java.awt.Color(153, 153, 153));
        descriptions.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        descriptions.setForeground(new java.awt.Color(102, 102, 102));
        descriptions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptions.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kTransparent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(filler6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(filler8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
            .addComponent(descriptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kTransparent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(progress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptions, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alarms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(filler19, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systemAlarms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(filler17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(biteAlarms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(filler7, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filler16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(396, 396, 396))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(filler15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(biteAlarms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(filler14, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler16, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(filler17, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systemAlarms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(filler19, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("System", new javax.swing.ImageIcon(getClass().getResource("/pic/32/jockey.png")), jPanel9); // NOI18N

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(filler12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sum_System1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sum_System2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178)
                .addComponent(filler9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(229, 229, 229))
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(filler10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(filler11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(filler10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sum_System2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sum_System1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(filler12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(filler13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(filler9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(filler11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(150, 150, 150))
        );

        jTabbedPane1.addTab("Summary", new javax.swing.ImageIcon(getClass().getResource("/pic/32/hardinfo.png")), jPanel42); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/onboard.png"))); // NOI18N
        jMenu1.setText("Program");
        jMenu1.setPreferredSize(new java.awt.Dimension(90, 25));

        MenuConnect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenuConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/network-transmit-receive.png"))); // NOI18N
        MenuConnect.setText("Connect");
        MenuConnect.setPreferredSize(new java.awt.Dimension(145, 25));
        MenuConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConnectActionPerformed(evt);
            }
        });
        jMenu1.add(MenuConnect);

        MenuDisconect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        MenuDisconect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/nm-no-connection.png"))); // NOI18N
        MenuDisconect.setText("Disconnect");
        MenuDisconect.setPreferredSize(new java.awt.Dimension(145, 25));
        MenuDisconect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDisconectActionPerformed(evt);
            }
        });
        jMenu1.add(MenuDisconect);
        jMenu1.add(jSeparator4);

        MenuSettings.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenuSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/application-default-icon.png"))); // NOI18N
        MenuSettings.setText("Settings");
        MenuSettings.setPreferredSize(new java.awt.Dimension(145, 25));
        MenuSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSettingsActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSettings);

        MenuProgLog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        MenuProgLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/application-x-glade.png"))); // NOI18N
        MenuProgLog.setText("Program log");
        MenuProgLog.setPreferredSize(new java.awt.Dimension(145, 25));
        MenuProgLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProgLogActionPerformed(evt);
            }
        });
        jMenu1.add(MenuProgLog);
        jMenu1.add(jSeparator1);

        MenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        MenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/application-exit.png"))); // NOI18N
        MenuExit.setText("Exit");
        MenuExit.setPreferredSize(new java.awt.Dimension(119, 25));
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        jMenu1.add(MenuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/folder.png"))); // NOI18N
        jMenu2.setText("Backups");
        jMenu2.setPreferredSize(new java.awt.Dimension(90, 25));

        jBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/dropboxstatus-busy.png"))); // NOI18N
        jBackup.setText("Backup");
        jBackup.setPreferredSize(new java.awt.Dimension(203, 25));
        jBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackupActionPerformed(evt);
            }
        });
        jMenu2.add(jBackup);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/accessories-text-editor.png"))); // NOI18N
        jMenu3.setText("Reports");
        jMenu3.setPreferredSize(new java.awt.Dimension(90, 25));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/evolution-tasks.png"))); // NOI18N
        jMenuItem1.setText("DME Reports");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/dialog-question.png"))); // NOI18N
        jMenu4.setText("Help");
        jMenu4.setToolTipText("");
        jMenu4.setPreferredSize(new java.awt.Dimension(90, 25));

        MenuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/dialog-information.png"))); // NOI18N
        MenuAbout.setText("About");
        MenuAbout.setPreferredSize(new java.awt.Dimension(93, 25));
        MenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAboutActionPerformed(evt);
            }
        });
        jMenu4.add(MenuAbout);

        MenuInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/dialog-warning.png"))); // NOI18N
        MenuInfo.setText("Info");
        MenuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInfoActionPerformed(evt);
            }
        });
        jMenu4.add(MenuInfo);

        MenuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/16/dialog-question.png"))); // NOI18N
        MenuHelp.setText("Help");
        MenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHelpActionPerformed(evt);
            }
        });
        jMenu4.add(MenuHelp);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConnectActionPerformed
        //this.setLocationByPlatform(true);
        Connect co = new Connect(this, true);
        //co.setLocationByPlatform(false);
        co.setVisible(true);

    }//GEN-LAST:event_MenuConnectActionPerformed

    private void MenuDisconectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDisconectActionPerformed
        ComData.stopCollectDataFromDME();
        Configuration.Config.indexConnection = -1;
        doHide();
        viewStation.setText("    Station: ???");
        setConnView("-1");
    }//GEN-LAST:event_MenuDisconectActionPerformed

    private void MenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAboutActionPerformed
        About ab = new About(this, true);
        ab.setVisible(true);
    }//GEN-LAST:event_MenuAboutActionPerformed

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        closeApplication();
    }//GEN-LAST:event_MenuExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closeApplication();
    }//GEN-LAST:event_formWindowClosing

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        closeApplication();
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSummaryActionPerformed
        ITC.sumWin.setVisible(true);
    }//GEN-LAST:event_ButtonSummaryActionPerformed

    private void ButtonLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogsActionPerformed
        ITC.logWin.setVisible(true);
    }//GEN-LAST:event_ButtonLogsActionPerformed

    private void ButtonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusActionPerformed
        ITC.alarmsWin.setVisible(true);
    }//GEN-LAST:event_ButtonStatusActionPerformed

    private void MenuProgLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProgLogActionPerformed
        ProgramLog pl = new ProgramLog(this, true);
        pl.setVisible(true);

    }//GEN-LAST:event_MenuProgLogActionPerformed

    private void MenuSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSettingsActionPerformed
        Settings se = new Settings(this, true);
        se.setVisible(true);
    }//GEN-LAST:event_MenuSettingsActionPerformed

    private void ButtonConfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfigurationActionPerformed
        ITC.dmeconfigWin.setVisible(true);
    }//GEN-LAST:event_ButtonConfigurationActionPerformed

    private void ButtonMTUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMTUActionPerformed
        ITC.mtuWin.setVisible(true);
    }//GEN-LAST:event_ButtonMTUActionPerformed

    private void ButtonCMURCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCMURCUActionPerformed
        ITC.cmurcuWin.setVisible(true);
    }//GEN-LAST:event_ButtonCMURCUActionPerformed

    private void ButtonHPATXUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHPATXUActionPerformed
        ITC.hpatxuWin.setVisible(true);
    }//GEN-LAST:event_ButtonHPATXUActionPerformed

    private void ButtonRXUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRXUActionPerformed
        ITC.rxuWin.setVisible(true);
    }//GEN-LAST:event_ButtonRXUActionPerformed

    private void ButtonPSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPSUActionPerformed
        ITC.psuWin.setVisible(true);
    }//GEN-LAST:event_ButtonPSUActionPerformed

    private void MenuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInfoActionPerformed
        Info in = new Info(this, true);
        in.setVisible(true);

    }//GEN-LAST:event_MenuInfoActionPerformed

    private void ButtonIDStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIDStationActionPerformed
        ITC.idsWin.setVisible(true);
    }//GEN-LAST:event_ButtonIDStationActionPerformed

    private void jBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackupActionPerformed
        ITC.backUPS.setVisible(true);
    }//GEN-LAST:event_jBackupActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ITC.rapDME.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        ITC.resDME.setVisible(true);
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void MenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHelpActionPerformed
        try {
            File f = new File(SysConfig.helpDir + "ITC.pdf");
            if (f.exists()) {
                if (Desktop.isDesktopSupported()) {

                    Desktop.getDesktop().open(f);

                } else {
                    System.out.println("File does not exists!");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuHelpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCMURCU;
    private javax.swing.JButton ButtonConfiguration;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonHPATXU;
    private javax.swing.JButton ButtonIDStation;
    private javax.swing.JButton ButtonLogs;
    private javax.swing.JButton ButtonMTU;
    private javax.swing.JButton ButtonPSU;
    private javax.swing.JButton ButtonRXU;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonStatus;
    private javax.swing.JButton ButtonSummary;
    private static javax.swing.JLabel ConnectedView;
    private javax.swing.JMenuItem MenuAbout;
    private javax.swing.JMenuItem MenuConnect;
    private javax.swing.JMenuItem MenuDisconect;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenuItem MenuHelp;
    private javax.swing.JMenuItem MenuInfo;
    private javax.swing.JMenuItem MenuProgLog;
    private javax.swing.JMenuItem MenuSettings;
    private javax.swing.ButtonGroup StatusViewGB1;
    private static Components.BiteAlarms biteAlarms1;
    public static javax.swing.JLabel descriptions;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JMenuItem jBackup;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel42;
    private static javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private static Components.Transparent kTransparent1;
    private static javax.swing.JLabel progress;
    public static javax.swing.JLabel showData;
    public static javax.swing.JLabel showTime;
    private static Components.Sum_System sum_System1;
    private Components.Sum_System sum_System2;
    private static Components.SystemAlarms systemAlarms1;
    public static javax.swing.JLabel viewStation;
    private javax.swing.JLabel viewVersion;
    private static javax.swing.JLabel viewWork;
    // End of variables declaration//GEN-END:variables

}
