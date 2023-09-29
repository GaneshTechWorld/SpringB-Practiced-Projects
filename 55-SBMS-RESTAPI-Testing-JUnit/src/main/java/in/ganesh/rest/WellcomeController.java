package in.ganesh.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.wlcm.Wellcome;

@RestController
public class WellcomeController 
{
    @Autowired 
	private Wellcome obj;
	
	@GetMapping("/getmsg")
	public String wlcmMessage()
	{
		String msg  = obj.getMessage();	
		return msg;
	}
	
}
