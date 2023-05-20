package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.dao.Studentdao;

@Service
public class studentserviceimpl implements Studentservices {
	@Autowired
	private Studentdao studentdao;

	@Override
	public Student addStudent(Student student) {
		studentdao.save(student);
		return student;
	
	}

	@Override
	public List<Student> getStudents() {
		
		return studentdao.findAll();
		}
	
	@Override
	public void Login(String id,int Pass, String cdlsiet) {
		
	}
	
	
}
