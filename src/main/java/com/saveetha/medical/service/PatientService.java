package com.saveetha.medical.service;

import com.saveetha.medical.model.Patient;
import com.saveetha.medical.repository.PatientRepository;

import java.util.List;

public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(int id) {
        return patientRepository.findById(id);
    }

    public void deletePatient(int id) {
        patientRepository.delete(id);
    }
}
