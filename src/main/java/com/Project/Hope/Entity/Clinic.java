package com.Project.Hope.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Table (name = "CLINIC_TBL")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int clinicId;
    protected String name;
    protected String location;
    protected String contactNumber;
    @Column(nullable = false,unique = true)
    protected String emergencyContactNumber;
    protected String emailAddress;
    protected String password;
    @Column(nullable = false,unique = true)
    protected String openingHours;
    protected String closingHours;
    protected String servicesOffered;
    protected String insuranceAcceptance;
    @Column(nullable = false)
    protected String packages;
    protected int clinicDoctorId;
    protected String clinicHead;
    protected String clinicHeadNumber;
    protected String clinicWebsite;
    protected String clinicCertificate;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime timestamp;

}
