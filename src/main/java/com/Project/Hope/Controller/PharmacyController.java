package com.Project.Hope.Controller;

import com.Project.Hope.Entity.Pharmacy;
import com.Project.Hope.Exception.PharmacyNotFoundException;
import com.Project.Hope.Service.PharmacyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class PharmacyController {
    @Autowired
    private PharmacyServiceImpl pharmacyService;

    @PostMapping("/register")
    public ResponseEntity<?> createPharmacy(@RequestBody Pharmacy pharmacy) {
        Pharmacy pharmacy1 = pharmacyService.createPharmacy(pharmacy);
        return ResponseEntity.status(HttpStatus.OK).body(pharmacy1);
    }

    @GetMapping("/pharmacies/all")
    public ResponseEntity<?> getAllPharmacy() {
        List<Pharmacy> allPharmacy = pharmacyService.getAllPharmacy();
        return ResponseEntity.status(HttpStatus.OK).body(allPharmacy);
    }

    @PutMapping("/update/{pharmacyId}")
    public ResponseEntity<?> updatePharmacy(@PathVariable int pharmacyId, @RequestBody Pharmacy pharmacy) throws PharmacyNotFoundException {
        Pharmacy pharmacy1 = pharmacyService.updatePharmacy(pharmacyId, pharmacy);
        return ResponseEntity.status(HttpStatus.OK).body(pharmacy1);
    }

    @DeleteMapping("/delete/{pharmacyId}")
    public ResponseEntity<?> deletePharmacyId(@PathVariable int pharmacyId) throws PharmacyNotFoundException {
        String pharmacy1 = pharmacyService.deletePharmacyById(pharmacyId);
        return ResponseEntity.status(HttpStatus.OK).body(pharmacy1);
    }
}