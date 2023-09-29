package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.dao.ReportDaoImpl;
import in.main.service.ReportServic;


@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
	ConfigurableApplicationContext obj	= SpringApplication.run(Application.class, args);
	ReportServic rs = obj.getBean(ReportServic.class);
	rs.generateReport();
	}

}
