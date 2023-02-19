package com.example.DentalClinic.Controller;

import com.example.DentalClinic.Entity.Patient;
import com.example.DentalClinic.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/AllPatients")
    public List<Patient> getAll(){
        return patientService.getAllPatient();

    }
    @PostMapping("/AddPatient")
    public Patient addPatient(@RequestBody Patient p){
        return patientService.addPatient(p);
    }
    @PutMapping("/Edit/{id}")
    public void updatePatient(@RequestBody Patient p ,@PathVariable Long id){
        patientService.updatePateint(p);
    }
    @DeleteMapping("/Delete/{id}")
    public void deletePatient(@PathVariable Long id){
        patientService.deletePatient(id);

    }
}
