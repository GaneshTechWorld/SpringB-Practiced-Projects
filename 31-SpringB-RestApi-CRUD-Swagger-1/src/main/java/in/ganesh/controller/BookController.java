
package in.ganesh.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import in.ganesh.entity.Book;
import in.ganesh.service.BookService;

@RestController
public class BookController 
{
	
	@Autowired
	private BookService bkservice;

	
	@PostMapping("/addbook")
	public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		String msg =  bkservice.upSertBook(book);	
		return new  ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	
	
	@PostMapping("/updatebook")
	public ResponseEntity<String> updateBook(@RequestBody Book book)
	{
		String msg =  bkservice.upSertBook(book);	
		return new  ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getbook")
	public ResponseEntity<List<Book>> getBooksData()
	{
		List<Book> lis = bkservice.getAllBooks();
		return new ResponseEntity<>(lis,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/book/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id)
	{
		String msg = bkservice.deleteBook(id);
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
		
}
