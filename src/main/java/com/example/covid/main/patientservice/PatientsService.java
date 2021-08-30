package com.example.covid.main.patientservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.covid.main.patientsbean.Patients;
import com.example.covid.main.patientsdao.PatientsDao;

@Service
public class PatientsService {

	@Autowired
	PatientsDao patientsDao;
	
	public List<Patients> getPatients() {
		return (List<Patients>) patientsDao.findAll();
	}
	
	public Patients addPatient(Patients patient) {
		return patientsDao.save(patient);
	}
	
	public Patients updatePatient(int id,Patients patient) {
		return patientsDao.findById(id)
			      .map(newPatient -> {
			    	  newPatient.setPatientsName(patient.getPatientsName());
			    	  newPatient.setPatientsAge(patient.getPatientsAge());
			        return patientsDao.save(newPatient);
			      })
			      .orElseGet(() -> {
			    	  patient.setPatientsId(id);
			          return patientsDao.save(patient);
			        });
	}
}
