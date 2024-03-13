package com.Project.Hope.Service;

import com.Project.Hope.Entity.Patient;
import com.Project.Hope.Exception.InvalidPatientIdException;
import com.Project.Hope.Exception.PatientNotFoundException;
import com.Project.Hope.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;


    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(int patientId, Patient patient) throws PatientNotFoundException {
        Patient existingPatient = patientRepository.findById(patientId).orElseThrow(() -> new PatientNotFoundException("Invalid PatientId"));
        existingPatient.setFirstName(patient.getFirstName());
        existingPatient.setLastName(patient.getLastName());
        existingPatient.setEmailAddress(patient.getEmailAddress());
        existingPatient.setContactAddress(patient.getContactAddress());
        existingPatient.setPassword(patient.getPassword());
        existingPatient.setClinicId(patient.getClinicId());
        existingPatient.setContactNumber(patient.getContactNumber());
        existingPatient.setDoctorId(patient.getDoctorId());
        existingPatient.setDateOfBirth(patient.getDateOfBirth());
        existingPatient.setEmergencyNumber(patient.getEmergencyNumber());
        existingPatient.setMaritalStatus(patient.getMaritalStatus());
        existingPatient.setOccupation(patient.getOccupation());
        existingPatient.setGender(patient.getGender());
        existingPatient.setPatientCommunicationMethod(patient.getPatientCommunicationMethod());
        existingPatient.setPatientIdProof(patient.getPatientIdProof());
        existingPatient.setPatientInsuranceInformation(patient.getPatientInsuranceInformation());
        existingPatient.setPatientLastVisit(patient.getPatientLastVisit());
        existingPatient.setPatientScheduledAppointment(patient.getPatientScheduledAppointment());
        existingPatient.setTimestamp(patient.getTimestamp());
        return patientRepository.save(existingPatient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(int PatientId) throws InvalidPatientIdException {
        return patientRepository.findById(PatientId).orElseThrow(() -> new InvalidPatientIdException("Invalid  PatientId"));
    }

    @Override
    public String deletePatientById(int patientId) throws PatientNotFoundException {
        try {
            patientRepository.deleteById(patientId);
            return "Patient successfully deleted";
        }
        catch(Exception ex){
            throw new PatientNotFoundException("Invalid patientId");
        }
    }

    @Override
    public Patient login(String emailAddress, String password) {
        return patientRepository.findByEmailAddressAndPassword(emailAddress, password);
    }
}
