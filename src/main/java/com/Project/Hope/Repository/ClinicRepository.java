package com.Project.Hope.Repository;

import com.Project.Hope.Entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicRepository extends JpaRepository <Clinic,Integer> {

    Clinic findByEmailAddressAndPassword(String emailAddress, String password);

}

