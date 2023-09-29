package in.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ganesh.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>
{
     
}
