package in.ganesh.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.exception.NoDataFoundException;

@RestController
public class Controller
{
   
	@GetMapping("/getname/{id}")
	public String getBookInfo(@PathVariable String id)
	{
		String msg = "";
		
		if(id.equals("ABCD123"))
		msg =  "Price is : 450$";
		else
	     throw new NoDataFoundException("Bhaiya Id sahi dalo..please");
		
		return msg;
	}
	
	
}
