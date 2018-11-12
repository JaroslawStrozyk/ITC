package Components;

import Communication.ComData;
import MainItc.ITC;
import java.awt.Color;

/**
 *
 * @author jaroslaw.strozyk
 */
public class ConfThresholds_old extends javax.swing.JPanel {

    /**
     * Creates new form ConfInstalation
     */
    public ConfThresholds_old() {
        initComponents();
        MTU1locked = false;
        MTU4locked = false;
    }
    
    private boolean MTU1locked;
    private boolean MTU4locked;

    public boolean allFieldsAreCorrect() {
        if (jTextField9.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField22.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField23.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField24.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField25.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField26.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField27.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField28.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField29.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField11.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField31.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField32.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField38.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField39.getBackground().equals(Color.red)) {
            return false;
        }

        if (jTextField33.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField34.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField35.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField36.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField37.getBackground().equals(Color.red)) {
            return false;
        }

        if (jTextField40.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField41.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField42.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField43.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField44.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField45.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField46.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField47.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField48.getBackground().equals(Color.red)) {
            return false;
        }

        if (jTextField10.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField30.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField49.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField50.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField51.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField52.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField53.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField54.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField55.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField56.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField57.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField58.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField59.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField12.getBackground().equals(Color.red)) {
            return false;
        }

        if (jTextField60.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField61.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField62.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField63.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField64.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField65.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField66.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField67.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField68.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField69.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField70.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField71.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField72.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField73.getBackground().equals(Color.red)) {
            return false;
        }

        if (jTextField13.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField14.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField74.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField75.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField76.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField77.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField80.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField81.getBackground().equals(Color.red)) {
            return false;
        }

        if (jTextField86.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField87.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField88.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField89.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField90.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField91.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField92.getBackground().equals(Color.red)) {
            return false;
        }
        if (jTextField93.getBackground().equals(Color.red)) {
            return false;
        }

        return true;
    }
    
       private void lock(String cardName) {
        switch (cardName) {
            case "MTU1":
                jTextField9.setEnabled(false);
                jTextField22.setEnabled(false);
                jTextField23.setEnabled(false);
                jTextField24.setEnabled(false);
                jTextField25.setEnabled(false);
                jTextField26.setEnabled(false);
                jTextField27.setEnabled(false);
                jTextField28.setEnabled(false);
                jTextField29.setEnabled(false);
                jTextField11.setEnabled(false);
                jTextField31.setEnabled(false);
                jTextField32.setEnabled(false);
                jTextField38.setEnabled(false);
                jTextField39.setEnabled(false);
  
                jTextField10.setEnabled(false);
                jTextField30.setEnabled(false);
                jTextField49.setEnabled(false);
                jTextField50.setEnabled(false);
                jTextField51.setEnabled(false);
                jTextField52.setEnabled(false);
                jTextField53.setEnabled(false);
                jTextField54.setEnabled(false);
                jTextField55.setEnabled(false);
                jTextField12.setEnabled(false);
                jTextField56.setEnabled(false);
                jTextField57.setEnabled(false);
                jTextField58.setEnabled(false);
                jTextField59.setEnabled(false);                
                
                jTextField13.setEnabled(false);
                jTextField74.setEnabled(false);
                jTextField75.setEnabled(false);
                jTextField76.setEnabled(false);
                jTextField77.setEnabled(false);
                jTextField14.setEnabled(false);
                jTextField81.setEnabled(false);
                jTextField80.setEnabled(false);
        
                jTextField9.setText("");
                jTextField22.setText("");
                jTextField23.setText("");
                jTextField24.setText("");
                jTextField25.setText("");
                jTextField26.setText("");
                jTextField27.setText("");
                jTextField28.setText("");
                jTextField29.setText("");
                jTextField11.setText("");
                jTextField31.setText("");
                jTextField32.setText("");
                jTextField38.setText("");
                jTextField39.setText("");
  
                jTextField10.setText("");
                jTextField30.setText("");
                jTextField49.setText("");
                jTextField50.setText("");
                jTextField51.setText("");
                jTextField52.setText("");
                jTextField53.setText("");
                jTextField54.setText("");
                jTextField55.setText("");
                jTextField12.setText("");
                jTextField56.setText("");
                jTextField57.setText("");
                jTextField58.setText("");
                jTextField59.setText("");                
                
                jTextField13.setText("");
                jTextField74.setText("");
                jTextField75.setText("");
                jTextField76.setText("");
                jTextField77.setText("");
                jTextField14.setText("");
                jTextField81.setText("");
                jTextField80.setText("");
        
                MTU1locked = true;
                break;
            case "MTU4":
                       
                jTextField33.setEnabled(false);
                jTextField34.setEnabled(false);
                jTextField35.setEnabled(false);
                jTextField36.setEnabled(false);
                jTextField37.setEnabled(false);
                jTextField40.setEnabled(false);
                jTextField41.setEnabled(false);
                jTextField42.setEnabled(false);
                jTextField43.setEnabled(false);
                jTextField44.setEnabled(false);
                jTextField45.setEnabled(false);
                jTextField46.setEnabled(false);
                jTextField47.setEnabled(false);
                jTextField48.setEnabled(false);

                jTextField60.setEnabled(false);
                jTextField61.setEnabled(false);
                jTextField62.setEnabled(false);
                jTextField63.setEnabled(false);
                jTextField64.setEnabled(false);
                jTextField65.setEnabled(false);
                jTextField66.setEnabled(false);
                jTextField67.setEnabled(false);
                jTextField68.setEnabled(false);
                jTextField69.setEnabled(false);
                jTextField70.setEnabled(false);
                jTextField71.setEnabled(false);
                jTextField72.setEnabled(false);
                jTextField73.setEnabled(false);

                jTextField86.setEnabled(false);
                jTextField87.setEnabled(false);
                jTextField88.setEnabled(false);
                jTextField89.setEnabled(false);
                jTextField90.setEnabled(false);
                jTextField91.setEnabled(false);
                jTextField92.setEnabled(false);
                jTextField93.setEnabled(false);    

                jTextField33.setText("");
                jTextField34.setText("");
                jTextField35.setText("");
                jTextField36.setText("");
                jTextField37.setText("");
                jTextField40.setText("");
                jTextField41.setText("");
                jTextField42.setText("");
                jTextField43.setText("");
                jTextField44.setText("");
                jTextField45.setText("");
                jTextField46.setText("");
                jTextField47.setText("");
                jTextField48.setText("");

                jTextField60.setText("");
                jTextField61.setText("");
                jTextField62.setText("");
                jTextField63.setText("");
                jTextField64.setText("");
                jTextField65.setText("");
                jTextField66.setText("");
                jTextField67.setText("");
                jTextField68.setText("");
                jTextField69.setText("");
                jTextField70.setText("");
                jTextField71.setText("");
                jTextField72.setText("");
                jTextField73.setText("");

                jTextField86.setText("");
                jTextField87.setText("");
                jTextField88.setText("");
                jTextField89.setText("");
                jTextField90.setText("");
                jTextField91.setText("");
                jTextField92.setText("");
                jTextField93.setText("");              

                MTU4locked = true;
                break;
            default:
                break;
        }
    }
       
