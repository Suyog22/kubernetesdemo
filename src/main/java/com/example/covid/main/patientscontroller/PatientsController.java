package com.example.covid.main.patientscontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.covid.main.patientsbean.Patients;
import com.example.covid.main.patientservice.PatientsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientsController {

	@Autowired
	PatientsService patientsService;
	
	@GetMapping("/getpatients")
	public List<Patients> getPatients() { 
		return patientsService.getPatients();
	}
	
	@PostMapping("/addpatient") 
	public Patients addPatient(@RequestBody Patients patient) {
		return patientsService.addPatient(patient);
	}
	
	@PutMapping("/updatepatient/{id}")
	public Patients updatePatient(@RequestBody Patients newPatients, @PathVariable int id) {
	    return patientsService.updatePatient(id,newPatients);
	  }
}
