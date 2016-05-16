package id.arief.sirmi.transaksi.tarifmobil;

import id.arief.sirmi.database.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arief-asus
 */
public class TarifController {

    public List<Tarif> getData() {
        String sqlSelect = "SELECT * FROM t_tarif_mobil";
        Statement statement;
        ResultSet resultSet;
        
        try {
           statement = Connection.getConnection().createStatement();
           resultSet = statement.executeQuery(sqlSelect);
           
           List<Tarif> list = new ArrayList<>();
           
           while(resultSet.next()) {
               Tarif tarif = new Tarif();
               tarif.setId(resultSet.getInt("id"));
               tarif.setGol_tarif(resultSet.getString("gol_tarif"));
               tarif.setKode_mobil(resultSet.getString("kode_mobil"));
               
               list.add(tarif);
           }
           resultSet.close();
           return list;
    } catch (SQLException exception) {
         System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    
    public List<Tarif> getDataByParameter(String sqlParam, String searchParam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void tambahData(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void ubahData(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void hapusData(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
