//package com.example.demo.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.entity.Report;
//
//@Repository
//public class ReportDaoImpl implements ReportDao {
//
//	private JdbcTemplate jdbcTemplate;
//	
//	
//	public ReportDaoImpl(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//
//	@Override
//	public List<Report> getAll() {
//		
//		String sql = "SELECT * FROM report";
////		GET by Map
//		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
////		empty list for return
//		List<Report> list = new ArrayList<>();
////		Insert data into report
//		for(Map<String, Object> result : resultList) {
//			
//		}
//		return list;
//		
//	}
//	
////	@Override
////	public List<Report> findList() {
////		
////		
////	}
//
//}
