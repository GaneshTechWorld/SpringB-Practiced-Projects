package in.ganesh.service;

import java.util.List;

import in.ganesh.entity.Book;

public interface BookService
{
	public String  upSertBook(Book book);
	
	public List<Book> getAllBooks();
	
	public String deleteBook(Integer bookID);
	

}
