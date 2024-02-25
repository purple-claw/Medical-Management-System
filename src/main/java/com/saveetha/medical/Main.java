package com.saveetha.medical;

import com.saveetha.medical.model.Patient;
import com.saveetha.medical.service.PatientService;
import com.saveetha.medical.repository.PatientRepository;

public class Main {
    public static void main(String[] args) {
        // Initialize repositories and services
        PatientRepository patientRepository = new YourPatientRepositoryImplementation();
        PatientService patientService = new PatientService(patientRepository);

        // Example usage
        Patient patient1 = new Patient(1, "John", 30, "Male");
        Patient patient2 = new Patient(2, "Alice", 25, "Female");

        patientService.addPatient(patient1);
        patientService.addPatient(patient2);

        System.out.println("All Patients:");
        patientService.getAllPatients().forEach(System.out::println);

        System.out.println("Patient with ID 1:");
        System.out.println(patientService.getPatientById(1));

        patientService.deletePatient(2);

        System.out.println("Remaining Patients:");
        patientService.getAllPatients().forEach(System.out::println);
    }
}
