package com.example.testproj.controller;
import com.example.testproj.dao.EmployeeRepo;
import com.example.testproj.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
//	@PostMapping("/saveEmployee")
//	public List<Employee> saveEmployee(@RequestBody Employee employee) {
//		System.out.println(employee.getClass().toString());
//		repo.save(employee);
//		return repo.findAll();
//	}	
	
	@RequestMapping("/home")
	public ModelAndView Home(Model m)
	{
		m.addAttribute("alldata",repo.findAll());
	return new ModelAndView("Home");
	}
	@RequestMapping("/")
	public ModelAndView Home2(Model m)
	{
		m.addAttribute("alldata",repo.findAll());
	return new ModelAndView("Home");
	}
	
	@RequestMapping("/saveEmployee2")
	public ModelAndView saveEmployee2(@ModelAttribute("employee")Employee employee,Model m)
	{
		repo.save(employee);
		m.addAttribute("alldata",repo.findAll());
	return new ModelAndView("Home");
	}	

	
	
	
	
	
	@GetMapping("/demo")
	public String getDemo(){
		return "demo";
	}
	
	@PostMapping("/saveEmp")
	public String saveEmp(@RequestBody Employee employee) {
		repo.save(employee);
		return "Employee saved..";
	}
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return repo.findAll();
	}
	@GetMapping("/getEmp/{department}")
	public List<Employee> getEmpByDepartment(@PathVariable String department){
		return repo.findByDept(department);
	}


}
