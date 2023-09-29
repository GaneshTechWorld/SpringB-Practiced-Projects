package in.ganesh;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.DoctorInfo;
import in.ganesh.repository.DoctorRepo;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
	ConfigurableApplicationContext cntx = 	SpringApplication.run(Application.class, args);
	DoctorRepo dr = cntx.getBean(DoctorRepo.class);
	
/*	DoctorInfo doct1 =  new DoctorInfo(1,"Dr.Ashok","Karki","ashok@gmail.com");
	dr.save(doct1);
	DoctorInfo doct2 =  new DoctorInfo(2,"Dr.Kushal","Karki","kushal@gmail.com");
	dr.save(doct2);
	DoctorInfo doct3 =  new DoctorInfo(3,"Dr.Mayur","Kumbharkheda","mayur@gmail.com");
	dr.save(doct3);

	DoctorInfo doct4 =  new DoctorInfo(4,"Dr.Surtik","Dhabe-Pimpri","surtik@gmail.com");
	DoctorInfo doct5 =  new DoctorInfo(5,"Dr.sagar","kotha","sagar@gmail.com");
	DoctorInfo doct6 =  new DoctorInfo(6,"Dr.ujjwal","nandurbar","ujjwal@gmail.com");
	DoctorInfo doct7 =  new DoctorInfo(7,"Dr.Amol","Shirur","kolhe@gmail.com");
	DoctorInfo doct8 =  new DoctorInfo(8,"Dr.raghunath","pune","raghu@gmail.com");
	DoctorInfo doct9 =  new DoctorInfo(9,"Dr.komal","anturli","komal@gmail.com");
	DoctorInfo doct10 =  new DoctorInfo(10,"Dr.manish","shirpur","manish@gmail.com");
	
	dr.saveAll(Arrays.asList(doct4,doct5,doct6,doct7,doct8,doct9,doct10));

    Optional<DoctorInfo> ls = dr.findById(1);
   
    List<DoctorInfo> list = dr.findByMail("ganesh@gmail.com");
 	list.listIterator();
	list.forEach(user ->
	{
		System.out.println(user);
	});

	 List<DoctorInfo> list =  dr.findByMailAndName("ganesh@gmail.com","ganesh");
	 list.forEach(user ->
	 {
 	    	System.out.println(user);
	 });
	 
	 List<DoctorInfo> list = dr.findByLocationOrName("Muktainagar","Ganesh");
	 list.forEach(user ->
	 {
 	    	System.out.println(user);
	 });
	 
	    dr.deleteById(3);
	 	System.out.println("Deleted..");

	
	 List<DoctorInfo> li = dr.findByLocationOrName("kotha","Dr.sagar");
	 li.forEach(user ->
	 {
 	    	System.out.println(user);
	 });

	
	System.out.println(dr.count());
	Iterable<DoctorInfo> lis = dr.findAll();
	lis.forEach(user ->{
		System.out.println(user);
	});
*/
	Iterable<DoctorInfo> li = dr.findAll();
	 li.forEach(a->
	 {
	    	System.out.println(a);
	 });
 } 	
}
