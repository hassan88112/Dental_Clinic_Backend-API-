package com.example.DentalClinic.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {

    private Long id;
    private String fullName;
    private LocalDate date;
    private Long price;
}
