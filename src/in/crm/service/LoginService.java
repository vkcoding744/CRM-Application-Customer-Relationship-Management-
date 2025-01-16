/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.crm.service;

import in.crm.dao.crmDao;
import java.sql.ResultSet;



public class LoginService 
{
   
   //creating method
    public ResultSet loginService(String email, String password)
    {        
        ResultSet rs = crmDao.loginDao(email, password);
        return  rs;
    }
}
