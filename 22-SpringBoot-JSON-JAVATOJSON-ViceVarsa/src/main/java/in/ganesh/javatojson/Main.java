package in.ganesh.javatojson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ganesh.entity.Author;
import in.ganesh.entity.Book;

public class Main
{
   public static void main(String[] args) throws StreamWriteException, DatabindException, IOException
   {
	 Author aut1 = new Author();
	 aut1.setAutAddress("Kanpur");
	 aut1.setAutAge(78);
	 aut1.setAutEducation("M.Tech Comp");
	 aut1.setAutName("Ganesh Chaudhary");
	 
	 Book b1 = new Book();
	 b1.setId("ABC1234C");
	 b1.setName("MachineL");
	 b1.setPages(456);
	 b1.setInfo(aut1);
	 
	 ObjectMapper mapper = new ObjectMapper();
 	 mapper.writeValue(new File("Book.json"), b1);
 	   
 	 System.out.println("Completed ......");
   }
}
