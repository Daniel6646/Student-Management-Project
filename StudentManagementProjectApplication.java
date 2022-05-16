package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementProjectApplication.class, args);
	}
	
	@Autowired
	StudentRepository studentrepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Daniel", "Q", "danny@gmail.com");
		 * studentrepository.save(student1);
		 * 
		 * Student student2 = new Student("Kratos", "L", "kratos@gmail.com");
		 * studentrepository.save(student2);
		 * 
		 * Student student3 = new Student("Zues", "Z", "zues@gmail.com");
		 * studentrepository.save(student3);
		 *
		 */
		
	}

}
