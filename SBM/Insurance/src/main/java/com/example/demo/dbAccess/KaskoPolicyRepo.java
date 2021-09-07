package com.example.demo.dbAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.classes.KaskoPolicy;

public interface KaskoPolicyRepo extends JpaRepository<KaskoPolicy, Integer> {

	KaskoPolicy findByPlateNo(String plateNo);

}
