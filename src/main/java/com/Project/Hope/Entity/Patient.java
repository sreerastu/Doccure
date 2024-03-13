package com.Project.Hope.Entity;

import com.Project.Hope.Enum.Gender;
import com.Project.Hope.Enum.MaritalStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="PATIENT_TBL")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected  int patientId;

    protected int doctorId;


    protected int clinicId;


    protected  String firstName;


    protected String lastName;


    protected String emailAddress;


    protected String contactAddress;


    protected String password;

    protected String contactNumber;

    protected String dateOfBirth;

    protected String emergencyNumber;

    protected String occupation;

    protected String patientInsuranceInformation;

    @Enumerated(EnumType.STRING)
    protected MaritalStatus maritalStatus;

    protected String patientLastVisit;

    protected String patientIdProof;

    @Enumerated(EnumType.STRING)
    protected Gender gender;

    protected String patientCommunicationMethod;

    protected String patientScheduledAppointment;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime timestamp;
}

