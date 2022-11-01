//package com.example.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.Report;
//
//@Service
//public class ReportService {
//
//	@Autowired
//	private ReportRepository reportRepository;
//	
//	public List<Report> findAll(){
//		return reportRepository.findAll();
//	}
//
//	public Report findOne(int id) {
//		return reportRepository.findOne(id);
//	}
//	
//	public Report save(Report report) {
//		return reportRepository.save(report);
//	}
//	
//	public void delete(int id) {
//		reportRepository.delete(id);
//	}
//}
