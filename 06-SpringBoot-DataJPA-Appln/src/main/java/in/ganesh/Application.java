package in.ganesh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.UserInfo;
import in.ganesh.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
	  ConfigurableApplicationContext  cntx = 	SpringApplication.run(Application.class, args);
	  UserRepository repo = cntx.getBean(UserRepository.class);
	  
	   /*
	   UserInfo user1 = new UserInfo(01,"Ganesh","Muktainagar","ganesh@gmail.com","7972525440");
	   repo.save(user1);
	   UserInfo user2 = new UserInfo(02,"kundan","Chopda","kundan@gmail.com","12345678");
	   repo.save(user2);
	   
	   UserInfo user3 = new UserInfo(03,"Sayli","Muktainagar","sayli@gmail.com","748569123");
	   UserInfo user4 = new UserInfo(04,"Krushna","Nepanagar","krushna@gmail.com","7925440");
	   UserInfo user5 = new UserInfo(05,"sahil","dhule","sahil@gmail.com","12345678");
	   UserInfo user6 = new UserInfo(06,"Akshay","Kothali","akshay@gmail.com","1234500678");
	   
	   UserInfo user7 = new UserInfo(07,"Atul","Karki","atul@gmail.com","74125896");
	   UserInfo user8 = new UserInfo(8,"Pranay","Naygaon","pranay@gmail.com","015440");
	   UserInfo user9 = new UserInfo(9,"Swapnil","khamkheda","swapnil@gmail.com","123458098");
	   UserInfo user10 = new UserInfo(10,"Eaknath","Bhusawal","eknath@gmail.com","128890343");
	   	  
       repo.saveAll(Arrays.asList(user7,user8,user9,user10));
	  
	  List<UserInfo> ls = repo.findByUser_mno("7972525440");
		
	   ls.forEach(u ->{
		   System.out.println(u);
	   });
	   */
	  
	}

}
