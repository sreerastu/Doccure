package com.Project.Hope.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
    protected String clinicAddress;
    protected String contactNumber;
    protected String emailAddress;
    protected String password;
    protected int clinicDoctorId;
    protected String clinicHead;
    protected String clinicHeadNumber;
    protected String clinicWebsite;
    protected String clinicCertificate;

}
