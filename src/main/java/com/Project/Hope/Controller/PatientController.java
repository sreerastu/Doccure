package com.Project.Hope.Controller;

import com.Project.Hope.Entity.Patient;
import com.Project.Hope.Exception.InvalidPatientIdException;
import com.Project.Hope.Exception.PatientNotFoundException;
import com.Project.Hope.Service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")

public class PatientController {
    @Autowired
    private PatientServiceImpl patientService;

    public PatientController(PatientServiceImpl patientService) {
        this.patientService = patientService;
    }


    @PostMapping("/Register/patient")
    public ResponseEntity<?> createPatient(@RequestBody Patient patient){
        Patient createPatient = patientService.createPatient(patient);
        return ResponseEntity.status(HttpStatus.OK).body(createPatient);
    }

    @PutMapping("/patient/{patientId}")
    public ResponseEntity<?>updatePatient(@PathVariable int patientId,@RequestBody Patient patientX) throws PatientNotFoundException {
        Patient patient = patientService.updatePatient(patientId, patientX);
        return ResponseEntity.status(HttpStatus.OK).body(patient);

    }

    @GetMapping("/patients")
    public ResponseEntity<?>getAllPatients(){
        List<Patient> patients = patientService.getAllPatients();
        return ResponseEntity.status(HttpStatus.OK).body(patients);

    }
    @GetMapping("/patient/{patientId}")
    public ResponseEntity<?>getPatientById(@PathVariable int patientId) throws InvalidPatientIdException {
        Patient patient = patientService.getPatientById(patientId);
        return ResponseEntity.status(HttpStatus.OK).body(patient);
    }

    @DeleteMapping("/patient/{patientId}")
    public ResponseEntity<?>deletePatientById(@PathVariable int patientId) throws PatientNotFoundException {
        patientService.deletePatientById(patientId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
