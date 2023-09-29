package in.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"in.kanta","in.ganesh"})//to represent base packages in our boot start class
public class Application {

	public static void main(String[] args)
	{
	   SpringApplication.run(Application.class, args);
	    
	}

}
