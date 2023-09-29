package in.ganesh.diesel;
import org.springframework.stereotype.Component;

import in.ganesh.vechicle.Vechicle;

@Component
public class DieselCar implements Vechicle
{
    public String setFuelType()
    {
    	return "set Fuel Type Diesel";
    }
}
