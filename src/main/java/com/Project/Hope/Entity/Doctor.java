package com.Project.Hope.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "DOCTOR_TBL")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int doctorId;
    protected String firstName;
    protected String lastName;
    protected String emailAddress;
    protected String password;
    protected String doctorCertification;
    protected String doctorTitle;
    protected String doctorLanguageSpoken;
    protected String doctorClinicSchedules;
    protected String doctorConsultingFees;
    protected String doctorAvailableTimes;
    protected String doctorSpecialization;
    protected String doctorEmergencyContact;
    protected String doctorAddress;
    protected String doctorMartialStatus;
    protected String doctorExperience;
    protected String doctorPrescription;
    protected int customerDoctorId;
    protected String doctorQualification;

}
