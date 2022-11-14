package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.service.MyUserService;


@SuppressWarnings("deprecation")
@Configuration //	Identify DI container
@EnableWebSecurity //	Enable Spring Security
public class WebSecConfig extends WebSecurityConfigurerAdapter{

	private MyUserService userService;
	
	@Autowired
	public WebSecConfig(MyUserService userService) {
		this.userService = userService;
	}

//	Authorize for each URL path. URLの認証要否を確認
	 @Override
	public void configure(HttpSecurity http) throws Exception {
		 
		 http
		 	.authorizeRequests() //request時に認証必要か？
		 	.antMatchers("/js/**", "/css/**", "/loginForm").permitAll()
		 	.anyRequest().authenticated() //antMatchers以外は全て認証必要としてる
		 	.and()
		 	.formLogin()
		 	.loginPage("/login")
		 	.usernameParameter("username")
		 	.passwordParameter("password")
		 	.defaultSuccessUrl("/report", true)
		 	.failureUrl("/loginForm?error=true");
	 }
	 
//	 Getting user info. Needed to authenticate.
	 @Override
	 public void  configure(AuthenticationManagerBuilder auth) throws Exception {
		 auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
	 }

//	 making password Hash
	 public BCryptPasswordEncoder passwordEncoder() {
		 BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder(); 
		 return bcpe;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
