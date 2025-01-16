
package in.crm.helper;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;


public class SuccessDialog 
{
    public static void openSuccessDialog(JRootPane rootPane, String  success_message)
    {
        JOptionPane.showMessageDialog(rootPane, success_message);
    }
    
}
