package com.cgi.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

}