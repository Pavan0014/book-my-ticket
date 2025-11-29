package com.jpg.book_my_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpg.book_my_ticket.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	

	void deleteByRole(String string);

	boolean existsByEmail(String email);
	
	User findByEmail(String email);
}
