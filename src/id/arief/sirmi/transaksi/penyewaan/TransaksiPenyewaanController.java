package id.arief.sirmi.transaksi.penyewaan;

import id.arief.sirmi.transaksi.penyewaan.carimobil.TarifMobil;
import id.arief.sirmi.database.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author arief-asus
 */
public class TransaksiPenyewaanController {
    String kode_transaksi;
    public List<Penyewaan> getData() {
        String sqlSelect = "";
        Statement statement;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<Penyewaan> list = new ArrayList<>();

            while (resultSet.next()) {
                Penyewaan penyewaan = new Penyewaan();
                //penyewaan.getKode_transaksi();

                list.add(penyewaan);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    public List<TarifMobil> getTarifMobil(String jenisTarif) {
        String sqlSelect = "SELECT a.kode_mobil, a.nama_mobil, a.merk_mobil, a.nopol_mobil, a.jenis_mobil, a.tahun_pembuatan, b.tarif, b.jenis, c.kode_tarif, c.gol_tarif, c.status FROM m_mobil as a join m_gol_tarif as b join t_tarif_mobil as c WHERE a.kode_mobil = c.kode_mobil AND c.gol_tarif = b.gol_tarif AND b.jenis = '" + jenisTarif + "' AND c.status ='AV'";
        Statement statement;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<TarifMobil> list = new ArrayList<>();

            while (resultSet.next()) {
                TarifMobil tarifMobil = new TarifMobil();
                tarifMobil.setKode_mobil(resultSet.getString("kode_mobil"));
                tarifMobil.setNama_mobil(resultSet.getString("nama_mobil"));
                tarifMobil.setMerk_mobil(resultSet.getString("merk_mobil"));
                tarifMobil.setNopol(resultSet.getString("nopol_mobil"));
                tarifMobil.setJenis_mobil(resultSet.getString("jenis_mobil"));
                tarifMobil.setTahun(resultSet.getString("tahun_pembuatan"));
                tarifMobil.setTarif(resultSet.getDouble("tarif"));
                tarifMobil.setJenis(resultSet.getString("jenis"));
                tarifMobil.setGol_tarif(resultSet.getString("gol_tarif"));
                tarifMobil.setStatus(resultSet.getString("status"));
                tarifMobil.setKodeTarif(resultSet.getInt("kode_tarif"));

                list.add(tarifMobil);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    public String tambahTransaksiSewa(Penyewaan penyewaan) {
        String sql = "INSERT INTO t_penyewaan VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement;
        String kodeTransaksi;
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
            Date date = new Date();
            String time = dateFormat.format(date);
            kode_transaksi = "TS"+time;
            
            preparedStatement = Connection.getConnection().prepareStatement(sql);
            penyewaan.setKodeTransaksi("TS" + time);
            preparedStatement.setString(1, penyewaan.getKodeTransaksi());
            preparedStatement.setInt(2, penyewaan.getKodeTarif());
            preparedStatement.setString(3, penyewaan.getNama());
            preparedStatement.setString(4, penyewaan.getAlamat());
            preparedStatement.setString(5, penyewaan.getTelp());
            preparedStatement.setString(6, penyewaan.getJaminan());
            preparedStatement.setString(7, penyewaan.getTglJamKeluar());
            preparedStatement.setString(8, penyewaan.getTglJamKembali());
            preparedStatement.setDouble(9, penyewaan.getBiayaSewa());
            preparedStatement.setString(10, penyewaan.getTanggalTransaksi());
            preparedStatement.setString(11, penyewaan.getKodeKaryawan());
            preparedStatement.executeUpdate();

            kodeTransaksi = penyewaan.getKodeTransaksi();

            return kodeTransaksi;
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan Pada TambahTransaksiSewa Error : " + e);
            return null;
        }
    }

    public void setStatusMobilNA(String kodeMobil) {
        String sql = "UPDATE t_tarif_mobil SET status = 'NA' WHERE kode_mobil = ?";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = Connection.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, kodeMobil);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiPenyewaanController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public JasperPrint cetakNotaSewa(String namaReport) {
        try {
            Penyewaan penyewaan = new Penyewaan();
            
            penyewaan.setPathReport("./report/");
            penyewaan.setSourceReport(penyewaan.getPathReport()+"templates/"+namaReport+".jrxml");
            penyewaan.setResultReport(penyewaan.getPathReport()+"result/"+namaReport+".html");

            HashMap hashMap = new HashMap();
            hashMap.put("kodeTransaksi", kode_transaksi);
            
            
            JasperReport jasperReport = JasperCompileManager.compileReport(penyewaan.getSourceReport());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, Connection.getConnection());
            JasperExportManager.exportReportToHtmlFile(jasperPrint, penyewaan.getResultReport());
            return jasperPrint;
        } catch(JRException | SQLException exception) {
            System.out.println("Terjadi kesalahan :" + exception);
            return null;
        }
    }

}
