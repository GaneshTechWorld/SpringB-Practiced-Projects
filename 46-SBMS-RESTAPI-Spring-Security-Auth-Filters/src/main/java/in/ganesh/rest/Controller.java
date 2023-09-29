package in.ganesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller 
{
	@GetMapping("/wellcome")
	public String wlcmPage()
	{
		return "Wellcome to our bank application....";
	}
	
	
	@GetMapping("/balance/{num}")
	public String getBalance(@PathVariable(value="num")  Integer num)
	{
	   if(num == 12345)
		   return "Balance : 500 $";
	   else
		   return "Enter valid account number";
	}
	
	@GetMapping("/contact")
	public String getContacts()
	{
		return "contact on +91 1122223323 for any query..our team get solve your issue as soon as possible...";	
	}
	

	
	@GetMapping("/info/{num}")
	public String getCustInfo(@PathVariable(value="num")  int number)
	{
	   if(number == 12345)
		   return  "name : Ganesh Chaudhary/n"+" mob num :797252540\n"+"Address: Kaprata Tal: Desundit Dist: ammaltappa state : nagasuttri  Tappudita";
	   else
		   return "Enter valid account number";
	}

}


