package com.database.springdbdemo.ass5;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository emprepo;
	
	@PostMapping("/addEmp")
	public int saveEmp(@RequestBody Employee employee) {
	emprepo.save(employee);
	return employee.getId();
}
	@GetMapping("/findEmp/{id}") 	
	public Optional<Employee> getEmployee(@PathVariable int id)
	{
        return emprepo.findById(id);
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		emprepo.deleteById(id);
		return "book deleted with id: " +id;
	}
	
	@GetMapping("/findAll")
	public List<Employee> getBooks()
	{
		return emprepo.findAll();
	}
	
}
