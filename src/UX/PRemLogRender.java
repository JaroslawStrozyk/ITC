package ux;

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
public class PRemLogRender extends JLabel implements TableCellRenderer {

    private static Integer[][] Index;

    public PRemLogRender(int i) {
        Index = new Integer[i][10];
        for (int j = 0; j < i; j++) {
            Index[j][0] = 0;
            Index[j][1] = 0;
            Index[j][2] = 0;
            Index[j][3] = 0;
            Index[j][4] = 0;
            Index[j][5] = 0;
            Index[j][6] = 0;
            Index[j][7] = 0;
            Index[j][8] = 0;
            Index[j][9] = 0;

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
        if (s.equals("failure")) {
            Index[row][0] = 1;
            Index[row][1] = 1;
            Index[row][2] = 1;
            Index[row][3] = 1;
            Index[row][4] = 1;
            Index[row][5] = 1;
            Index[row][6] = 1;
            Index[row][7] = 1;
            Index[row][8] = 1;
            Index[row][9] = 1;
        } else if (s.matches("(.*)error:(.*)")) {
            Index[row][0] = 2;
            Index[row][1] = 2;
            Index[row][2] = 2;
            Index[row][3] = 2;
            Index[row][4] = 2;
            Index[row][5] = 2;
            Index[row][6] = 2;
            Index[row][7] = 2;
            Index[row][8] = 2;
            Index[row][9] = 2;
        }

        switch (Index[row][column]) {
            case 1:
                label.setBackground(Color.YELLOW);
                label.setForeground(Color.RED);
                break;
            case 2:
                label.setBackground(Color.RED);
                label.setForeground(Color.YELLOW);
                break;
            default:
                //label.setBackground(new Color(204, 255, 204));
                break;
        }


        return label;
    }
}
