package com.jpg.book_my_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpg.book_my_ticket.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
//	boolean existsByEmail(String email);

	void deleteByRole(String string);

	boolean existsByEmail1(String email);
}
