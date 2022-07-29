package com.cgi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cgi.model.Student;
import com.cgi.repository.StudentRepository;
import com.cgi.StudentServiceApplication;
import com.cgi.template.Course;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository StudentRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Student saveStudent(Student Student) {
		// TODO Auto-generated method stub
		return this.StudentRepository.save(Student);
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return this.StudentRepository.findById(id).get();
	}

	public Course getCourseDetailsById(int id) {
	
		Course Course = 
				this.restTemplate.getForObject("http://localhost:7001/api/"+id, 
						Course.class);
		System.out.println(Course.getCname());
		return Course;
	}
}
