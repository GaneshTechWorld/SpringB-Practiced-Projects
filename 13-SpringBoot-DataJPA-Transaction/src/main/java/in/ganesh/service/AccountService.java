package in.ganesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ganesh.entity.Account;
import in.ganesh.entity.AccountPK;
import in.ganesh.repo.AccountPKRepo;
import in.ganesh.repo.AccountRepo;

@Service
public class AccountService
{
	private AccountRepo acc;
	
	     
         public AccountService(AccountRepo  acc)
        {
        	 this.acc= acc;
        	
		}
         
         public void saveData()
         {   
        	 Account ac1 = new Account();
        	 AccountPK p1 = new AccountPK();
        	 
        	 p1.setAcc_no("4938698757");
        	 p1.setAano("359503110269");
        	 p1.setHolder_name("Ganesh Chaudhary"); 
        	
             ac1.setCountry("India");
             ac1.setAcc_type("Saving");
             ac1.setAddress("Muktainagar");
             ac1.setKeys(p1);
             
             acc.save(ac1);
         }
}
