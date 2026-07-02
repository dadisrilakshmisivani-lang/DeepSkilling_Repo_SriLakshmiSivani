package com.example.springdatajpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springdatajpaexample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}