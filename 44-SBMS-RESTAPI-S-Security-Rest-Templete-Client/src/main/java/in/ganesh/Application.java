package in.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.client.GetMessage;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		 ConfigurableApplicationContext cntx =   SpringApplication.run(Application.class, args);
	    GetMessage msg = cntx.getBean(GetMessage.class);
	    msg.getMsg();
	}

}
