package Components;

import Communication.ComData;

/**
 *
 * @author jaroslaw.strozyk
 */
public class SVMTU extends javax.swing.JPanel {

    /**
     * Creates new form SVMTU
     */
    public SVMTU() {
        initComponents();
    }

    public void displayMTUStatus() 
    {
        
        if(ComData.getTLastPoll(3, 2).equals("0"))
        {  
            jTextField243.setText(ComData.getTMTUStatus(0, 1));
            jTextField243.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(0, 2)));
            jTextField244.setText(ComData.getTMTUStatus(1, 1));
            jTextField244.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(1, 2)));
            jTextField245.setText(ComData.getTMTUStatus(2, 1));
            jTextField245.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(2, 2)));
            jTextField246.setText(ComData.getTMTUStatus(3, 1));
            jTextField246.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(3, 2)));
            jTextField157.setText(ComData.getTMTUStatus(8, 1));
            jTextField157.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(8, 2)));
            jTextField158.setText(ComData.getTMTUStatus(9, 1));
            jTextField158.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(9, 2)));
            jTextField159.setText(ComData.getTMTUStatus(10, 1));
            jTextField159.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(10, 2)));
            jTextField160.setText(ComData.getTMTUStatus(11, 1));
            jTextField160.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(11, 2)));
            jTextField161.setText(ComData.getTMTUStatus(12, 1));
            jTextField161.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(12, 2)));
            jTextField162.setText(ComData.getTMTUStatus(13, 1));
            jTextField162.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(13, 2)));
        }
        else
        {  
            jTextField243.setText("");
            jTextField243.setBackground(UX.PColor.setBackGround("-2"));
            jTextField244.setText("");
            jTextField244.setBackground(UX.PColor.setBackGround("-2"));
            jTextField245.setText("");
            jTextField245.setBackground(UX.PColor.setBackGround("-2"));
            jTextField246.setText("");
            jTextField246.setBackground(UX.PColor.setBackGround("-2"));
            jTextField157.setText("");
            jTextField157.setBackground(UX.PColor.setBackGround("-2"));
            jTextField158.setText("");
            jTextField158.setBackground(UX.PColor.setBackGround("-2"));
            jTextField159.setText("");
            jTextField159.setBackground(UX.PColor.setBackGround("-2"));
            jTextField160.setText("");
            jTextField160.setBackground(UX.PColor.setBackGround("-2"));
            jTextField161.setText("");
            jTextField161.setBackground(UX.PColor.setBackGround("-2"));
            jTextField162.setText("");
            jTextField162.setBackground(UX.PColor.setBackGround("-2"));
        }            
        if(ComData.getTLastPoll(4, 2).equals("0"))
        {  
            jTextField220.setText(ComData.getTMTUStatus(4, 1));
            jTextField220.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(4, 2)));
            jTextField226.setText(ComData.getTMTUStatus(5, 1));
            jTextField226.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(5, 2)));
            jTextField227.setText(ComData.getTMTUStatus(6, 1));
            jTextField227.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(6, 2)));
            jTextField228.setText(ComData.getTMTUStatus(7, 1));
            jTextField228.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(7, 2)));
            jTextField149.setText(ComData.getTMTUStatus(14, 1));
            jTextField149.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(14, 2)));
            jTextField150.setText(ComData.getTMTUStatus(15, 1));
            jTextField150.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(15, 2)));
            jTextField151.setText(ComData.getTMTUStatus(16, 1));
            jTextField151.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(16, 2)));
            jTextField152.setText(ComData.getTMTUStatus(17, 1));
            jTextField152.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(17, 2)));
            jTextField153.setText(ComData.getTMTUStatus(18, 1));
            jTextField153.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(18, 2)));
            jTextField154.setText(ComData.getTMTUStatus(19, 1));
            jTextField154.setBackground(UX.PColor.setBackGround(ComData.getTMTUStatus(19, 2)));
        }
        else
        {  
            jTextField220.setText("");
            jTextField220.setBackground(UX.PColor.setBackGround("-2"));
            jTextField226.setText("");
            jTextField226.setBackground(UX.PColor.setBackGround("-2"));
            jTextField227.setText("");
            jTextField227.setBackground(UX.PColor.setBackGround("-2"));
            jTextField228.setText("");
            jTextField228.setBackground(UX.PColor.setBackGround("-2"));
            jTextField149.setText("");
            jTextField149.setBackground(UX.PColor.setBackGround("-2"));
            jTextField150.setText("");
            jTextField150.setBackground(UX.PColor.setBackGround("-2"));
            jTextField151.setText("");
            jTextField151.setBackground(UX.PColor.setBackGround("-2"));
            jTextField152.setText("");
            jTextField152.setBackground(UX.PColor.setBackGround("-2"));
            jTextField153.setText("");
            jTextField153.setBackground(UX.PColor.setBackGround("-2"));
            jTextField154.setText("");
            jTextField154.setBackground(UX.PColor.setBackGround("-2"));
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
        jLabel94 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jTextField220 = new javax.swing.JTextField();
        jTextField226 = new javax.swing.JTextField();
        jTextField227 = new javax.swing.JTextField();
        jTextField228 = new javax.swing.JTextField();
        jPanel73 = new javax.swing.JPanel();
        jTextField243 = new javax.swing.JTextField();
        jTextField244 = new javax.swing.JTextField();
        jTextField245 = new javax.swing.JTextField();
        jTextField246 = new javax.swing.JTextField();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jTextField149 = new javax.swing.JTextField();
        jTextField150 = new javax.swing.JTextField();
        jTextField151 = new javax.swing.JTextField();
        jTextField152 = new javax.swing.JTextField();
        jTextField153 = new javax.swing.JTextField();
        jTextField154 = new javax.swing.JTextField();
        jPanel76 = new javax.swing.JPanel();
        jTextField157 = new javax.swing.JTextField();
        jTextField158 = new javax.swing.JTextField();
        jTextField159 = new javax.swing.JTextField();
        jTextField160 = new javax.swing.JTextField();
        jTextField161 = new javax.swing.JTextField();
        jTextField162 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        jPanel71.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Autodiagnosis", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("Beacon Delay:");

        jPanel72.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField220.setEditable(false);
        jTextField220.setBackground(new java.awt.Color(102, 255, 255));
        jTextField220.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField220.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField220.setText("???");

        jTextField226.setEditable(false);
        jTextField226.setBackground(new java.awt.Color(102, 255, 255));
        jTextField226.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField226.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField226.setText("???");

        jTextField227.setEditable(false);
        jTextField227.setBackground(new java.awt.Color(102, 255, 255));
        jTextField227.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField227.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField227.setText("???");

        jTextField228.setEditable(false);
        jTextField228.setBackground(new java.awt.Color(102, 255, 255));
        jTextField228.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField228.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField228.setText("???");

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField227, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jTextField220, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField226, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField228, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField220, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField226, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField227, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField228, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel73.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField243.setEditable(false);
        jTextField243.setBackground(new java.awt.Color(102, 255, 255));
        jTextField243.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField243.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField243.setText("???");

        jTextField244.setEditable(false);
        jTextField244.setBackground(new java.awt.Color(102, 255, 255));
        jTextField244.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField244.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField244.setText("???");

        jTextField245.setEditable(false);
        jTextField245.setBackground(new java.awt.Color(102, 255, 255));
        jTextField245.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField245.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField245.setText("???");

        jTextField246.setEditable(false);
        jTextField246.setBackground(new java.awt.Color(102, 255, 255));
        jTextField246.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField246.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField246.setText("???");

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField245, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jTextField243, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField244, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField246, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField243, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField244, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField246, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField245, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setText("Beacon Delay:");

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel97.setText("Pulse Pair Spacing:");

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel104.setText("Pulse Pair Spacing:");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel74.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Ident", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel98.setText("ID Tone Period (741 us):");

        jPanel75.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField149.setEditable(false);
        jTextField149.setBackground(new java.awt.Color(102, 255, 255));
        jTextField149.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField149.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField149.setText("???");

        jTextField150.setEditable(false);
        jTextField150.setBackground(new java.awt.Color(102, 255, 255));
        jTextField150.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField150.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField150.setText("???");

        jTextField151.setEditable(false);
        jTextField151.setBackground(new java.awt.Color(102, 255, 255));
        jTextField151.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField151.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField151.setText("???");

        jTextField152.setEditable(false);
        jTextField152.setBackground(new java.awt.Color(102, 255, 255));
        jTextField152.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField152.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField152.setText("???");

        jTextField153.setEditable(false);
        jTextField153.setBackground(new java.awt.Color(102, 255, 255));
        jTextField153.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField153.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField153.setText("???");

        jTextField154.setEditable(false);
        jTextField154.setBackground(new java.awt.Color(102, 255, 255));
        jTextField154.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField154.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField154.setText("???");

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField149)
            .addComponent(jTextField150, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField151)
            .addComponent(jTextField152)
            .addComponent(jTextField153)
            .addComponent(jTextField154)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel76.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField157.setEditable(false);
        jTextField157.setBackground(new java.awt.Color(102, 255, 255));
        jTextField157.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField157.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField157.setText("???");

        jTextField158.setEditable(false);
        jTextField158.setBackground(new java.awt.Color(102, 255, 255));
        jTextField158.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField158.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField158.setText("???");

        jTextField159.setEditable(false);
        jTextField159.setBackground(new java.awt.Color(102, 255, 255));
        jTextField159.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField159.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField159.setText("???");

        jTextField160.setEditable(false);
        jTextField160.setBackground(new java.awt.Color(102, 255, 255));
        jTextField160.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField160.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField160.setText("???");

        jTextField161.setEditable(false);
        jTextField161.setBackground(new java.awt.Color(102, 255, 255));
        jTextField161.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField161.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField161.setText("???");

        jTextField162.setEditable(false);
        jTextField162.setBackground(new java.awt.Color(102, 255, 255));
        jTextField162.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField162.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField162.setText("???");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField157)
            .addComponent(jTextField158, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField159)
            .addComponent(jTextField160)
            .addComponent(jTextField161)
            .addComponent(jTextField162)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField158, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField159, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField160, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField161, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField162, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel99.setText("Dash Length:");

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel100.setText("Dot Length:");

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel101.setText("Keydown Period:");

        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel102.setText("Ident Period:");

        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel103.setText("Ident Length:");

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField150;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField153;
    private javax.swing.JTextField jTextField154;
    private javax.swing.JTextField jTextField157;
    private javax.swing.JTextField jTextField158;
    private javax.swing.JTextField jTextField159;
    private javax.swing.JTextField jTextField160;
    private javax.swing.JTextField jTextField161;
    private javax.swing.JTextField jTextField162;
    private javax.swing.JTextField jTextField220;
    private javax.swing.JTextField jTextField226;
    private javax.swing.JTextField jTextField227;
    private javax.swing.JTextField jTextField228;
    private javax.swing.JTextField jTextField243;
    private javax.swing.JTextField jTextField244;
    private javax.swing.JTextField jTextField245;
    private javax.swing.JTextField jTextField246;
    // End of variables declaration//GEN-END:variables
}
