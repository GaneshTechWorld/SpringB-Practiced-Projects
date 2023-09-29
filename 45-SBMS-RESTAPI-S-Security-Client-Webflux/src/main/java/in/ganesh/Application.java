package in.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.webclinet.GetMessage;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext cntx = 	SpringApplication.run(Application.class, args);
	GetMessage obj = cntx.getBean(GetMessage.class);
	obj.getWlcmMessage();
	}

}