       private void unlock(String cardName) {
        switch (cardName) {
            case "MTU1":
                jTextField9.setEnabled(true);
                jTextField22.setEnabled(true);
                jTextField23.setEnabled(true);
                jTextField24.setEnabled(true);
                jTextField25.setEnabled(true);
                jTextField26.setEnabled(true);
                jTextField27.setEnabled(true);
                jTextField28.setEnabled(true);
                jTextField29.setEnabled(true);
                jTextField11.setEnabled(true);
                jTextField31.setEnabled(true);
                jTextField32.setEnabled(true);
                jTextField38.setEnabled(true);
                jTextField39.setEnabled(true);
  
                jTextField10.setEnabled(true);
                jTextField30.setEnabled(true);
                jTextField49.setEnabled(true);
                jTextField50.setEnabled(true);
                jTextField51.setEnabled(true);
                jTextField52.setEnabled(true);
                jTextField53.setEnabled(true);
                jTextField54.setEnabled(true);
                jTextField55.setEnabled(true);
                jTextField12.setEnabled(true);
                jTextField56.setEnabled(true);
                jTextField57.setEnabled(true);
                jTextField58.setEnabled(true);
                jTextField59.setEnabled(true);                
                
                jTextField13.setEnabled(true);
                jTextField74.setEnabled(true);
                jTextField75.setEnabled(true);
                jTextField76.setEnabled(true);
                jTextField77.setEnabled(true);
                jTextField14.setEnabled(true);
                jTextField81.setEnabled(true);
                jTextField80.setEnabled(true);
        
                MTU1locked = false;
                break;
            case "MTU4":
                       
                jTextField33.setEnabled(true);
                jTextField34.setEnabled(true);
                jTextField35.setEnabled(true);
                jTextField36.setEnabled(true);
                jTextField37.setEnabled(true);
                jTextField40.setEnabled(true);
                jTextField41.setEnabled(true);
                jTextField42.setEnabled(true);
                jTextField43.setEnabled(true);
                jTextField44.setEnabled(true);
                jTextField45.setEnabled(true);
                jTextField46.setEnabled(true);
                jTextField47.setEnabled(true);
                jTextField48.setEnabled(true);

                jTextField60.setEnabled(true);
                jTextField61.setEnabled(true);
                jTextField62.setEnabled(true);
                jTextField63.setEnabled(true);
                jTextField64.setEnabled(true);
                jTextField65.setEnabled(true);
                jTextField66.setEnabled(true);
                jTextField67.setEnabled(true);
                jTextField68.setEnabled(true);
                jTextField69.setEnabled(true);
                jTextField70.setEnabled(true);
                jTextField71.setEnabled(true);
                jTextField72.setEnabled(true);
                jTextField73.setEnabled(true);

                jTextField86.setEnabled(true);
                jTextField87.setEnabled(true);
                jTextField88.setEnabled(true);
                jTextField89.setEnabled(true);
                jTextField90.setEnabled(true);
                jTextField91.setEnabled(true);
                jTextField92.setEnabled(true);
                jTextField93.setEnabled(true);    

                MTU4locked = false;
                break;
            default:
                break;
        }
    }

