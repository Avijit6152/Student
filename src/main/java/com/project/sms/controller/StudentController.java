package com.project.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.sms.entity.StudentEntity;
import com.project.sms.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
		}
	
	@RequestMapping("/students/new")
	public String createStudentForm(Model model) {
		StudentEntity studentEntity = new StudentEntity();
		model.addAttribute("student", studentEntity);
		return "create_student";
	}
	
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") StudentEntity studentEntity){
		studentService.saveStudent(studentEntity);
		return "redirect:/students";
	}
	
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student")StudentEntity studentEntity,
			Model model) {
		
		StudentEntity existingStudent=studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setName(studentEntity.getName());
		existingStudent.setFname(studentEntity.getFname());
		existingStudent.setMname(studentEntity.getMname());
		
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		studentService.deleteStudentById(id);
		
		return "redirect:/students";
		
	}
	
	
	
	
}
