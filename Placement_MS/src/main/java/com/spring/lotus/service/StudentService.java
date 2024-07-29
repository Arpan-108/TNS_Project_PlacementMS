package com.spring.lotus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.lotus.entity.Student;
import com.spring.lotus.repository.IStudentRepository;

@Service
public class StudentService implements IStudentService{

	@Autowired
	IStudentRepository repo;
	
	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void addStudent(Student s) {
		
		repo.save(s);
	}

	@Override
	public void deleteStudent(Long id) {
		
		repo.deleteById(id);
	}

	@Override
	public void updateStudent(Long id, Student s) {
		
		if (repo.findById(id).isPresent()) {
			
			repo.save(s);
		} 
		System.out.println("Record not found");	
	}
}
