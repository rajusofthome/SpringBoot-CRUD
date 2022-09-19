package com.example.crud.repository;

import org.springframework.stereotype.Repository;

import com.example.crud.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String username);
	
}
