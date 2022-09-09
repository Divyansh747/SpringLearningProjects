package com.springexample.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springexample.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getAllcourses() {
		return Arrays.asList(new Course(1, "Learn Microservices", "in28Minutes"),
				new Course(2, "Learn Docker", "in28Minutes"));
	}

	@GetMapping("/courses/1")
	public Course getCourseById() {
		return new Course(1, "Learn Microservices", "in28Minutes");
	}
}
