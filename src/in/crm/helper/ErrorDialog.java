
package in.crm.helper;

import in.crm.admin.*;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;


public class ErrorDialog 
{
    public static void openErrorDialog(JRootPane rootPane, String  error_message, String error_title)
    {
        JOptionPane.showMessageDialog(rootPane, error_message,error_title,JOptionPane.ERROR_MESSAGE);
    }
}
