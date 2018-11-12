package Components;

import Communication.ComData;

/**
 *
 * @author jaroslaw.strozyk
 */
public class SVHPATXU extends javax.swing.JPanel {

    /**
     * Creates new form SVHPATXU
     */
    public SVHPATXU() {
        initComponents();
    }

    public void displayHPATXUStatus() {
        if(ComData.getTLastPoll(7, 2).equals("0"))
        {         
            jTextField169.setText(ComData.getTTXUStatus(0, 1));
            jTextField169.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(0, 2)));
            jTextField170.setText(ComData.getTTXUStatus(1, 1));
            jTextField170.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(1, 2)));
            jTextField171.setText(ComData.getTTXUStatus(2, 1));
            jTextField171.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(2, 2)));
            jTextField172.setText(ComData.getTTXUStatus(3, 1));
            jTextField172.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(3, 2)));
            jTextField173.setText(ComData.getTTXUStatus(4, 1));
            jTextField173.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(4, 2)));
            jTextField174.setText(ComData.getTTXUStatus(5, 1));
            jTextField174.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(5, 2)));
            jTextField175.setText(ComData.getTTXUStatus(6, 1));
            jTextField175.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(6, 2)));
            jTextField176.setText(ComData.getTTXUStatus(7, 1));
            jTextField176.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(7, 2)));
            
            jTextField185.setText(ComData.getTTXUStatus(16, 1));
            jTextField185.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(16, 2)));
            jTextField186.setText(ComData.getTTXUStatus(17, 1));
            jTextField186.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(17, 2)));
        }
        else
        {         
            jTextField169.setText("");
            jTextField169.setBackground(UX.PColor.setBackGround("-2"));
            jTextField170.setText("");
            jTextField170.setBackground(UX.PColor.setBackGround("-2"));
            jTextField171.setText("");
            jTextField171.setBackground(UX.PColor.setBackGround("-2"));
            jTextField172.setText("");
            jTextField172.setBackground(UX.PColor.setBackGround("-2"));
            jTextField173.setText("");
            jTextField173.setBackground(UX.PColor.setBackGround("-2"));
            jTextField174.setText("");
            jTextField174.setBackground(UX.PColor.setBackGround("-2"));
            jTextField175.setText("");
            jTextField175.setBackground(UX.PColor.setBackGround("-2"));
            jTextField176.setText("");
            jTextField176.setBackground(UX.PColor.setBackGround("-2"));
            
            jTextField185.setText("");
            jTextField185.setBackground(UX.PColor.setBackGround("-2"));
            jTextField186.setText("");
            jTextField186.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if(ComData.getTLastPoll(8, 2).equals("0"))
        {  
            jTextField155.setText(ComData.getTTXUStatus(8, 1));
            jTextField155.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(8, 2)));
            jTextField156.setText(ComData.getTTXUStatus(9, 1));
            jTextField156.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(9, 2)));
            jTextField163.setText(ComData.getTTXUStatus(10, 1));
            jTextField163.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(10, 2)));
            jTextField164.setText(ComData.getTTXUStatus(11, 1));
            jTextField164.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(11, 2)));
            jTextField165.setText(ComData.getTTXUStatus(12, 1));
            jTextField165.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(12, 2)));
            jTextField166.setText(ComData.getTTXUStatus(13, 1));
            jTextField166.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(13, 2)));
            jTextField167.setText(ComData.getTTXUStatus(14, 1));
            jTextField167.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(14, 2)));
            jTextField168.setText(ComData.getTTXUStatus(15, 1));
            jTextField168.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(15, 2)));

            jTextField177.setText(ComData.getTTXUStatus(18, 1));
            jTextField177.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(18, 2)));
            jTextField178.setText(ComData.getTTXUStatus(19, 1));
            jTextField178.setBackground(UX.PColor.setBackGround(ComData.getTTXUStatus(19, 2)));
        }
        else
         {  
            jTextField155.setText("");
            jTextField155.setBackground(UX.PColor.setBackGround("-2"));
            jTextField156.setText("");
            jTextField156.setBackground(UX.PColor.setBackGround("-2"));
            jTextField163.setText("");
            jTextField163.setBackground(UX.PColor.setBackGround("-2"));
            jTextField164.setText("");
            jTextField164.setBackground(UX.PColor.setBackGround("-2"));
            jTextField165.setText("");
            jTextField165.setBackground(UX.PColor.setBackGround("-2"));
            jTextField166.setText("");
            jTextField166.setBackground(UX.PColor.setBackGround("-2"));
            jTextField167.setText("");
            jTextField167.setBackground(UX.PColor.setBackGround("-2"));
            jTextField168.setText("");
            jTextField168.setBackground(UX.PColor.setBackGround("-2"));

            jTextField177.setText("");
            jTextField177.setBackground(UX.PColor.setBackGround("-2"));
            jTextField178.setText("");
            jTextField178.setBackground(UX.PColor.setBackGround("-2"));
        }       
        // HPA
        
        if(ComData.getTLastPoll(5, 2).equals("0"))
        {  
            jTextField303.setText(ComData.getTHPAStatus(0, 1));
            jTextField303.setBackground(UX.PColor.setBackGround(ComData.getTHPAStatus(0, 2)));
            jTextField304.setText(ComData.getTHPAStatus(1, 1));
            jTextField304.setBackground(UX.PColor.setBackGround(ComData.getTHPAStatus(1, 2)));
            jTextField305.setText(ComData.getTHPAStatus(2, 1));
            jTextField305.setBackground(UX.PColor.setBackGround(ComData.getTHPAStatus(2, 2)));
            jTextField306.setText(ComData.getTHPAStatus(3, 1));
            jTextField306.setBackground(UX.PColor.setBackGround(ComData.getTHPAStatus(3, 2)));
        }
        else
        {  
            jTextField303.setText("");
            jTextField303.setBackground(UX.PColor.setBackGround("-2"));
            jTextField304.setText("");
            jTextField304.setBackground(UX.PColor.setBackGround("-2"));
            jTextField305.setText("");
            jTextField305.setBackground(UX.PColor.setBackGround("-2"));
            jTextField306.setText("");
            jTextField306.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if(ComData.getTLastPoll(6, 2).equals("0"))
        {          
            jTextField229.setText(ComData.getTHPAStatus(4, 1));
            jTextField229.setBackground(UX.PColor.setBackGround(ComData.getTHPAStatus(4, 2)));
            jTextField230.setText(ComData.getTHPAStatus(5, 1));
            jTextField230.setBackground(UX.PColor.setBackGround(ComData.getTHPAStatus(5, 2)));
            jTextField231.setText(ComData.getTHPAStatus(6, 1));
            jTextField231.setBackground(UX.PColor.setBackGround(ComData.getTHPAStatus(6, 2)));
            jTextField232.setText(ComData.getTHPAStatus(7, 1));
            jTextField232.setBackground(UX.PColor.setBackGround(ComData.getTHPAStatus(7, 2)));
        }
        else
        {          
            jTextField229.setText("");
            jTextField229.setBackground(UX.PColor.setBackGround("-2"));
            jTextField230.setText("");
            jTextField230.setBackground(UX.PColor.setBackGround("-2"));
            jTextField231.setText("");
            jTextField231.setBackground(UX.PColor.setBackGround("-2"));
            jTextField232.setText("");
            jTextField232.setBackground(UX.PColor.setBackGround("-2"));
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
        jLabel96 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jTextField229 = new javax.swing.JTextField();
        jTextField230 = new javax.swing.JTextField();
        jTextField231 = new javax.swing.JTextField();
        jTextField232 = new javax.swing.JTextField();
        jPanel79 = new javax.swing.JPanel();
        jTextField303 = new javax.swing.JTextField();
        jTextField304 = new javax.swing.JTextField();
        jTextField305 = new javax.swing.JTextField();
        jTextField306 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel80 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jTextField155 = new javax.swing.JTextField();
        jTextField156 = new javax.swing.JTextField();
        jTextField163 = new javax.swing.JTextField();
        jTextField164 = new javax.swing.JTextField();
        jTextField165 = new javax.swing.JTextField();
        jTextField166 = new javax.swing.JTextField();
        jTextField167 = new javax.swing.JTextField();
        jTextField168 = new javax.swing.JTextField();
        jPanel82 = new javax.swing.JPanel();
        jTextField169 = new javax.swing.JTextField();
        jTextField170 = new javax.swing.JTextField();
        jTextField171 = new javax.swing.JTextField();
        jTextField172 = new javax.swing.JTextField();
        jTextField173 = new javax.swing.JTextField();
        jTextField174 = new javax.swing.JTextField();
        jTextField175 = new javax.swing.JTextField();
        jTextField176 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jPanel83 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jTextField177 = new javax.swing.JTextField();
        jTextField178 = new javax.swing.JTextField();
        jPanel85 = new javax.swing.JPanel();
        jTextField185 = new javax.swing.JTextField();
        jTextField186 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        jPanel77.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setText("RF Operation Enabled:");

        jPanel78.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField229.setEditable(false);
        jTextField229.setBackground(new java.awt.Color(102, 255, 255));
        jTextField229.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField229.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField229.setText("???");

        jTextField230.setEditable(false);
        jTextField230.setBackground(new java.awt.Color(102, 255, 255));
        jTextField230.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField230.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField230.setText("???");

        jTextField231.setEditable(false);
        jTextField231.setBackground(new java.awt.Color(102, 255, 255));
        jTextField231.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField231.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField231.setText("???");

        jTextField232.setEditable(false);
        jTextField232.setBackground(new java.awt.Color(102, 255, 255));
        jTextField232.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField232.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField232.setText("???");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField229)
            .addComponent(jTextField230, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField231)
            .addComponent(jTextField232)
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addComponent(jTextField229, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField230, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField231, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField232, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel79.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField303.setEditable(false);
        jTextField303.setBackground(new java.awt.Color(102, 255, 255));
        jTextField303.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField303.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField303.setText("???");

        jTextField304.setEditable(false);
        jTextField304.setBackground(new java.awt.Color(102, 255, 255));
        jTextField304.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField304.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField304.setText("???");

        jTextField305.setEditable(false);
        jTextField305.setBackground(new java.awt.Color(102, 255, 255));
        jTextField305.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField305.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField305.setText("???");

        jTextField306.setEditable(false);
        jTextField306.setBackground(new java.awt.Color(102, 255, 255));
        jTextField306.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField306.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField306.setText("???");

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField303)
            .addComponent(jTextField304, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField305)
            .addComponent(jTextField306)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addComponent(jTextField303, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField304, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField305, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField306, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel97.setText("Forward Power:");

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel104.setText("Temperature:");

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel105.setText("Transmission Rate:");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel80.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel106.setText("RF Operation Enabled:");

        jPanel81.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField155.setEditable(false);
        jTextField155.setBackground(new java.awt.Color(102, 255, 255));
        jTextField155.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField155.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField155.setText("???");

        jTextField156.setEditable(false);
        jTextField156.setBackground(new java.awt.Color(102, 255, 255));
        jTextField156.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField156.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField156.setText("???");

        jTextField163.setEditable(false);
        jTextField163.setBackground(new java.awt.Color(102, 255, 255));
        jTextField163.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField163.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField163.setText("???");

        jTextField164.setEditable(false);
        jTextField164.setBackground(new java.awt.Color(102, 255, 255));
        jTextField164.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField164.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField164.setText("???");

        jTextField165.setEditable(false);
        jTextField165.setBackground(new java.awt.Color(102, 255, 255));
        jTextField165.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField165.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField165.setText("???");

        jTextField166.setEditable(false);
        jTextField166.setBackground(new java.awt.Color(102, 255, 255));
        jTextField166.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField166.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField166.setText("???");

        jTextField167.setEditable(false);
        jTextField167.setBackground(new java.awt.Color(102, 255, 255));
        jTextField167.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField167.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField167.setText("???");

        jTextField168.setEditable(false);
        jTextField168.setBackground(new java.awt.Color(102, 255, 255));
        jTextField168.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField168.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField168.setText("???");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField155)
            .addComponent(jTextField156, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField163)
            .addComponent(jTextField164)
            .addComponent(jTextField165)
            .addComponent(jTextField166)
            .addComponent(jTextField167)
            .addComponent(jTextField168)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addComponent(jTextField155, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField163, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField164, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField165, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField166, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField167, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField168, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel82.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField169.setEditable(false);
        jTextField169.setBackground(new java.awt.Color(102, 255, 255));
        jTextField169.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField169.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField169.setText("???");

        jTextField170.setEditable(false);
        jTextField170.setBackground(new java.awt.Color(102, 255, 255));
        jTextField170.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField170.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField170.setText("???");

        jTextField171.setEditable(false);
        jTextField171.setBackground(new java.awt.Color(102, 255, 255));
        jTextField171.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField171.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField171.setText("???");

        jTextField172.setEditable(false);
        jTextField172.setBackground(new java.awt.Color(102, 255, 255));
        jTextField172.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField172.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField172.setText("???");

        jTextField173.setEditable(false);
        jTextField173.setBackground(new java.awt.Color(102, 255, 255));
        jTextField173.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField173.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField173.setText("???");

        jTextField174.setEditable(false);
        jTextField174.setBackground(new java.awt.Color(102, 255, 255));
        jTextField174.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField174.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField174.setText("???");

        jTextField175.setEditable(false);
        jTextField175.setBackground(new java.awt.Color(102, 255, 255));
        jTextField175.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField175.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField175.setText("???");

        jTextField176.setEditable(false);
        jTextField176.setBackground(new java.awt.Color(102, 255, 255));
        jTextField176.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField176.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField176.setText("???");

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField169)
            .addComponent(jTextField170, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField171)
            .addComponent(jTextField172)
            .addComponent(jTextField173)
            .addComponent(jTextField174)
            .addComponent(jTextField175)
            .addComponent(jTextField176)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addComponent(jTextField169, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField170, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField171, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField172, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel107.setText("HPA Present:");

        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel108.setText("Forward Power:");

        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel109.setText("Temperature:");

        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel110.setText("Replies Transmission Rate:");

        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel111.setText("Squitter Transmission Rate:");

        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel112.setText("Total Transmission Rate:");

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel113.setText("Waveform Fail Count:");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel83.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU Interlock Status", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel114.setText("ILS 1 Interlock Status:");

        jPanel84.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField177.setEditable(false);
        jTextField177.setBackground(new java.awt.Color(102, 255, 255));
        jTextField177.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField177.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField177.setText("???");

        jTextField178.setEditable(false);
        jTextField178.setBackground(new java.awt.Color(102, 255, 255));
        jTextField178.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField178.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField178.setText("???");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField177)
            .addComponent(jTextField178, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addComponent(jTextField177, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField178, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel85.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField185.setEditable(false);
        jTextField185.setBackground(new java.awt.Color(102, 255, 255));
        jTextField185.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField185.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField185.setText("???");

        jTextField186.setEditable(false);
        jTextField186.setBackground(new java.awt.Color(102, 255, 255));
        jTextField186.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField186.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField186.setText("???");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField185)
            .addComponent(jTextField186, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addComponent(jTextField185, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField186, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel115.setText("ILS 2 Interlock Status:");

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel83Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(filler22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel83Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(filler22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JTextField jTextField155;
    private javax.swing.JTextField jTextField156;
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
    private javax.swing.JTextField jTextField185;
    private javax.swing.JTextField jTextField186;
    private javax.swing.JTextField jTextField229;
    private javax.swing.JTextField jTextField230;
    private javax.swing.JTextField jTextField231;
    private javax.swing.JTextField jTextField232;
    private javax.swing.JTextField jTextField303;
    private javax.swing.JTextField jTextField304;
    private javax.swing.JTextField jTextField305;
    private javax.swing.JTextField jTextField306;
    // End of variables declaration//GEN-END:variables
}
