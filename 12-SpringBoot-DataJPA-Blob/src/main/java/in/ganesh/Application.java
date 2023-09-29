package in.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.EmployeeInfo;
import in.ganesh.repo.EmployeeRepo;
import in.ganesh.service.EmployeeService;

@SpringBootApplication
public class Application
{

	public static void main(String[] args) throws Exception
	{
	  ConfigurableApplicationContext cntx = SpringApplication.run(Application.class, args);
	  EmployeeService srv =  cntx.getBean( EmployeeService.class);
	  srv.saveData();
	}

}
