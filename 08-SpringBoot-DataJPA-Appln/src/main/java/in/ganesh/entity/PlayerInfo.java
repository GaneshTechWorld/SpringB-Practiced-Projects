package in.ganesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Table
public class PlayerInfo 
{
	@Id
	private Integer id;
    
    private String name;
    
    private Integer age;
    
    private String location;
    
    private String country;
}
