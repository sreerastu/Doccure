package com.Project.Hope.Controller;

import com.Project.Hope.Entity.Clinic;
import com.Project.Hope.Exception.ClinicNotFoundException;
import com.Project.Hope.Service.ClinicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class ClinicController {

    @Autowired
    private ClinicServiceImpl clinicService;

    @PostMapping("/save")
    public ResponseEntity<?> createClinic(@RequestBody Clinic clinic) {
        Clinic clinic1 = clinicService.createClinic(clinic);
        return ResponseEntity.status(HttpStatus.OK).body(clinic1);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllClinic() {
        List<Clinic> allClinics = clinicService.getAllClinics();
        return ResponseEntity.status(HttpStatus.OK).body(allClinics);
    }

    @PutMapping("/update/{clinicId}")
    public ResponseEntity<?> updateClinic(@PathVariable int clinicId, @RequestBody Clinic clinic) throws ClinicNotFoundException {
        Clinic clinic1 = clinicService.updateClinic(clinicId, clinic);
        return ResponseEntity.status(HttpStatus.OK).body(clinic1);
    }

    @GetMapping("/clinic/{clinicId}")
    public ResponseEntity<?> getClinicId(@PathVariable int clinicId) throws ClinicNotFoundException {
        Clinic allClinics = clinicService.getClinicById(clinicId);
        return ResponseEntity.status(HttpStatus.OK).body(allClinics);
    }

    @DeleteMapping("/delete/{clinicId}")
    public ResponseEntity<?> deleteClinicId(@PathVariable int clinicId) throws ClinicNotFoundException {
        String clinic1 = clinicService.deleteClinicById(clinicId);
        return ResponseEntity.status(HttpStatus.OK).body(clinic1);
    }

}


