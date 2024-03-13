package com.Project.Hope.Service;

import com.Project.Hope.Entity.Clinic;
import com.Project.Hope.Exception.ClinicNotFoundException;

import java.util.List;

public interface ClinicService {

Clinic createClinic(Clinic clinic);

Clinic updateClinic( int clinicId, Clinic clinic) throws ClinicNotFoundException, ClinicNotFoundException;

List<Clinic> getAllClinics();

Clinic getClinicById(int clinicId) throws ClinicNotFoundException;

String deleteClinicById(int clinicId) throws ClinicNotFoundException;

Clinic login( String emailAddress, String password);

Clinic getClinicByMail(String emailAddress);
}
