package in.ganesh.repository;

import org.springframework.data.repository.CrudRepository;

import in.ganesh.entity.DoctorInfo;
import java.util.List;
import java.util.Optional;


public interface DoctorRepo extends CrudRepository<DoctorInfo,Integer> 
{
   public  Optional<DoctorInfo> findById(Integer id);
   public  List<DoctorInfo> findByMail(String mail);
   public  List<DoctorInfo> findByMailAndName(String mail ,String name);
   public  List<DoctorInfo> findByLocationOrName(String location, String name);
   public Iterable<DoctorInfo> findAll(); 
}
