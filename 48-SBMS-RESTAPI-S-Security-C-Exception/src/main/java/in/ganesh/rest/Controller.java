package in.ganesh.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.binding.ExceptionInfo;

@RestController
public class Controller
{
	private Logger logger = LoggerFactory.getLogger(Controller.class);
	@GetMapping("/wellcome")
    public String getWlcmMsg()
    {  
		try
		{
    	int num = 10/0;
		}
        catch(ArithmeticException ex)
        {
          throw new  ArithmeticException(ex.getMessage());
          //logger.error("error Occured :"+ ex,ex);	
          //ex.printStackTrace(); 	
        }
    	return "Wellcome........Wellcome.............Wellcome.........Wellcome...........Wellcome...........Wellcome";
    }
	
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> excHandling(ArithmeticException ex)
	{
	   ExceptionInfo exc = new ExceptionInfo();
	   exc.setCode("ABCD123WZ");
	   exc.setMsg(ex.getMessage());
	   
	   return  new  ResponseEntity<>(exc,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
