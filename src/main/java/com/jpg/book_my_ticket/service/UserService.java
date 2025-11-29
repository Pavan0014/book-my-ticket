package com.jpg.book_my_ticket.service;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jpg.book_my_ticket.dto.LoginDto;
import com.jpg.book_my_ticket.dto.UserDto;

import jakarta.servlet.http.HttpSession;

public interface UserService {

	String register(UserDto userDto, BindingResult result);

	String login(LoginDto dto, RedirectAttributes attributes,HttpSession session);
}
