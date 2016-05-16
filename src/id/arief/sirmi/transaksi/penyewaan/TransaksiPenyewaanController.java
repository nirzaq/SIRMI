package id.arief.sirmi.transaksi.penyewaan;

import id.arief.sirmi.transaksi.penyewaan.carimobil.TarifMobil;
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
public class TransaksiPenyewaanController {

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
                penyewaan.getKode_transaksi();

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
        String sqlSelect = "SELECT a.kode_mobil, a.nama_mobil, a.merk_mobil, a.nopol_mobil, a.jenis_mobil, a.tahun_pembuatan, b.tarif, b.jenis, c.gol_tarif, c.status FROM m_mobil as a join m_gol_tarif as b join t_tarif_mobil as c WHERE a.kode_mobil = c.kode_mobil AND c.gol_tarif = b.gol_tarif AND b.jenis = '" + jenisTarif + "' AND c.status ='AV'";
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
                
                list.add(tarifMobil);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }
    
    
}
