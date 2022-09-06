package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.AppConfig;

@Repository
public interface AppConfigRepository extends JpaRepository<AppConfig, String> {

}
