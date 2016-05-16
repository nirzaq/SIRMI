/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.arief.sirmi.master.user;

/**
 *
 * @author arief-asus
 */
public class User {
    String kode_user;
    String username;
    String password;
    HakAkses hakAkses;

    public String getKode_user() {
        return kode_user;
    }

    public void setKode_user(String kode_user) {
        this.kode_user = kode_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HakAkses getHakAkses() {
        return hakAkses;
    }

    public void setHakAkses(HakAkses hakAkses) {
        this.hakAkses = hakAkses;
    }
}
