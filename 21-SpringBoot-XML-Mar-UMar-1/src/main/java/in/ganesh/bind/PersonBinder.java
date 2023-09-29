package in.ganesh.bind;

import java.io.File;

import org.glassfish.jaxb.runtime.v2.runtime.JAXBContextImpl.JAXBContextBuilder;
import org.springframework.stereotype.Component;

import in.ganesh.entity.Person;
import in.ganesh.entity2.EmployeeInfo;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;


public class PersonBinder 
{	
 public  static void main(String[] args) throws JAXBException   
{
	File xmlF = new File("Person.xml");
	JAXBContext cntx =  JAXBContext.newInstance(Person.class);
	Unmarshaller mrshl = cntx.createUnmarshaller();
	Object object = mrshl.unmarshal(xmlF);
	Person per = (Person)object;
    System.out.println(per);	
}
}
