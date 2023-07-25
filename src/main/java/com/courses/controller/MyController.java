package com.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.entities.Course;
import com.courses.services.CourseService;

@RestController
public class MyController {

@Autowired	
	private CourseService courseService;
	
	@GetMapping("/")
	public String home() {
		return "This is Homepage";
	
}

	
	//get the list of courses
	
	@GetMapping("/courses")
	
	public List<Course> getCourses(){
		return this.courseService.getCourse();
		
		
	}
	
	@GetMapping("/courses/{courseId}")
	
	public Course getCourseId(@PathVariable String courseId) {
		return this.courseService.getCourseId(Long.parseLong(courseId));
	}
	
	
	@PostMapping(path = "/courses", consumes = "application/json")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	
	public void deletebyId(@PathVariable long courseId ) {
		courseService.deletebyId(courseId);
	}
	
	
}