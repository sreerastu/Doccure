package com.Project.Hope.Repository;



import com.Project.Hope.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

    Doctor findByEmailAddressAndPassword(String emailAddress, String Password);
    Doctor findByEmailAddress(String emailAddress);
}
