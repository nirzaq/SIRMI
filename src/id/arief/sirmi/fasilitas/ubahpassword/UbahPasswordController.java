package id.arief.sirmi.fasilitas.ubahpassword;

import id.arief.sirmi.database.Connection;
import id.arief.sirmi.login.Login;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arief-asus
 */
public class UbahPasswordController {
    public Login ubahPassword(Login login) {
        String sqlUpdate = "UPDATE tb_user SET password = ? WHERE kode_user = ? ";
        PreparedStatement preparedStatement;
        
        try {
            preparedStatement = Connection.getConnection().prepareStatement(sqlUpdate);
            preparedStatement.setString(1, login.getPassword());
            preparedStatement.setString(2, login.getKode_user());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UbahPasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return login;
    }
}