    public void displayThresholds() {
        if (ComData.getTLastPoll(3, 2).equals("0")) {
            if (MTU1locked) {
                unlock("MTU1");
            }
            jTextField9.setText(ComData.getSummaryThresholdConfig(0, 1));
            jTextField22.setText(ComData.getSummaryThresholdConfig(1, 1));
            jTextField23.setText(ComData.getSummaryThresholdConfig(2, 1));
            jTextField24.setText(ComData.getSummaryThresholdConfig(3, 1));
            jTextField25.setText(ComData.getSummaryThresholdConfig(6, 1));
            jTextField11.setText(ComData.getSummaryThresholdConfig(7, 1));
            jTextField29.setText(ComData.getSummaryThresholdConfig(4, 1));
            jTextField28.setText(ComData.getSummaryThresholdConfig(5, 1));
            jTextField27.setText(ComData.getPulseShapeThresholdConfig(25, 1));
            jTextField26.setText(ComData.getPulseShapeThresholdConfig(24, 1));
            jTextField39.setText(ComData.getPulseShapeThresholdConfig(0, 1));
            jTextField38.setText(ComData.getPulseShapeThresholdConfig(1, 1));
            jTextField32.setText(ComData.getPulseShapeThresholdConfig(3, 1));
            jTextField31.setText(ComData.getPulseShapeThresholdConfig(2, 1));



            jTextField10.setText(ComData.getPulseShapeThresholdConfig(4, 1));
            jTextField30.setText(ComData.getPulseShapeThresholdConfig(5, 1));
            jTextField49.setText(ComData.getPulseShapeThresholdConfig(7, 1));
            jTextField50.setText(ComData.getPulseShapeThresholdConfig(6, 1));
            jTextField51.setText(ComData.getPulseShapeThresholdConfig(8, 1));
            jTextField12.setText(ComData.getPulseShapeThresholdConfig(9, 1));
            jTextField55.setText(ComData.getPulseShapeThresholdConfig(11, 1));
            jTextField54.setText(ComData.getPulseShapeThresholdConfig(10, 1));
            jTextField53.setText(ComData.getSummaryThresholdConfig(9, 1));
            jTextField52.setText(ComData.getSummaryThresholdConfig(8, 1));
            jTextField59.setText(ComData.getSummaryThresholdConfig(20, 1));
            jTextField58.setText(ComData.getSummaryThresholdConfig(21, 1));
            jTextField57.setText(ComData.getSummaryThresholdConfig(25, 1));
            jTextField56.setText(ComData.getSummaryThresholdConfig(24, 1));

            jTextField13.setText(ComData.getMTUThresholdConfig(8, 1));
            jTextField74.setText(ComData.getMTUThresholdConfig(9, 1));
            jTextField75.setText(ComData.getMTUThresholdConfig(11, 1));
            jTextField76.setText(ComData.getMTUThresholdConfig(10, 1));
            jTextField77.setText(ComData.getMTUThresholdConfig(19, 1));
            jTextField14.setText(ComData.getMTUThresholdConfig(18, 1));
            jTextField81.setText(ComData.getMTUThresholdConfig(13, 1));
            jTextField80.setText(ComData.getMTUThresholdConfig(12, 1));
        } else {
            if (!MTU1locked) {
                lock("MTU1");
            }
        }

        
        if (ComData.getTLastPoll(4, 2).equals("0")) {
            if (MTU4locked) {
                unlock("MTU4");
            }

            jTextField33.setText(ComData.getSummaryThresholdConfig(10, 1));
            jTextField34.setText(ComData.getSummaryThresholdConfig(11, 1));
            jTextField35.setText(ComData.getSummaryThresholdConfig(12, 1));
            jTextField36.setText(ComData.getSummaryThresholdConfig(13, 1));
            jTextField37.setText(ComData.getSummaryThresholdConfig(16, 1));
            jTextField40.setText(ComData.getSummaryThresholdConfig(17, 1));
            jTextField41.setText(ComData.getSummaryThresholdConfig(14, 1));
            jTextField42.setText(ComData.getSummaryThresholdConfig(15, 1));
            jTextField43.setText(ComData.getPulseShapeThresholdConfig(27, 1));
            jTextField44.setText(ComData.getPulseShapeThresholdConfig(26, 1));
            jTextField45.setText(ComData.getPulseShapeThresholdConfig(12, 1));
            jTextField46.setText(ComData.getPulseShapeThresholdConfig(13, 1));
            jTextField47.setText(ComData.getPulseShapeThresholdConfig(15, 1));
            jTextField48.setText(ComData.getPulseShapeThresholdConfig(14, 1));

            jTextField60.setText(ComData.getPulseShapeThresholdConfig(16, 1));
            jTextField61.setText(ComData.getPulseShapeThresholdConfig(17, 1));
            jTextField62.setText(ComData.getPulseShapeThresholdConfig(19, 1));
            jTextField63.setText(ComData.getPulseShapeThresholdConfig(18, 1));
            jTextField64.setText(ComData.getPulseShapeThresholdConfig(20, 1));
            jTextField65.setText(ComData.getPulseShapeThresholdConfig(21, 1));
            jTextField66.setText(ComData.getPulseShapeThresholdConfig(23, 1));
            jTextField67.setText(ComData.getPulseShapeThresholdConfig(22, 1));
            jTextField68.setText(ComData.getSummaryThresholdConfig(19, 1));
            jTextField69.setText(ComData.getSummaryThresholdConfig(18, 1));
            jTextField70.setText(ComData.getSummaryThresholdConfig(26, 1));
            jTextField71.setText(ComData.getSummaryThresholdConfig(27, 1));
            jTextField72.setText(ComData.getSummaryThresholdConfig(31, 1));
            jTextField73.setText(ComData.getSummaryThresholdConfig(30, 1));

            jTextField86.setText(ComData.getMTUThresholdConfig(20, 1));
            jTextField87.setText(ComData.getMTUThresholdConfig(21, 1));
            jTextField88.setText(ComData.getMTUThresholdConfig(23, 1));
            jTextField89.setText(ComData.getMTUThresholdConfig(22, 1));
            jTextField90.setText(ComData.getMTUThresholdConfig(31, 1));
            jTextField91.setText(ComData.getMTUThresholdConfig(30, 1));
            jTextField92.setText(ComData.getMTUThresholdConfig(27, 1));
            jTextField93.setText(ComData.getMTUThresholdConfig(26, 1));
        } else {
            if (!MTU4locked) {
                lock("MTU4");
            }
        }
    }

    
    public String[] getDataToSend() {
        String[] data = new String[72];

        
        data[0] = jTextField9.getText().replace(".", "");
        data[1] = jTextField22.getText().replace(".", "");
        data[2] = jTextField23.getText().replace(".", "");
        data[3] = jTextField24.getText().replace(".", "");
        data[4] = jTextField25.getText().replace(".", "");
        data[5] = jTextField26.getText();
        data[6] = jTextField27.getText();
        data[7] = jTextField28.getText();
        data[8] = jTextField29.getText();
        data[9] = jTextField11.getText().replace(".", "");
        data[10] = jTextField31.getText().replace(".", "");
        data[11] = jTextField32.getText().replace(".", "");
        data[12] = jTextField38.getText().replace(".", "");
        data[13] = jTextField39.getText().replace(".", "");

        data[14] = jTextField33.getText().replace(".", "");
        data[15] = jTextField34.getText().replace(".", "");
        data[16] = jTextField35.getText().replace(".", "");
        data[17] = jTextField36.getText().replace(".", "");
        data[18] = jTextField37.getText().replace(".", "");
        data[19] = jTextField40.getText().replace(".", "");
        data[20] = jTextField41.getText();
        data[21] = jTextField42.getText();
        data[22] = jTextField43.getText();
        data[23] = jTextField44.getText();
        data[24] = jTextField45.getText().replace(".", "");
        data[25] = jTextField46.getText().replace(".", "");
        data[26] = jTextField47.getText().replace(".", "");
        data[27] = jTextField48.getText().replace(".", "");

        data[28] = jTextField10.getText().replace(".", "");
        data[29] = jTextField30.getText().replace(".", "");
        data[30] = jTextField49.getText().replace(".", "");
        data[31] = jTextField50.getText().replace(".", "");
        data[32] = jTextField51.getText().replace(".", "");
        data[33] = jTextField52.getText().replace(".", "");
        data[34] = jTextField53.getText().replace(".", "");
        data[35] = jTextField54.getText().replace(".", "");
        data[36] = jTextField55.getText().replace(".", "");
        data[37] = jTextField56.getText();
        data[38] = jTextField57.getText();
        data[39] = jTextField58.getText().replace(".", "");
        data[40] = jTextField59.getText().replace(".", "");
        data[41] = jTextField12.getText().replace(".", "");

        data[42] = jTextField60.getText().replace(".", "");
        data[43] = jTextField61.getText().replace(".", "");
        data[44] = jTextField62.getText().replace(".", "");
        data[45] = jTextField63.getText().replace(".", "");
        data[46] = jTextField64.getText().replace(".", "");
        data[47] = jTextField65.getText().replace(".", "");
        data[48] = jTextField66.getText().replace(".", "");
        data[49] = jTextField67.getText().replace(".", "");
        data[50] = jTextField68.getText().replace(".", "");
        data[51] = jTextField69.getText().replace(".", "");
        data[52] = jTextField70.getText().replace(".", "");
        data[53] = jTextField71.getText().replace(".", "");
        data[54] = jTextField72.getText();
        data[55] = jTextField73.getText();

        data[56] = jTextField13.getText();
        data[57] = jTextField74.getText();
        data[58] = jTextField75.getText();
        data[59] = jTextField76.getText();
        data[60] = jTextField77.getText().replace(".", "");
        data[61] = jTextField14.getText().replace(".", "");
        data[62] = jTextField81.getText().replace(".", "");
        data[63] = jTextField80.getText().replace(".", "");
        data[64] = jTextField86.getText();
        data[65] = jTextField87.getText();
        data[66] = jTextField88.getText();
        data[67] = jTextField89.getText();
        data[68] = jTextField90.getText().replace(".", "");
        data[69] = jTextField91.getText().replace(".", "");
        data[70] = jTextField92.getText().replace(".", "");
        data[71] = jTextField93.getText().replace(".", "");
        
        return data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jTextField86 = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jTextField88 = new javax.swing.JTextField();
        jTextField89 = new javax.swing.JTextField();
        jTextField90 = new javax.swing.JTextField();
        jTextField91 = new javax.swing.JTextField();
        jTextField92 = new javax.swing.JTextField();
        jTextField93 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1520, 510));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU Executive - Parameter Limits", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Threshold", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Beacon Delay Primary Alarm:");
        jLabel29.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel29.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Beacon Delay Secondary Alarm:");
        jLabel30.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel30.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Pulse Spacing Primary Alarm:");
        jLabel31.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel31.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Pulse Spacing Secondary Alarm:");
        jLabel32.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel32.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Transmitted Power Primary Alarm:");
        jLabel33.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel33.setPreferredSize(new java.awt.Dimension(34, 25));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setText("???");
        jTextField9.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField9.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField9.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField9CaretUpdate(evt);
            }
        });

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField22.setText("???");
        jTextField22.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField22.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField22.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField22CaretUpdate(evt);
            }
        });

        jTextField23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField23.setText("???");
        jTextField23.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField23.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField23.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField23.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField23CaretUpdate(evt);
            }
        });

        jTextField24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField24.setText("???");
        jTextField24.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField24.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField24.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField24.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField24CaretUpdate(evt);
            }
        });

        jTextField25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField25.setText("???");
        jTextField25.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField25.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField25.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField25.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField25CaretUpdate(evt);
            }
        });

        jTextField26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField26.setText("???");
        jTextField26.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField26.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField26.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField26.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField26CaretUpdate(evt);
            }
        });

        jTextField27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField27.setText("???");
        jTextField27.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField27.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField27.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField27.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField27CaretUpdate(evt);
            }
        });

        jTextField28.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField28.setText("???");
        jTextField28.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField28.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField28.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField28.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField28CaretUpdate(evt);
            }
        });

        jTextField29.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField29.setText("???");
        jTextField29.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField29.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField29.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField29.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField29CaretUpdate(evt);
            }
        });

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField11.setText("???");
        jTextField11.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField11.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField11.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField11CaretUpdate(evt);
            }
        });

        jTextField31.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField31.setText("???");
        jTextField31.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField31.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField31.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField31.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField31CaretUpdate(evt);
            }
        });

        jTextField32.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField32.setText("???");
        jTextField32.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField32.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField32.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField32.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField32CaretUpdate(evt);
            }
        });

        jTextField38.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField38.setText("???");
        jTextField38.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField38.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField38.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField38.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField38CaretUpdate(evt);
            }
        });

        jTextField39.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField39.setText("???");
        jTextField39.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField39.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField39.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField39.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField39CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel35.setText("µs (0.00÷1.00)");
        jLabel35.setToolTipText("");
        jLabel35.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel35.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel35.setName(""); // NOI18N
        jLabel35.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel36.setText("µs (0.00÷1.00)");
        jLabel36.setToolTipText("");
        jLabel36.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel36.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel36.setName(""); // NOI18N
        jLabel36.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel37.setText("µs (0.00÷1.00)");
        jLabel37.setToolTipText("");
        jLabel37.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel37.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel37.setName(""); // NOI18N
        jLabel37.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel38.setText("µs (0.00÷1.00)");
        jLabel38.setToolTipText("");
        jLabel38.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel38.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel38.setName(""); // NOI18N
        jLabel38.setPreferredSize(new java.awt.Dimension(80, 25));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField33.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField33.setText("???");
        jTextField33.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField33.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField33.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField33.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField33CaretUpdate(evt);
            }
        });

        jTextField34.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField34.setText("???");
        jTextField34.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField34.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField34.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField34.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField34CaretUpdate(evt);
            }
        });

        jTextField35.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField35.setText("???");
        jTextField35.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField35.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField35.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField35.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField35CaretUpdate(evt);
            }
        });

        jTextField36.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField36.setText("???");
        jTextField36.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField36.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField36.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField36.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField36CaretUpdate(evt);
            }
        });

        jTextField37.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField37.setText("???");
        jTextField37.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField37.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField37.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField37.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField37CaretUpdate(evt);
            }
        });

        jTextField40.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField40.setText("???");
        jTextField40.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField40.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField40.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField40.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField40CaretUpdate(evt);
            }
        });

        jTextField41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField41.setText("???");
        jTextField41.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField41.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField41.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField41.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField41CaretUpdate(evt);
            }
        });

        jTextField42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField42.setText("???");
        jTextField42.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField42.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField42.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField42.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField42CaretUpdate(evt);
            }
        });

        jTextField43.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField43.setText("???");
        jTextField43.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField43.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField43.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField43.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField43CaretUpdate(evt);
            }
        });

        jTextField44.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField44.setText("???");
        jTextField44.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField44.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField44.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField44.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField44CaretUpdate(evt);
            }
        });

        jTextField45.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField45.setText("???");
        jTextField45.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField45.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField45.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField45.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField45CaretUpdate(evt);
            }
        });

        jTextField46.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField46.setText("???");
        jTextField46.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField46.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField46.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField46.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField46CaretUpdate(evt);
            }
        });

        jTextField47.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField47.setText("???");
        jTextField47.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField47.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField47.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField47.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField47CaretUpdate(evt);
            }
        });

        jTextField48.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField48.setText("???");
        jTextField48.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField48.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField48.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField48.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField48CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("TX Frequency Deviation Secondary Alarm:");
        jLabel34.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel34.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("TX Frequency Deviation Primary Alarm:");
        jLabel40.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel40.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Efficiency Secondary Alarm:");
        jLabel41.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel41.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Efficiency Primary Alarm:");
        jLabel42.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel42.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Transmitted Power Secondary Alarm:");
        jLabel43.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel43.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Pulse Rise Time Secondary Alarm High:");
        jLabel45.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel45.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Pulse Rise Time Primary Alarm High:");
        jLabel46.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel46.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Pulse Rise Time Secondary Alarm Low:");
        jLabel47.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel47.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Pulse Rise Time Primary Alarm Low:");
        jLabel48.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel48.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel49.setText("W (25.1÷1500.0)");
        jLabel49.setToolTipText("");
        jLabel49.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel49.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel49.setName(""); // NOI18N
        jLabel49.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel50.setText("W (25.1÷1500.0)");
        jLabel50.setToolTipText("");
        jLabel50.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel50.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel50.setName(""); // NOI18N
        jLabel50.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel51.setText("% (0÷100)");
        jLabel51.setToolTipText("");
        jLabel51.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel51.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel51.setName(""); // NOI18N
        jLabel51.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel52.setText("% (0÷100)");
        jLabel52.setToolTipText("");
        jLabel52.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel52.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel52.setName(""); // NOI18N
        jLabel52.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel53.setText("ppm (1÷20)");
        jLabel53.setToolTipText("");
        jLabel53.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel53.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel53.setName(""); // NOI18N
        jLabel53.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel54.setText("ppm (1÷20)");
        jLabel54.setToolTipText("");
        jLabel54.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel54.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel54.setName(""); // NOI18N
        jLabel54.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel55.setText("µs (1.00÷3.50)");
        jLabel55.setToolTipText("");
        jLabel55.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel55.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel55.setName(""); // NOI18N
        jLabel55.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel56.setText("µs (1.00÷3.50)");
        jLabel56.setToolTipText("");
        jLabel56.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel56.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel56.setName(""); // NOI18N
        jLabel56.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel57.setText("µs (1.00÷3.50)");
        jLabel57.setToolTipText("");
        jLabel57.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel57.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel57.setName(""); // NOI18N
        jLabel57.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel58.setText("µs (1.00÷3.50)");
        jLabel58.setToolTipText("");
        jLabel58.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel58.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel58.setName(""); // NOI18N
        jLabel58.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Threshold", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Pulse Fall Time Primary Alarm Low:");
        jLabel39.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel39.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Pulse Fall Time Secondary Alarm Low:");
        jLabel44.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel44.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Pulse Fall Time Primary Alarm High:");
        jLabel59.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel59.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("Pulse Fall Time Secondary Alarm High:");
        jLabel60.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel60.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Pulse Width Primary Alarm Low:");
        jLabel61.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel61.setPreferredSize(new java.awt.Dimension(34, 25));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setText("???");
        jTextField10.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField10.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField10.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField10CaretUpdate(evt);
            }
        });

        jTextField30.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField30.setText("???");
        jTextField30.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField30.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField30.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField30.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField30CaretUpdate(evt);
            }
        });

        jTextField49.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField49.setText("???");
        jTextField49.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField49.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField49.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField49.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField49CaretUpdate(evt);
            }
        });

        jTextField50.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField50.setText("???");
        jTextField50.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField50.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField50.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField50.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField50CaretUpdate(evt);
            }
        });

        jTextField51.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField51.setText("???");
        jTextField51.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField51.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField51.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField51.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField51CaretUpdate(evt);
            }
        });

        jTextField52.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField52.setText("???");
        jTextField52.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField52.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField52.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField52.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField52CaretUpdate(evt);
            }
        });

        jTextField53.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField53.setText("???");
        jTextField53.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField53.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField53.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField53.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField53CaretUpdate(evt);
            }
        });

        jTextField54.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField54.setText("???");
        jTextField54.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField54.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField54.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField54.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField54CaretUpdate(evt);
            }
        });

        jTextField55.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField55.setText("???");
        jTextField55.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField55.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField55.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField55.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField55CaretUpdate(evt);
            }
        });

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField12.setText("???");
        jTextField12.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField12.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField12.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField12CaretUpdate(evt);
            }
        });

        jTextField56.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField56.setText("???");
        jTextField56.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField56.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField56.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField56.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField56CaretUpdate(evt);
            }
        });

        jTextField57.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField57.setText("???");
        jTextField57.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField57.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField57.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField57.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField57CaretUpdate(evt);
            }
        });

        jTextField58.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField58.setText("???");
        jTextField58.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField58.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField58.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField58.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField58CaretUpdate(evt);
            }
        });

        jTextField59.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField59.setText("???");
        jTextField59.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField59.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField59.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField59.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField59CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel62.setText("µs (1.00÷3.50)");
        jLabel62.setToolTipText("");
        jLabel62.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel62.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel62.setName(""); // NOI18N
        jLabel62.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel63.setText("µs (1.00÷3.50)");
        jLabel63.setToolTipText("");
        jLabel63.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel63.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel63.setName(""); // NOI18N
        jLabel63.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel64.setText("µs (1.00÷3.50)");
        jLabel64.setToolTipText("");
        jLabel64.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel64.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel64.setName(""); // NOI18N
        jLabel64.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel65.setText("µs (1.00÷3.50)");
        jLabel65.setToolTipText("");
        jLabel65.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel65.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel65.setName(""); // NOI18N
        jLabel65.setPreferredSize(new java.awt.Dimension(80, 25));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField60.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField60.setText("???");
        jTextField60.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField60.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField60.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField60.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField60CaretUpdate(evt);
            }
        });

        jTextField61.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField61.setText("???");
        jTextField61.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField61.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField61.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField61.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField61CaretUpdate(evt);
            }
        });

        jTextField62.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField62.setText("???");
        jTextField62.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField62.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField62.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField62.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField62CaretUpdate(evt);
            }
        });

        jTextField63.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField63.setText("???");
        jTextField63.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField63.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField63.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField63.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField63CaretUpdate(evt);
            }
        });

        jTextField64.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField64.setText("???");
        jTextField64.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField64.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField64.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField64.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField64CaretUpdate(evt);
            }
        });

        jTextField65.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField65.setText("???");
        jTextField65.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField65.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField65.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField65.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField65CaretUpdate(evt);
            }
        });

        jTextField66.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField66.setText("???");
        jTextField66.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField66.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField66.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField66.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField66CaretUpdate(evt);
            }
        });

        jTextField67.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField67.setText("???");
        jTextField67.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField67.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField67.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField67.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField67CaretUpdate(evt);
            }
        });

        jTextField68.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField68.setText("???");
        jTextField68.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField68.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField68.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField68.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField68CaretUpdate(evt);
            }
        });

        jTextField69.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField69.setText("???");
        jTextField69.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField69.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField69.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField69.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField69CaretUpdate(evt);
            }
        });

        jTextField70.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField70.setText("???");
        jTextField70.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField70.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField70.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField70.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField70CaretUpdate(evt);
            }
        });

        jTextField71.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField71.setText("???");
        jTextField71.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField71.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField71.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField71.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField71CaretUpdate(evt);
            }
        });

        jTextField72.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField72.setText("???");
        jTextField72.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField72.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField72.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField72.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField72CaretUpdate(evt);
            }
        });

        jTextField73.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField73.setText("???");
        jTextField73.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField73.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField73.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField73.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField73CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("Pulse Power Variation Secondary Alarm:");
        jLabel66.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel66.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("Pulse Power Variation Primary Alarm:");
        jLabel67.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel67.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel68.setText("Pulse Width Secondary Alarm High:");
        jLabel68.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel68.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel69.setText("Pulse Width Primary Alarm High:");
        jLabel69.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel69.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("Pulse Width Secondary Alarm Low:");
        jLabel70.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel70.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Transmission Rate Secondary Alarm High:");
        jLabel71.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel71.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("Transmission Rate Primary Alarm High:");
        jLabel72.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel72.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel73.setText("Radiated Power Secondary Alarm:");
        jLabel73.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel73.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel74.setText("Radiated Power Primary Alarm:");
        jLabel74.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel74.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel75.setText("µs (2.50÷4.50)");
        jLabel75.setToolTipText("");
        jLabel75.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel75.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel75.setName(""); // NOI18N
        jLabel75.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel76.setText("µs (2.50÷4.50)");
        jLabel76.setToolTipText("");
        jLabel76.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel76.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel76.setName(""); // NOI18N
        jLabel76.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel77.setText("µs (2.50÷4.50)");
        jLabel77.setToolTipText("");
        jLabel77.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel77.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel77.setName(""); // NOI18N
        jLabel77.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel78.setText("µs (2.50÷4.50)");
        jLabel78.setToolTipText("");
        jLabel78.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel78.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel78.setName(""); // NOI18N
        jLabel78.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel79.setText("dB (0.50÷2.00)");
        jLabel79.setToolTipText("");
        jLabel79.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel79.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel79.setName(""); // NOI18N
        jLabel79.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel80.setText("dB (0.50÷2.00)");
        jLabel80.setToolTipText("");
        jLabel80.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel80.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel80.setName(""); // NOI18N
        jLabel80.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel81.setText("W (25.1÷1500.0)");
        jLabel81.setToolTipText("");
        jLabel81.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel81.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel81.setName(""); // NOI18N
        jLabel81.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel82.setText("W (25.1÷1500.0)");
        jLabel82.setToolTipText("");
        jLabel82.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel82.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel82.setName(""); // NOI18N
        jLabel82.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel83.setText("ppps (2000÷5000)");
        jLabel83.setToolTipText("");
        jLabel83.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel83.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel83.setName(""); // NOI18N
        jLabel83.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel84.setText("ppps (2000÷5000)");
        jLabel84.setToolTipText("");
        jLabel84.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel84.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel84.setName(""); // NOI18N
        jLabel84.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Threshold", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("1350 Hz ID Tone Period (741 us)");
        jLabel85.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel85.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("1350 Hz ID Tone Period (741 us)");
        jLabel86.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel86.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("1350 Hz ID Tone Period (741 us)");
        jLabel87.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel87.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setText("1350 Hz ID Tone Period (741 us)");
        jLabel88.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel88.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("Ident Length Primary Alarm:");
        jLabel89.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel89.setPreferredSize(new java.awt.Dimension(34, 25));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField13.setText("???");
        jTextField13.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField13.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField13.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField13CaretUpdate(evt);
            }
        });

        jTextField74.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField74.setText("???");
        jTextField74.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField74.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField74.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField74.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField74CaretUpdate(evt);
            }
        });

        jTextField75.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField75.setText("???");
        jTextField75.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField75.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField75.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField75.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField75CaretUpdate(evt);
            }
        });

        jTextField76.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField76.setText("???");
        jTextField76.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField76.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField76.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField76.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField76CaretUpdate(evt);
            }
        });

        jTextField77.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField77.setText("???");
        jTextField77.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField77.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField77.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField77.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField77CaretUpdate(evt);
            }
        });

        jTextField80.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField80.setText("???");
        jTextField80.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField80.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField80.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField80.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField80CaretUpdate(evt);
            }
        });

        jTextField81.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField81.setText("???");
        jTextField81.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField81.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField81.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField81.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField81CaretUpdate(evt);
            }
        });

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField14.setText("???");
        jTextField14.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField14.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField14.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField14CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel90.setText("µs (500÷740)");
        jLabel90.setToolTipText("");
        jLabel90.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel90.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel90.setName(""); // NOI18N
        jLabel90.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel91.setText("µs (500÷740)");
        jLabel91.setToolTipText("");
        jLabel91.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel91.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel91.setName(""); // NOI18N
        jLabel91.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel92.setText("µs (745÷800)");
        jLabel92.setToolTipText("");
        jLabel92.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel92.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel92.setName(""); // NOI18N
        jLabel92.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel93.setText("µs (745÷800)");
        jLabel93.setToolTipText("");
        jLabel93.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel93.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel93.setName(""); // NOI18N
        jLabel93.setPreferredSize(new java.awt.Dimension(80, 25));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MTU 4", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTextField86.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField86.setText("???");
        jTextField86.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField86.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField86.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField86.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField86CaretUpdate(evt);
            }
        });

        jTextField87.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField87.setText("???");
        jTextField87.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField87.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField87.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField87.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField87CaretUpdate(evt);
            }
        });

        jTextField88.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField88.setText("???");
        jTextField88.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField88.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField88.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField88.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField88CaretUpdate(evt);
            }
        });

        jTextField89.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField89.setText("???");
        jTextField89.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField89.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField89.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField89.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField89CaretUpdate(evt);
            }
        });

        jTextField90.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField90.setText("???");
        jTextField90.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField90.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField90.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField90.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField90CaretUpdate(evt);
            }
        });

        jTextField91.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField91.setText("???");
        jTextField91.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField91.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField91.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField91.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField91CaretUpdate(evt);
            }
        });

        jTextField92.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField92.setText("???");
        jTextField92.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField92.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField92.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField92.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField92CaretUpdate(evt);
            }
        });

        jTextField93.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField93.setText("???");
        jTextField93.setMaximumSize(new java.awt.Dimension(60, 25));
        jTextField93.setMinimumSize(new java.awt.Dimension(60, 25));
        jTextField93.setPreferredSize(new java.awt.Dimension(60, 25));
        jTextField93.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField93CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField87, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setText("ID Keydown Length");
        jLabel96.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel96.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel97.setText("ID Keydown Length");
        jLabel97.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel97.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel98.setText("Ident Length Secondary Alarm :");
        jLabel98.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel98.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel103.setText("s (0.00÷10.00)");
        jLabel103.setToolTipText("");
        jLabel103.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel103.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel103.setName(""); // NOI18N
        jLabel103.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel104.setText("s (0.00÷10.00)");
        jLabel104.setToolTipText("");
        jLabel104.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel104.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel104.setName(""); // NOI18N
        jLabel104.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel105.setText("s (0.00÷5.00)");
        jLabel105.setToolTipText("");
        jLabel105.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel105.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel105.setName(""); // NOI18N
        jLabel105.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel106.setText("s (0.00÷5.00)");
        jLabel106.setToolTipText("");
        jLabel106.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel106.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel106.setName(""); // NOI18N
        jLabel106.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel113.setText("Primary Alarm Low:");
        jLabel113.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel113.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("Secondary Alarm Low:");
        jLabel94.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel94.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel95.setText("Primary Alarm High:");
        jLabel95.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel95.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel99.setText("Secondary Alarm High:");
        jLabel99.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel99.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel100.setText("Primary Alarm High:");
        jLabel100.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel100.setPreferredSize(new java.awt.Dimension(34, 25));

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel101.setText("Secondary Alarm High:");
        jLabel101.setMinimumSize(new java.awt.Dimension(34, 25));
        jLabel101.setPreferredSize(new java.awt.Dimension(34, 25));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField9CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField9.getText(), 0.00, 1.00) > 0) {
            jTextField9.setBackground(Color.white);
            jTextField9.setForeground(Color.BLACK);
        } else {
            jTextField9.setBackground(Color.red);
            jTextField9.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField9CaretUpdate

    private void jTextField33CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField33CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField33.getText(), 0.00, 1.00) > 0) {
            jTextField33.setBackground(Color.white);
            jTextField33.setForeground(Color.BLACK);
        } else {
            jTextField33.setBackground(Color.red);
            jTextField33.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField33CaretUpdate

    private void jTextField22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField22CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField22.getText(), 0.00, 1.00) > 0) {
            jTextField22.setBackground(Color.white);
            jTextField22.setForeground(Color.BLACK);
        } else {
            jTextField22.setBackground(Color.red);
            jTextField22.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField22CaretUpdate

    private void jTextField34CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField34CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField34.getText(), 0.00, 1.00) > 0) {
            jTextField34.setBackground(Color.white);
            jTextField34.setForeground(Color.BLACK);
        } else {
            jTextField34.setBackground(Color.red);
            jTextField34.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField34CaretUpdate

    private void jTextField23CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField23CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField23.getText(), 0.00, 1.00) > 0) {
            jTextField23.setBackground(Color.white);
            jTextField23.setForeground(Color.BLACK);
        } else {
            jTextField23.setBackground(Color.red);
            jTextField23.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField23CaretUpdate

    private void jTextField35CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField35CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField35.getText(), 0.00, 1.00) > 0) {
            jTextField35.setBackground(Color.white);
            jTextField35.setForeground(Color.BLACK);
        } else {
            jTextField35.setBackground(Color.red);
            jTextField35.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField35CaretUpdate

    private void jTextField24CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField24CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField24.getText(), 0.00, 1.00) > 0) {
            jTextField24.setBackground(Color.white);
            jTextField24.setForeground(Color.BLACK);
        } else {
            jTextField24.setBackground(Color.red);
            jTextField24.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField24CaretUpdate

    private void jTextField36CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField36CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField36.getText(), 0.00, 1.00) > 0) {
            jTextField36.setBackground(Color.white);
            jTextField36.setForeground(Color.BLACK);
        } else {
            jTextField36.setBackground(Color.red);
            jTextField36.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField36CaretUpdate

    private void jTextField25CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField25CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField25.getText(), 25.1, 1500.0) > 0) {
            jTextField25.setBackground(Color.white);
            jTextField25.setForeground(Color.BLACK);
        } else {
            jTextField25.setBackground(Color.red);
            jTextField25.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField25CaretUpdate

    private void jTextField37CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField37CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField37.getText(), 25.1, 1500.0) > 0) {
            jTextField37.setBackground(Color.white);
            jTextField37.setForeground(Color.BLACK);
        } else {
            jTextField37.setBackground(Color.red);
            jTextField37.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField37CaretUpdate

    private void jTextField26CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField26CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField26.getText(), 1, 20) > 0) {
            jTextField26.setBackground(Color.white);
            jTextField26.setForeground(Color.BLACK);
        } else {
            jTextField26.setBackground(Color.red);
            jTextField26.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField26CaretUpdate

    private void jTextField27CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField27CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField27.getText(), 1, 20) > 0) {
            jTextField27.setBackground(Color.white);
            jTextField27.setForeground(Color.BLACK);
        } else {
            jTextField27.setBackground(Color.red);
            jTextField27.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField27CaretUpdate

    private void jTextField28CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField28CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField28.getText(), 0, 100) > 0) {
            jTextField28.setBackground(Color.white);
            jTextField28.setForeground(Color.BLACK);
        } else {
            jTextField28.setBackground(Color.red);
            jTextField28.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField28CaretUpdate

    private void jTextField29CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField29CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField29.getText(), 0, 100) > 0) {
            jTextField29.setBackground(Color.white);
            jTextField29.setForeground(Color.BLACK);
        } else {
            jTextField29.setBackground(Color.red);
            jTextField29.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField29CaretUpdate

    private void jTextField11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField11.getText(), 25.1, 1500.0) > 0) {
            jTextField11.setBackground(Color.white);
            jTextField11.setForeground(Color.BLACK);
        } else {
            jTextField11.setBackground(Color.red);
            jTextField11.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField11CaretUpdate

    private void jTextField31CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField31CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField31.getText(), 1.00, 3.50) > 0) {
            jTextField31.setBackground(Color.white);
            jTextField31.setForeground(Color.BLACK);
        } else {
            jTextField31.setBackground(Color.red);
            jTextField31.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField31CaretUpdate

    private void jTextField32CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField32CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField32.getText(), 1.00, 3.50) > 0) {
            jTextField32.setBackground(Color.white);
            jTextField32.setForeground(Color.BLACK);
        } else {
            jTextField32.setBackground(Color.red);
            jTextField32.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField32CaretUpdate

    private void jTextField38CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField38CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField38.getText(), 1.00, 3.50) > 0) {
            jTextField38.setBackground(Color.white);
            jTextField38.setForeground(Color.BLACK);
        } else {
            jTextField38.setBackground(Color.red);
            jTextField38.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField38CaretUpdate

    private void jTextField39CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField39CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField39.getText(), 1.00, 3.50) > 0) {
            jTextField39.setBackground(Color.white);
            jTextField39.setForeground(Color.BLACK);
        } else {
            jTextField39.setBackground(Color.red);
            jTextField39.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField39CaretUpdate

    private void jTextField40CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField40CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField40.getText(), 25.1, 1500.0) > 0) {
            jTextField40.setBackground(Color.white);
            jTextField40.setForeground(Color.BLACK);
        } else {
            jTextField40.setBackground(Color.red);
            jTextField40.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField40CaretUpdate

    private void jTextField41CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField41CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField41.getText(), 0, 100) > 0) {
            jTextField41.setBackground(Color.white);
            jTextField41.setForeground(Color.BLACK);
        } else {
            jTextField41.setBackground(Color.red);
            jTextField41.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField41CaretUpdate

    private void jTextField42CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField42CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField42.getText(), 0, 100) > 0) {
            jTextField42.setBackground(Color.white);
            jTextField42.setForeground(Color.BLACK);
        } else {
            jTextField42.setBackground(Color.red);
            jTextField42.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField42CaretUpdate

    private void jTextField43CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField43CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField43.getText(), 1, 20) > 0) {
            jTextField43.setBackground(Color.white);
            jTextField43.setForeground(Color.BLACK);
        } else {
            jTextField43.setBackground(Color.red);
            jTextField43.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField43CaretUpdate

    private void jTextField44CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField44CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField44.getText(), 1, 20) > 0) {
            jTextField44.setBackground(Color.white);
            jTextField44.setForeground(Color.BLACK);
        } else {
            jTextField44.setBackground(Color.red);
            jTextField44.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField44CaretUpdate

    private void jTextField45CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField45CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField45.getText(), 1.00, 3.50) > 0) {
            jTextField45.setBackground(Color.white);
            jTextField45.setForeground(Color.BLACK);
        } else {
            jTextField45.setBackground(Color.red);
            jTextField45.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField45CaretUpdate

    private void jTextField46CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField46CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField46.getText(), 1.00, 3.50) > 0) {
            jTextField46.setBackground(Color.white);
            jTextField46.setForeground(Color.BLACK);
        } else {
            jTextField46.setBackground(Color.red);
            jTextField46.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField46CaretUpdate

    private void jTextField47CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField47CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField47.getText(), 1.00, 3.50) > 0) {
            jTextField47.setBackground(Color.white);
            jTextField47.setForeground(Color.BLACK);
        } else {
            jTextField47.setBackground(Color.red);
            jTextField47.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField47CaretUpdate

    private void jTextField48CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField48CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField48.getText(), 1.00, 3.50) > 0) {
            jTextField48.setBackground(Color.white);
            jTextField48.setForeground(Color.BLACK);
        } else {
            jTextField48.setBackground(Color.red);
            jTextField48.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField48CaretUpdate

    private void jTextField10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField10CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField10.getText(), 1.00, 3.50) > 0) {
            jTextField10.setBackground(Color.white);
            jTextField10.setForeground(Color.BLACK);
        } else {
            jTextField10.setBackground(Color.red);
            jTextField10.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField10CaretUpdate

    private void jTextField30CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField30CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField30.getText(), 1.00, 3.50) > 0) {
            jTextField30.setBackground(Color.white);
            jTextField30.setForeground(Color.BLACK);
        } else {
            jTextField30.setBackground(Color.red);
            jTextField30.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField30CaretUpdate

    private void jTextField49CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField49CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField49.getText(), 1.00, 3.50) > 0) {
            jTextField49.setBackground(Color.white);
            jTextField49.setForeground(Color.BLACK);
        } else {
            jTextField49.setBackground(Color.red);
            jTextField49.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField49CaretUpdate

    private void jTextField50CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField50CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField50.getText(), 1.00, 3.50) > 0) {
            jTextField50.setBackground(Color.white);
            jTextField50.setForeground(Color.BLACK);
        } else {
            jTextField50.setBackground(Color.red);
            jTextField50.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField50CaretUpdate

    private void jTextField51CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField51CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField51.getText(), 2.50, 4.50) > 0) {
            jTextField51.setBackground(Color.white);
            jTextField51.setForeground(Color.BLACK);
        } else {
            jTextField51.setBackground(Color.red);
            jTextField51.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField51CaretUpdate

    private void jTextField52CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField52CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField52.getText(), 0.50, 2.00) > 0) {
            jTextField52.setBackground(Color.white);
            jTextField52.setForeground(Color.BLACK);
        } else {
            jTextField52.setBackground(Color.red);
            jTextField52.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField52CaretUpdate

    private void jTextField53CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField53CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField53.getText(), 0.50, 2.00) > 0) {
            jTextField53.setBackground(Color.white);
            jTextField53.setForeground(Color.BLACK);
        } else {
            jTextField53.setBackground(Color.red);
            jTextField53.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField53CaretUpdate

    private void jTextField54CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField54CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField54.getText(), 2.50, 4.50) > 0) {
            jTextField54.setBackground(Color.white);
            jTextField54.setForeground(Color.BLACK);
        } else {
            jTextField54.setBackground(Color.red);
            jTextField54.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField54CaretUpdate

    private void jTextField55CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField55CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField55.getText(), 2.50, 4.50) > 0) {
            jTextField55.setBackground(Color.white);
            jTextField55.setForeground(Color.BLACK);
        } else {
            jTextField55.setBackground(Color.red);
            jTextField55.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField55CaretUpdate

    private void jTextField12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField12CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField12.getText(), 2.50, 4.50) > 0) {
            jTextField12.setBackground(Color.white);
            jTextField12.setForeground(Color.BLACK);
        } else {
            jTextField12.setBackground(Color.red);
            jTextField12.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField12CaretUpdate

    private void jTextField56CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField56CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField56.getText(), 2000, 5000) > 0) {
            jTextField56.setBackground(Color.white);
            jTextField56.setForeground(Color.BLACK);
        } else {
            jTextField56.setBackground(Color.red);
            jTextField56.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField56CaretUpdate

    private void jTextField57CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField57CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField57.getText(), 2000, 5000) > 0) {
            jTextField57.setBackground(Color.white);
            jTextField57.setForeground(Color.BLACK);
        } else {
            jTextField57.setBackground(Color.red);
            jTextField57.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField57CaretUpdate

    private void jTextField58CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField58CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField58.getText(), 25.1, 1500.0) > 0) {
            jTextField58.setBackground(Color.white);
            jTextField58.setForeground(Color.BLACK);
        } else {
            jTextField58.setBackground(Color.red);
            jTextField58.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField58CaretUpdate

    private void jTextField59CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField59CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField59.getText(), 25.1, 1500.0) > 0) {
            jTextField59.setBackground(Color.white);
            jTextField59.setForeground(Color.BLACK);
        } else {
            jTextField59.setBackground(Color.red);
            jTextField59.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField59CaretUpdate

    private void jTextField60CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField60CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField60.getText(), 1.00, 3.50) > 0) {
            jTextField60.setBackground(Color.white);
            jTextField60.setForeground(Color.BLACK);
        } else {
            jTextField60.setBackground(Color.red);
            jTextField60.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField60CaretUpdate

    private void jTextField61CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField61CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField61.getText(), 1.00, 3.50) > 0) {
            jTextField61.setBackground(Color.white);
            jTextField61.setForeground(Color.BLACK);
        } else {
            jTextField61.setBackground(Color.red);
            jTextField61.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField61CaretUpdate

    private void jTextField62CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField62CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField62.getText(), 1.00, 3.50) > 0) {
            jTextField62.setBackground(Color.white);
            jTextField62.setForeground(Color.BLACK);
        } else {
            jTextField62.setBackground(Color.red);
            jTextField62.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField62CaretUpdate

    private void jTextField63CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField63CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField63.getText(), 1.00, 3.50) > 0) {
            jTextField63.setBackground(Color.white);
            jTextField63.setForeground(Color.BLACK);
        } else {
            jTextField63.setBackground(Color.red);
            jTextField63.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField63CaretUpdate

    private void jTextField64CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField64CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField64.getText(), 2.50, 4.50) > 0) {
            jTextField64.setBackground(Color.white);
            jTextField64.setForeground(Color.BLACK);
        } else {
            jTextField64.setBackground(Color.red);
            jTextField64.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField64CaretUpdate

    private void jTextField65CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField65CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField65.getText(), 2.50, 4.50) > 0) {
            jTextField65.setBackground(Color.white);
            jTextField65.setForeground(Color.BLACK);
        } else {
            jTextField65.setBackground(Color.red);
            jTextField65.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField65CaretUpdate

    private void jTextField66CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField66CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField66.getText(), 2.50, 4.50) > 0) {
            jTextField66.setBackground(Color.white);
            jTextField66.setForeground(Color.BLACK);
        } else {
            jTextField66.setBackground(Color.red);
            jTextField66.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField66CaretUpdate

    private void jTextField67CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField67CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField67.getText(), 2.50, 4.50) > 0) {
            jTextField67.setBackground(Color.white);
            jTextField67.setForeground(Color.BLACK);
        } else {
            jTextField67.setBackground(Color.red);
            jTextField67.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField67CaretUpdate

    private void jTextField68CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField68CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField68.getText(), 0.50, 2.00) > 0) {
            jTextField68.setBackground(Color.white);
            jTextField68.setForeground(Color.BLACK);
        } else {
            jTextField68.setBackground(Color.red);
            jTextField68.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField68CaretUpdate

    private void jTextField69CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField69CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField69.getText(), 0.50, 2.00) > 0) {
            jTextField69.setBackground(Color.white);
            jTextField69.setForeground(Color.BLACK);
        } else {
            jTextField69.setBackground(Color.red);
            jTextField69.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField69CaretUpdate

    private void jTextField70CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField70CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField70.getText(), 25.1, 1500.0) > 0) {
            jTextField70.setBackground(Color.white);
            jTextField70.setForeground(Color.BLACK);
        } else {
            jTextField70.setBackground(Color.red);
            jTextField70.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField70CaretUpdate

    private void jTextField71CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField71CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField71.getText(), 25.1, 1500.0) > 0) {
            jTextField71.setBackground(Color.white);
            jTextField71.setForeground(Color.BLACK);
        } else {
            jTextField71.setBackground(Color.red);
            jTextField71.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField71CaretUpdate

    private void jTextField72CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField72CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField72.getText(), 2000, 5000) > 0) {
            jTextField72.setBackground(Color.white);
            jTextField72.setForeground(Color.BLACK);
        } else {
            jTextField72.setBackground(Color.red);
            jTextField72.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField72CaretUpdate

    private void jTextField73CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField73CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField73.getText(), 2000, 5000) > 0) {
            jTextField73.setBackground(Color.white);
            jTextField73.setForeground(Color.BLACK);
        } else {
            jTextField73.setBackground(Color.red);
            jTextField73.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField73CaretUpdate

    private void jTextField13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField13CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField13.getText(), 500, 740) > 0) {
            jTextField13.setBackground(Color.white);
            jTextField13.setForeground(Color.BLACK);
        } else {
            jTextField13.setBackground(Color.red);
            jTextField13.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField13CaretUpdate

    private void jTextField74CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField74CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField74.getText(), 500, 740) > 0) {
            jTextField74.setBackground(Color.white);
            jTextField74.setForeground(Color.BLACK);
        } else {
            jTextField74.setBackground(Color.red);
            jTextField74.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField74CaretUpdate

    private void jTextField75CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField75CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField75.getText(), 745, 800) > 0) {
            jTextField75.setBackground(Color.white);
            jTextField75.setForeground(Color.BLACK);
        } else {
            jTextField75.setBackground(Color.red);
            jTextField75.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField75CaretUpdate

    private void jTextField76CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField76CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField76.getText(), 745, 800) > 0) {
            jTextField76.setBackground(Color.white);
            jTextField76.setForeground(Color.BLACK);
        } else {
            jTextField76.setBackground(Color.red);
            jTextField76.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField76CaretUpdate

    private void jTextField77CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField77CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField77.getText(), 0.00, 10.00) > 0) {
            jTextField77.setBackground(Color.white);
            jTextField77.setForeground(Color.BLACK);
        } else {
            jTextField77.setBackground(Color.red);
            jTextField77.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField77CaretUpdate

    private void jTextField80CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField80CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField80.getText(), 0.00, 5.00) > 0) {
            jTextField80.setBackground(Color.white);
            jTextField80.setForeground(Color.BLACK);
        } else {
            jTextField80.setBackground(Color.red);
            jTextField80.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField80CaretUpdate

    private void jTextField81CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField81CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField81.getText(), 0.00, 5.00) > 0) {
            jTextField81.setBackground(Color.white);
            jTextField81.setForeground(Color.BLACK);
        } else {
            jTextField81.setBackground(Color.red);
            jTextField81.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField81CaretUpdate

    private void jTextField14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField14CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField14.getText(), 0.00, 10.00) > 0) {
            jTextField14.setBackground(Color.white);
            jTextField14.setForeground(Color.BLACK);
        } else {
            jTextField14.setBackground(Color.red);
            jTextField14.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField14CaretUpdate

    private void jTextField86CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField86CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField86.getText(), 500, 740) > 0) {
            jTextField86.setBackground(Color.white);
            jTextField86.setForeground(Color.BLACK);
        } else {
            jTextField86.setBackground(Color.red);
            jTextField86.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField86CaretUpdate

    private void jTextField87CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField87CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField87.getText(), 500, 740) > 0) {
            jTextField87.setBackground(Color.white);
            jTextField87.setForeground(Color.BLACK);
        } else {
            jTextField87.setBackground(Color.red);
            jTextField87.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField87CaretUpdate

    private void jTextField88CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField88CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField88.getText(), 745, 800) > 0) {
            jTextField88.setBackground(Color.white);
            jTextField88.setForeground(Color.BLACK);
        } else {
            jTextField88.setBackground(Color.red);
            jTextField88.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField88CaretUpdate

    private void jTextField89CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField89CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField89.getText(), 745, 800) > 0) {
            jTextField89.setBackground(Color.white);
            jTextField89.setForeground(Color.BLACK);
        } else {
            jTextField89.setBackground(Color.red);
            jTextField89.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField89CaretUpdate

    private void jTextField90CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField90CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField90.getText(), 0.00, 10.00) > 0) {
            jTextField90.setBackground(Color.white);
            jTextField90.setForeground(Color.BLACK);
        } else {
            jTextField90.setBackground(Color.red);
            jTextField90.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField90CaretUpdate

    private void jTextField91CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField91CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField91.getText(), 0.00, 10.00) > 0) {
            jTextField91.setBackground(Color.white);
            jTextField91.setForeground(Color.BLACK);
        } else {
            jTextField91.setBackground(Color.red);
            jTextField91.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField91CaretUpdate

    private void jTextField92CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField92CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField92.getText(), 0.00, 5.00) > 0) {
            jTextField92.setBackground(Color.white);
            jTextField92.setForeground(Color.BLACK);
        } else {
            jTextField92.setBackground(Color.red);
            jTextField92.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField92CaretUpdate

    private void jTextField93CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField93CaretUpdate
        if (ITC.dmeconfigWin.parseField(jTextField93.getText(), 0.00, 5.00) > 0) {
            jTextField93.setBackground(Color.white);
            jTextField93.setForeground(Color.BLACK);
        } else {
            jTextField93.setBackground(Color.red);
            jTextField93.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_jTextField93CaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
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
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    // End of variables declaration//GEN-END:variables
}
