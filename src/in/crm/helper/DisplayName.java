
package in.crm.helper;

import java.sql.ResultSet;
import javax.swing.JLabel;


public class DisplayName 
{
    public static void displayName(ResultSet rs, JLabel j1)
    {
         try
        {
        String name = rs.getString("name");
        j1.setText(name);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
