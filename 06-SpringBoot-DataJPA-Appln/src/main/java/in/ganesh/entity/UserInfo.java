package in.ganesh.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Component
@Entity
@Table(name="USERINFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo
{
	@Id
	@Column(name="UID")
	@Getter
	private Integer user_id;
	
	@Column(name="UNAME")
	private String user_name;
	
	@Column(name="ULOCATION")
	private String user_location;
	
	@Column(name="UMAIL")
	private String user_mail;
	
	@Column(name="UMNO")
	private String user_mno;
	
}
