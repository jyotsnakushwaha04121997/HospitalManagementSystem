package com.application.hospitalManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.hospitalManagementSystem.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {

}
