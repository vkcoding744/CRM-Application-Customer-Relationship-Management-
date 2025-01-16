

package in.crm.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;



public class DbConnection 
{
    public static  Connection getConnect()
    {
        Connection con = null;
        try
        {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_db","root","root");
                      
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return con;
    }
    
}
