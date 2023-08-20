package az.demo.smartcity.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebSecurity
@EnableWebMvc
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.csrf().disable().authorizeHttpRequests()
		.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		.requestMatchers(HttpMethod.POST, "/user-registration").permitAll()
		.requestMatchers(HttpMethod.GET, "/home").permitAll()
		.requestMatchers(HttpMethod.GET, "/").permitAll()
		.requestMatchers(HttpMethod.GET, "/login").permitAll()
		.anyRequest().authenticated().and().httpBasic();
		return http.build();
	}
	
	@Autowired
	private DataSource dataSource;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
	  throws Exception {
	    auth.jdbcAuthentication()
	      .dataSource(dataSource);
	}
	
}
