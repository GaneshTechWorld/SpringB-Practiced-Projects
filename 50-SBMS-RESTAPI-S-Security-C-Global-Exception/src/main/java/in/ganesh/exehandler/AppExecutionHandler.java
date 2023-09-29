package in.ganesh.exehandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ganesh.binding.ExceptionInfo;
import in.ganesh.exception.NoDataFoundException;

@RestControllerAdvice
public class AppExecutionHandler
{
	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<ExceptionInfo> excHandling(NoDataFoundException ex)
	{
	   ExceptionInfo exc = new ExceptionInfo();
	   exc.setCode("ABCD123WZ");
	   exc.setMsg(ex.getMessage());
	   
	   return  new  ResponseEntity<>(exc,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
