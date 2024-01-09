package com.springrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.dao.CourseDao;
import com.springrestapi.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourse() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);		
	}

}
