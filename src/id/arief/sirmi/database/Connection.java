package id.arief.sirmi.database;

import com.sun.media.jfxmedia.logging.Logger;
import id.arief.sirmi.util.MessageUtil;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author arief-asus
 */
public class Connection {
    
    private static java.sql.Connection connection;

    public static java.sql.Connection getConnection() throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_sirmi";
        String user = "root";
        String password = "";
        if(connection == null) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch(ClassNotFoundException | SQLException error) {
                MessageUtil.showErrorMessage("Tidak terkoneksi dengan database, hubungi Admin", null);
                System.out.println("Tidak Terkoneksi Dengan Database  : \n& "+error);
            }
        }
        return connection;
    }   
}