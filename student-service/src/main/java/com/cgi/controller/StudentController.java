package com.cgi.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.model.Student;
import com.cgi.service.StudentService;
import com.cgi.template.Course;
import com.cgi.template.ResponseTemplate;

@RestController
@RequestMapping("/api")
public class StudentController {



	@Autowired
	private StudentService StudentService;

	@PostMapping("/save")
	
	public ResponseEntity<Student> saveStudent(@RequestBody Student Student) {
		Student Student1 = this.StudentService.saveStudent(Student);

		return new ResponseEntity<Student>(Student1, HttpStatus.OK);
	}
	
	@GetMapping("/{Studentid}")
	public ResponseTemplate getStudentWithCourseDetails(@PathVariable("Studentid") int Studentid) {
	
	
		ResponseTemplate rt=new ResponseTemplate();
		Student Student = this.StudentService.getStudentById(Studentid);
		System.out.println(Student.getCid());
		Course Course = this.StudentService.getCourseDetailsById(Student.getCid());
		     
		
		rt.setStudent(Student);
		rt.setCourse(Course);
		return rt;
	}
	
	
	
}