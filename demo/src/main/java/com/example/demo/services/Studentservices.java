package com.example.demo.services;

import java.util.List;

import com.example.demo.Model.Student;

public interface Studentservices {
	
	public Student addStudent(Student student);
	
	public List<Student> getStudents();
	
	public void Login(String id,int Pass, String cdlsiet);
	

}
