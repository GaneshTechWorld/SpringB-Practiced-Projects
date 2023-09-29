package in.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.ganesh.entity.MobileInfo;

public interface MobileRepo  extends JpaRepository<MobileInfo, Integer>
{

}
