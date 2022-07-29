package com.cgi.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.model.Course;
import com.cgi.repository.CourseRepository;


import java.util.List;

@Service
public class CourseService {
	@Autowired
	private CourseRepository CourseRepository;

	public Course saveCourse(Course Course) {
		// TODO Auto-generated method stub
		return this.CourseRepository.save(Course);

	}
	
	public List<Course> getAllCourse() {
		List<Course> list = this.CourseRepository.findAll();

		return list;
	}
	public Course findCourseById(int did) {
		// TODO Auto-generated method stub
		Optional<Course> op = this.CourseRepository.findById(did);

		if (op.isPresent()) {
			return op.get();
		}
		return null;
	}
}