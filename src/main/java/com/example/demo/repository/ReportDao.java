package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Report;

public interface ReportDao {

	List<Report> getAll();

	List<Report> findList();
	
	
}
