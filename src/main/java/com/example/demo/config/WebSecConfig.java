package com.example.demo.config;

<<<<<<< HEAD
=======
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
>>>>>>> 1818c0192d2759f1098609d5ad9b6b0fdb4c06b3
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

<<<<<<< HEAD
=======
//	
>>>>>>> 1818c0192d2759f1098609d5ad9b6b0fdb4c06b3
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
<<<<<<< HEAD
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
		
=======
			.formLogin(login -> login // login setting starts from here
					.loginProcessingUrl("/login") // url where user/pw will send
					.loginPage("/login") // url for login page 
					.defaultSuccessUrl("/report", true)
					.failureUrl("/login?error")
					.permitAll() // login pageは未ログインでもアクセス可
					)
			.logout(logout -> logout
				//	.logoutSuccessUrl("/login")
					.permitAll()
					)
			.authorizeHttpRequests(requests -> requests // url毎のauthen設定開始
					.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll() // persmit for css/** etc
					.mvcMatchers("/login").permitAll() // urlかfile="/login"はloginなしでアクセス可 
					.mvcMatchers("/general").hasRole("GENERAL") //  url or fileが"/general"かその傘下の時はROLE_GENERALのみアクセスできる
					.mvcMatchers("/admin").hasRole("ADMIN") //  url or fileが"/admin"はROLE_ADMINのみアクセスできる　*autMatchersはurlのみ
					.anyRequest().authenticated()
					);
>>>>>>> 1818c0192d2759f1098609d5ad9b6b0fdb4c06b3
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
