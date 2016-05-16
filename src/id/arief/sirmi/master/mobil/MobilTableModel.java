package id.arief.sirmi.master.mobil;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author arief-asus
 */
public class MobilTableModel extends AbstractTableModel{ 
    
    private List<Mobil> list = new ArrayList<>();
    
    public void setData(List<Mobil>list){
        this.list = list;
        fireTableDataChanged();
    }
    
    public Mobil get(int row){
        return list.get(row);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex+1;
            case 1:
                return list.get(rowIndex).getKode_mobil();
            case 2:
                return list.get(rowIndex).getNama_mobil();
            case 3:
                return list.get(rowIndex).getMerk_mobil();
            case 4:
                return list.get(rowIndex).getNopol_mobil();
            case 5:
                return list.get(rowIndex).getJenis_mobil();
            case 6:
                return list.get(rowIndex).getTahun_pembuatan();
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
                return "Kode Mobil";
            case 2:
                return "Nama";
            case 3:
                return "Merk";
            case 4:
                return "Nopol";
            case 5:
                return "Jenis";
            case 6:
                return "Tahun";
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
