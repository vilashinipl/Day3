package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired 
	StudentRepo s_repo;
	public String adddetails(Student stu)
	{
		s_repo.save(stu);
		return "Welcome to REST API";
	}
	public List<Student> getdetails()
	{
		return s_repo.findAll();
	}
	public Optional<Student> getdetailsById(int id)
	{
		return s_repo.findById(id);
	}
}