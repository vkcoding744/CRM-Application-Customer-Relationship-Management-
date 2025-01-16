

package in.crm.dao;

import in.crm.dbconnection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class crmDao 
{
    //login by matching details from database
    public static ResultSet loginDao(String email, String password)
    {    
        ResultSet rs=null;
        try 
        {
           Connection con = DbConnection.getConnect();      
            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
                     
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }     
              return  rs;
              
    }
           // insert register employee details in database
    public static boolean registerEmpDao(String name, String email, String pass, String phno)
    {
         boolean status = false;
        try 
        {
           Connection con = DbConnection.getConnect();      
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);
            ps.setString(4, phno);
           int count = ps.executeUpdate();
           
           if(count>0)
           {
               status=true;
           }
           else
           {
            status=false;
           }          
        } 
        catch (Exception e)
        {
            status = false;
            e.printStackTrace();
        }
           return status;
           
    }
                 // insert customer enquiry details in database
        public static boolean insertCustEnqDao(String phoneno, String name, String interester_course, String discussion, String enquiry_type, int status_code, String enquiry_date, String enquiry_time, String emp_email)
        {
              boolean status = false;
        try 
        {
           Connection con = DbConnection.getConnect();      
            PreparedStatement ps = con.prepareStatement("insert into customer_enquiry_details values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, phoneno);
            ps.setString(2, name);
            ps.setString(3, interester_course);
            ps.setString(4, discussion);
            ps.setString(5, enquiry_type);
            ps.setInt(6, status_code);
            ps.setString(7, enquiry_date);
            ps.setString(8, enquiry_time);
            ps.setString(9, emp_email);
        
           int count = ps.executeUpdate();
           
           if(count>0)
           {
            status = true;
           }
           else
           {
            status = false;
           }          
        } 
        catch (Exception e)
        {
       
            e.printStackTrace();
        }
          return status;
          
    }    
                         //insert or update followup details in database
         public static boolean insertOrUpdateFollowupDetailsDao(String phoneno, String followup_date)
        {
              boolean status = false;
        try 
        {
           Connection con1 = DbConnection.getConnect();      
            PreparedStatement ps1 = con1.prepareStatement("select * from followup_details where phoneno=?");
            ps1.setString(1, phoneno);
    
            ResultSet rs = ps1.executeQuery();
           
           if(rs.next())
           {               
                 //if data is already present
            Connection con2 = DbConnection.getConnect();  
            PreparedStatement ps2 = con2.prepareStatement("update followup_details set next_followup_date=? where phoneno=?");
            ps2.setString(1, followup_date);
            ps2.setString(2, phoneno);
            
           int count = ps2.executeUpdate();
           
           if(count>0)
           {
             status = true;
           }
           else
           {
              status = false;
           }          
           
            }
           else 
           {
              //if data is not present 
            Connection con2 = DbConnection.getConnect();  
            PreparedStatement ps2 = con2.prepareStatement("insert into followup_details values(?,?)");
            ps2.setString(1, phoneno);
            ps2.setString(2, followup_date);
         
           int count = ps2.executeUpdate();
           
           if(count>0)
           {
            status = true;
           }
           else
           {
            status = false;
           }        
           }
     
        } 
        catch (Exception e)
        {
       
            e.printStackTrace();
        }
          return status;
          
    }
         
            // get all followup Details from database
          public static ResultSet getAllFollowupDetailsDao(String date, String emp_email)
     {
         ResultSet rs=null;

        try 
        {
           Connection con = DbConnection.getConnect(); 
           
            PreparedStatement ps = con.prepareStatement("select ced.phoneno, ced.name from followup_details as fd inner join customer_enquiry_details as ced where fd.phoneno=ced.phoneno and next_followup_date=? and fd.emp_email=?");
            ps.setString(1, date);        
            ps.setString(2, emp_email);
             rs = ps.executeQuery();
             
       } 
        catch (Exception e)
        {
            rs = null;
            e.printStackTrace();
        }
               return  rs;
               
     }
          
               // get customer history from database
          public static ResultSet getFollowupHistoryDao(String phoneno)
     {
            ResultSet rs=null;

        try 
        {
           Connection con = DbConnection.getConnect(); 
           
            PreparedStatement ps = con.prepareStatement("select * from  customer_enquiry_details where phoneno=?");
            ps.setString(1, phoneno);        
             rs = ps.executeQuery();
             
       } 
        catch (Exception e)
        {
            rs = null;
            e.printStackTrace();
        }
               return  rs;
                 
}
          
          
          
}