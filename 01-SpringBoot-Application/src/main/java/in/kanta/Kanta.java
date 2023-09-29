package in.kanta;

import org.springframework.stereotype.Component;

@Component   
public class Kanta   //not subpackage so obj not created  
{
public Kanta() {
	System.out.println("Kanta Constructor..........");
}
}
