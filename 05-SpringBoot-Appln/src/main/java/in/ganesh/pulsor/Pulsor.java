package in.ganesh.pulsor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.ganesh.vechicle.Vechicle;



@Component
public class Pulsor 
{
	private Vechicle veh;

	@Autowired
	@Qualifier("main")
	public void setVeh(Vechicle veh)
	{
		this.veh = veh;
		System.out.println("Setter method is called....");
		System.out.println("veh class is : "+veh.getClass());
	}
	/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "in.ganesh.vechicle.Vechicle.setFuelType()" because "this.veh" is null
	at in.ganesh.pulsor.Pulsor.pulsorInfo(Pulsor.java:24)
	at in.ganesh.Application.main(Application.java:17)
	*/
	
	/*
	@Autowired
	public void setVeh(Vechicle veh)
	{
		this.veh = veh;
		System.out.println("Setter method is called....");
		System.out.println("veh class is : "+veh.getClass());
	}
	*/
	
	
	//  if only single constructor is their then no need to write @Autowird ,if non param constructor is also their then compiler get confused so need to write @Autowird
	/*@Autowired
	public Pulsor(Vechicle veh)
	{
		this.veh = veh;
	}
	*/
	
	public void pulsorInfo()
	{
		System.out.println(veh.setFuelType());
		System.out.println(veh.setTyreNumbers());
	}
	
	
}
