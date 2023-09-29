package in.ganesh.entity;

import java.sql.Blob;

import org.hibernate.engine.internal.AbstractEntityEntry;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@Table(name="employee_info")
public class EmployeeInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="location")
	private String location;
	
	@Lob
	@Column(length=0)
	private  byte[] img;

}
