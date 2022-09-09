package com.springexample.learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springexample.learnspringboot.courses.bean.Course;
import com.springexample.learnspringboot.courses.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/courses")
	public List<Course> getAllcourses() {
		return courseRepository.findAll();
	}

	@GetMapping("/courses/{id}")
	public Course getCourseById(@PathVariable long id) {
		Optional<Course> course = courseRepository.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}
		return course.get();
	}
}
