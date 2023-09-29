package in.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.pulsor.Pulsor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		 ConfigurableApplicationContext obj = SpringApplication.run(Application.class, args);
	     Pulsor pls = obj.getBean(Pulsor.class);
	     
	     pls.pulsorInfo();
	}

}
