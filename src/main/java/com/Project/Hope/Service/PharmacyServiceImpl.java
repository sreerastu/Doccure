package com.Project.Hope.Service;

import com.Project.Hope.Entity.Pharmacy;
import com.Project.Hope.Exception.PharmacyNotFoundException;
import com.Project.Hope.Repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService{
    @Autowired
    private PharmacyRepository pharmacyRepository;

    @Override
    public Pharmacy createPharmacy(Pharmacy pharmacy) {
        return pharmacyRepository.save(pharmacy);
    }

    @Override
    public Pharmacy updatePharmacy(int pharmacyId, Pharmacy pharmacy) throws  PharmacyNotFoundException {
     Pharmacy existingPharmacy = pharmacyRepository.findById(pharmacyId).orElseThrow(() -> new PharmacyNotFoundException("It is invalid"));
     existingPharmacy.setName(pharmacy.getName());
     existingPharmacy.setPharmacyId(pharmacy.getPharmacyId());
     existingPharmacy.setEmail(pharmacy.getEmail());
     existingPharmacy.setPassword(pharmacy.getPassword());
     existingPharmacy.setAbout(pharmacy.getAbout());
     existingPharmacy.setLocation(pharmacy.getLocation());
     existingPharmacy.setPrescription(pharmacy.getPrescription());
     existingPharmacy.setCustomer(pharmacy.getCustomer());

        return existingPharmacy;
    }

    @Override
    public List<Pharmacy> getAllPharmacy() {
        return pharmacyRepository.findAll();
    }


    @Override
    public Pharmacy getPharmacyById(int pharmacyId) throws PharmacyNotFoundException {
        Pharmacy existingPharmacy = pharmacyRepository.findById(pharmacyId).orElseThrow(() -> new PharmacyNotFoundException("Unable to get details")) ;
        return existingPharmacy;

    }

    @Override
    public String deletePharmacyById(int pharmacyId) throws PharmacyNotFoundException {
        try {
            pharmacyRepository.deleteById(pharmacyId);
            return "Pharmacy got deleted successfully";
        } catch (Exception ex) {
            throw new PharmacyNotFoundException("Unable to delete");

        }
    }
    @Override
    public Pharmacy login(String emailAddress, String password) {
        return null;
    }

    @Override
    public Pharmacy getPharmacyByMail(String emailAddress) {
        return null;
    }
}
