package in.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.ganesh.entity.CourseInfo;

public interface CourseRepo  extends JpaRepository<CourseInfo,Integer>
{

}
