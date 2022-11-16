package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //	Identify DI container
@EnableWebSecurity //	Enable Spring Security
public class WebSecConfig{

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
			.authorizeHttpRequests((requests) -> requests
					.antMatchers("/login", "/css/**").permitAll()
					.anyRequest().authenticated()
					)
			.formLogin((form) -> form
					.loginPage("/login")
					.permitAll()
					.defaultSuccessUrl("/report", true)
					)
			.logout((logout) -> logout.permitAll());
		
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user =
				User.withDefaultPasswordEncoder()
					.username("email")
					.password("password")
					.roles("USER")
					.build();
		return new InMemoryUserDetailsManager(user);
					
	}

}
