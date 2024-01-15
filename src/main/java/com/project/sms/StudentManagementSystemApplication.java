package com.project.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.project.sms.entity.StudentEntity;
import com.project.sms.repository.StudentRepository;




@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		StudentEntity studentEntity = new StudentEntity("Avijit","Hrushikesh","Basanta");
//		studentRepository.save(studentEntity);
//		
//		StudentEntity studentEntity2 = new StudentEntity("Avijit1","Hrushikesh1","Basanta1");
//		studentRepository.save(studentEntity2);
//		
//		StudentEntity studentEntity3 = new StudentEntity("Avijit2","Hrushikesh2","Basanta2");
//		studentRepository.save(studentEntity3);
//		
//		StudentEntity studentEntity4 = new StudentEntity("Avijit3","Hrushikesh3","Basanta3");
//		studentRepository.save(studentEntity4);
//		
//		StudentEntity studentEntity5 = new StudentEntity("Avijit4","Hrushikesh4","Basanta4");
//		studentRepository.save(studentEntity5);
//		
//		StudentEntity studentEntity6 = new StudentEntity("Avijit5","Hrushikesh5","Basanta5");
//		studentRepository.save(studentEntity6);
		
	}

}
