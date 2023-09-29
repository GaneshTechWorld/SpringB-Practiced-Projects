package in.ganesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.entity.Employee;

@RestController
public class EmployeeController 
{
	@GetMapping("/emp")
	public ResponseEntity<Employee> getData()
	{
		Employee emp = new Employee();  		
		emp.setAge(23);
		emp.setEmpId("ABC2345DT");
		emp.setEmpName("Ganesh");
		emp.setLocation("Muktainagar");
		
		
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
}
