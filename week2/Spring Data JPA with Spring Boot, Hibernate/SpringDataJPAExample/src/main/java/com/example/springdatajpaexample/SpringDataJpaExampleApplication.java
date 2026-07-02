package com.example.springdatajpaexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springdatajpaexample.entity.Student;
import com.example.springdatajpaexample.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaExampleApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {

        repository.save(new Student("Sivani"));
        repository.save(new Student("Lakshmi"));

        System.out.println("Student Records:");

        repository.findAll().forEach(student ->
                System.out.println(student.getId() + " : " + student.getName()));
    }
}