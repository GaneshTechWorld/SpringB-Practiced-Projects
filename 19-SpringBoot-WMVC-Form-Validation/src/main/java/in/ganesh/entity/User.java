package in.ganesh.entity;
import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class User
{
	   @NotNull(message="id is required")
       private Integer id;
       
	   @NotEmpty(message="name is required...")
       private String name;
       
	   @Email(message="Enter mail peoperly")
       private String mail;
       
       private Integer age;
       
       private String mno;
}
