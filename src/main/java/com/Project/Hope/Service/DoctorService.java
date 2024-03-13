package com.Project.Hope.Service;

import com.Project.Hope.Entity.Doctor;
import com.Project.Hope.Exception.DoctorNotFoundException;
import com.Project.Hope.Exception.InvalidDoctorIdException;

import java.util.List;

public interface DoctorService {


    Doctor createDoctor(Doctor doctor);

    Doctor updateDoctor(int DoctorId, Doctor doctor) throws DoctorNotFoundException;

    List<Doctor> getAllDoctors();

    Doctor getDoctorById(int DoctorId) throws InvalidDoctorIdException;

    String deleteDoctorById(int DoctorId) throws DoctorNotFoundException;

    Doctor login(String emailAddress,String Password);

    Doctor getDocByEmail(String emailAddress);


}
