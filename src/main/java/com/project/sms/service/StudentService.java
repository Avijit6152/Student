package com.project.sms.service;

import java.util.List;

import com.project.sms.entity.StudentEntity;

public interface StudentService {
	
	List<StudentEntity> getAllStudent();

	
	StudentEntity saveStudent(StudentEntity studentEntity);
	
	StudentEntity  getStudentById(Long id);
	StudentEntity updateStudent(StudentEntity studentEntity);
	
	void deleteStudentById(Long id);
}
