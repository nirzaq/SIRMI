package id.arief.sirmi.master.karyawan;

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
public class KaryawanController {

    public List<Karyawan> getData() {
        String sqlSelect = "SELECT * FROM m_karyawan";
        Statement statement;
        ResultSet resultSet;

        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<Karyawan> list = new ArrayList<>();

            while (resultSet.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setKodeKaryawan(resultSet.getString("kode_karyawan"));
                karyawan.setNamaKaryawan(resultSet.getString("nama_karyawan"));
                karyawan.setTanggalLahirKaryawan(resultSet.getDate("tanggal_lahir"));
                karyawan.setKontakKaryawan(resultSet.getString("kontak_karyawan"));

                list.add(karyawan);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }

    }

    public List<Karyawan> getKaryawanByParameter(String sqlParameter, String searchParameter) {
        String sqlSelect = "SELECT * FROM m_karyawan WHERE " + sqlParameter + " LIKE '%" + searchParameter + "%'";
        Statement statement = null;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<Karyawan> list = new ArrayList<>();

            while (resultSet.next()) {

                Karyawan karyawan = new Karyawan();
                karyawan.setKodeKaryawan(resultSet.getString("kode_karyawan"));
                karyawan.setNamaKaryawan(resultSet.getString("nama_karyawan"));
                karyawan.setTanggalLahirKaryawan(resultSet.getDate("tanggal_lahir"));
                karyawan.setKontakKaryawan(resultSet.getString("kontak_karyawan"));

                list.add(karyawan);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    public void tambahData(Karyawan karyawan) {
        try {
            String sqlTambah = "INSERT INTO m_karyawan VALUES (?,?,?,?,?)";
            PreparedStatement ps;
            ps = Connection.getConnection().prepareStatement(sqlTambah);
            ps.setString(1, null);
            ps.setString(2, karyawan.getKodeKaryawan());
            ps.setString(3, karyawan.getNamaKaryawan());
            ps.setString(4, karyawan.getTanggalLahirKaryawan().toString());
            ps.setString(5, karyawan.getKontakKaryawan());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ubahData(Karyawan karyawan) {
        try {
            String sqlTambah = "UPDATE m_karyawan set nama_karyawan = ?, tanggal_lahir = ?, kontak_karyawan = ? WHERE kode_karyawan = ?";
            PreparedStatement ps;
            ps = Connection.getConnection().prepareStatement(sqlTambah);
            ps.setString(4, karyawan.getKodeKaryawan());
            ps.setString(1, karyawan.getNamaKaryawan());
            ps.setString(2, karyawan.getTanggalLahirKaryawan().toString());
            ps.setString(3, karyawan.getKontakKaryawan());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteKaryawan(String kodeKaryawan) {
        try {
            String sql = "DELETE from m_karyawan WHERE kode_karyawan = ?";
            PreparedStatement ps;
            ps = Connection.getConnection().prepareStatement(sql);
            ps.setString(1, kodeKaryawan);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean cekKaryawan(String kodeKaryawan, String tanggalLahir, String namaKaryawan) {
        boolean adaKaryawan = false;
        String sql_cek = "SELECT * FROM m_karyawan WHERE kode_karyawan = '" + kodeKaryawan + "' OR tanggal_lahir = '" + tanggalLahir + "' AND  nama_karyawan= '" + namaKaryawan + "'";
        Statement statement;
        ResultSet resultSet;

        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sql_cek);
            if (resultSet.first()) {
                adaKaryawan = true;
            } else {
                adaKaryawan = false;
            }

        } catch (SQLException ex) {
            adaKaryawan = false;
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return adaKaryawan;
    }

}