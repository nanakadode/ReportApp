//package com.example.demo.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.MyUserDetails;
//import com.example.demo.entity.Users;
//import com.example.demo.repository.UserAccountDao;
//
//@Service
//public class MyUserService implements UserDetailsService {
//
//	private final UserAccountDao dao;
//	
//	@Autowired
//	public MyUserService(UserAccountDao dao) {
//		this.dao = dao;
//	}
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		Optional<Users> user = dao.findUser(username); 
//		if(!user.isPresent()) {
//			throw new UsernameNotFoundException(username + " is not found");
//		}
////		userが取得できた場合はMyUserDetailクラスとして返す
//		return new MyUserDetails(user.get());
//	}
//
//}
