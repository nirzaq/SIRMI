package id.arief.sirmi.transaksi.tarifmobil;

import id.arief.sirmi.master.mobil.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author arief-asus
 */
public class TarifTableModel extends AbstractTableModel{ 
    
    private List<Tarif> list = new ArrayList<>();
    
    public void setData(List<Tarif>list){
        this.list = list;
        fireTableDataChanged();
    }
    
    public Tarif get(int row){
        return list.get(row);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex+1;
            case 1:
                return list.get(rowIndex).getKode_mobil();
            case 2:
                return list.get(rowIndex).getGol_tarif();
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
                return "Kode Tarif";
            case 2:
                return "Golongan Tarif";
            case 3:
                return "Kode Mobil";
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
