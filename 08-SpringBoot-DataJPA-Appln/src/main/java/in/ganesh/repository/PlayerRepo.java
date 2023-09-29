package in.ganesh.repository;


import in.ganesh.entity.PlayerInfo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface PlayerRepo  extends JpaRepository<PlayerInfo,Integer>
{
	//@Query(value = "From PlayerInfo")
	//public List<PlayerInfo> getAllUsers();
	
	//@Query(value = "From PlayerInfo where id=:num")
	//public List<PlayerInfo> getAllUserSql(Integer num);
	
	 //@Query(value = "select * from  player_info", nativeQuery = true)
	//public List<PlayerInfo> getAll();
	
	 //@Query(value = "select * from  player_info where id=:num", nativeQuery = true)
	 //public List<PlayerInfo> getAll(Integer num);
	
	 @Query(value = "From PlayerInfo where id=:id and age=:age")
	 public List<PlayerInfo> getUsers(Integer id,Integer age);
	
	
}
