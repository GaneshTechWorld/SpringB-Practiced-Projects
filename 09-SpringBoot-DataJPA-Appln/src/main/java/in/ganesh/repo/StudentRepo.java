package in.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.ganesh.entity.StudentInfo;

public interface StudentRepo extends JpaRepository<StudentInfo, Integer>
{
   
}
