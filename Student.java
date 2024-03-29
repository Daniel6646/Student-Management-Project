package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name", nullable =false)//not necessary,jpa will take fieldname below as column anme if not provided
	private String firstName;
	
	@Column(name = "last_Name",nullable = false)
	private String lastName;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;//create parameterized constructor so u can call them and pass values onto them
		this.lastName = lastName;
		this.email = email;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = (long) id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
