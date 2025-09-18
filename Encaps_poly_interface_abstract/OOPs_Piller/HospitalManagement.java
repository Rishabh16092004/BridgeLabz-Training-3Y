package OOPs_Piller;

import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }
    public abstract double calculateBill();
}
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();
    public InPatient(String id, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
    public void addRecord(String record) {
        records.add(record);
    }
    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();
    public OutPatient(String id, String name, int age, String diagnosis, double consultationFee) {
        super(id, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }
    public double calculateBill() {
        return consultationFee;
    }
    public void addRecord(String record) {
        records.add(record);
    }
    public List<String> viewRecords() {
        return records;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient p1 = new InPatient("P001", "Alice", 30, "Fever", 5, 2000);
        OutPatient p2 = new OutPatient("P002", "Bob", 45, "Checkup", 500);
        p1.addRecord("Admitted for high fever.");
        p1.addRecord("Given paracetamol.");
        p2.addRecord("Consulted for routine checkup.");
        patients.add(p1);
        patients.add(p2);
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails() + " | Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                System.out.println("Records: " + ((MedicalRecord)p).viewRecords());
            }
        }
    }
}

