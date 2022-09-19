package com.example.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.AppConfig;
import com.example.crud.repository.AppConfigRepository;

@RestController
public class AppConfigController {

	@Autowired
	private AppConfigRepository appConfigRepository;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping(value="/createconfig")
	public ResponseEntity<String> createConfig(@RequestBody AppConfig appConfig)
	{
		appConfigRepository.save(appConfig);
		return new ResponseEntity<String>("Config created",HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value="/getconfig")
	public ResponseEntity<Optional<AppConfig>> getConfig(@RequestParam("key") String key )
	{
		Optional<AppConfig> appConfig = appConfigRepository.findById(key);
		return new ResponseEntity<Optional<AppConfig>>(appConfig,HttpStatus.OK);
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value="/getconfigs")
	public ResponseEntity<List<AppConfig>> getConfigs()
	{
		List<AppConfig> appConfigs = appConfigRepository.findAll();
		return new ResponseEntity<List<AppConfig>>(appConfigs,HttpStatus.OK);
	}
	
}
