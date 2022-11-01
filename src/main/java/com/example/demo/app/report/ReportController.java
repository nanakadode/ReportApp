package com.example.demo.app.report;

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
		String sql = "SELECT * FROM report_table";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		model.addAttribute("ReportList", list);
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
		String sql = "INSERT INTO report_table(ttle, content) VALUES(?,?);";
		jdbcTemplate.update(sql, reportForm.getTitle(), reportForm.getContent());
		return "redirect:/report";
	}
	
//	Edit form page(display)
	@GetMapping("/edit/{id}")
	public String edit(@ModelAttribute ReportForm reportForm, @PathVariable int id) {
		
		String sql = "SELECT * FROM report_table WHERE id = " + id;
		Map<String, Object> map = jdbcTemplate.queryForMap(sql);
		reportForm.setId((int)map.get("id"));
		reportForm.setTitle((String)map.get("title"));
		reportForm.setContent((String)map.get("content"));
		return "report/edit";
	}
	
//	Edit form page(save)
	@PostMapping("/edit/{id}")
	public String update(ReportForm reportForm, @PathVariable int id) {
		String sql = "UPDATE report_table SET title = ?, content = ? WHERE id = " + id;
		jdbcTemplate.update(sql, reportForm.getTitle(), reportForm.getContent());
		return "redirect:/report/index";
	}
	
//	delete 
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		String sql = "DELETE from report_table WHERE id = " + id;
		jdbcTemplate.update(sql);
		return "redirect:/report/index";
	}
	
	
}
