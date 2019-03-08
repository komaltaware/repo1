package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dto.RegisterDTO;
import com.lti.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(RegisterDTO registerDTO) {  //to get all the data whatever filled in the form  by user of jsp file
		
		registerService.register(registerDTO); //it will store the form data in registerservice object and will handover it to RegisterService class for applying some business logic
		return "redirect:/confirmation.jsp"; 
		
	}
}
