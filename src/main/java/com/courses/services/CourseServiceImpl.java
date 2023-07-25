package com.courses.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.courses.entities.Course;

@Service

public class CourseServiceImpl implements CourseService {
	
	
	List<Course> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(145, "Java Core Course", "This course is core java basics"));
		list.add(new Course(4343, "SpringBoot Course", "Creating Restful Api"));
		}

	@Override
	public List<Course> getCourse() {
		
		return list;
	}
	
	@Override
	public Course getCourseId(long courseId){
		
		Course c = null;
		
		
		for(Course course : list) {
			if(course.getId() == courseId) {
				
				c = course;		
				break;
				
			}
		}
		return c;
}
	@Override
	
	public Course addCourse(Course course) {
		
		list.add(course);
		
		return course;
		
	}
	
	public void deletebyId(long courseId) {
		
		list.removeIf(course -> course.getId() == courseId);
	}
	
	
	
}
