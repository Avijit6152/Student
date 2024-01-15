package com.project.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sms.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
 