package OOPs_Piller;

import java.util.*;
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public String getVehicleDetails() {
        return "VehicleID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm;
    }
    public abstract double calculateFare(double distance);
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
class Car extends Vehicle implements GPS {
    private String location;

    public Car(String id, String driver, double ratePerKm) {
        super(id, driver, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Bike extends Vehicle implements GPS {
    private String location;
    public Bike(String id, String driver, double ratePerKm) {
        super(id, driver, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Auto extends Vehicle implements GPS {
    private String location;
    public Auto(String id, String driver, double ratePerKm) {
        super(id, driver, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}
public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        Car car = new Car("C001", "Alice", 15);
        Bike bike = new Bike("B001", "Bob", 7);
        Auto auto = new Auto("A001", "Charlie", 10);
        car.updateLocation("Downtown");
        bike.updateLocation("Station Road");
        auto.updateLocation("Market Square");
        rides.add(car);
        rides.add(bike);
        rides.add(auto);
        double distance = 12.5;
        for (Vehicle v : rides) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));

            if (v instanceof GPS) {
                System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());
            }
            System.out.println("---------------------------");
        }
    }
}

