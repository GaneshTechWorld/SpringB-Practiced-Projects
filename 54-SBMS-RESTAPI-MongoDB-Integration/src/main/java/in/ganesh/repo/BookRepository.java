package in.ganesh.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.ganesh.entity.Book;
import java.util.List;


public interface BookRepository extends MongoRepository<Book,String> 
{

	public Book  findByBookId(Integer bookId);
}
