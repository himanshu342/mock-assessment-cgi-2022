package com.cgi.template;




import com.cgi.model.Student;

public class ResponseTemplate {
	private Student Student;
	private Course Course;

	public ResponseTemplate(Student Student, Course Course) {
		super();
		this.Student = Student;
		this.Course = Course;
	}

	public ResponseTemplate() {
		super();
	}

	public Student getStudent() {
		return Student;
	}

	public void setStudent(Student Student) {
		this.Student = Student;
	}

	public Course getCourse() {
		return Course;
	}

	public void setCourse(Course Course) {
		this.Course = Course;
	}

}