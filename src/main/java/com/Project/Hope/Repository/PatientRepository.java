package com.Project.Hope.Repository;

import com.Project.Hope.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository  extends JpaRepository<Patient,Integer> {
    Patient findByEmailAddressAndPassword(String emailAddress, String password);



}
