//package com.example.demo.entity;
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//// User & PW を入力しuserが存在した時にその他をチェックできるクラス
//public class MyUserDetails implements UserDetails {
//
//	private static final long serialVersionUID = 1L;
//	private final Users user;
//	
//	
//	public MyUserDetails(Users user) {
//		this.user = user;
//	}
//
//	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getPassword() {
//		return user.getPassword();
//	}
//
//	@Override
//	public String getUsername() {
//		return user.getUsername();
//	}
//
////	Account is expired or not?
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
////	Account is unlocked or not?
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
////	account is valid or not?
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//}
