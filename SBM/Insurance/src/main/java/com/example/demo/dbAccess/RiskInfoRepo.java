package com.example.demo.dbAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.classes.RiskInfo;

public interface RiskInfoRepo extends JpaRepository<RiskInfo, String> {

}
