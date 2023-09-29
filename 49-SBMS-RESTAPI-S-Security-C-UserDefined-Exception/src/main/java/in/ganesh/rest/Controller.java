package in.ganesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.binding.ExceptionInfo;
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
	
	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<ExceptionInfo> excHandling(NoDataFoundException ex)
	{
	   ExceptionInfo exc = new ExceptionInfo();
	   exc.setCode("ABCD123WZ");
	   exc.setMsg(ex.getMessage());
	   
	   return  new  ResponseEntity<>(exc,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
