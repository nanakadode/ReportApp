//package com.example.demo.app.user;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//	private JdbcTemplate jdbcTemplate;
//	
////	constructor
//	@Autowired
//	public UserController(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//	
////	index 
//	@GetMapping
//	public String index(Model model) {
//		String sql = "SELECT * FROM users";
//		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
//		model.addAttribute("userList", list);
//		return "user/index";
//	}
//	
////	new
//	@GetMapping("/form")
//	public String form(@ModelAttribute UserForm userForm) {
//		return "user/form";
//	}
//	
////	new(save)
//	@PostMapping("/form")
//	public String create(UserForm userForm) {
//		String sql = "INSERT INTO users(username, password) VALUES(?,?);";
//		jdbcTemplate.update(sql, userForm.getUsername(), userForm.getPassword());
//		return "redirect:/report";
//	}
//	
//}
