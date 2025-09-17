package Object;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " consulted with:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Doctor " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Sharma");
        Doctor d2 = new Doctor("Dr. Mehta");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Priya");

        h1.addDoctor(d1);
        h1.addDoctor(d2);
        h1.addPatient(p1);
        h1.addPatient(p2);

        h1.showHospital();

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);

        System.out.println();
        d1.showPatients();
        d2.showPatients();
        System.out.println();
        p1.showDoctors();
        p2.showDoctors();
    }
}

