package com.example.DentalClinic.Repository;

import com.example.DentalClinic.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepos extends JpaRepository<Patient,Long> {
}
