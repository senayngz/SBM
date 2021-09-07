package com.example.demo.dbAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.classes.TrafPolicy;

public interface TrafPolicyRepo extends JpaRepository<TrafPolicy, Integer> {

	TrafPolicy findByPlateNo(String plateNo);

}
