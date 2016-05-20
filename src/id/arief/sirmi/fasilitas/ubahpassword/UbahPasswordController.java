package id.arief.sirmi.fasilitas.ubahpassword;

import id.arief.sirmi.database.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arief-asus
 */
public class UbahPasswordController {

    public void ubahPassword(Password password) {
        String sqlUpdate = "UPDATE t_user SET password = ? WHERE kode_karyawan = ? and password = ? ";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = Connection.getConnection().prepareStatement(sqlUpdate);
            preparedStatement.setString(1, password.getPassBaru());
            preparedStatement.setString(2, password.getKode_user());
            preparedStatement.setString(3, password.getPassLama());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UbahPasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isPassLamaBenar(String kodeUser, String password) {
        boolean isPassLamaBenar = false;
        String sql = "SELECT * from t_user WHERE kode_karyawan = '" + kodeUser + "' and password = '" + password + "'  ";
        Statement statement;
        ResultSet resultSet;

        try {
            statement = Connection.getConnection().createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet.first()) {
                isPassLamaBenar = true;
            } else {
                isPassLamaBenar = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UbahPasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isPassLamaBenar;
    }
}
