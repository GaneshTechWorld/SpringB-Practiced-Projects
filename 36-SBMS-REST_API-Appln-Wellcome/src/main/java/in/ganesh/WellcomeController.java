package in.ganesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController 
{
	@Autowired
	private Environment env;
     
	 @GetMapping("/wellcome")
	  public String wlcmMessage()
	  {
		  String prt = env.getProperty("server.port");
		  
		  return "Wellcome in Bhole's World's........."+prt;
	  }
}
