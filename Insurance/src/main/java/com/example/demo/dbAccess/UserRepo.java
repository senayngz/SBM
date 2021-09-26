package com.example.demo.dbAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.classes.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByTCKN(String tCKN);

}

