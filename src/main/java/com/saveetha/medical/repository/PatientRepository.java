package com.saveetha.medical.repository;

import com.saveetha.medical.model.Patient;

import java.util.List;

public interface PatientRepository {
    Patient save(Patient patient);
    List<Patient> findAll();
    Patient findById(int id);
    void delete(int id);
}
