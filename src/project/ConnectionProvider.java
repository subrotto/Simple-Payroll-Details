
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionProvider {
    public static Connection getCon()
    {
        try { 
             Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","");
      return con;
        
        
        }
        catch(ClassNotFoundException | SQLException e) 
        {
         System.out.println(e); 
         return null;
        }
        
        
    }
}
