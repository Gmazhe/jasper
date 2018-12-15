package com.springboot.jasper.repositary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.jasper.model.Student;
import com.springboot.jasper.model.StudentMapper;

@Repository
public class StudentRepositary {
	
	 @Autowired
	    JdbcTemplate jdbcTemplet;
	 
private final String STUDENT_ID =  "select SPRIDEN_ID,SPRIDEN_LAST_NAME,SPRIDEN_FIRST_NAME from spriden where SPRIDEN_ID= ?";
	
	public Student getStudent(String id) {
	
		return jdbcTemplet.queryForObject(STUDENT_ID, new Object[] { id }, new StudentMapper());
	}
	
}
