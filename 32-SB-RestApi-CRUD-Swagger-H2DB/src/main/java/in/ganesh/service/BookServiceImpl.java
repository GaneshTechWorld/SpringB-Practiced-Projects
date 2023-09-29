package in.ganesh.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import in.ganesh.entity.Book;
import in.ganesh.repository.BookRepository;

@Service
public class BookServiceImpl  implements BookService
{
	
	private BookRepository repo;
	
	
	public BookServiceImpl(BookRepository repo)
	{
		this.repo = repo;
	}
	
	
    @Override
    public String upSertBook(Book book)
    {
    	Integer bookID = book.getBookID();
    	 repo.save(book);
    	if(bookID == null)
    	{
    		return "inseted succesfully...";
    	}
    	else
    	{
    		return "Updated succesfully...";
    	}
    }
    
    @Override
    public List<Book> getAllBooks() 
    {
    	List<Book> lis = repo.findAll(); 
    	
    	return lis;
    }
	
    
    @Override
    public String deleteBook(Integer bookID)
    {
    	repo.deleteById(bookID);
    	return "Deleted Succesfully...........";
    }
}

