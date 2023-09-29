package in.ganesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController
{

	@GetMapping("/")
	public ResponseEntity<String> wellcome()
	{	
		String res = "..........Wellocme.........Wellcome................Wellcome.........."; 
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}

	

	@GetMapping("/wellcome")
	public ResponseEntity<String> getwellcome()
	{	
		String res = "Wellocme to the This Word"; 
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}

	
	
    @GetMapping("/greet")
    public String grtMesg()
    {
    	return "Greet Message.......Greet Message.........Greet Message..";
    }
    
    
    @GetMapping("/gen")
    public ResponseEntity<String> genrateMsg(@RequestParam("fname") String fname,@RequestParam("lname") String lname)
    {
    	String msg = fname+" Wellcome in  "+lname+" empire";
    	
    	return new ResponseEntity<String>(msg,HttpStatus.OK);
    	
    }
}
