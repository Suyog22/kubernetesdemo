package com.example.covid.main.patientsbean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Patients")
public class Patients {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int patientsId;
	
	@Column(name = "patientsName")
	private String patientsName;
	
	@Column(name = "patientsAge")
	private int patientsAge;
	
	@Override
	public String toString() {
		return "Patients [patientsId=" + patientsId + ", patientsName=" + patientsName + ", patientsAge=" + patientsAge
				+ "]";
	}

	public int getPatientsId() {
		return patientsId;
	}

	public void setPatientsId(int patientsId) {
		this.patientsId = patientsId;
	}

	public String getPatientsName() {
		return patientsName;
	}

	public void setPatientsName(String patientsName) {
		this.patientsName = patientsName;
	}

	public int getPatientsAge() {
		return patientsAge;
	}

	public void setPatientsAge(int patientsAge) {
		this.patientsAge = patientsAge;
	}

	public Patients() {
		super();
	}

	public Patients(int patientsId, String patientsName, int patientsAge) {
		super();
		this.patientsId = patientsId;
		this.patientsName = patientsName;
		this.patientsAge = patientsAge;
	}
	
	
}
