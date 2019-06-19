package bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/tfsdb?verifyServerCertificate=false&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DB_USSERNAME = "root";
    private static final String DB_PASSWORD = "roott";

    public Connection getConnection(){
    Connection connection = null;
    try {
        Class.forName(DB_DRIVER);
        connection = DriverManager.getConnection(DB_URL, DB_USSERNAME, DB_PASSWORD);
        System.out.println("Connection OK");
    } catch (ClassNotFoundException | SQLException e){
        e.printStackTrace();
        System.out.println("Connection ERROR");
        }
    return connection;
    }
}
