package com.example.covid.main.patientsdao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.covid.main.patientsbean.Patients;

@Repository
public interface PatientsDao extends CrudRepository<Patients, Integer> {

}
