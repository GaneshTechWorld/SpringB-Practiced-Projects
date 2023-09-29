package in.ganesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WlcmController 
{
	@GetMapping("/wellcome")
	public String wlcmMessage()
	{
		String msg = "Wellcome To Java World's..........";
		
		return msg;
	}

}
