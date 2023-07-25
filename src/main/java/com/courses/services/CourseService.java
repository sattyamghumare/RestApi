package com.courses.services;

import java.util.List;

import com.courses.entities.Course;

public interface CourseService{
	
	public List<Course> getCourse();

	public Course getCourseId(long courseId);
	public Course addCourse(Course course);

	public void deletebyId(long courseId);

}
