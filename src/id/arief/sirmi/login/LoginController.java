package id.arief.sirmi.login;

import id.arief.sirmi.database.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author arief-asus
 */
public class LoginController {

    /**
     *
     * @param username
     * @param password
     * @return Login
     * @throws Exception
     */
    public Login getLoginDanHakAkses(String username, String password) throws Exception {

        String sqlSelect = "SELECT * FROM t_user WHERE username = '" + username + "' AND password = '" + password + "'";
        Statement statement;
        ResultSet resultSet;

        try {

            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sqlSelect);
            Login login = new Login();

            if (resultSet.next()) {
                login.setKode_karyawan(resultSet.getString("kode_karyawan"));
                login.setUsername(resultSet.getString("username"));
                login.setKategori_user(resultSet.getString("hak_akses"));
                System.out.print(login.getKategori_user());
            } else {
                login.setKode_karyawan("TIDAK ADA");
            }
            resultSet.close();
            return login;
        } catch (SQLException exception) {
            System.out.println("Terjadi kesalahan : " + exception);
            return null;
        }
    }
}
