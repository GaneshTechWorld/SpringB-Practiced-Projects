package in.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.Account;
import in.ganesh.service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
	ConfigurableApplicationContext cntx = 	SpringApplication.run(Application.class, args);
	AccountService service = cntx.getBean(AccountService.class);
	service.saveData();
	}

}
