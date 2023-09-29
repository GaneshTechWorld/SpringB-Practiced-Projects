package in.ganesh.users;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class UserAuthentication extends WebSecurityConfigurerAdapter
{
   @Override
   protected void configure(AuthenticationManagerBuilder auth) throws Exception 
   {
		/*
		 * // TODO Auto-generated method stub super.configure(auth);
		 */
	     auth.inMemoryAuthentication()
	          .withUser("ashok").password("ashok@123").authorities("admin").and()
	          .withUser("ganesh").password("ganesh@123").authorities("admin").and()
	          .withUser("nikita").password("nikita@123").authorities("read").and()
	          .passwordEncoder(NoOpPasswordEncoder.getInstance());
   }
	 
}
