package in.ganesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Account")
@Entity
@Data   @NoArgsConstructor
public class Account 
{
	@Column(name="acc_type")
	private String acc_type;
	
	@Column(name="address")
	private String address;

	@Column(name="country")
	private String  country;

	@EmbeddedId
	private AccountPK keys;
}
