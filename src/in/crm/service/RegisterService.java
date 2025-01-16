
package in.crm.service;

import in.crm.dao.crmDao;



public class RegisterService 
{
    public boolean registerEmpService(String name, String email, String pass, String phno)
    {
       boolean status = crmDao.registerEmpDao(name, email, pass, phno);
        
         return status;
    }
    
}
