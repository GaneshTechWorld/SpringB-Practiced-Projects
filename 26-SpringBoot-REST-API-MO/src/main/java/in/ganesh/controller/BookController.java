package in.ganesh.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.entity.Book;

@RestController
public class BookController 
{

	@GetMapping("/book")
	public ResponseEntity<List<Book>> getData()
	{
	  Book b1 = new Book("Bhagwat Gita",200,"Tulsidas",560);
	  Book b2 = new Book("GK",130,"Ganesh",160);
	  Book b3 = new Book("Machine Learning",400,"Sajal",1260);
	  Book b4 = new Book("AI",600,"Mayur",4200);
	
	  List<Book> books = Arrays.asList(b1,b2,b3,b4);
	   
	  return new ResponseEntity<>(books,HttpStatus.OK);
	}
}
