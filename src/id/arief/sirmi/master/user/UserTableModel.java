package id.arief.sirmi.master.user;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author arief-asus
 */
public class UserTableModel extends AbstractTableModel{ 
    
    private List<User> list = new ArrayList<>();
    
    public void setData(List<User> list){
        this.list = list;
        fireTableDataChanged();
    }
    
    public User get(int row){
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
                return list.get(rowIndex).getKode_user();
            case 2:
                return list.get(rowIndex).getUsername();
            case 3:
                return list.get(rowIndex).getHakAkses();
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
                return "Kode User";
            case 2:
                return "Username";
            case 3:
                return "Hak Akses";
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
