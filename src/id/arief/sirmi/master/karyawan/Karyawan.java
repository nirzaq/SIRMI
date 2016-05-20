package id.arief.sirmi.master.karyawan;

import java.util.Date;

/**
 *
 * @author arief-asus
 */
public class Karyawan {
    String kodeKaryawan;
    String namaKaryawan;
    Date tanggalLahirKaryawan;
    String kontakKaryawan;

    public String getKodeKaryawan() {
        return kodeKaryawan;
    }

    public void setKodeKaryawan(String kodeKaryawan) {
        this.kodeKaryawan = kodeKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public Date getTanggalLahirKaryawan() {
        return tanggalLahirKaryawan;
    }

    public void setTanggalLahirKaryawan(Date tanggalLahirKaryawan) {
        this.tanggalLahirKaryawan = tanggalLahirKaryawan;
    }

    public String getKontakKaryawan() {
        return kontakKaryawan;
    }

    public void setKontakKaryawan(String kontakKaryawan) {
        this.kontakKaryawan = kontakKaryawan;
    }
    
    
}
