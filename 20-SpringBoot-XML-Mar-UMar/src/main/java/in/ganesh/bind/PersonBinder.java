package in.ganesh.bind;

import java.io.File;

import org.glassfish.jaxb.runtime.v2.runtime.JAXBContextImpl.JAXBContextBuilder;
import org.springframework.stereotype.Component;

import in.ganesh.entity.Person;
import in.ganesh.entity2.EmployeeInfo;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


public class PersonBinder 
{	
 public  static void main(String[] args) throws JAXBException   
{
	EmployeeInfo emp = new EmployeeInfo();
	emp.setEmpid("qscsewee3re2");
	emp.setEdu("B.Tech");
	emp.setClocation("Pune");
	
	Person p1 = new Person();
	p1.setId(101);
	p1.setAge(23);
	p1.setName("Ganesh Chaudahry");
	p1.setAddress("Dhabe");
	p1.setEmpinfo(emp);
	

	JAXBContext cntx =  JAXBContext.newInstance(Person.class);
	Marshaller mrshl = cntx.createMarshaller();
	mrshl.marshal(p1,new File("Person.xml"));
    System.out.println("File Created Succesfully...............");	
}
}
