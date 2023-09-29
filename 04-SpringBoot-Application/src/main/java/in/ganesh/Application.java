package in.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.updated_disell_car.Updated_Diesel_Car;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntx =   SpringApplication.run(Application.class, args);
		Updated_Diesel_Car car = cntx.getBean(Updated_Diesel_Car.class);
		
		car.uDCFuel();
	}

}
