package id.arief.sirmi.transaksi.penyewaan;

import java.sql.Date;

/**
 *
 * @author arief-asus
 */
public class Penyewaan {
    String kodeTransaksi;
    int kodeTarif;
    String nama;
    String alamat;
    String telp;
    String jaminan;
    String tglJamKeluar;
    String tglJamKembali;
    Double biayaSewa;
    int lamaSewa;
    String tanggalTransaksi;
    String kodeKaryawan;
    String kodeMobil;
    
    private String pathReport;
    private String resultReport;
    private String sourceReport;

    public String getPathReport() {
        return pathReport;
    }

    public void setPathReport(String pathReport) {
        this.pathReport = pathReport;
    }

    public String getResultReport() {
        return resultReport;
    }

    public void setResultReport(String resultReport) {
        this.resultReport = resultReport;
    }

    public String getSourceReport() {
        return sourceReport;
    }

    public void setSourceReport(String sourceReport) {
        this.sourceReport = sourceReport;
    }
    
    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public int getKodeTarif() {
        return kodeTarif;
    }

    public void setKodeTarif(int kodeTarif) {
        this.kodeTarif = kodeTarif;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getJaminan() {
        return jaminan;
    }

    public void setJaminan(String jaminan) {
        this.jaminan = jaminan;
    }

    public String getTglJamKeluar() {
        return tglJamKeluar;
    }

    public void setTglJamKeluar(String tglJamKeluar) {
        this.tglJamKeluar = tglJamKeluar;
    }

    public String getTglJamKembali() {
        return tglJamKembali;
    }

    public void setTglJamKembali(String tglJamKembali) {
        this.tglJamKembali = tglJamKembali;
    }

   

    public Double getBiayaSewa() {
        return biayaSewa;
    }

    public void setBiayaSewa(Double biayaSewa) {
        this.biayaSewa = biayaSewa;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getKodeKaryawan() {
        return kodeKaryawan;
    }

    public void setKodeKaryawan(String kodeKaryawan) {
        this.kodeKaryawan = kodeKaryawan;
    }

    public String getKodeMobil() {
        return kodeMobil;
    }

    public void setKodeMobil(String kodeMobil) {
        this.kodeMobil = kodeMobil;
    }
}