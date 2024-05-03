package com.taha.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PatientModel {

	List<String> names = new ArrayList<>();

	PatientModel() {
		names.add("Taha");
		names.add("Freind");
		names.add("company");
	}

	public String getPatientFromDatabase(Integer num) {
		int patiendIndex = (num != null) ? num : 0;

		return names.get(patiendIndex);

	}
	public List <String> getNames(){
		return names;
	}
}
