package in.ganesh.greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.wlcm.WellcomeContC;

@RestController
public class GreetController 
{
	@Autowired
	private  WellcomeContC obj;
	
	@GetMapping("/greet")
	public String getGreetMessage()
	{
		String msg = obj.getWellcomeMsg();
		String end =  "greet greet greet.........";
		
		return msg+end;
	}

}
