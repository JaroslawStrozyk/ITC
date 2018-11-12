package Windows;

import Configuration.SysConfig;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author edatabit
 */
public class RXU extends javax.swing.JFrame {

    /**
     * Creates new form RXU
     */
    public RXU() {
        initComponents();
        Image iconImage = Toolkit.getDefaultToolkit().getImage(SysConfig.iconFile);
        this.setIconImage(iconImage);
    }

    public static void showData(){
        rXUStatusAlarms1.displayRXUAlarms();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MessageWindow = new javax.swing.JLabel();
        rXUStatusAlarms1 = new Components.RXUStatusAlarms();

        setTitle("RXU");
        setResizable(false);

        MessageWindow.setBackground(new java.awt.Color(51, 51, 51));
        MessageWindow.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MessageWindow.setForeground(new java.awt.Color(255, 255, 0));
        MessageWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MessageWindow.setText("Loading data, please wait...");
        MessageWindow.setToolTipText("");
        MessageWindow.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MessageWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(rXUStatusAlarms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(rXUStatusAlarms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(MessageWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RXU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RXU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RXU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RXU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RXU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel MessageWindow;
    private static Components.RXUStatusAlarms rXUStatusAlarms1;
    // End of variables declaration//GEN-END:variables
}
