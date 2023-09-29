package in.ganesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="StudentInfo")
public class StudentInfo 
{
  @Id
  @Column(name="id")
  private Integer id;
  
  @Column(name="name")
  private String name;
  
  @Column(name="location")
  private String location;
  
  @Column(name="mail")
  private String mail;
  
  @Column(name="age")
  private Integer age;
  
}
