package com.springrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestapi.model.Course;

public interface CourseDao extends JpaRepository<Course,Long>{

}
