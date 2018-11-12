package Components;

import Communication.ComData;

/**
 *
 * @author jaroslaw.strozyk
 */
public class SVVoltage extends javax.swing.JPanel {

    /**
     * Creates new form SVVoltage
     */
    public SVVoltage() {
        initComponents();
    }

    public void displayVoltage() {

        if(ComData.getTLastPoll(3, 2).equals("0"))
        {  
            jTextField104.setText(ComData.getTVoltage(0, 1));
            jTextField104.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(0, 2)));
            jTextField105.setText(ComData.getTVoltage(1, 1));
            jTextField105.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(1, 2)));
            jTextField106.setText(ComData.getTVoltage(2, 1));
            jTextField106.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(2, 2)));
            jTextField107.setText(ComData.getTVoltage(3, 1));
            jTextField107.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(3, 2)));
            jTextField108.setText(ComData.getTVoltage(4, 1));
            jTextField108.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(4, 2)));
            jTextField109.setText(ComData.getTVoltage(5, 1));
            jTextField109.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(5, 2)));
            jTextField110.setText(ComData.getTVoltage(6, 1));
            jTextField110.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(6, 2)));
        }
        else
        {  
            jTextField104.setText("");
            jTextField104.setBackground(UX.PColor.setBackGround("-2"));
            jTextField105.setText("");
            jTextField105.setBackground(UX.PColor.setBackGround("-2"));
            jTextField106.setText("");
            jTextField106.setBackground(UX.PColor.setBackGround("-2"));
            jTextField107.setText("");
            jTextField107.setBackground(UX.PColor.setBackGround("-2"));
            jTextField108.setText("");
            jTextField108.setBackground(UX.PColor.setBackGround("-2"));
            jTextField109.setText("");
            jTextField109.setBackground(UX.PColor.setBackGround("-2"));
            jTextField110.setText("");
            jTextField110.setBackground(UX.PColor.setBackGround("-2"));
        }    
        
        if(ComData.getTLastPoll(4, 2).equals("0"))
        {  
            jTextField77.setText(ComData.getTVoltage(7, 1));
            jTextField77.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(7, 2)));
            jTextField78.setText(ComData.getTVoltage(8, 1));
            jTextField78.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(8, 2)));
            jTextField79.setText(ComData.getTVoltage(9, 1));
            jTextField79.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(9, 2)));
            jTextField80.setText(ComData.getTVoltage(10, 1));
            jTextField80.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(10, 2)));
            jTextField85.setText(ComData.getTVoltage(11, 1));
            jTextField85.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(11, 2)));
            jTextField86.setText(ComData.getTVoltage(12, 1));
            jTextField86.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(12, 2)));
            jTextField87.setText(ComData.getTVoltage(13, 1));
            jTextField87.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(13, 2)));
        }
        else
        {  
            jTextField77.setText("");
            jTextField77.setBackground(UX.PColor.setBackGround("-2"));
            jTextField78.setText("");
            jTextField78.setBackground(UX.PColor.setBackGround("-2"));
            jTextField79.setText("");
            jTextField79.setBackground(UX.PColor.setBackGround("-2"));
            jTextField80.setText("");
            jTextField80.setBackground(UX.PColor.setBackGround("-2"));
            jTextField85.setText("");
            jTextField85.setBackground(UX.PColor.setBackGround("-2"));
            jTextField86.setText("");
            jTextField86.setBackground(UX.PColor.setBackGround("-2"));
            jTextField87.setText("");
            jTextField87.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if(ComData.getTLastPoll(1, 2).equals("0"))
        {          
            jTextField235.setText(ComData.getTVoltage(14, 1));
            jTextField235.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(14, 2)));
            jTextField236.setText(ComData.getTVoltage(15, 1));
            jTextField236.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(15, 2)));
            jTextField237.setText(ComData.getTVoltage(16, 1));
            jTextField237.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(16, 2)));
            jTextField238.setText(ComData.getTVoltage(17, 1));
            jTextField238.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(17, 2)));
            jTextField248.setText(ComData.getTVoltage(18, 1));
            jTextField248.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(18, 2)));
        }
        else
        {          
            jTextField235.setText("");
            jTextField235.setBackground(UX.PColor.setBackGround("-2"));
            jTextField236.setText("");
            jTextField236.setBackground(UX.PColor.setBackGround("-2"));
            jTextField237.setText("");
            jTextField237.setBackground(UX.PColor.setBackGround("-2"));
            jTextField238.setText("");
            jTextField238.setBackground(UX.PColor.setBackGround("-2"));
            jTextField248.setText("");
            jTextField248.setBackground(UX.PColor.setBackGround("-2"));
        }            
         
        if(ComData.getTLastPoll(2, 2).equals("0"))
        {  
            jTextField214.setText(ComData.getTVoltage(19, 1));
            jTextField214.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(19, 2)));
            jTextField215.setText(ComData.getTVoltage(20, 1));
            jTextField215.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(20, 2)));
            jTextField216.setText(ComData.getTVoltage(21, 1));
            jTextField216.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(21, 2)));
            jTextField221.setText(ComData.getTVoltage(22, 1));
            jTextField221.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(22, 2)));
            jTextField249.setText(ComData.getTVoltage(23, 1));
            jTextField249.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(23, 2)));
        }
        else
        {  
            jTextField214.setText("");
            jTextField214.setBackground(UX.PColor.setBackGround("-2"));
            jTextField215.setText("");
            jTextField215.setBackground(UX.PColor.setBackGround("-2"));
            jTextField216.setText("");
            jTextField216.setBackground(UX.PColor.setBackGround("-2"));
            jTextField221.setText("");
            jTextField221.setBackground(UX.PColor.setBackGround("-2"));
            jTextField249.setText("");
            jTextField249.setBackground(UX.PColor.setBackGround("-2"));
        }            
        
        if(ComData.getTLastPoll(7, 2).equals("0"))
        {          
            if (ComData.getTStatusView(5, 1).equals("ON")) {
                jTextField247.setText(ComData.getTVoltage(24, 1));
                jTextField247.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(24, 2)));
            } else {
                jTextField247.setText("");
                jTextField247.setBackground(UX.PColor.setBackGround("-2"));
            }

            jTextField250.setText(ComData.getTVoltage(25, 1));
            jTextField250.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(25, 2)));
            jTextField251.setText(ComData.getTVoltage(26, 1));
            jTextField251.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(26, 2)));
            jTextField252.setText(ComData.getTVoltage(27, 1));
            jTextField252.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(27, 2)));
            jTextField253.setText(ComData.getTVoltage(28, 1));
            jTextField253.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(28, 2)));
            jTextField254.setText(ComData.getTVoltage(29, 1));
            jTextField254.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(29, 2)));
            jTextField255.setText(ComData.getTVoltage(30, 1));
            jTextField255.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(30, 2)));
        }
        else
        {          
            jTextField247.setText("");
            jTextField247.setBackground(UX.PColor.setBackGround("-2"));
            jTextField250.setText("");
            jTextField250.setBackground(UX.PColor.setBackGround("-2"));
            jTextField251.setText("");
            jTextField251.setBackground(UX.PColor.setBackGround("-2"));
            jTextField252.setText("");
            jTextField252.setBackground(UX.PColor.setBackGround("-2"));
            jTextField253.setText("");
            jTextField253.setBackground(UX.PColor.setBackGround("-2"));
            jTextField254.setText("");
            jTextField254.setBackground(UX.PColor.setBackGround("-2"));
            jTextField255.setText("");
            jTextField255.setBackground(UX.PColor.setBackGround("-2"));
        }            
        
        if(ComData.getTLastPoll(8, 2).equals("0"))
        {  
            if (ComData.getTStatusView(6, 1).equals("ON")) {
                jTextField88.setText(ComData.getTVoltage(31, 1));
                jTextField88.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(31, 2)));
            } else {
                jTextField88.setText("");
                jTextField88.setBackground(UX.PColor.setBackGround("-2"));
            }
            jTextField103.setText(ComData.getTVoltage(32, 1));
            jTextField103.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(32, 2)));
            jTextField212.setText(ComData.getTVoltage(33, 1));
            jTextField212.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(33, 2)));
            jTextField213.setText(ComData.getTVoltage(34, 1));
            jTextField213.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(34, 2)));
            jTextField222.setText(ComData.getTVoltage(35, 1));
            jTextField222.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(35, 2)));
            jTextField223.setText(ComData.getTVoltage(36, 1));
            jTextField223.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(36, 2)));
            jTextField224.setText(ComData.getTVoltage(37, 1));
            jTextField224.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(37, 2)));
        }
        else
        {  
            jTextField88.setText("");
            jTextField88.setBackground(UX.PColor.setBackGround("-2"));
            jTextField103.setText("");
            jTextField103.setBackground(UX.PColor.setBackGround("-2"));
            jTextField212.setText("");
            jTextField212.setBackground(UX.PColor.setBackGround("-2"));
            jTextField213.setText("");
            jTextField213.setBackground(UX.PColor.setBackGround("-2"));
            jTextField222.setText("");
            jTextField222.setBackground(UX.PColor.setBackGround("-2"));
            jTextField223.setText("");
            jTextField223.setBackground(UX.PColor.setBackGround("-2"));
            jTextField224.setText("");
            jTextField224.setBackground(UX.PColor.setBackGround("-2"));
        }            
        
        
        if(ComData.getTLastPoll(5, 2).equals("0"))
        {  
            if (ComData.getTStatusView(5, 1).equals("ON")) {
                jTextField261.setText(ComData.getTVoltage(38, 1));
                jTextField261.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(38, 2)));
            } else {
                jTextField261.setText("");
                jTextField261.setBackground(UX.PColor.setBackGround("-2"));
            }
            jTextField262.setText(ComData.getTVoltage(39, 1));
            jTextField262.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(39, 2)));
            jTextField263.setText(ComData.getTVoltage(40, 1));
            jTextField263.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(40, 2)));
            jTextField264.setText(ComData.getTVoltage(41, 1));
            jTextField264.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(41, 2)));
            jTextField265.setText(ComData.getTVoltage(42, 1));
            jTextField265.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(42, 2)));
        }
        else
        {  
            jTextField261.setText("");
            jTextField261.setBackground(UX.PColor.setBackGround("-2"));
            jTextField262.setText("");
            jTextField262.setBackground(UX.PColor.setBackGround("-2"));
            jTextField263.setText("");
            jTextField263.setBackground(UX.PColor.setBackGround("-2"));
            jTextField264.setText("");
            jTextField264.setBackground(UX.PColor.setBackGround("-2"));
            jTextField265.setText("");
            jTextField265.setBackground(UX.PColor.setBackGround("-2"));
        }            
        
        if(ComData.getTLastPoll(6, 2).equals("0"))
        {          
            if (ComData.getTStatusView(6, 1).equals("ON")) {
                jTextField256.setText(ComData.getTVoltage(43, 1));
                jTextField256.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(43, 2)));
            } else {
                jTextField256.setText("");
                jTextField256.setBackground(UX.PColor.setBackGround("-2"));
            }
            jTextField257.setText(ComData.getTVoltage(44, 1));
            jTextField257.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(44, 2)));
            jTextField258.setText(ComData.getTVoltage(45, 1));
            jTextField258.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(45, 2)));
            jTextField259.setText(ComData.getTVoltage(46, 1));
            jTextField259.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(46, 2)));
            jTextField260.setText(ComData.getTVoltage(47, 1));
            jTextField260.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(47, 2)));
        }
        else       
        {          
            jTextField256.setText("");
            jTextField256.setBackground(UX.PColor.setBackGround("-2"));
            jTextField257.setText("");
            jTextField257.setBackground(UX.PColor.setBackGround("-2"));
            jTextField258.setText("");
            jTextField258.setBackground(UX.PColor.setBackGround("-2"));
            jTextField259.setText("");
            jTextField259.setBackground(UX.PColor.setBackGround("-2"));
            jTextField260.setText("");
            jTextField260.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if(ComData.getTLastPoll(9, 2).equals("0"))
        {          
            jTextField273.setText(ComData.getTVoltage(48, 1));
            jTextField273.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(48, 2)));
            jTextField274.setText(ComData.getTVoltage(49, 1));
            jTextField274.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(49, 2)));
            jTextField275.setText(ComData.getTVoltage(50, 1));
            jTextField275.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(50, 2)));
            jTextField276.setText(ComData.getTVoltage(51, 1));
            jTextField276.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(51, 2)));
            jTextField277.setText(ComData.getTVoltage(52, 1));
            jTextField277.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(52, 2)));
            jTextField278.setText(ComData.getTVoltage(53, 1));
            jTextField278.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(53, 2)));
            jTextField279.setText(ComData.getTVoltage(54, 1));
            jTextField279.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(54, 2)));
            jTextField280.setText(ComData.getTVoltage(55, 1));
            jTextField280.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(55, 2)));
        }
        else
        {          
            jTextField273.setText("");
            jTextField273.setBackground(UX.PColor.setBackGround("-2"));
            jTextField274.setText("");
            jTextField274.setBackground(UX.PColor.setBackGround("-2"));
            jTextField275.setText("");
            jTextField275.setBackground(UX.PColor.setBackGround("-2"));
            jTextField276.setText("");
            jTextField276.setBackground(UX.PColor.setBackGround("-2"));
            jTextField277.setText("");
            jTextField277.setBackground(UX.PColor.setBackGround("-2"));
            jTextField278.setText("");
            jTextField278.setBackground(UX.PColor.setBackGround("-2"));
            jTextField279.setText("");
            jTextField279.setBackground(UX.PColor.setBackGround("-2"));
            jTextField280.setText("");
            jTextField280.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if(ComData.getTLastPoll(10, 2).equals("0"))
        {  
            jTextField266.setText(ComData.getTVoltage(56, 1));
            jTextField266.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(56, 2)));
            jTextField267.setText(ComData.getTVoltage(57, 1));
            jTextField267.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(57, 2)));
            jTextField268.setText(ComData.getTVoltage(58, 1));
            jTextField268.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(58, 2)));
            jTextField269.setText(ComData.getTVoltage(59, 1));
            jTextField269.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(59, 2)));
            jTextField270.setText(ComData.getTVoltage(60, 1));
            jTextField270.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(60, 2)));
            jTextField271.setText(ComData.getTVoltage(61, 1));
            jTextField271.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(61, 2)));
            jTextField272.setText(ComData.getTVoltage(62, 1));
            jTextField272.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(62, 2)));
            jTextField281.setText(ComData.getTVoltage(63, 1));
            jTextField281.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(63, 2)));
        }
        else
        {  
            jTextField266.setText("");
            jTextField266.setBackground(UX.PColor.setBackGround("-2"));
            jTextField267.setText("");
            jTextField267.setBackground(UX.PColor.setBackGround("-2"));
            jTextField268.setText("");
            jTextField268.setBackground(UX.PColor.setBackGround("-2"));
            jTextField269.setText("");
            jTextField269.setBackground(UX.PColor.setBackGround("-2"));
            jTextField270.setText("");
            jTextField270.setBackground(UX.PColor.setBackGround("-2"));
            jTextField271.setText("");
            jTextField271.setBackground(UX.PColor.setBackGround("-2"));
            jTextField272.setText("");
            jTextField272.setBackground(UX.PColor.setBackGround("-2"));
            jTextField281.setText("");
            jTextField281.setBackground(UX.PColor.setBackGround("-2"));
        }

        if(ComData.getTLastPoll(0, 2).equals("0"))
        {  
            jTextField290.setText(ComData.getTVoltage(64, 1));
            jTextField290.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(64, 2)));
            jTextField291.setText(ComData.getTVoltage(65, 1));
            jTextField291.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(65, 2)));
            jTextField292.setText(ComData.getTVoltage(66, 1));
            jTextField292.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(66, 2)));
            jTextField293.setText(ComData.getTVoltage(67, 1));
            jTextField293.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(67, 2)));
            jTextField294.setText(ComData.getTVoltage(68, 1));
            jTextField294.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(68, 2)));
            jTextField295.setText(ComData.getTVoltage(69, 1));
            jTextField295.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(69, 2)));
            jTextField296.setText(ComData.getTVoltage(70, 1));
            jTextField296.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(70, 2)));
            jTextField297.setText(ComData.getTVoltage(71, 1));
            jTextField297.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(71, 2)));
        }
        else
        {  
            jTextField290.setText("");
            jTextField290.setBackground(UX.PColor.setBackGround("-2"));
            jTextField291.setText("");
            jTextField291.setBackground(UX.PColor.setBackGround("-2"));
            jTextField292.setText("");
            jTextField292.setBackground(UX.PColor.setBackGround("-2"));
            jTextField293.setText("");
            jTextField293.setBackground(UX.PColor.setBackGround("-2"));
            jTextField294.setText("");
            jTextField294.setBackground(UX.PColor.setBackGround("-2"));
            jTextField295.setText("");
            jTextField295.setBackground(UX.PColor.setBackGround("-2"));
            jTextField296.setText("");
            jTextField296.setBackground(UX.PColor.setBackGround("-2"));
            jTextField297.setText("");
            jTextField297.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if(ComData.getTLastPoll(11, 2).equals("0"))
        {                  
            jTextField239.setText(ComData.getTVoltage(72, 1));
            jTextField239.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(72, 2)));
            jTextField240.setText(ComData.getTVoltage(73, 1));
            jTextField240.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(73, 2)));
            jTextField241.setText(ComData.getTVoltage(74, 1));
            jTextField241.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(74, 2)));
            jTextField242.setText(ComData.getTVoltage(75, 1));
            jTextField242.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(75, 2)));
            jTextField283.setText(ComData.getTVoltage(76, 1));
            jTextField283.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(76, 2))); 
            jTextField289.setText(ComData.getTVoltage(77, 1));
            jTextField289.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(77, 2)));
            jTextField298.setText(ComData.getTVoltage(78, 1));
            jTextField298.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(78, 2)));
            jTextField299.setText(ComData.getTVoltage(79, 1));
            jTextField299.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(79, 2)));
            jTextField300.setText(ComData.getTVoltage(80, 1));
            jTextField300.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(80, 2)));
            jTextField301.setText(ComData.getTVoltage(81, 1));
            jTextField301.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(81, 2)));
        }
        else
        {                  
            jTextField239.setText("");
            jTextField239.setBackground(UX.PColor.setBackGround("-2"));
            jTextField240.setText("");
            jTextField240.setBackground(UX.PColor.setBackGround("-2"));
            jTextField241.setText("");
            jTextField241.setBackground(UX.PColor.setBackGround("-2"));
            jTextField242.setText("");
            jTextField242.setBackground(UX.PColor.setBackGround("-2"));
            jTextField283.setText("");
            jTextField283.setBackground(UX.PColor.setBackGround("-2"));
            jTextField289.setText("");
            jTextField289.setBackground(UX.PColor.setBackGround("-2"));
            jTextField298.setText("");
            jTextField298.setBackground(UX.PColor.setBackGround("-2"));
            jTextField299.setText("");
            jTextField299.setBackground(UX.PColor.setBackGround("-2"));
            jTextField300.setText("");
            jTextField300.setBackground(UX.PColor.setBackGround("-2"));
            jTextField301.setText("");
            jTextField301.setBackground(UX.PColor.setBackGround("-2"));
        }
        
        if(ComData.getTLastPoll(12, 2).equals("0"))
        {  
            jTextField217.setText(ComData.getTVoltage(82, 1));
            jTextField217.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(82, 2)));
            jTextField218.setText(ComData.getTVoltage(83, 1));
            jTextField218.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(83, 2)));
            jTextField219.setText(ComData.getTVoltage(84, 1));
            jTextField219.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(84, 2)));
            jTextField225.setText(ComData.getTVoltage(85, 1));
            jTextField225.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(85, 2)));
            jTextField282.setText(ComData.getTVoltage(86, 1));
            jTextField282.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(86, 2)));
            jTextField284.setText(ComData.getTVoltage(87, 1));
            jTextField284.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(87, 2)));
            jTextField285.setText(ComData.getTVoltage(88, 1));
            jTextField285.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(88, 2)));
            jTextField286.setText(ComData.getTVoltage(89, 1));
            jTextField286.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(89, 2)));
            jTextField287.setText(ComData.getTVoltage(90, 1));
            jTextField287.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(90, 2)));
            jTextField288.setText(ComData.getTVoltage(91, 1));
            jTextField288.setBackground(UX.PColor.setBackGround(ComData.getTVoltage(91, 2)));
        }
        else
        {  
            jTextField217.setText("");
            jTextField217.setBackground(UX.PColor.setBackGround("-2"));
            jTextField218.setText("");
            jTextField218.setBackground(UX.PColor.setBackGround("-2"));
            jTextField219.setText("");
            jTextField219.setBackground(UX.PColor.setBackGround("-2"));
            jTextField225.setText("");
            jTextField225.setBackground(UX.PColor.setBackGround("-2"));
            jTextField282.setText("");
            jTextField282.setBackground(UX.PColor.setBackGround("-2"));
            jTextField284.setText("");
            jTextField284.setBackground(UX.PColor.setBackGround("-2"));
            jTextField285.setText("");
            jTextField285.setBackground(UX.PColor.setBackGround("-2"));
            jTextField286.setText("");
            jTextField286.setBackground(UX.PColor.setBackGround("-2"));
            jTextField287.setText("");
            jTextField287.setBackground(UX.PColor.setBackGround("-2"));
            jTextField288.setText("");
            jTextField288.setBackground(UX.PColor.setBackGround("-2"));
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

        jPanel50 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField85 = new javax.swing.JTextField();
        jTextField86 = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jPanel57 = new javax.swing.JPanel();
        jTextField104 = new javax.swing.JTextField();
        jTextField105 = new javax.swing.JTextField();
        jTextField106 = new javax.swing.JTextField();
        jTextField107 = new javax.swing.JTextField();
        jTextField108 = new javax.swing.JTextField();
        jTextField109 = new javax.swing.JTextField();
        jTextField110 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel87 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        jTextField88 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField212 = new javax.swing.JTextField();
        jTextField213 = new javax.swing.JTextField();
        jTextField222 = new javax.swing.JTextField();
        jTextField223 = new javax.swing.JTextField();
        jTextField224 = new javax.swing.JTextField();
        jPanel93 = new javax.swing.JPanel();
        jTextField247 = new javax.swing.JTextField();
        jTextField250 = new javax.swing.JTextField();
        jTextField251 = new javax.swing.JTextField();
        jTextField252 = new javax.swing.JTextField();
        jTextField253 = new javax.swing.JTextField();
        jTextField254 = new javax.swing.JTextField();
        jTextField255 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel58 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jTextField214 = new javax.swing.JTextField();
        jTextField215 = new javax.swing.JTextField();
        jTextField216 = new javax.swing.JTextField();
        jTextField221 = new javax.swing.JTextField();
        jTextField249 = new javax.swing.JTextField();
        jPanel60 = new javax.swing.JPanel();
        jTextField235 = new javax.swing.JTextField();
        jTextField236 = new javax.swing.JTextField();
        jTextField237 = new javax.swing.JTextField();
        jTextField238 = new javax.swing.JTextField();
        jTextField248 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel42 = new javax.swing.JLabel();
        jPanel94 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel95 = new javax.swing.JPanel();
        jTextField256 = new javax.swing.JTextField();
        jTextField257 = new javax.swing.JTextField();
        jTextField258 = new javax.swing.JTextField();
        jTextField259 = new javax.swing.JTextField();
        jTextField260 = new javax.swing.JTextField();
        jPanel96 = new javax.swing.JPanel();
        jTextField261 = new javax.swing.JTextField();
        jTextField262 = new javax.swing.JTextField();
        jTextField263 = new javax.swing.JTextField();
        jTextField264 = new javax.swing.JTextField();
        jTextField265 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel60 = new javax.swing.JLabel();
        jPanel97 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        jTextField266 = new javax.swing.JTextField();
        jTextField267 = new javax.swing.JTextField();
        jTextField268 = new javax.swing.JTextField();
        jTextField269 = new javax.swing.JTextField();
        jTextField270 = new javax.swing.JTextField();
        jTextField271 = new javax.swing.JTextField();
        jTextField272 = new javax.swing.JTextField();
        jTextField281 = new javax.swing.JTextField();
        jPanel99 = new javax.swing.JPanel();
        jTextField273 = new javax.swing.JTextField();
        jTextField274 = new javax.swing.JTextField();
        jTextField275 = new javax.swing.JTextField();
        jTextField276 = new javax.swing.JTextField();
        jTextField277 = new javax.swing.JTextField();
        jTextField278 = new javax.swing.JTextField();
        jTextField279 = new javax.swing.JTextField();
        jTextField280 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel68 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel104 = new javax.swing.JPanel();
        jTextField290 = new javax.swing.JTextField();
        jTextField291 = new javax.swing.JTextField();
        jTextField292 = new javax.swing.JTextField();
        jTextField293 = new javax.swing.JTextField();
        jTextField294 = new javax.swing.JTextField();
        jTextField295 = new javax.swing.JTextField();
        jTextField296 = new javax.swing.JTextField();
        jTextField297 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel80 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jTextField217 = new javax.swing.JTextField();
        jTextField218 = new javax.swing.JTextField();
        jTextField219 = new javax.swing.JTextField();
        jTextField225 = new javax.swing.JTextField();
        jTextField282 = new javax.swing.JTextField();
        jPanel63 = new javax.swing.JPanel();
        jTextField239 = new javax.swing.JTextField();
        jTextField240 = new javax.swing.JTextField();
        jTextField241 = new javax.swing.JTextField();
        jTextField242 = new javax.swing.JTextField();
        jTextField283 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel45 = new javax.swing.JLabel();
        jPanel100 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        jTextField284 = new javax.swing.JTextField();
        jTextField285 = new javax.swing.JTextField();
        jTextField286 = new javax.swing.JTextField();
        jTextField287 = new javax.swing.JTextField();
        jTextField288 = new javax.swing.JTextField();
        jPanel102 = new javax.swing.JPanel();
        jTextField289 = new javax.swing.JTextField();
        jTextField298 = new javax.swing.JTextField();
        jTextField299 = new javax.swing.JTextField();
        jTextField300 = new javax.swing.JTextField();
        jTextField301 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel72 = new javax.swing.JLabel();

        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Voltage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("24V RF:");

        jPanel51.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField77.setEditable(false);
        jTextField77.setBackground(new java.awt.Color(102, 255, 255));
        jTextField77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField77.setText("???");

        jTextField78.setEditable(false);
        jTextField78.setBackground(new java.awt.Color(102, 255, 255));
        jTextField78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField78.setText("???");

        jTextField79.setEditable(false);
        jTextField79.setBackground(new java.awt.Color(102, 255, 255));
        jTextField79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField79.setText("???");

        jTextField80.setEditable(false);
        jTextField80.setBackground(new java.awt.Color(102, 255, 255));
        jTextField80.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField80.setText("???");

        jTextField85.setEditable(false);
        jTextField85.setBackground(new java.awt.Color(102, 255, 255));
        jTextField85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField85.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField85.setText("???");

        jTextField86.setEditable(false);
        jTextField86.setBackground(new java.awt.Color(102, 255, 255));
        jTextField86.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField86.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField86.setText("???");

        jTextField87.setEditable(false);
        jTextField87.setBackground(new java.awt.Color(102, 255, 255));
        jTextField87.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField87.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField87.setText("???");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField77)
            .addComponent(jTextField78, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField79)
            .addComponent(jTextField80)
            .addComponent(jTextField85)
            .addComponent(jTextField86)
            .addComponent(jTextField87)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel57.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField104.setEditable(false);
        jTextField104.setBackground(new java.awt.Color(102, 255, 255));
        jTextField104.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField104.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField104.setText("???");

        jTextField105.setEditable(false);
        jTextField105.setBackground(new java.awt.Color(102, 255, 255));
        jTextField105.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField105.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField105.setText("???");

        jTextField106.setEditable(false);
        jTextField106.setBackground(new java.awt.Color(102, 255, 255));
        jTextField106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField106.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField106.setText("???");

        jTextField107.setEditable(false);
        jTextField107.setBackground(new java.awt.Color(102, 255, 255));
        jTextField107.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField107.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField107.setText("???");

        jTextField108.setEditable(false);
        jTextField108.setBackground(new java.awt.Color(102, 255, 255));
        jTextField108.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField108.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField108.setText("???");

        jTextField109.setEditable(false);
        jTextField109.setBackground(new java.awt.Color(102, 255, 255));
        jTextField109.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField109.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField109.setText("???");

        jTextField110.setEditable(false);
        jTextField110.setBackground(new java.awt.Color(102, 255, 255));
        jTextField110.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField110.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField110.setText("???");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField104)
            .addComponent(jTextField105, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField106)
            .addComponent(jTextField107)
            .addComponent(jTextField108)
            .addComponent(jTextField109)
            .addComponent(jTextField110)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("24V CTL:");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("12V:");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Analog 5V:");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Digital 5V:");

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Analog -5V:");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("3.3V:");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel87.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU Voltage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("48V:");

        jPanel92.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField88.setEditable(false);
        jTextField88.setBackground(new java.awt.Color(102, 255, 255));
        jTextField88.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField88.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField88.setText("???");

        jTextField103.setEditable(false);
        jTextField103.setBackground(new java.awt.Color(102, 255, 255));
        jTextField103.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField103.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField103.setText("???");

        jTextField212.setEditable(false);
        jTextField212.setBackground(new java.awt.Color(102, 255, 255));
        jTextField212.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField212.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField212.setText("???");

        jTextField213.setEditable(false);
        jTextField213.setBackground(new java.awt.Color(102, 255, 255));
        jTextField213.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField213.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField213.setText("???");

        jTextField222.setEditable(false);
        jTextField222.setBackground(new java.awt.Color(102, 255, 255));
        jTextField222.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField222.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField222.setText("???");

        jTextField223.setEditable(false);
        jTextField223.setBackground(new java.awt.Color(102, 255, 255));
        jTextField223.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField223.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField223.setText("???");

        jTextField224.setEditable(false);
        jTextField224.setBackground(new java.awt.Color(102, 255, 255));
        jTextField224.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField224.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField224.setText("???");

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField88)
            .addComponent(jTextField103, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField212)
            .addComponent(jTextField213)
            .addComponent(jTextField222)
            .addComponent(jTextField223)
            .addComponent(jTextField224)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField212, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField213, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField222, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField223, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField224, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel93.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TXU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField247.setEditable(false);
        jTextField247.setBackground(new java.awt.Color(102, 255, 255));
        jTextField247.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField247.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField247.setText("???");

        jTextField250.setEditable(false);
        jTextField250.setBackground(new java.awt.Color(102, 255, 255));
        jTextField250.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField250.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField250.setText("???");

        jTextField251.setEditable(false);
        jTextField251.setBackground(new java.awt.Color(102, 255, 255));
        jTextField251.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField251.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField251.setText("???");

        jTextField252.setEditable(false);
        jTextField252.setBackground(new java.awt.Color(102, 255, 255));
        jTextField252.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField252.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField252.setText("???");

        jTextField253.setEditable(false);
        jTextField253.setBackground(new java.awt.Color(102, 255, 255));
        jTextField253.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField253.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField253.setText("???");

        jTextField254.setEditable(false);
        jTextField254.setBackground(new java.awt.Color(102, 255, 255));
        jTextField254.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField254.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField254.setText("???");

        jTextField255.setEditable(false);
        jTextField255.setBackground(new java.awt.Color(102, 255, 255));
        jTextField255.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField255.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField255.setText("???");
        jTextField255.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField255ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField247)
            .addComponent(jTextField250, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField251)
            .addComponent(jTextField252)
            .addComponent(jTextField253)
            .addComponent(jTextField254)
            .addComponent(jTextField255)
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addComponent(jTextField247, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField250, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField251, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField252, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField253, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField254, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField255, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("24V RF:");

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("24V CTL:");

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("12V:");

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Analog 5V:");

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Digital 5V:");

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Analog -5V:");

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel92, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel58.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CMU Voltage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("24V:");

        jPanel59.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CMU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField214.setEditable(false);
        jTextField214.setBackground(new java.awt.Color(102, 255, 255));
        jTextField214.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField214.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField214.setText("???");

        jTextField215.setEditable(false);
        jTextField215.setBackground(new java.awt.Color(102, 255, 255));
        jTextField215.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField215.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField215.setText("???");

        jTextField216.setEditable(false);
        jTextField216.setBackground(new java.awt.Color(102, 255, 255));
        jTextField216.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField216.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField216.setText("???");

        jTextField221.setEditable(false);
        jTextField221.setBackground(new java.awt.Color(102, 255, 255));
        jTextField221.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField221.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField221.setText("???");

        jTextField249.setEditable(false);
        jTextField249.setBackground(new java.awt.Color(102, 255, 255));
        jTextField249.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField249.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField249.setText("???");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField214)
            .addComponent(jTextField215, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField216)
            .addComponent(jTextField221)
            .addComponent(jTextField249)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addComponent(jTextField214, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField215, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField216, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField221, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField249, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel60.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CMU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField235.setEditable(false);
        jTextField235.setBackground(new java.awt.Color(102, 255, 255));
        jTextField235.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField235.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField235.setText("???");

        jTextField236.setEditable(false);
        jTextField236.setBackground(new java.awt.Color(102, 255, 255));
        jTextField236.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField236.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField236.setText("???");

        jTextField237.setEditable(false);
        jTextField237.setBackground(new java.awt.Color(102, 255, 255));
        jTextField237.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField237.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField237.setText("???");

        jTextField238.setEditable(false);
        jTextField238.setBackground(new java.awt.Color(102, 255, 255));
        jTextField238.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField238.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField238.setText("???");

        jTextField248.setEditable(false);
        jTextField248.setBackground(new java.awt.Color(102, 255, 255));
        jTextField248.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField248.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField248.setText("???");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField235)
            .addComponent(jTextField236, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField237)
            .addComponent(jTextField238)
            .addComponent(jTextField248)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addComponent(jTextField235, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField236, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField237, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField238, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField248, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("5V:");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("3.3V:");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("2.5V:");

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("1.2V:");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel94.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA Voltage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("48V:");

        jPanel95.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField256.setEditable(false);
        jTextField256.setBackground(new java.awt.Color(102, 255, 255));
        jTextField256.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField256.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField256.setText("???");

        jTextField257.setEditable(false);
        jTextField257.setBackground(new java.awt.Color(102, 255, 255));
        jTextField257.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField257.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField257.setText("???");

        jTextField258.setEditable(false);
        jTextField258.setBackground(new java.awt.Color(102, 255, 255));
        jTextField258.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField258.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField258.setText("???");

        jTextField259.setEditable(false);
        jTextField259.setBackground(new java.awt.Color(102, 255, 255));
        jTextField259.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField259.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField259.setText("???");

        jTextField260.setEditable(false);
        jTextField260.setBackground(new java.awt.Color(102, 255, 255));
        jTextField260.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField260.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField260.setText("???");

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField256)
            .addComponent(jTextField257, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField258)
            .addComponent(jTextField259)
            .addComponent(jTextField260)
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addComponent(jTextField256, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField257, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField258, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField259, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField260, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel96.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HPA B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField261.setEditable(false);
        jTextField261.setBackground(new java.awt.Color(102, 255, 255));
        jTextField261.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField261.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField261.setText("???");

        jTextField262.setEditable(false);
        jTextField262.setBackground(new java.awt.Color(102, 255, 255));
        jTextField262.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField262.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField262.setText("???");

        jTextField263.setEditable(false);
        jTextField263.setBackground(new java.awt.Color(102, 255, 255));
        jTextField263.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField263.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField263.setText("???");

        jTextField264.setEditable(false);
        jTextField264.setBackground(new java.awt.Color(102, 255, 255));
        jTextField264.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField264.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField264.setText("???");

        jTextField265.setEditable(false);
        jTextField265.setBackground(new java.awt.Color(102, 255, 255));
        jTextField265.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField265.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField265.setText("???");

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField261)
            .addComponent(jTextField262, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField263)
            .addComponent(jTextField264)
            .addComponent(jTextField265)
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addComponent(jTextField261, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField262, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField263, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField264, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField265, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("24V RF: ");

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("24V CTL:");

        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("5V:");

        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("3.3V:");

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(filler11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel94Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel94Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel97.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU Voltage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("30V:");

        jPanel98.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField266.setEditable(false);
        jTextField266.setBackground(new java.awt.Color(102, 255, 255));
        jTextField266.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField266.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField266.setText("???");

        jTextField267.setEditable(false);
        jTextField267.setBackground(new java.awt.Color(102, 255, 255));
        jTextField267.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField267.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField267.setText("???");

        jTextField268.setEditable(false);
        jTextField268.setBackground(new java.awt.Color(102, 255, 255));
        jTextField268.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField268.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField268.setText("???");

        jTextField269.setEditable(false);
        jTextField269.setBackground(new java.awt.Color(102, 255, 255));
        jTextField269.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField269.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField269.setText("???");

        jTextField270.setEditable(false);
        jTextField270.setBackground(new java.awt.Color(102, 255, 255));
        jTextField270.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField270.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField270.setText("???");

        jTextField271.setEditable(false);
        jTextField271.setBackground(new java.awt.Color(102, 255, 255));
        jTextField271.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField271.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField271.setText("???");

        jTextField272.setEditable(false);
        jTextField272.setBackground(new java.awt.Color(102, 255, 255));
        jTextField272.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField272.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField272.setText("???");

        jTextField281.setEditable(false);
        jTextField281.setBackground(new java.awt.Color(102, 255, 255));
        jTextField281.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField281.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField281.setText("???");

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField266)
            .addComponent(jTextField267, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField268)
            .addComponent(jTextField269)
            .addComponent(jTextField270)
            .addComponent(jTextField271)
            .addComponent(jTextField272)
            .addComponent(jTextField281)
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addComponent(jTextField266, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField267, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField268, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField269, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField270, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField271, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField272, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField281, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel99.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RXU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField273.setEditable(false);
        jTextField273.setBackground(new java.awt.Color(102, 255, 255));
        jTextField273.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField273.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField273.setText("???");

        jTextField274.setEditable(false);
        jTextField274.setBackground(new java.awt.Color(102, 255, 255));
        jTextField274.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField274.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField274.setText("???");

        jTextField275.setEditable(false);
        jTextField275.setBackground(new java.awt.Color(102, 255, 255));
        jTextField275.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField275.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField275.setText("???");

        jTextField276.setEditable(false);
        jTextField276.setBackground(new java.awt.Color(102, 255, 255));
        jTextField276.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField276.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField276.setText("???");

        jTextField277.setEditable(false);
        jTextField277.setBackground(new java.awt.Color(102, 255, 255));
        jTextField277.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField277.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField277.setText("???");

        jTextField278.setEditable(false);
        jTextField278.setBackground(new java.awt.Color(102, 255, 255));
        jTextField278.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField278.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField278.setText("???");

        jTextField279.setEditable(false);
        jTextField279.setBackground(new java.awt.Color(102, 255, 255));
        jTextField279.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField279.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField279.setText("???");

        jTextField280.setEditable(false);
        jTextField280.setBackground(new java.awt.Color(102, 255, 255));
        jTextField280.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField280.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField280.setText("???");

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField273)
            .addComponent(jTextField274, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(jTextField275)
            .addComponent(jTextField276)
            .addComponent(jTextField277)
            .addComponent(jTextField278)
            .addComponent(jTextField279)
            .addComponent(jTextField280)
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addComponent(jTextField273, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField274, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField275, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField276, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField277, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField278, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField279, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField280, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("24V RF:");

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("24V CTL:");

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel64.setText("12V:");

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Analog 5V:");

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("Digital 5V:");

        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("Analog -5V:");

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel68.setText("3.3V:");

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel97Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel97Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel98, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel99, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel103.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RCU Voltage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel73.setText("24V Combined:");

        jPanel104.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField290.setEditable(false);
        jTextField290.setBackground(new java.awt.Color(102, 255, 255));
        jTextField290.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField290.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField290.setText("???");

        jTextField291.setEditable(false);
        jTextField291.setBackground(new java.awt.Color(102, 255, 255));
        jTextField291.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField291.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField291.setText("???");

        jTextField292.setEditable(false);
        jTextField292.setBackground(new java.awt.Color(102, 255, 255));
        jTextField292.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField292.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField292.setText("???");

        jTextField293.setEditable(false);
        jTextField293.setBackground(new java.awt.Color(102, 255, 255));
        jTextField293.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField293.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField293.setText("???");

        jTextField294.setEditable(false);
        jTextField294.setBackground(new java.awt.Color(102, 255, 255));
        jTextField294.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField294.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField294.setText("???");

        jTextField295.setEditable(false);
        jTextField295.setBackground(new java.awt.Color(102, 255, 255));
        jTextField295.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField295.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField295.setText("???");

        jTextField296.setEditable(false);
        jTextField296.setBackground(new java.awt.Color(102, 255, 255));
        jTextField296.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField296.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField296.setText("???");

        jTextField297.setEditable(false);
        jTextField297.setBackground(new java.awt.Color(102, 255, 255));
        jTextField297.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField297.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField297.setText("???");

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField290)
            .addComponent(jTextField291, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
            .addComponent(jTextField292)
            .addComponent(jTextField293)
            .addComponent(jTextField294)
            .addComponent(jTextField295)
            .addComponent(jTextField296)
            .addComponent(jTextField297)
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel104Layout.createSequentialGroup()
                .addComponent(jTextField290, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField291, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField292, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField293, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField294, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField295, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField296, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField297, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel74.setText("24V System A:");

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel75.setText("24V System B:");

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel76.setText("Relay Voltage:");

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel77.setText("5V:");

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("3.3V:");

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("2.5V:");

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel80.setText("1.2V:");

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addComponent(jPanel104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel61.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PSU Voltage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("AC Voltage:");

        jPanel62.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PSU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel62.setPreferredSize(new java.awt.Dimension(110, 189));

        jTextField217.setEditable(false);
        jTextField217.setBackground(new java.awt.Color(102, 255, 255));
        jTextField217.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField217.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField217.setText("???");

        jTextField218.setEditable(false);
        jTextField218.setBackground(new java.awt.Color(102, 255, 255));
        jTextField218.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField218.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField218.setText("???");

        jTextField219.setEditable(false);
        jTextField219.setBackground(new java.awt.Color(102, 255, 255));
        jTextField219.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField219.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField219.setText("???");

        jTextField225.setEditable(false);
        jTextField225.setBackground(new java.awt.Color(102, 255, 255));
        jTextField225.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField225.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField225.setText("???");

        jTextField282.setEditable(false);
        jTextField282.setBackground(new java.awt.Color(102, 255, 255));
        jTextField282.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField282.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField282.setText("???");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField217)
            .addComponent(jTextField218, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addComponent(jTextField219)
            .addComponent(jTextField225)
            .addComponent(jTextField282)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addComponent(jTextField217, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField218, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField219, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField225, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField282, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel63.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PSU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel63.setPreferredSize(new java.awt.Dimension(110, 189));

        jTextField239.setEditable(false);
        jTextField239.setBackground(new java.awt.Color(102, 255, 255));
        jTextField239.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField239.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField239.setText("???");

        jTextField240.setEditable(false);
        jTextField240.setBackground(new java.awt.Color(102, 255, 255));
        jTextField240.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField240.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField240.setText("???");

        jTextField241.setEditable(false);
        jTextField241.setBackground(new java.awt.Color(102, 255, 255));
        jTextField241.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField241.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField241.setText("???");

        jTextField242.setEditable(false);
        jTextField242.setBackground(new java.awt.Color(102, 255, 255));
        jTextField242.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField242.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField242.setText("???");

        jTextField283.setEditable(false);
        jTextField283.setBackground(new java.awt.Color(102, 255, 255));
        jTextField283.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField283.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField283.setText("???");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField239)
            .addComponent(jTextField240, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addComponent(jTextField241)
            .addComponent(jTextField242)
            .addComponent(jTextField283)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addComponent(jTextField239, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField240, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField241, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField242, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField283, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("DC Load Voltage:");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("DC Load Current:");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Battery Voltage:");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Battery Current:");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(filler9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(filler9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel100.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PSU Other", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Battery Temperature:");

        jPanel101.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PSU B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel101.setPreferredSize(new java.awt.Dimension(110, 189));

        jTextField284.setEditable(false);
        jTextField284.setBackground(new java.awt.Color(102, 255, 255));
        jTextField284.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField284.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField284.setText("???");

        jTextField285.setEditable(false);
        jTextField285.setBackground(new java.awt.Color(102, 255, 255));
        jTextField285.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField285.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField285.setText("???");

        jTextField286.setEditable(false);
        jTextField286.setBackground(new java.awt.Color(102, 255, 255));
        jTextField286.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField286.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField286.setText("???");

        jTextField287.setEditable(false);
        jTextField287.setBackground(new java.awt.Color(102, 255, 255));
        jTextField287.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField287.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField287.setText("???");

        jTextField288.setEditable(false);
        jTextField288.setBackground(new java.awt.Color(102, 255, 255));
        jTextField288.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField288.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField288.setText("???");

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField284)
            .addComponent(jTextField285, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addComponent(jTextField286)
            .addComponent(jTextField287)
            .addComponent(jTextField288)
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addComponent(jTextField284, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField285, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField286, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField287, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField288, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel102.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PSU A", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel102.setPreferredSize(new java.awt.Dimension(110, 189));

        jTextField289.setEditable(false);
        jTextField289.setBackground(new java.awt.Color(102, 255, 255));
        jTextField289.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField289.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField289.setText("???");

        jTextField298.setEditable(false);
        jTextField298.setBackground(new java.awt.Color(102, 255, 255));
        jTextField298.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField298.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField298.setText("???");

        jTextField299.setEditable(false);
        jTextField299.setBackground(new java.awt.Color(102, 255, 255));
        jTextField299.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField299.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField299.setText("???");

        jTextField300.setEditable(false);
        jTextField300.setBackground(new java.awt.Color(102, 255, 255));
        jTextField300.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField300.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField300.setText("???");

        jTextField301.setEditable(false);
        jTextField301.setBackground(new java.awt.Color(102, 255, 255));
        jTextField301.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField301.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField301.setText("???");

        javax.swing.GroupLayout jPanel102Layout = new javax.swing.GroupLayout(jPanel102);
        jPanel102.setLayout(jPanel102Layout);
        jPanel102Layout.setHorizontalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField289)
            .addComponent(jTextField298, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addComponent(jTextField299)
            .addComponent(jTextField300)
            .addComponent(jTextField301)
        );
        jPanel102Layout.setVerticalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel102Layout.createSequentialGroup()
                .addComponent(jTextField289, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField298, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField299, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField300, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField301, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel69.setText("Number Of Rectifiers:");

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("Battery Runtime:");

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Battery Capacity:");

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("Battery DOD:");

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(filler13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel100Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel100Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel87, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel97, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField255ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField255ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField255ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField212;
    private javax.swing.JTextField jTextField213;
    private javax.swing.JTextField jTextField214;
    private javax.swing.JTextField jTextField215;
    private javax.swing.JTextField jTextField216;
    private javax.swing.JTextField jTextField217;
    private javax.swing.JTextField jTextField218;
    private javax.swing.JTextField jTextField219;
    private javax.swing.JTextField jTextField221;
    private javax.swing.JTextField jTextField222;
    private javax.swing.JTextField jTextField223;
    private javax.swing.JTextField jTextField224;
    private javax.swing.JTextField jTextField225;
    private javax.swing.JTextField jTextField235;
    private javax.swing.JTextField jTextField236;
    private javax.swing.JTextField jTextField237;
    private javax.swing.JTextField jTextField238;
    private javax.swing.JTextField jTextField239;
    private javax.swing.JTextField jTextField240;
    private javax.swing.JTextField jTextField241;
    private javax.swing.JTextField jTextField242;
    private javax.swing.JTextField jTextField247;
    private javax.swing.JTextField jTextField248;
    private javax.swing.JTextField jTextField249;
    private javax.swing.JTextField jTextField250;
    private javax.swing.JTextField jTextField251;
    private javax.swing.JTextField jTextField252;
    private javax.swing.JTextField jTextField253;
    private javax.swing.JTextField jTextField254;
    private javax.swing.JTextField jTextField255;
    private javax.swing.JTextField jTextField256;
    private javax.swing.JTextField jTextField257;
    private javax.swing.JTextField jTextField258;
    private javax.swing.JTextField jTextField259;
    private javax.swing.JTextField jTextField260;
    private javax.swing.JTextField jTextField261;
    private javax.swing.JTextField jTextField262;
    private javax.swing.JTextField jTextField263;
    private javax.swing.JTextField jTextField264;
    private javax.swing.JTextField jTextField265;
    private javax.swing.JTextField jTextField266;
    private javax.swing.JTextField jTextField267;
    private javax.swing.JTextField jTextField268;
    private javax.swing.JTextField jTextField269;
    private javax.swing.JTextField jTextField270;
    private javax.swing.JTextField jTextField271;
    private javax.swing.JTextField jTextField272;
    private javax.swing.JTextField jTextField273;
    private javax.swing.JTextField jTextField274;
    private javax.swing.JTextField jTextField275;
    private javax.swing.JTextField jTextField276;
    private javax.swing.JTextField jTextField277;
    private javax.swing.JTextField jTextField278;
    private javax.swing.JTextField jTextField279;
    private javax.swing.JTextField jTextField280;
    private javax.swing.JTextField jTextField281;
    private javax.swing.JTextField jTextField282;
    private javax.swing.JTextField jTextField283;
    private javax.swing.JTextField jTextField284;
    private javax.swing.JTextField jTextField285;
    private javax.swing.JTextField jTextField286;
    private javax.swing.JTextField jTextField287;
    private javax.swing.JTextField jTextField288;
    private javax.swing.JTextField jTextField289;
    private javax.swing.JTextField jTextField290;
    private javax.swing.JTextField jTextField291;
    private javax.swing.JTextField jTextField292;
    private javax.swing.JTextField jTextField293;
    private javax.swing.JTextField jTextField294;
    private javax.swing.JTextField jTextField295;
    private javax.swing.JTextField jTextField296;
    private javax.swing.JTextField jTextField297;
    private javax.swing.JTextField jTextField298;
    private javax.swing.JTextField jTextField299;
    private javax.swing.JTextField jTextField300;
    private javax.swing.JTextField jTextField301;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    // End of variables declaration//GEN-END:variables
}
