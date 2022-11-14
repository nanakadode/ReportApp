package com.example.demo.app.report;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/report")
public class ReportController {

	private JdbcTemplate jdbcTemplate;
	
//	constructor
	@Autowired
	public ReportController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
//	index page
	@GetMapping
	public String index(Model model) {
		String sql = "SELECT * FROM report";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		model.addAttribute("reportList", list);
		return "report/index";
	}
	
//	new register page
	@GetMapping("/form")
	public String form(@ModelAttribute ReportForm reportForm) {
		return "report/form";
	}
	
	
//	save new data
	@PostMapping("/form")
	public String create(ReportForm reportForm) {
		String sql = "INSERT INTO report(title, content, report_date) VALUES(?,?,?);";
		jdbcTemplate.update(sql, reportForm.getTitle(), reportForm.getContent(), reportForm.getReportDate());
		return "redirect:/report";
	}
	
//	Edit form page(edit)
	@GetMapping("/edit/{id}")
	public String edit(@ModelAttribute ReportForm reportForm, @PathVariable int id) {
		
		String sql = "SELECT * FROM report WHERE id = " + id;
		Map<String, Object> map = jdbcTemplate.queryForMap(sql);
		reportForm.setId((int)map.get("id"));
		reportForm.setTitle((String)map.get("title"));
		reportForm.setContent((String)map.get("content"));
		reportForm.setReportDate((LocalDate)map.get("reportDate"));
		return "report/edit";
	}
	
//	Edit form page(update)
	@PostMapping("/edit/{id}")
	public String update(
//			ReportForm reportForm, 
			@ModelAttribute ReportForm reportForm, 
			@PathVariable int id
	) {
		String sql = "UPDATE report SET title = ?, content = ?, report_date = ? WHERE id = " + id;
		jdbcTemplate.update(sql, reportForm.getTitle(), reportForm.getContent(), reportForm.getReportDate());
		return "redirect:/report";
	}
	
//	delete 
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		String sql = "DELETE from report WHERE id = " + id;
		jdbcTemplate.update(sql);
		return "redirect:/report";
	}
	
	
}
