package in.ganesh.updated_disell_car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import in.ganesh.vechicle.Vechicle;

@Component
public class Updated_Diesel_Car
{
	 
   private Vechicle veh;
   @Autowired
   public void setVeh(Vechicle veh)
   {
	 this.veh = veh;
	 System.out.println("Setter method is called....");
	 System.out.println(veh.getClass());
   }



public void uDCFuel()
   {
	   veh.setFuelType();
   }
}
