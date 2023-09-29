package in.ganesh.filter;

import org.apache.tomcat.websocket.WsFrameClient;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter
{

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
			/*
			http.authorizeHttpRequests()
		        .anyRequest()
			    .authenticated();
			http.formLogin();
			http.httpBasic();
			 */
		
			http.authorizeHttpRequests()
			    .antMatchers("/info/1345").authenticated()
			    .antMatchers("/balance/12345").authenticated()
			    .antMatchers("/contact").authenticated()
			    .antMatchers("/wellcome").permitAll();
		
		     http.formLogin();
			 http.httpBasic();
			System.out.println("sayli");
	}
}
