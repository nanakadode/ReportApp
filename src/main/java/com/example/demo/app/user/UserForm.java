package com.example.demo.app.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserForm {

	private int id;
	@NotNull
	private String username;
	@NotNull
	@Size(min=6, max=8)
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
