package com.Project.Hope.Entity;


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
@Table(name = "PAYMENT_TBL")
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int paymentId;
    @Column(name = "inVoice")
    protected String inVoice;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime timestamp;
}
