package in.ganesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.entity.Book;
import in.ganesh.repo.BookRepository;

@RestController
public class BookController 
{
    @Autowired
    private BookRepository repo;
    
    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book book)
    {
    	System.out.println("Swami");
         repo.save(book);
         return new  ResponseEntity<>("Book Saved",HttpStatus.OK);
    }
    
    @GetMapping("/books")
    public List<Book> books()
    {
        
        return repo.findAll();
    }
    
    @GetMapping("/book/{bookId}")
    public Book books(@PathVariable Integer bid)
    {
        
        return  repo.findByBookId(bid);
    }
}
