package in.ganesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="MobileInfo")
@Data 
public class MobileInfo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mobID;
	
	@Column(name="Moblie_Name")
	private String mName;
	
	@Column(name="Mobile_Price")
	private Integer price;
}
