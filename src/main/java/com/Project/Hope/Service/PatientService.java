package com.Project.Hope.Service;


import com.Project.Hope.Entity.Patient;
import com.Project.Hope.Exception.InvalidPatientIdException;
import com.Project.Hope.Exception.PatientNotFoundException;

import java.util.List;

public interface PatientService {

    Patient createPatient(Patient patient);

    Patient updatePatient(int Patient, Patient patient) throws PatientNotFoundException;

    List<Patient> getAllPatients();


    Patient getPatientById(int PatientId) throws InvalidPatientIdException;

    String deletePatientById(int PatientId) throws PatientNotFoundException;

    Patient login(String emailAddress, String password);
}
