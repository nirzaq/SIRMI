package id.arief.sirmi.master.karyawan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arief-asus
 */
public class KaryawanTableModel extends AbstractTableModel {
     private List<Karyawan> list = new ArrayList<>();
    
    public void setData(List<Karyawan>list){
        this.list = list;
        fireTableDataChanged();
    }
    
    public Karyawan get(int row){
        return list.get(row);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex+1;
            case 1:
                return list.get(rowIndex).getKodeKaryawan();
            case 2:
                return list.get(rowIndex).getNamaKaryawan();
            case 3:
                return list.get(rowIndex).getTanggalLahirKaryawan();
            case 4:
                return list.get(rowIndex).getKontakKaryawan();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "No";
            case 1:
                return "Kode";
            case 2:
                return "Nama";
            case 3:
                return "Tanggal Lahir";
            case 4:
                return "No Telepon";
            default:
                return null;
        }
    }
    //Agar tidak bisa diedit
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
        //return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
}
