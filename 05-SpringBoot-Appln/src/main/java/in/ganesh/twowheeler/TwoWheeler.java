package in.ganesh.twowheeler;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import in.ganesh.vechicle.Vechicle;

@Component("main")
//@Primary
public class TwoWheeler implements Vechicle
{
	public String setFuelType()
	{
		return "Fuel Type is Petrol Only";
	}
	   
	public String  setTyreNumbers()
	{
		return "Number of tyres are two only..are";
	}
}