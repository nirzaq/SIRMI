package id.arief.sirmi.master.user;

import id.arief.sirmi.database.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arief-asus
 */
public class UserController {

    public List<User> getData() {
        String sqlSelect = "SELECT * FROM t_user WHERE username != 'Admin'";
        Statement statement;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<User> list = new ArrayList<>();

            while (resultSet.next()) {
                User user = new User();
                user.setKode_user(resultSet.getString("kode_user"));
                user.setUsername(resultSet.getString("username"));
                user.setHakAkses(HakAkses.valueOf(resultSet.getString("hak_akses")));
                list.add(user);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    public List<User> getDataByParameter(String sqlParam, String searchParam) {
        String sqlSelect = "SELECT * FROM t_user WHERE " + sqlParam + " LIKE '%" + searchParam + "%' AND username != 'Admin'";
        Statement statement = null;
        ResultSet resultSet;
        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);

            List<User> list = new ArrayList<>();

            while (resultSet.next()) {
                User user = new User();
                user.setKode_user(resultSet.getString("kode_user"));
                user.setUsername(resultSet.getString("username"));
                user.setHakAkses(HakAkses.valueOf(resultSet.getString("hak_akses")));
                list.add(user);
            }
            resultSet.close();
            return list;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }

    public void tambahData(User user) {
        try {
            String sql_tambah = "INSERT INTO t_user VALUES (?,?,?,?)";
            PreparedStatement ps;
            ps = Connection.getConnection().prepareStatement(sql_tambah);
            ps.setString(1, null);
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getHakAkses().toString());
            ps.executeUpdate();
        } catch (SQLException ex) {

        }
    }

    public void ubahData(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void hapusData(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
