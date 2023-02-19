package com.example.DentalClinic.Service;

import com.example.DentalClinic.Entity.Patient;
import com.example.DentalClinic.Repository.PatientRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepos patientRepos;
    public List<Patient> getAllPatient(){
        return patientRepos.findAll();
    }
    public Patient addPatient(Patient p){
        return patientRepos.save(p);
    }
    public void updatePateint(Patient p){
        patientRepos.save(p);

    }
    public void deletePatient(Long id){
        patientRepos.deleteById(id);
    }
}
