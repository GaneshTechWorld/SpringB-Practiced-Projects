package in.ganesh;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.CrudRepository;

import in.ganesh.entity.MobileInfo;
import in.ganesh.repo.MobileRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
	ConfigurableApplicationContext cntx =	SpringApplication.run(Application.class, args);
	MobileRepo repo = 	cntx.getBean(MobileRepo.class);
	/*
	MobileInfo mob1 = new MobileInfo();
	mob1.setMName("Redmi");  
	mob1.setPrice(10000);
	repo.save(mob1);
    
	MobileInfo mob2 = new MobileInfo();
	mob2.setMName("Samsung");  
	mob2.setPrice(7000);
	repo.save(mob2);
	
	MobileInfo mob3 = new MobileInfo();
	mob3.setMName("Micromax");  
	mob3.setMobID(null);
	mob3.setPrice(1000);
	repo.save(mob3);
    
	MobileInfo mob4 = new MobileInfo();
	mob4.setMobID(null);
	mob4.setMName("Jio");  
	mob4.setPrice(6500);
	repo.save(mob4 );
	*/
	MobileInfo mob7 = new MobileInfo();
	mob7.setMName("Karke");  
	mob7.setPrice(100000);
	repo.save(mob7);
    
	
	}

}
