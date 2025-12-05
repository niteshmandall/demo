package com.example.demo;

import java.time.LocalDate;

public class PatientResponse {

    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;

    public static PatientResponse from(Patient patient) {
        PatientResponse dto = new PatientResponse();
        dto.id = patient.getId();
        dto.name = patient.getName();
        dto.email = patient.getEmail();
        dto.dateOfBirth = patient.getDateOfBirth();
        return dto;
    }

    // getters
}

