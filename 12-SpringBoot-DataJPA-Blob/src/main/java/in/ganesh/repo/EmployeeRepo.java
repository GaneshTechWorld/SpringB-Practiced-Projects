package in.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.ganesh.entity.EmployeeInfo;

public interface EmployeeRepo extends JpaRepository<EmployeeInfo,Integer>
{

}
