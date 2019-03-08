package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.RegisterDao;
import com.lti.dto.RegisterDTO;
import com.lti.entity.Register;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao; // service needs to talk with dao
	
	@Transactional
	public void register(RegisterDTO registerDTO) {
		
		Register register= new Register(); //object of Entity class
		register.setName(registerDTO.getName());
		register.setEmail(registerDTO.getEmail());
		register.setPassword(registerDTO.getPassword());
		
		registerDao.add(register); 
		
	}
}
