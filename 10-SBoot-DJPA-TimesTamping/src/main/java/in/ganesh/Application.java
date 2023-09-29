package in.ganesh;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.CourseInfo;
import in.ganesh.repo.CourseRepo;

@SpringBootApplication
public class Application
{
	public static void main(String[] args) 
	{
	  ConfigurableApplicationContext cntx =  SpringApplication.run(Application.class, args);
	
	  CourseRepo repo =  cntx.getBean(CourseRepo.class);
	  CourseInfo  c1 = new CourseInfo();
	  c1.setId(2021);
	  c1.setPrice(3400);
	  c1.setSName("Core Java");
	  c1.setDuration(30);
	  CourseInfo  c2 = new CourseInfo();
	  c2.setId(1050);
	  c2.setPrice(4500);
	  c2.setSName("Core Python");
	  c2.setDuration(25);
	  
	  repo.saveAll(Arrays.asList(c1,c2));
	 
	}

}
