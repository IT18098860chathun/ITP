
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chame
 */
public class DBconnect {
    
    
    public static Connection connect()
    {
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbuni","root","c1234");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
         
        return conn;
    }
    
    
}

