package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Atm;
import net.javaguides.springboot.repository.AtmRepository;

@RestController
@RequestMapping("/Atm/v1")
public class AtmController {
	
	@Autowired
	private AtmRepository atmRepository;
	
	
	//Here we are going to create REST APIs
	
	//get allAtms
	@GetMapping("/atms")
	public List<Atm> getAllEmployees(){
		return atmRepository.findAll();
		
	}
	
	
	
	

}
