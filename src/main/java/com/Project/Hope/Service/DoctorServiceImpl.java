package com.Project.Hope.Service;
import com.Project.Hope.Entity.Doctor;
import com.Project.Hope.Exception.DoctorNotFoundException;
import com.Project.Hope.Exception.InvalidDoctorIdException;
import com.Project.Hope.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor(int DoctorId, Doctor doctor) throws DoctorNotFoundException {
        Doctor existingDoctor = doctorRepository.findById(DoctorId).orElseThrow(() -> new DoctorNotFoundException("Invalid DoctorId"));
        existingDoctor.setFirstName(doctor.getFirstName());
        existingDoctor.setLastName(doctor.getLastName());
        existingDoctor.setDoctorAvailableTimes(doctor.getDoctorAvailableTimes());
        existingDoctor.setDoctorAddress(doctor.getDoctorAddress());
        existingDoctor.setDoctorClinicSchedules(doctor.getDoctorClinicSchedules());
        existingDoctor.setDoctorQualification(doctor.getDoctorQualification());
        existingDoctor.setDoctorConsultingFees(doctor.getDoctorConsultingFees());
        existingDoctor.setDoctorEmergencyContact(doctor.getDoctorEmergencyContact());
        existingDoctor.setDoctorExperience(doctor.getDoctorExperience());
        existingDoctor.setDoctorSpecialization(doctor.getDoctorSpecialization());
        existingDoctor.setDoctorLanguageSpoken(doctor.getDoctorLanguageSpoken());
        existingDoctor.setDoctorTitle(doctor.getDoctorTitle());
        existingDoctor.setDoctorMartialStatus(doctor.getDoctorMartialStatus());
        existingDoctor.setDoctorEmergencyContact(doctor.getDoctorEmergencyContact());
        existingDoctor.setCustomerDoctorId(doctor.getCustomerDoctorId());
        existingDoctor.setDoctorCertification(doctor.getDoctorCertification());
        existingDoctor.setEmailAddress(doctor.getEmailAddress());
        existingDoctor.setDoctorPrescription(doctor.getDoctorPrescription());
        existingDoctor.setPassword(doctor.getPassword());
        return doctorRepository.save(existingDoctor);
    }
    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(int doctorId) throws InvalidDoctorIdException {
        return doctorRepository.findById(doctorId).orElseThrow(() -> new InvalidDoctorIdException("Invalid DoctorId"));
    }

    @Override
    public String deleteDoctorById(int DoctorId) throws DoctorNotFoundException {
        try {
            doctorRepository.deleteById(DoctorId);
            return "Doctor successfully deleted";
        }
         catch(Exception ex){
            throw new DoctorNotFoundException("Invalid DoctorId");
            }
    }

    @Override
    public Doctor login(String emailAddress, String Password) {
        return doctorRepository.findByEmailAddressAndPassword(emailAddress,Password)  ;
    }

    @Override
    public Doctor getDocByEmail(String emailAddress) {
        return doctorRepository.findByEmailAddress(emailAddress);
    }
}


