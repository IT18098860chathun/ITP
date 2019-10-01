
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_connection {

    public static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

private String url = "jdbc:mysql://localhost:3306/pbuni";
private String user = "root";
private String password = "c1234";
private String driver = "com.mysql.cj.jdbc.Driver";
private Connection connection;

public db_connection(){
    
}

public Connection getConnection() throws ClassNotFoundException,SQLException{
    Class.forName(driver);
    connection = DriverManager.getConnection(url, user, password);
    System.out.println("DB connected");
    return connection;
}
}