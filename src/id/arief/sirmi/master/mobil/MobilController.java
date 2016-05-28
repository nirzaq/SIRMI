package id.arief.sirmi.master.mobil;

import id.arief.sirmi.database.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arief-asus
 */
public class MobilController {

    public List<Mobil> getMobil() throws Exception {
        String sqlSelect = "SELECT * FROM m_mobil";
        Statement statement;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<Mobil> list = new ArrayList<>();

            while (resultSet.next()) {
                Mobil mobil = new Mobil();
                mobil.setKode_mobil(resultSet.getString("kode_mobil"));
                mobil.setNama_mobil(resultSet.getString("nama_mobil"));
                mobil.setMerk_mobil(resultSet.getString("merk_mobil"));
                mobil.setNopol_mobil(resultSet.getString("nopol_mobil"));
                mobil.setJenis_mobil(resultSet.getString("jenis_mobil"));
                mobil.setTahun_pembuatan(resultSet.getString("tahun_pembuatan"));

                list.add(mobil);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    public List<Mobil> getMobilByParameter(String sqlParameter, String searchParameter) throws Exception {
        String sqlSelect = "SELECT * FROM m_mobil WHERE " + sqlParameter + " LIKE '%" + searchParameter + "%'";
        Statement statement = null;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<Mobil> list = new ArrayList<>();

            while (resultSet.next()) {
                Mobil mobil = new Mobil();
                mobil.setKode_mobil(resultSet.getString("kode_mobil"));
                mobil.setNama_mobil(resultSet.getString("nama_mobil"));
                mobil.setMerk_mobil(resultSet.getString("merk_mobil"));
                mobil.setNopol_mobil(resultSet.getString("nopol_mobil"));
                mobil.setJenis_mobil(resultSet.getString("jenis_mobil"));
                mobil.setTahun_pembuatan(resultSet.getString("tahun_pembuatan"));
                list.add(mobil);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    System.out.println("Terjadi kesalahan : " + exception);
                }
            }
        }

    }

    public void tambahMobil(Mobil mobil) {
        try {
            String sql_tambah = "INSERT INTO m_mobil VALUES (?,?,?,?,?,?)";
            PreparedStatement ps;
            ps = Connection.getConnection().prepareStatement(sql_tambah);
            ps.setString(1, mobil.getKode_mobil());
            ps.setString(2, mobil.getNama_mobil());
            ps.setString(3, mobil.getMerk_mobil());
            ps.setString(4, mobil.getNopol_mobil());
            ps.setString(5, mobil.getJenis_mobil());
            ps.setString(6, mobil.getTahun_pembuatan());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MobilController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void UbahMobil(Mobil mobil) {

        try {
            String sql_ubah = "UPDATE m_mobil set nama_mobil=?,merk_mobil=?,nopol_mobil=?,jenis_mobil=?,tahun_pembuatan=? WHERE kode_mobil=?";
            PreparedStatement ps = Connection.getConnection().prepareStatement(sql_ubah);

            ps.setString(1, mobil.getNama_mobil());
            ps.setString(2, mobil.getMerk_mobil());
            ps.setString(3, mobil.getNopol_mobil());
            ps.setString(4, mobil.getJenis_mobil());
            ps.setString(5, mobil.getTahun_pembuatan());
            ps.setString(6, mobil.getKode_mobil());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MobilController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMobil(String kodeMobil) {

        try {
            String sqlDelete = "DELETE FROM m_mobil WHERE kode_mobil = ?";
            PreparedStatement ps;
            ps = Connection.getConnection().prepareStatement(sqlDelete);
            ps.setString(1, kodeMobil);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MobilController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean cekMobil(String nopol) {
        boolean adaMobil = false;
        String sql_cek = "SELECT * FROM m_mobil WHERE nopol_mobil = '" + nopol + "'";
        Statement statement;
        ResultSet resultSet;

        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sql_cek);
            if (resultSet.first()) {
                adaMobil = true;
            } else {
                adaMobil = false;

            }

        } catch (SQLException ex) {
            Logger.getLogger(MobilController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return adaMobil;
    }

    public boolean cekNopol(String nopol, String kodeMobil) {
        boolean adaMobil = false;
        String sql_cek = "SELECT * FROM m_mobil WHERE nopol_mobil = '" + nopol + "' AND kode_mobil != '" + kodeMobil + "'";
        Statement statement;
        ResultSet resultSet;

        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sql_cek);
            if (resultSet.first()) {
                adaMobil = true;
            } else {
                adaMobil = false;

            }

        } catch (SQLException ex) {
            Logger.getLogger(MobilController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return adaMobil;
    }

    public String idMobil() {
        String idMobil = null;
        try {

            String sql = "SELECT MAX(right(kode_mobil,3)) AS no FROM m_mobil";
            Statement statement = Connection.getConnection().createStatement();

            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                if (resultSet.first() == false) {
                    idMobil = "001";
                } else {
                    resultSet.last();
                    int autoid = resultSet.getInt(1) + 1;
                    String nomor = String.valueOf(autoid);
                    int noLong = nomor.length();

                    for (int a = 0; a < 3 - noLong; a++) {
                        nomor = "0" + nomor;
                    }
                    idMobil = nomor;

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MobilController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return idMobil;
    }

    public boolean isMobilRent(String kodeMobil) {
        
        boolean isMobilRent = false;
        String sql_cek = "SELECT * FROM t_tarif_mobil WHERE kode_mobil ='" + kodeMobil + "' AND status = 'NA'";
        Statement statement;
        ResultSet resultSet;

        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sql_cek);
            isMobilRent = resultSet.first();

        } catch (SQLException ex) {
            Logger.getLogger(MobilController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isMobilRent;
    }

}
