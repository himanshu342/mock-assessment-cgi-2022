package com.cgi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.model.Course;
import com.cgi.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	private CourseService CourseService;
	
	@PostMapping("/save")
	public ResponseEntity<Course> saveCourse(@RequestBody Course Course)
	{
		 Course Course1 = this.CourseService.saveCourse(Course);
		return new ResponseEntity<>(Course1,HttpStatus.OK);
	}
	
	@GetMapping("/{did}")
	public ResponseEntity<Course> getCourseById(@PathVariable("did") int did)
	{
		Course Course = this.CourseService.findCourseById(did);
					
		return new ResponseEntity<Course>(Course,HttpStatus.OK);
	}
	@GetMapping("/allcourses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> list = this.CourseService.getAllCourse();
		System.out.println(list);// logs
		return new ResponseEntity<List<Course>>(list,HttpStatus.OK);
	}

}