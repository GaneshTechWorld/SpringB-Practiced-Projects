package in.ganesh;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ganesh.entity.StudentInfo;
import in.ganesh.repo.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
	 ConfigurableApplicationContext cntx = 	SpringApplication.run(Application.class, args);
	 StudentRepo repo = cntx.getBean(StudentRepo.class);
	 /*
	 StudentInfo stud1 = new StudentInfo(1,"Nikita","Karki","nikita@gmail.com",26);
	 StudentInfo stud2 = new StudentInfo(2,"Sanika","Kotha","sanu@gmail.com",26);
	 StudentInfo stud3 = new StudentInfo(3,"Bhumika","Dhule","bhumi@gmail.com",26);
	 StudentInfo stud4 = new StudentInfo(4,"Khushi","Dhabe","kushi@gmail.com",26);
	 StudentInfo stud5 = new StudentInfo(5,"Pari","Pimpri","pari@gmail.com",26);
	 StudentInfo stud6 = new StudentInfo(6,"Mayuri","Thane","mayu@gmail.com",26);
	  
	 repo.saveAll(Arrays.asList(stud1,stud2,stud3,stud4,stud5,stud6));
	
	 List<StudentInfo>  lis =   repo.findAll();
	 lis.forEach(user ->{
		 System.out.println(user);
	 });
	 
	 StudentInfo stud7 = new StudentInfo(7,"Riddhu","cham","riddhua@gmail.com",26);
	 StudentInfo stud8 = new StudentInfo(8,"Siddhui","gam","siddhu@gmail.com",26);
	 StudentInfo stud9 = new StudentInfo(9,"Kaddu","Dum","kaddu@gmail.com",26);
	 StudentInfo stud10 = new StudentInfo(10,"Soni","Pum","soni@gmail.com",26);
	 StudentInfo stud11 = new StudentInfo(11,"Moni","Nar","moni@gmail.com",26);
	 StudentInfo stud12 = new StudentInfo(12,"Tono","Esr","tono@gmail.com",26);
	 
	 repo.saveAll(Arrays.asList(stud7,stud8,stud9,stud10,stud11,stud12));
	 
	 List<StudentInfo>  lis =   repo.findAll(Sort.by("id").descending());
	 lis.forEach(user ->{
		 System.out.println(user);
	 });
	
	 PageRequest pReq = PageRequest.of(3,3);
     Page<StudentInfo>  pageData =   repo.findAll(pReq);
	 List<StudentInfo> lis = pageData.getContent();
	 lis.forEach(user ->{
		 System.out.println(user);
	 }); 
	  */
	  StudentInfo entity = new StudentInfo();
	  entity.setId(12);
	  Example<StudentInfo> exmple = Example.of(entity);
	  List<StudentInfo> lis = repo.findAll(exmple);
	  lis.forEach(user ->{
		 System.out.println(user);
	 }); 
	 
	 
	}

}
