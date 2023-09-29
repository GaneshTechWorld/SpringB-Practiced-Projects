package in.ganesh.service;

import java.io.File;
import org.springframework.dao.DataIntegrityViolationException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.SQLException;
import  org.hibernate.exception.DataException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.pattern.color.BoldBlueCompositeConverter;
import in.ganesh.entity.EmployeeInfo;
import in.ganesh.repo.EmployeeRepo;

@Service
public class EmployeeService  
{
	@Autowired
	private  EmployeeRepo repo;
	
    
    public  void saveData() throws Exception
    {
    	//String path ="F:\\ID.jpg"; 
        EmployeeInfo emp1 = new EmployeeInfo();
        emp1.setLocation("Muk");
        emp1.setName("Ganesh");
        File file = new File("F:\\ID.jpg");
        System.out.println("1");
         byte[]picInBytes = new byte[(int)(file.length())];                        //new byte[(int) (4*file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read();
        fileInputStream.close();
        System.out.println("2");
        emp1.setImg(picInBytes);
        
        repo.save(emp1);
    }
}
