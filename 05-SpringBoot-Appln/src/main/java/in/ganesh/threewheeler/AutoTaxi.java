package in.ganesh.threewheeler;

import org.springframework.stereotype.Component;

import in.ganesh.vechicle.Vechicle;

@Component
public class AutoTaxi  implements Vechicle
{
	@Override
	public String setTyreNumbers()
	{
		return "Tyres numbers are 3";
	}
	
	
    public String setFuelType() 
    {
	  return "Fuel type is gas only";
    }
	

}
