package com.example.demo.entity;

//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Table(name="users")
//@Entity
public class Users {

	private int id;
	private String username;
	private String password;
	private String email;
//	private boolean enabled;
//	private String authorityId;
//	private String tempkey;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public boolean isEnabled() {
//		return enabled;
//	}
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
//	public String getAuthorityId() {
//		return authorityId;
//	}
//	public void setAuthorityId(String authorityId) {
//		this.authorityId = authorityId;
//	}
//	public String getTempkey() {
//		return tempkey;
//	}
//	public void setTempkey(String tempkey) {
//		this.tempkey = tempkey;
//	}
}
