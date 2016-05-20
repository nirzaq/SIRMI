package id.arief.sirmi.master.goltarif;

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
public class GolTarifController {

    public List<GolTarif> getData() {
        String sqlSelect = "SELECT * FROM m_gol_tarif";
        Statement statement;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<GolTarif> list = new ArrayList<>();

            while (resultSet.next()) {
               
                GolTarif golTarif = new GolTarif();
                golTarif.setGol_tarif(resultSet.getString("gol_tarif"));
                golTarif.setTarif(resultSet.getDouble("tarif"));
                golTarif.setJenis(resultSet.getString("jenis"));

                list.add(golTarif);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    public List<GolTarif> getDataByParameter(String sqlParam, String searchParam) {
        String sqlSelect = "SELECT * FROM m_gol_tarif WHERE " + sqlParam + " LIKE '%" + searchParam + "%'";
        Statement statement;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<GolTarif> list = new ArrayList<>();

            while (resultSet.next()) {
                GolTarif golTarif = new GolTarif();
                golTarif.setGol_tarif(resultSet.getString("gol_tarif"));
                golTarif.setTarif(resultSet.getDouble("tarif"));
                golTarif.setJenis(resultSet.getString("jenis"));

                list.add(golTarif);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    public void tambahData(GolTarif golTarif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ubahData(GolTarif golTarif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void hapusData(GolTarif golTarif) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}