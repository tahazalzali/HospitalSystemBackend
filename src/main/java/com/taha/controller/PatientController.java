package com.taha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taha.model.Patient;
import com.taha.service.PatientService;

@RestController
@RequestMapping("/patients")

public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/print-name")
	public ResponseEntity getPatients() {
		return ResponseEntity.ok(patientService.printName("company").getName());
	}
	@GetMapping ("/get-patients")
	public ResponseEntity getName() {
		return ResponseEntity.ok(patientService.getPatients());
	}
	@PostMapping("/save")
	public ResponseEntity savePatient(@RequestBody Patient patient)
	{
	return ResponseEntity.ok(patient);
	}
		
	
}
