package com.application.hospitalManagementSystem;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.application.hospitalManagementSystem.entity.Patient;
import com.application.hospitalManagementSystem.repository.*;

@SpringBootTest
public class PatientTests {
	@Autowired
	private PatientRepo patientRepo;
@Test
public void testPatientRepo() {
	List<Patient> patients=patientRepo.findAll();
	System.out.println(patients);
}
}
