package id.arief.sirmi.util;

import java.awt.Component;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author arief-asus
 */
public class TableUtil {
    /**
     * Method ini digunakan untuk mengatur lebar kolom tabel
     * agar otomatis menyesuaikan dengan isi pada kolom
     * tersebut
     * @param table 
     */ 
    public static void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 50; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    
    /**
     * Method ini digunakan untuk membuat rata tengah kolom pada tabel.
     * @param table
     * @param kolom
     * 
     */
     
    public static void kolomRataTengah(JTable table, int kolom) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
        table.getColumnModel().getColumn(kolom).setCellRenderer( centerRenderer );
    }
    
    public static void tabelKosong(JTable table, AbstractTableModel tableModel) {
        TableCellRenderer rendererFromHeader = table.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        JLabel tabelKosong = new JLabel("Data tidak ditemukan");
        table.add(tabelKosong);
        table.setFillsViewportHeight(true);
        table.setLayout(new GridBagLayout());

        tableModel.addTableModelListener((TableModelEvent e) -> {
            tabelKosong.setVisible(tableModel.getRowCount() == 0);
        });
    }
}
