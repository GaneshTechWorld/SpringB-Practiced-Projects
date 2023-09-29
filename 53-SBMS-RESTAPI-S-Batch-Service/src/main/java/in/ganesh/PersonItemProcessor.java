package in.ganesh;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PersonItemProcessor implements ItemProcessor<Person, Person>
{
	
	@Override
	public Person process(Person item) throws Exception 
	 {
		   String firstName = item.getFirstName();
		   String lastName = item.getLastName();
		   
		  Person tPerson = new  Person(firstName.toUpperCase(), lastName.toUpperCase());
		  
		return    tPerson;
	}

}
