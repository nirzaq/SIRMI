/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.arief.sirmi.master.goltarif;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arief-asus
 */
public class GolTarifTableModel extends AbstractTableModel {
     private List<GolTarif> list = new ArrayList<>();
    
    public void setData(List<GolTarif>list){
        this.list = list;
        fireTableDataChanged();
    }
    
    public GolTarif get(int row){
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
                return list.get(rowIndex).getGol_tarif();
            case 2:
                return list.get(rowIndex).getTarif();
            case 3:
                return list.get(rowIndex).getJenis();
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
                return "Golongan Tarif";
            case 2:
                return "Tarif";
            case 3:
                return "Jenis Tarif";
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
