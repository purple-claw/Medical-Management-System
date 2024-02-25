# Medical Management System

This is a simple Java project for managing patient data in a medical facility. It provides basic functionalities such as adding, retrieving, and deleting patient records.

## Features

- **Add Patient**: Add a new patient to the system with their details including name, age, and gender.
- **Retrieve All Patients**: Retrieve a list of all patients currently stored in the system.
- **Retrieve Patient by ID**: Retrieve a specific patient's details by providing their unique ID.
- **Delete Patient**: Remove a patient from the system based on their ID.

## Directory Structure

The project has the following directory structure:

medical_management_system
│
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com
│ │ │ └── example
│ │ │ └── medical
│ │ │ ├── model
│ │ │ │ └── Patient.java
│ │ │ ├── repository
│ │ │ │ └── PatientRepository.java
│ │ │ ├── service
│ │ │ │ └── PatientService.java
│ │ │ └── Main.java
│ │ └── resources
│ └── test
│ └── java
│ └── com
│ └── example
│ └── medical
│ └── service
│ └── PatientServiceTest.java
└── pom.xml


## Running the Project

To run the project, you can use Maven commands. Navigate to the root directory of the project and execute the following command:

mvn clean compile exec:java -Dexec.mainClass="com.example.medical.Main"


## Expected Output

Upon running the project, you should see output similar to the following in the console:

All Patients:
Patient{id=1, name='John', age=30, gender='Male'}
Patient{id=2, name='Alice', age=25, gender='Female'}
Patient with ID 1:
Patient{id=1, name='John', age=30, gender='Male'}
Remaining Patients:
Patient{id=1, name='John', age=30, gender='Male'}

## Testing

The project includes a set of unit tests for the `PatientService` class. These tests ensure the correct functionality of the service layer.

## Dependencies

This project uses the following dependencies:
- JUnit 5 for unit testing.
- Mockito for mocking dependencies in tests.
