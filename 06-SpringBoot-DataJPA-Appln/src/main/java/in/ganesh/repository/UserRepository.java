package in.ganesh.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.ganesh.entity.UserInfo;

public interface UserRepository  extends CrudRepository<UserInfo,Integer>
{
	public List<UserInfo> findByUser_id(Integer user_id);
   
}