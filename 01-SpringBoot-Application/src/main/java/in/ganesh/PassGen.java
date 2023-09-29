package in.ganesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PassGen 
{
	public PassGen()
	{
	  System.out.println("Password Generator.....");
    }
	
	@Bean     //to customized object creation
	public PassGen passGenGetObj()
	{
		PassGen obj = new PassGen();
		return obj;
	}
}
