package com.Clinic.Management.System.Clinic.Management.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;


@Document(collection = "prescriptions")
public class Prescription {

    @Id
    private String id;

    @NotBlank
    @Size(min = 3,max=100)
    private String patientName;

    @NotNull(message = "appointmentId is required")
    private Long  appointmentId;

    @NotBlank
    @Size(min = 3, max = 100)
    private String medication;

    @NotBlank
    @Size(min = 3, max = 20)
    private String dosage;

    @Size(max = 200)
    private String doctorNotes;

    public Prescription(){}

    public Prescription(String patientName, Long appointmentId, String medication, String dosage) {
        this.patientName = patientName;
        this.appointmentId = appointmentId;
        this.medication = medication;
        this.dosage = dosage;
    }

    public String getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public String getMedication() {
        return medication;
    }

    public String getDosage() {
        return dosage;
    }

    public String getDoctorNotes() {
        return doctorNotes;
    }
}
