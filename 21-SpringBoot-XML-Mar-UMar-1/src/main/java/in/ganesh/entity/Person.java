package in.ganesh.entity;


import in.ganesh.entity2.EmployeeInfo;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;


@Data
@XmlRootElement(name="Person")
public class Person
{
 
   private Integer id;
 
   private String name;
 
   private String address;
 
   private Integer age;
   
   private EmployeeInfo empinfo;
  
}
