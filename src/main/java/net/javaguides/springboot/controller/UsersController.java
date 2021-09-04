package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Users;
import net.javaguides.springboot.repository.UsersRepository;

@RestController
@RequestMapping("/User/v1/")
public class UsersController {
	
	
	
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping("/users")
	public List<Users> getAllusers(){
		return usersRepository.findAll();
		
		
	}
	
	
	
	
	

}
