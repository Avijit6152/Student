package com.project.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sms.entity.StudentEntity;
import com.project.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<StudentEntity> getAllStudent() {
		
		return studentRepository.findAll();
	}



	@Override
	public StudentEntity saveStudent(StudentEntity studentEntity) {
		
		return studentRepository.save(studentEntity);
	}



	@Override
	public StudentEntity getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}



	@Override
	public StudentEntity updateStudent(StudentEntity studentEntity) {
		
		return studentRepository.save(studentEntity);
	}



	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
	}

}
