package in.ganesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.entity.Book;
import in.ganesh.entity.Booked;

@RestController
public class BookController
{
	@PostMapping(value = "/book",consumes = {"application/json"} ,produces = {"application/xml"})
	public ResponseEntity<Booked> getData(@RequestBody Book books)
	{
		System.out.println(books);
		Booked book1 = new Booked("Booked..","Money Recived Succesfully","Muktaianagr","123ACD34DE");
	
		return new ResponseEntity<>(book1,HttpStatus.OK);		
	}

}
