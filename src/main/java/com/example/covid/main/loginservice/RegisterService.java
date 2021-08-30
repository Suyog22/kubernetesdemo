package com.example.covid.main.loginservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.covid.main.loginbean.Register;
import com.example.covid.main.loginbean.SignInRequest;
import com.example.covid.main.loginbean.SigninResponse;
import com.example.covid.main.logindao.RegisterDao;

@Service
public class RegisterService {

	@Autowired
	RegisterDao registerDao;
	
	public Register signUp(Register register) {
		return registerDao.save(register);
	}
	
	public SigninResponse signIn(SignInRequest request) {
		SigninResponse res = new SigninResponse();
		List<Register> registeredUsers = registerDao.findAll();

		for(Register register : registeredUsers) {
			if(register.getUserName().equalsIgnoreCase(request.getUserName())
					&& (register.getPassword().equalsIgnoreCase(request.getPassword()))) {
						res.setUserName(request.getUserName());
						res.setPassword(request.getPassword());
						res.setStatusCode(200);
						res.setReturnMessage("Login Successfull");
						break;
					} else {
						res.setUserName(request.getUserName());
						res.setPassword(request.getPassword());
						res.setStatusCode(5032);
						res.setReturnMessage("Invalid username and password");
					}
		}
		return res;
	}
}
