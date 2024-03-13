package com.Project.Hope.Service;


import com.Project.Hope.Entity.Pharmacy;
import com.Project.Hope.Exception.PharmacyNotFoundException;

import java.util.List;

public interface PharmacyService {
    Pharmacy createPharmacy(Pharmacy pharmacy);

    Pharmacy updatePharmacy(int pharmacyId, Pharmacy pharmacy) throws PharmacyNotFoundException;

    List<Pharmacy> getAllPharmacy();

    Pharmacy getPharmacyById(int pharmacyId) throws PharmacyNotFoundException;

    String deletePharmacyById(int pharmacyId) throws PharmacyNotFoundException;

    Pharmacy login( String emailAddress, String password);

    Pharmacy getPharmacyByMail(String emailAddress);

}
