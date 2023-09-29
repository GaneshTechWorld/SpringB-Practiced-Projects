package in.ganesh.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController
{
	@GetMapping("/book/{name}")
	public ResponseEntity<String>  getBookData(@PathVariable("name") String name)
	{
		String res = name+" Book is very good ,please read it";
		
	   return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	
	@GetMapping("/book/{name}/{authName}")
	public ResponseEntity<String>  getBookData(@PathVariable("name") String nme,@PathVariable("authName") String anme)
	{
		String res = nme+" Book is very good ,please read it."+anme+"wrote it with pure intension and in simple words..";
		
	   return new ResponseEntity<String>(res,HttpStatus.OK);
	}
}
