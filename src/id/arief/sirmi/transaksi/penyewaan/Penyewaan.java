package id.arief.sirmi.transaksi.penyewaan;

/**
 *
 * @author arief-asus
 */
public class Penyewaan {
    String kode_transaksi;
    String nama_penyewa;
    String alamat;
    String telp;
    JenisSewa jenisSewa;
    String kode_mobil_sewa;
    Jaminan jaminan;
    int lama_hari_sewa;

    public String getKode_transaksi() {
        return kode_transaksi;
    }

    public void setKode_transaksi(String kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    public String getNama_penyewa() {
        return nama_penyewa;
    }

    public void setNama_penyewa(String nama_penyewa) {
        this.nama_penyewa = nama_penyewa;
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

    public JenisSewa getJenisSewa() {
        return jenisSewa;
    }

    public void setJenisSewa(JenisSewa jenisSewa) {
        this.jenisSewa = jenisSewa;
    }

    public String getKode_mobil_sewa() {
        return kode_mobil_sewa;
    }

    public void setKode_mobil_sewa(String kode_mobil_sewa) {
        this.kode_mobil_sewa = kode_mobil_sewa;
    }

    public Jaminan getJaminan() {
        return jaminan;
    }

    public void setJaminan(Jaminan jaminan) {
        this.jaminan = jaminan;
    }

    public int getLama_hari_sewa() {
        return lama_hari_sewa;
    }

    public void setLama_hari_sewa(int lama_hari_sewa) {
        this.lama_hari_sewa = lama_hari_sewa;
    }
    
    
}
