package com.jpg.book_my_ticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue()
private Long id;
private String name;
private String email;
private Long mobile;
private String password;
private String role;
}
