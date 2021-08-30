package com.example.covid.main.logincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.covid.main.loginbean.Register;
import com.example.covid.main.loginbean.SignInRequest;
import com.example.covid.main.loginbean.SigninResponse;
import com.example.covid.main.loginservice.RegisterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	RegisterService registerService;
	
	@PostMapping("/signup")
	public Register signUp(@RequestBody Register register) {
		System.out.println("In signup");
		return registerService.signUp(register);
	}
	
	@PostMapping("/signin")
	public SigninResponse signIn(@RequestBody SignInRequest signInRequest) {
		System.out.println("In signin");
		return registerService.signIn(signInRequest);
	}
}
