package com.example.demo.app.report;

import javax.validation.constraints.NotNull;

public class ReportForm {

	
	private int id;
	@NotNull
	private String title;
	@NotNull
	private String content;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
