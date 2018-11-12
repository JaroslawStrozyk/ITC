package UX;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author edatabit
 */
public class PLogRender extends JLabel implements TableCellRenderer {

    private static Integer[][] Index;

    public PLogRender(int i) {
        Index = new Integer[i][4];
        for (int j=0;j<i;j++){
            Index[j][0] = 0;
            Index[j][1] = 0;
            Index[j][2] = 0;
            Index[j][3] = 0;
        }
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = this;
        String s = String.valueOf(value);

        setOpaque(true);
        label.setFont(new Font("Arial", Font.PLAIN, 12)); //"Tahoma"
        label.setText(s);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(new Color(230, 230, 230)); //new Color(204, 255, 204)
        label.setForeground(Color.BLACK);
        if (s.equals("WARN")) {
            Index[row][0] = 1;
            Index[row][1] = 1;
            Index[row][2] = 1;
            Index[row][3] = 1;
        } else if (s.equals("ERROR")) {
            Index[row][0] = 2;
            Index[row][1] = 2;
            Index[row][2] = 2;
            Index[row][3] = 2;
        }

        if (Index[row][column]==2){
            label.setBackground(Color.RED); 
            label.setForeground(Color.YELLOW);            
        }else if (Index[row][column]==1){
            label.setBackground(Color.YELLOW);
            label.setForeground(Color.RED);            
        }else{
           // label.setBackground(new Color(204,255,204));
        }

        return label;
    }
}
