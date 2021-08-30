package com.example.covid.main.logindao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.covid.main.loginbean.Register;

public interface RegisterDao extends JpaRepository<Register, Integer>{

}
