package com.taha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taha.model.Patient;
import com.taha.model.PatientModel;

@Service
@RequestMapping("/patients")
public class PatientService {

@Autowired
private PatientModel patientModel;
	
public Patient printName (String name) {
//	String patientName=patientModel.getPatientFromDatabase(1).toUpperCase();
//	return patientName;
	String n = patientModel.getNames().stream().filter(i->i==name).findAny().orElse("No found");
	Patient p = new Patient();
	p.setName(n.toUpperCase());
	return p;
}
	
public List<Patient> getPatients(){
	ArrayList<Patient> list = new ArrayList<>();
	patientModel.getNames().stream().forEach(p-> list.add(new Patient(p)));
	return list;
}

}
