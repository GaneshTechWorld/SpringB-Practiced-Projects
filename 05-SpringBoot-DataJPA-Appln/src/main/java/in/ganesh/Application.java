package in.ganesh;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.PlayerInfo;
import in.ganesh.repository.PlayerRepository;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext cac = SpringApplication.run(Application.class, args);
		PlayerInfo p1 = cac.getBean(PlayerInfo.class);
		PlayerRepository player = cac.getBean(PlayerRepository.class);
		
		p1.setPlayerId(25000);
		p1.setPalyer_name("Ganesh Chaudhary");
		p1.setPalyer_age(23);
		p1.setLocation("Muktainagar");
		
		
		player.save(p1);
		 
	}

}
