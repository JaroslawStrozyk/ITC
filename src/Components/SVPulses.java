package Components;

import Communication.ComData;

/**
 *
 * @author jaroslaw.strozyk
 */
public class SVPulses extends javax.swing.JPanel {

    /**
     * Creates new form SVPulse
     */
    public SVPulses() {
        initComponents();
    }

    public static void displayPulseShape() {

        if (ComData.getTStatusView(5, 1).equals("ON")) {

            if(ComData.getTLastPoll(3, 2).equals("0"))
            {              
                jTextField1.setText(ComData.getTPulseShape(0, 1));
                jTextField1.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(0, 2)));
                jTextField2.setText(ComData.getTPulseShape(1, 1));
                jTextField2.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(1, 2)));
                jTextField3.setText(ComData.getTPulseShape(2, 1));
                jTextField3.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(2, 2)));
                jTextField4.setText(ComData.getTPulseShape(3, 1));
                jTextField4.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(3, 2)));
                jTextField5.setText(ComData.getTPulseShape(4, 1));
                jTextField5.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(4, 2)));
                jTextField6.setText(ComData.getTPulseShape(5, 1));
                jTextField6.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(5, 2)));
                jTextField7.setText(ComData.getTPulseShape(48, 1));
                jTextField7.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(48, 2)));
                jTextField8.setText(ComData.getTPulseShape(49, 1));
                jTextField8.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(49, 2)));            
            }
            else
            {
                jTextField1.setText("");
                jTextField1.setBackground(UX.PColor.setBackGround("-2"));
                jTextField2.setText("");
                jTextField2.setBackground(UX.PColor.setBackGround("-2"));
                jTextField3.setText("");
                jTextField3.setBackground(UX.PColor.setBackGround("-2"));
                jTextField4.setText("");
                jTextField4.setBackground(UX.PColor.setBackGround("-2"));
                jTextField5.setText("");
                jTextField5.setBackground(UX.PColor.setBackGround("-2"));
                jTextField6.setText("");
                jTextField6.setBackground(UX.PColor.setBackGround("-2"));
                jTextField7.setText("");
                jTextField7.setBackground(UX.PColor.setBackGround("-2"));
                jTextField8.setText("");
                jTextField8.setBackground(UX.PColor.setBackGround("-2"));
                }
                
            if(ComData.getTLastPoll(4, 2).equals("0"))
            {              
                jTextField9.setText(ComData.getTPulseShape(6, 1));
                jTextField9.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(6, 2)));
                jTextField10.setText(ComData.getTPulseShape(7, 1));
                jTextField10.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(7, 2)));
                jTextField11.setText(ComData.getTPulseShape(8, 1));
                jTextField11.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(8, 2)));
                jTextField12.setText(ComData.getTPulseShape(9, 1));
                jTextField12.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(9, 2)));
                jTextField13.setText(ComData.getTPulseShape(10, 1));
                jTextField13.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(10, 2)));
                jTextField14.setText(ComData.getTPulseShape(11, 1));
                jTextField14.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(11, 2)));
                jTextField15.setText(ComData.getTPulseShape(50, 1));
                jTextField15.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(50, 2)));
                jTextField16.setText(ComData.getTPulseShape(51, 1));
                jTextField16.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(51, 2)));
            }
            else
            {
                jTextField9.setText("");
                jTextField9.setBackground(UX.PColor.setBackGround("-2"));
                jTextField10.setText("");
                jTextField10.setBackground(UX.PColor.setBackGround("-2"));
                jTextField11.setText("");
                jTextField11.setBackground(UX.PColor.setBackGround("-2"));
                jTextField12.setText("");
                jTextField12.setBackground(UX.PColor.setBackGround("-2"));
                jTextField13.setText("");
                jTextField13.setBackground(UX.PColor.setBackGround("-2"));
                jTextField14.setText("");
                jTextField14.setBackground(UX.PColor.setBackGround("-2"));
                jTextField15.setText("");
                jTextField15.setBackground(UX.PColor.setBackGround("-2"));
                jTextField16.setText("");
                jTextField16.setBackground(UX.PColor.setBackGround("-2"));
            }
            

        }
        else {
            jTextField1.setText("");
            jTextField1.setBackground(UX.PColor.setBackGround("-2"));
            jTextField2.setText("");
            jTextField2.setBackground(UX.PColor.setBackGround("-2"));
            jTextField3.setText("");
            jTextField3.setBackground(UX.PColor.setBackGround("-2"));
            jTextField4.setText("");
            jTextField4.setBackground(UX.PColor.setBackGround("-2"));
            jTextField5.setText("");
            jTextField5.setBackground(UX.PColor.setBackGround("-2"));
            jTextField6.setText("");
            jTextField6.setBackground(UX.PColor.setBackGround("-2"));
            jTextField7.setText("");
            jTextField7.setBackground(UX.PColor.setBackGround("-2"));
            jTextField8.setText("");
            jTextField8.setBackground(UX.PColor.setBackGround("-2"));
            jTextField9.setText("");
            jTextField9.setBackground(UX.PColor.setBackGround("-2"));
            jTextField10.setText("");
            jTextField10.setBackground(UX.PColor.setBackGround("-2"));
            jTextField11.setText("");
            jTextField11.setBackground(UX.PColor.setBackGround("-2"));
            jTextField12.setText("");
            jTextField12.setBackground(UX.PColor.setBackGround("-2"));
            jTextField13.setText("");
            jTextField13.setBackground(UX.PColor.setBackGround("-2"));
            jTextField14.setText("");
            jTextField14.setBackground(UX.PColor.setBackGround("-2"));
            jTextField15.setText("");
            jTextField15.setBackground(UX.PColor.setBackGround("-2"));
            jTextField16.setText("");
            jTextField16.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if (ComData.getTStatusView(6, 1).equals("ON")) {

            if(ComData.getTLastPoll(3, 2).equals("0"))
            {              
                jTextField17.setText(ComData.getTPulseShape(12, 1));
                jTextField17.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(12, 2)));
                jTextField18.setText(ComData.getTPulseShape(13, 1));
                jTextField18.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(13, 2)));
                jTextField19.setText(ComData.getTPulseShape(14, 1));
                jTextField19.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(14, 2)));
                jTextField20.setText(ComData.getTPulseShape(15, 1));
                jTextField20.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(15, 2)));
                jTextField21.setText(ComData.getTPulseShape(16, 1));
                jTextField21.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(16, 2)));
                jTextField22.setText(ComData.getTPulseShape(17, 1));
                jTextField22.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(17, 2)));
                jTextField23.setText(ComData.getTPulseShape(52, 1));
                jTextField23.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(52, 2)));
                jTextField24.setText(ComData.getTPulseShape(53, 1));
                jTextField24.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(53, 2))); 
            }
            else
            {
                jTextField17.setText("");
                jTextField17.setBackground(UX.PColor.setBackGround("-2"));
                jTextField18.setText("");
                jTextField18.setBackground(UX.PColor.setBackGround("-2"));
                jTextField19.setText("");
                jTextField19.setBackground(UX.PColor.setBackGround("-2"));
                jTextField20.setText("");
                jTextField20.setBackground(UX.PColor.setBackGround("-2"));
                jTextField21.setText("");
                jTextField21.setBackground(UX.PColor.setBackGround("-2"));
                jTextField22.setText("");
                jTextField22.setBackground(UX.PColor.setBackGround("-2"));
                jTextField23.setText("");
                jTextField23.setBackground(UX.PColor.setBackGround("-2"));
                jTextField24.setText("");
                jTextField24.setBackground(UX.PColor.setBackGround("-2"));
            }
            
            if(ComData.getTLastPoll(4, 2).equals("0"))
            {  
                jTextField25.setText(ComData.getTPulseShape(18, 1));
                jTextField25.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(18, 2)));
                jTextField26.setText(ComData.getTPulseShape(19, 1));
                jTextField26.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(19, 2)));
                jTextField27.setText(ComData.getTPulseShape(20, 1));
                jTextField27.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(20, 2)));
                jTextField28.setText(ComData.getTPulseShape(21, 1));
                jTextField28.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(21, 2)));
                jTextField29.setText(ComData.getTPulseShape(22, 1));
                jTextField29.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(22, 2)));
                jTextField30.setText(ComData.getTPulseShape(23, 1));
                jTextField30.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(23, 2)));
                jTextField31.setText(ComData.getTPulseShape(54, 1));
                jTextField31.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(54, 2)));
                jTextField32.setText(ComData.getTPulseShape(55, 1));
                jTextField32.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(55, 2)));
            }
            else
            {
                jTextField25.setText("");
                jTextField25.setBackground(UX.PColor.setBackGround("-2"));
                jTextField26.setText("");
                jTextField26.setBackground(UX.PColor.setBackGround("-2"));
                jTextField27.setText("");
                jTextField27.setBackground(UX.PColor.setBackGround("-2"));
                jTextField28.setText("");
                jTextField28.setBackground(UX.PColor.setBackGround("-2"));
                jTextField29.setText("");
                jTextField29.setBackground(UX.PColor.setBackGround("-2"));
                jTextField30.setText("");
                jTextField30.setBackground(UX.PColor.setBackGround("-2"));
                jTextField31.setText("");
                jTextField31.setBackground(UX.PColor.setBackGround("-2"));
                jTextField32.setText("");
                jTextField32.setBackground(UX.PColor.setBackGround("-2"));            
            }
               
        }
        else {
            jTextField17.setText("");
            jTextField17.setBackground(UX.PColor.setBackGround("-2"));
            jTextField18.setText("");
            jTextField18.setBackground(UX.PColor.setBackGround("-2"));
            jTextField19.setText("");
            jTextField19.setBackground(UX.PColor.setBackGround("-2"));
            jTextField20.setText("");
            jTextField20.setBackground(UX.PColor.setBackGround("-2"));
            jTextField21.setText("");
            jTextField21.setBackground(UX.PColor.setBackGround("-2"));
            jTextField22.setText("");
            jTextField22.setBackground(UX.PColor.setBackGround("-2"));
            jTextField23.setText("");
            jTextField23.setBackground(UX.PColor.setBackGround("-2"));
            jTextField24.setText("");
            jTextField24.setBackground(UX.PColor.setBackGround("-2"));
            jTextField25.setText("");
            jTextField25.setBackground(UX.PColor.setBackGround("-2"));
            jTextField26.setText("");
            jTextField26.setBackground(UX.PColor.setBackGround("-2"));
            jTextField27.setText("");
            jTextField27.setBackground(UX.PColor.setBackGround("-2"));
            jTextField28.setText("");
            jTextField28.setBackground(UX.PColor.setBackGround("-2"));
            jTextField29.setText("");
            jTextField29.setBackground(UX.PColor.setBackGround("-2"));
            jTextField30.setText("");
            jTextField30.setBackground(UX.PColor.setBackGround("-2"));
            jTextField31.setText("");
            jTextField31.setBackground(UX.PColor.setBackGround("-2"));
            jTextField32.setText("");
            jTextField32.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if (ComData.getTStatusView(5, 1).equals("ON") || ComData.getTStatusView(6, 1).equals("ON")) 
        {
            
            if(ComData.getTLastPoll(7, 2).equals("0"))
            {             
                jTextField46.setText(ComData.getTPulseShape(36, 1));
                jTextField46.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(36, 2)));
                jTextField47.setText(ComData.getTPulseShape(37, 1));
                jTextField47.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(37, 2)));
                jTextField48.setText(ComData.getTPulseShape(38, 1));
                jTextField48.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(38, 2)));
                jTextField49.setText(ComData.getTPulseShape(39, 1));
                jTextField49.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(39, 2)));
                jTextField50.setText(ComData.getTPulseShape(40, 1));
                jTextField50.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(40, 2)));
                jTextField51.setText(ComData.getTPulseShape(41, 1));
                jTextField51.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(41, 2)));
            }
            else
            {
                jTextField46.setText("");
                jTextField46.setBackground(UX.PColor.setBackGround("-2"));
                jTextField47.setText("");
                jTextField47.setBackground(UX.PColor.setBackGround("-2"));
                jTextField48.setText("");
                jTextField48.setBackground(UX.PColor.setBackGround("-2"));
                jTextField49.setText("");
                jTextField49.setBackground(UX.PColor.setBackGround("-2"));
                jTextField50.setText("");
                jTextField50.setBackground(UX.PColor.setBackGround("-2"));
                jTextField51.setText("");
                jTextField51.setBackground(UX.PColor.setBackGround("-2"));
            }
            
            if(ComData.getTLastPoll(7, 2).equals("0"))
            { 
                jTextField52.setText(ComData.getTPulseShape(42, 1));
                jTextField52.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(42, 2)));
                jTextField53.setText(ComData.getTPulseShape(43, 1));
                jTextField53.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(43, 2)));
                jTextField54.setText(ComData.getTPulseShape(44, 1));
                jTextField54.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(44, 2)));
                jTextField55.setText(ComData.getTPulseShape(45, 1));
                jTextField55.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(45, 2)));
                jTextField56.setText(ComData.getTPulseShape(46, 1));
                jTextField56.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(46, 2)));
                jTextField57.setText(ComData.getTPulseShape(47, 1));
                jTextField57.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(47, 2)));  
            }   
            else
            {
                jTextField52.setText("");
                jTextField52.setBackground(UX.PColor.setBackGround("-2"));
                jTextField53.setText("");
                jTextField53.setBackground(UX.PColor.setBackGround("-2"));
                jTextField54.setText("");
                jTextField54.setBackground(UX.PColor.setBackGround("-2"));
                jTextField55.setText("");
                jTextField55.setBackground(UX.PColor.setBackGround("-2"));
                jTextField56.setText("");
                jTextField56.setBackground(UX.PColor.setBackGround("-2"));
                jTextField57.setText("");
                jTextField57.setBackground(UX.PColor.setBackGround("-2"));                
            }
            
            if(ComData.getTLastPoll(5, 2).equals("0"))
            {              
                jTextField33.setText(ComData.getTPulseShape(24, 1));
                jTextField33.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(24, 2)));
                jTextField34.setText(ComData.getTPulseShape(25, 1));
                jTextField34.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(25, 2)));
                jTextField36.setText(ComData.getTPulseShape(26, 1));
                jTextField36.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(26, 2)));
                jTextField37.setText(ComData.getTPulseShape(27, 1));
                jTextField37.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(27, 2)));
                jTextField38.setText(ComData.getTPulseShape(28, 1));
                jTextField38.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(28, 2)));
                jTextField39.setText(ComData.getTPulseShape(29, 1));
                jTextField39.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(29, 2)));
            } 
            else
            {
                jTextField33.setText("");
                jTextField33.setBackground(UX.PColor.setBackGround("-2"));
                jTextField34.setText("");
                jTextField34.setBackground(UX.PColor.setBackGround("-2"));
                jTextField36.setText("");
                jTextField36.setBackground(UX.PColor.setBackGround("-2"));
                jTextField37.setText("");
                jTextField37.setBackground(UX.PColor.setBackGround("-2"));
                jTextField38.setText("");
                jTextField38.setBackground(UX.PColor.setBackGround("-2"));
                jTextField39.setText("");
                jTextField39.setBackground(UX.PColor.setBackGround("-2"));
            }
            
            if(ComData.getTLastPoll(6, 2).equals("0"))
            { 
                jTextField40.setText(ComData.getTPulseShape(30, 1));
                jTextField40.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(30, 2)));
                jTextField41.setText(ComData.getTPulseShape(31, 1));
                jTextField41.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(31, 2)));
                jTextField42.setText(ComData.getTPulseShape(32, 1));
                jTextField42.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(32, 2)));
                jTextField43.setText(ComData.getTPulseShape(33, 1));
                jTextField43.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(33, 2)));
                jTextField44.setText(ComData.getTPulseShape(34, 1));
                jTextField44.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(34, 2)));
                jTextField45.setText(ComData.getTPulseShape(35, 1));
                jTextField45.setBackground(UX.PColor.setBackGround(ComData.getTPulseShape(35, 2)));
            }
            else
            {
                jTextField40.setText("");
                jTextField40.setBackground(UX.PColor.setBackGround("-2"));
                jTextField41.setText("");
                jTextField41.setBackground(UX.PColor.setBackGround("-2"));
                jTextField42.setText("");
                jTextField42.setBackground(UX.PColor.setBackGround("-2"));
                jTextField43.setText("");
                jTextField43.setBackground(UX.PColor.setBackGround("-2"));
                jTextField44.setText("");
                jTextField44.setBackground(UX.PColor.setBackGround("-2"));
                jTextField45.setText("");
                jTextField45.setBackground(UX.PColor.setBackGround("-2"));                
            }
        
        }
        else
        {
            jTextField33.setText("");
            jTextField33.setBackground(UX.PColor.setBackGround("-2"));
            jTextField34.setText("");
            jTextField34.setBackground(UX.PColor.setBackGround("-2"));
            jTextField36.setText("");
            jTextField36.setBackground(UX.PColor.setBackGround("-2"));
            jTextField37.setText("");
            jTextField37.setBackground(UX.PColor.setBackGround("-2"));
            jTextField38.setText("");
            jTextField38.setBackground(UX.PColor.setBackGround("-2"));
            jTextField39.setText("");
            jTextField39.setBackground(UX.PColor.setBackGround("-2"));
            jTextField40.setText("");
            jTextField40.setBackground(UX.PColor.setBackGround("-2"));
            jTextField41.setText("");
            jTextField41.setBackground(UX.PColor.setBackGround("-2"));
            jTextField42.setText("");
            jTextField42.setBackground(UX.PColor.setBackGround("-2"));
            jTextField43.setText("");
            jTextField43.setBackground(UX.PColor.setBackGround("-2"));
            jTextField44.setText("");
            jTextField44.setBackground(UX.PColor.setBackGround("-2"));
            jTextField45.setText("");
            jTextField45.setBackground(UX.PColor.setBackGround("-2"));
            
            jTextField46.setText("");
            jTextField46.setBackground(UX.PColor.setBackGround("-2"));
            jTextField47.setText("");
            jTextField47.setBackground(UX.PColor.setBackGround("-2"));
            jTextField48.setText("");
            jTextField48.setBackground(UX.PColor.setBackGround("-2"));
            jTextField49.setText("");
            jTextField49.setBackground(UX.PColor.setBackGround("-2"));
            jTextField50.setText("");
            jTextField50.setBackground(UX.PColor.setBackGround("-2"));
            jTextField51.setText("");
            jTextField51.setBackground(UX.PColor.setBackGround("-2"));
            jTextField52.setText("");
            jTextField52.setBackground(UX.PColor.setBackGround("-2"));
            jTextField53.setText("");
            jTextField53.setBackground(UX.PColor.setBackGround("-2"));
            jTextField54.setText("");
            jTextField54.setBackground(UX.PColor.setBackGround("-2"));
            jTextField55.setText("");
            jTextField55.setBackground(UX.PColor.setBackGround("-2"));
            jTextField56.setText("");
            jTextField56.setBackground(UX.PColor.setBackGround("-2"));
            jTextField57.setText("");
            jTextField57.setBackground(UX.PColor.setBackGround("-2"));
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

        jPanel52 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jPanel64 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jPanel65 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jPanel67 = new javax.swing.JPanel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel68 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jPanel70 = new javax.swing.JPanel();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU - TXP A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Pulse 1 Rise Time:");

        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(102, 255, 255));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("???");

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(102, 255, 255));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("???");

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(102, 255, 255));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("???");

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(102, 255, 255));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("???");

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(102, 255, 255));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("???");

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(102, 255, 255));
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("???");

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(102, 255, 255));
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("???");

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(102, 255, 255));
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("???");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField9)
            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField11)
            .addComponent(jTextField12)
            .addComponent(jTextField13)
            .addComponent(jTextField14)
            .addComponent(jTextField15)
            .addComponent(jTextField16)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel64.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("???");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("???");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("???");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("???");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(102, 255, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("???");

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(102, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("???");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(102, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("???");

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 255, 255));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("???");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField3)
            .addComponent(jTextField4)
            .addComponent(jTextField5)
            .addComponent(jTextField6)
            .addComponent(jTextField7)
            .addComponent(jTextField8)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Pulse 1 Fall Time:");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Pulse 1 Width:");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Pulse 2 Rise Time:");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Pulse 2 Fall Time:");

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Pulse 2 Width:");

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel90.setText("TX Freq Deviation:");

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel91.setText("RX Freq Deviation:");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel54.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU - TXP B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Pulse 1 Rise Time:");

        jPanel55.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(102, 255, 255));
        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setText("???");

        jTextField26.setEditable(false);
        jTextField26.setBackground(new java.awt.Color(102, 255, 255));
        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setText("???");

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(102, 255, 255));
        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setText("???");

        jTextField28.setEditable(false);
        jTextField28.setBackground(new java.awt.Color(102, 255, 255));
        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setText("???");

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(102, 255, 255));
        jTextField29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setText("???");

        jTextField30.setEditable(false);
        jTextField30.setBackground(new java.awt.Color(102, 255, 255));
        jTextField30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setText("???");

        jTextField31.setEditable(false);
        jTextField31.setBackground(new java.awt.Color(102, 255, 255));
        jTextField31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setText("???");

        jTextField32.setEditable(false);
        jTextField32.setBackground(new java.awt.Color(102, 255, 255));
        jTextField32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("???");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField25)
            .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField27)
            .addComponent(jTextField28)
            .addComponent(jTextField29)
            .addComponent(jTextField30)
            .addComponent(jTextField31)
            .addComponent(jTextField32)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel65.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(102, 255, 255));
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("???");

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(102, 255, 255));
        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("???");

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(102, 255, 255));
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("???");

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(102, 255, 255));
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("???");

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(102, 255, 255));
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("???");

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(102, 255, 255));
        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("???");

        jTextField23.setEditable(false);
        jTextField23.setBackground(new java.awt.Color(102, 255, 255));
        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setText("???");

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(102, 255, 255));
        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setText("???");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField17)
            .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField19)
            .addComponent(jTextField20)
            .addComponent(jTextField21)
            .addComponent(jTextField22)
            .addComponent(jTextField23)
            .addComponent(jTextField24)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Pulse 1 Fall Time:");

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Pulse 1 Width:");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Pulse 2 Rise Time:");

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Pulse 2 Fall Time:");

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Pulse 2 Width:");

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel92.setText("TX Freq Deviation:");

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setText("RX Freq Deviation:");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Pulse 1 Rise Time:");

        jPanel66.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField40.setEditable(false);
        jTextField40.setBackground(new java.awt.Color(102, 255, 255));
        jTextField40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setText("???");

        jTextField41.setEditable(false);
        jTextField41.setBackground(new java.awt.Color(102, 255, 255));
        jTextField41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setText("???");

        jTextField42.setEditable(false);
        jTextField42.setBackground(new java.awt.Color(102, 255, 255));
        jTextField42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setText("???");

        jTextField43.setEditable(false);
        jTextField43.setBackground(new java.awt.Color(102, 255, 255));
        jTextField43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setText("???");

        jTextField44.setEditable(false);
        jTextField44.setBackground(new java.awt.Color(102, 255, 255));
        jTextField44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setText("???");

        jTextField45.setEditable(false);
        jTextField45.setBackground(new java.awt.Color(102, 255, 255));
        jTextField45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setText("???");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField40)
            .addComponent(jTextField41, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField42)
            .addComponent(jTextField43)
            .addComponent(jTextField44)
            .addComponent(jTextField45)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel67.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField33.setEditable(false);
        jTextField33.setBackground(new java.awt.Color(102, 255, 255));
        jTextField33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setText("???");

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(102, 255, 255));
        jTextField34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("???");

        jTextField36.setEditable(false);
        jTextField36.setBackground(new java.awt.Color(102, 255, 255));
        jTextField36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setText("???");

        jTextField37.setEditable(false);
        jTextField37.setBackground(new java.awt.Color(102, 255, 255));
        jTextField37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("???");

        jTextField38.setEditable(false);
        jTextField38.setBackground(new java.awt.Color(102, 255, 255));
        jTextField38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setText("???");

        jTextField39.setEditable(false);
        jTextField39.setBackground(new java.awt.Color(102, 255, 255));
        jTextField39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setText("???");

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField33)
            .addComponent(jTextField34, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField36)
            .addComponent(jTextField37)
            .addComponent(jTextField38)
            .addComponent(jTextField39)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Pulse 1 Fall Time:");

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Pulse 1 Width:");

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel81.setText("Pulse 2 Rise Time:");

        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("Pulse 2 Fall Time:");

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("Pulse 2 Width:");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel68.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("Pulse 1 Rise Time:");

        jPanel69.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField52.setEditable(false);
        jTextField52.setBackground(new java.awt.Color(102, 255, 255));
        jTextField52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.setText("???");

        jTextField53.setEditable(false);
        jTextField53.setBackground(new java.awt.Color(102, 255, 255));
        jTextField53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.setText("???");

        jTextField54.setEditable(false);
        jTextField54.setBackground(new java.awt.Color(102, 255, 255));
        jTextField54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField54.setText("???");

        jTextField55.setEditable(false);
        jTextField55.setBackground(new java.awt.Color(102, 255, 255));
        jTextField55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.setText("???");

        jTextField56.setEditable(false);
        jTextField56.setBackground(new java.awt.Color(102, 255, 255));
        jTextField56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.setText("???");

        jTextField57.setEditable(false);
        jTextField57.setBackground(new java.awt.Color(102, 255, 255));
        jTextField57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField57.setText("???");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField52)
            .addComponent(jTextField53, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField54)
            .addComponent(jTextField55)
            .addComponent(jTextField56)
            .addComponent(jTextField57)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel70.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField46.setEditable(false);
        jTextField46.setBackground(new java.awt.Color(102, 255, 255));
        jTextField46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setText("???");

        jTextField47.setEditable(false);
        jTextField47.setBackground(new java.awt.Color(102, 255, 255));
        jTextField47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setText("???");

        jTextField48.setEditable(false);
        jTextField48.setBackground(new java.awt.Color(102, 255, 255));
        jTextField48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setText("???");

        jTextField49.setEditable(false);
        jTextField49.setBackground(new java.awt.Color(102, 255, 255));
        jTextField49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setText("???");

        jTextField50.setEditable(false);
        jTextField50.setBackground(new java.awt.Color(102, 255, 255));
        jTextField50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setText("???");

        jTextField51.setEditable(false);
        jTextField51.setBackground(new java.awt.Color(102, 255, 255));
        jTextField51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.setText("???");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField46)
            .addComponent(jTextField47, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField48)
            .addComponent(jTextField49)
            .addComponent(jTextField50)
            .addComponent(jTextField51)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("Pulse 1 Fall Time:");

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("Pulse 1 Width:");

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("Pulse 2 Rise Time:");

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setText("Pulse 2 Fall Time:");

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("Pulse 2 Width:");

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField10;
    private static javax.swing.JTextField jTextField11;
    private static javax.swing.JTextField jTextField12;
    private static javax.swing.JTextField jTextField13;
    private static javax.swing.JTextField jTextField14;
    private static javax.swing.JTextField jTextField15;
    private static javax.swing.JTextField jTextField16;
    private static javax.swing.JTextField jTextField17;
    private static javax.swing.JTextField jTextField18;
    private static javax.swing.JTextField jTextField19;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField20;
    private static javax.swing.JTextField jTextField21;
    private static javax.swing.JTextField jTextField22;
    private static javax.swing.JTextField jTextField23;
    private static javax.swing.JTextField jTextField24;
    private static javax.swing.JTextField jTextField25;
    private static javax.swing.JTextField jTextField26;
    private static javax.swing.JTextField jTextField27;
    private static javax.swing.JTextField jTextField28;
    private static javax.swing.JTextField jTextField29;
    private static javax.swing.JTextField jTextField3;
    private static javax.swing.JTextField jTextField30;
    private static javax.swing.JTextField jTextField31;
    private static javax.swing.JTextField jTextField32;
    private static javax.swing.JTextField jTextField33;
    private static javax.swing.JTextField jTextField34;
    private static javax.swing.JTextField jTextField36;
    private static javax.swing.JTextField jTextField37;
    private static javax.swing.JTextField jTextField38;
    private static javax.swing.JTextField jTextField39;
    private static javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField jTextField40;
    private static javax.swing.JTextField jTextField41;
    private static javax.swing.JTextField jTextField42;
    private static javax.swing.JTextField jTextField43;
    private static javax.swing.JTextField jTextField44;
    private static javax.swing.JTextField jTextField45;
    private static javax.swing.JTextField jTextField46;
    private static javax.swing.JTextField jTextField47;
    private static javax.swing.JTextField jTextField48;
    private static javax.swing.JTextField jTextField49;
    private static javax.swing.JTextField jTextField5;
    private static javax.swing.JTextField jTextField50;
    private static javax.swing.JTextField jTextField51;
    private static javax.swing.JTextField jTextField52;
    private static javax.swing.JTextField jTextField53;
    private static javax.swing.JTextField jTextField54;
    private static javax.swing.JTextField jTextField55;
    private static javax.swing.JTextField jTextField56;
    private static javax.swing.JTextField jTextField57;
    private static javax.swing.JTextField jTextField6;
    private static javax.swing.JTextField jTextField7;
    private static javax.swing.JTextField jTextField8;
    private static javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
