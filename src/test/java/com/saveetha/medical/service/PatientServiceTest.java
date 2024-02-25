package com.saveetha.medical.service;

import com.saveetha.medical.model.Patient;
import com.saveetha.medical.repository.PatientRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PatientServiceTest {

    @Test
    public void testAddPatient() {
        // Mock repository
        PatientRepository patientRepository = mock(PatientRepository.class);
        PatientService patientService = new PatientService(patientRepository);

        // Create a patient
        Patient patient = new Patient(1, "John", 30, "Male");

        // Mock the behavior of save method in the repository
        when(patientRepository.save(patient)).thenReturn(patient);

        // Call addPatient method
        Patient savedPatient = patientService.addPatient(patient);

        // Verify that the patient was saved
        assertEquals(patient, savedPatient);
    }

    @Test
    public void testGetAllPatients() {
        // Mock repository
        PatientRepository patientRepository = mock(PatientRepository.class);
        PatientService patientService = new PatientService(patientRepository);

        // Create sample patients
        Patient patient1 = new Patient(1, "John", 30, "Male");
        Patient patient2 = new Patient(2, "Alice", 25, "Female");

        // Mock the behavior of findAll method in the repository
        when(patientRepository.findAll()).thenReturn(Arrays.asList(patient1, patient2));

        // Call getAllPatients method
        List<Patient> patients = patientService.getAllPatients();

        // Verify that the correct list of patients was returned
        assertEquals(2, patients.size());
        assertEquals(patient1, patients.get(0));
        assertEquals(patient2, patients.get(1));
    }

    @Test
    public void testGetPatientById() {
        // Mock repository
        PatientRepository patientRepository = mock(PatientRepository.class);
        PatientService patientService = new PatientService(patientRepository);

        // Create a patient
        Patient patient = new Patient(1, "John", 30, "Male");

        // Mock the behavior of findById method in the repository
        when(patientRepository.findById(1)).thenReturn(patient);

        // Call getPatientById method
        Patient retrievedPatient = patientService.getPatientById(1);

        // Verify that the correct patient was retrieved
        assertEquals(patient, retrievedPatient);
    }

    @Test
    public void testDeletePatient() {
        // Mock repository
        PatientRepository patientRepository = mock(PatientRepository.class);
        PatientService patientService = new PatientService(patientRepository);

        // Call deletePatient method
        patientService.deletePatient(1);

        // Verify that delete method in the repository was called with the correct ID
        verify(patientRepository, times(1)).delete(1);
    }
}
