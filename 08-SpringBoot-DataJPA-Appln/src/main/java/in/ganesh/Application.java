package in.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.PlayerInfo;
import in.ganesh.repository.PlayerRepo;

@SpringBootApplication
public class Application
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext cntx = SpringApplication.run(Application.class, args);
		PlayerRepo repo = cntx.getBean(PlayerRepo.class);
		 
	   /*	 
	    PlayerInfo p1 =  new PlayerInfo(1,"swami",21,"karki","India");
		PlayerInfo p7 =  new PlayerInfo(7,"samul",23,"sukai","India");
		PlayerInfo p8 = new	PlayerInfo(8,"gaju",23,"dhabe","India"); 
		PlayerInfo p9 = new PlayerInfo(9,"sarf",28,"dhaka","Bangla");
		PlayerInfo p10 = new PlayerInfo(10,"pankaj",34,"kotha","India");
		repo.saveAll(Arrays.asList(p1,p7,p8,p9,p10));
		
		List<PlayerInfo> list =  repo.getAllUserSql(1);
		list.forEach(user -> {
			System.out.printf(user.getName() +"\t\t"+user.getLocation() +"\t\t"+ user.getCountry() );
			System.out.println();
		});
		
		List<PlayerInfo> list =  repo.getAll(1);
		list.forEach(user -> {
			System.out.printf(+user.getId()+"\t\t"+user.getName() +"\t\t"+user.getLocation() +"\t\t"+ user.getCountry());
			System.out.println();
		});
		
*/
		
		List<PlayerInfo> list =  repo.getUsers(10,34);
		list.forEach(user -> {
			System.out.printf(user.getId()+"\t\t"+user.getAge()+"\t\t"+user.getName() +"\t\t"+user.getLocation() +"\t\t"+ user.getCountry());
			System.out.println();
		});
			
			
   }
}
