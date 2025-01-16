
package in.crm.service;

import in.crm.dao.crmDao;
import java.sql.ResultSet;

     public class CustomerEnquiryService
     {
                 // customer enquiry service 
     public boolean insertCustEnqService(String phoneno, String name, String interester_course, String discussion, String enquiry_type, int status_code, String enquiry_date, String enquiry_time, String emp_email)
     {
       boolean status = crmDao.insertCustEnqDao(phoneno, name, interester_course, discussion, enquiry_type, status_code, enquiry_date, enquiry_time, emp_email);   
       return  status;
     }
                  //  followup details service
     public boolean  insertOrUpdateFollowupService(String phoneno, String followup_date)
     {
           boolean status = crmDao.insertOrUpdateFollowupDetailsDao(phoneno, followup_date);
           return  status;
     }
               //followup details service
     public ResultSet getAllFollowupDetailsService(String date, String emp_email)
     {
        ResultSet rs = crmDao.getAllFollowupDetailsDao(date, emp_email);
         return  rs;
     }
                 //customer history service
     public ResultSet getFollowupHistoryService(String phoneno)
     {
       ResultSet rs = crmDao.getFollowupHistoryDao(phoneno);
         return  rs;
     }

      
      
     }
