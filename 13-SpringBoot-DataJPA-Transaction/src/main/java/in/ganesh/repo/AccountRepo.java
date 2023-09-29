package in.ganesh.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import in.ganesh.entity.Account;
import in.ganesh.entity.AccountPK;

public interface AccountRepo extends JpaRepositoryImplementation<Account,AccountPK> 
{

}
