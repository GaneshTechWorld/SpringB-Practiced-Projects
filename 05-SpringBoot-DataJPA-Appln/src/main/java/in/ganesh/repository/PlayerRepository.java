package in.ganesh.repository;
import org.springframework.data.repository.CrudRepository;

import in.ganesh.entity.PlayerInfo;

public interface PlayerRepository  extends CrudRepository<PlayerInfo,Integer>
{

}
