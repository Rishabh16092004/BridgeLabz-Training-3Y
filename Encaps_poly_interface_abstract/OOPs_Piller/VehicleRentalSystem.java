package OOPs_Piller;

import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) {  this.rentalRate = rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return getRentalRate() * 0.1; }
    public String getInsuranceDetails() { return "Car Insurance Policy: " + policyNumber; }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.9; }
    public double calculateInsurance() { return getRentalRate() * 0.05; }
    public String getInsuranceDetails() { return "Bike Insurance Policy: " + policyNumber; }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    public double calculateInsurance() { return getRentalRate() * 0.2; }
    public String getInsuranceDetails() { return "Truck Insurance Policy: " + policyNumber; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", 2000, "CAR-001"));
        vehicles.add(new Bike("B456", 500, "BIKE-001"));
        vehicles.add(new Truck("T789", 3000, "TRUCK-001"));

        for (Vehicle v : vehicles) {
            double rental = v.calculateRentalCost(5);
            double insurance = (v instanceof Insurable) ? ((Insurable)v).calculateInsurance() : 0;
            System.out.println(v.getType() + " " + v.getVehicleNumber() +
                    " Rental(5 days): " + rental + " Insurance: " + insurance);
        }
    }
}

