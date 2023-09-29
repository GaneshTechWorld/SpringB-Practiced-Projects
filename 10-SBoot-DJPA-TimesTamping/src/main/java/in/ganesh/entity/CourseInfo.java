package in.ganesh.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
 @NoArgsConstructor
 @AllArgsConstructor
@Table(name="CourseInfo")
public class CourseInfo 
{
	@Id
    private Integer id;
	
	@Column(name="cName")
    private String cName;
	
	@Column(name="price")
    private Integer price;
	
	@Column(name="sName")
    private String sName;
	
	@Column(name="duration")
    private Integer duration;
	
	@CreationTimestamp
	@Column(name="Creation_Time",updatable = false)
	private LocalDateTime tim;
	
	@UpdateTimestamp
	@Column(name="Updation_Time",insertable = false)
	private LocalDateTime udt;
	
}
