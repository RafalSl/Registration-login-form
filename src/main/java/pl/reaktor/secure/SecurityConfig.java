package pl.reaktor.secure;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource datasource;
	
/*	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.jdbcAuthentication()
			.dataSource(datasource);
	}
	*/
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests() 
		.antMatchers("/").permitAll() 
		.antMatchers("/start").permitAll() 
        .antMatchers("/registration").permitAll() 
        .anyRequest().authenticated() 
       .and() 
       .formLogin(); 
	}
}
