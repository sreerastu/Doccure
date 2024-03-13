package com.Project.Hope.Service;

import com.Project.Hope.Entity.Clinic;
import com.Project.Hope.Exception.ClinicNotFoundException;
import com.Project.Hope.Repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicServiceImpl implements ClinicService {
    @Autowired
    private ClinicRepository clinicRepository;

    @Override
    public Clinic createClinic(Clinic clinic) {
        return clinicRepository.save(clinic);
    }

    @Override
    public Clinic updateClinic(int clinicId, Clinic clinic) throws ClinicNotFoundException {
        Clinic existingClinic = clinicRepository.findById(clinicId).orElseThrow(()-> new ClinicNotFoundException("It is invalid"));
        existingClinic.setName(clinic.getName());
        existingClinic.setClinicId(clinic.getClinicId());
        existingClinic.setClinicWebsite(clinic.getClinicWebsite());
        existingClinic.setLocation(clinic.getLocation());
        existingClinic.setClinicHead(clinic.getClinicHead());
        existingClinic.setClinicDoctorId(clinic.getClinicDoctorId());
        existingClinic.setClinicHeadNumber(clinic.getClinicHeadNumber());
        existingClinic.setClinicCertificate(clinic.getClinicCertificate());
        existingClinic.setPassword(clinic.getPassword());
        existingClinic.setEmergencyContactNumber(clinic.getEmergencyContactNumber());
        existingClinic.setOpeningHours(clinic.getOpeningHours());
        existingClinic.setClosingHours(clinic.getClosingHours());
        existingClinic.setInsuranceAcceptance(clinic.getInsuranceAcceptance());
        existingClinic.setPackages(clinic.getPackages());
        existingClinic.setServicesOffered(clinic.getServicesOffered());
        return existingClinic;
    }

    @Override
    public List<Clinic> getAllClinics() {
        return clinicRepository.findAll();
    }

    @Override
    public Clinic getClinicById(int clinicId) throws ClinicNotFoundException {
        Clinic existingClinic = clinicRepository.findById(clinicId).orElseThrow(() ->new ClinicNotFoundException("Unable to get the details"));
        return existingClinic;
    }

    @Override
    public String deleteClinicById(int clinicId) throws ClinicNotFoundException {
        try {
            clinicRepository.deleteById(clinicId);
            return "Clinic got deleted successfully";
        }
            catch (Exception ex){
            throw new ClinicNotFoundException("Unable to delete");

        }
    }

    @Override
    public Clinic login(String emailAddress, String password) {
        return null;
    }

    @Override
    public Clinic getClinicByMail(String emailAddress) {
        return null;
    }
}


