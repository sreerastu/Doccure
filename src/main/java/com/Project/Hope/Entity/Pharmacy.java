package com.Project.Hope.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "PHARMACY_TBL")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int pharmacyId;
    protected String name;
    protected String email;
    protected String password;
    protected String location;
    protected String about;
    protected String prescription;
    protected String customer;
}
