package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
@RestController
@RequestMapping("/welcome")
public class StudentController {
	@Autowired 
	StudentService studentservice;
	
	@PostMapping(" ")
	public String create(@RequestBody Student stu)
	{
		return studentservice.adddetails(stu);
	}
	@GetMapping(" ")
	public List<Student> read()
	{
		return studentservice.getdetails();
	}
	@GetMapping("/{id}")
	public Optional<Student> readById(@PathVariable int id)
	{
		return studentservice.getdetailsById(id);
	}
}