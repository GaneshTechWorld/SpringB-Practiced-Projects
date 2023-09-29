package in.ganesh.wellcomeController;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController
{

	@GetMapping("/wellcome")
	public ResponseEntity<String> wellcome()
	{	
		String res = "Wellocme to thec Bhole's World"; 
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}

    @GetMapping("/greet")
    public String grtMesg()
    {
    	return "Shree Shivay Namosthubhuyam......Har Har Mahadev";
    }
    
    @GetMapping("/gen")
    public ResponseEntity<String> genrateMsg(@RequestParam("fname") String fname,@RequestParam("lname") String lname)
    {
    	String msg = fname+" Wellcome in  "+lname+" empire";
    	
    	return new ResponseEntity<String>(msg,HttpStatus.OK);
    	
    }
}
