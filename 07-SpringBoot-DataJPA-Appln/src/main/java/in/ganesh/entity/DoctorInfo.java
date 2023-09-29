package in.ganesh.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
@Table(name="DoctorInfo")
public class DoctorInfo
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
}
