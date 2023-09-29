package in.ganesh.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
public class AccountPK  implements Serializable
{
	

	private String holder_name;
	
	
	private String aano;
	
	
	private String acc_no;
	
}
