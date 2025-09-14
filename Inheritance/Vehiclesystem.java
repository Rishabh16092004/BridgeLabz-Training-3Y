/**
 * vehicle
 */
class Vehicle{
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayDetails(){
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
class Truck extends Vehicle {
    int loadCapacity; // in tons

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
public class Vehiclesystem {
    public static void main(String[] args) {
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 15);
        Vehicle bike = new Motorcycle(150, "Petrol", false);

        Vehicle[] vehicles = {car, truck, bike};
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("-----------------");
        }
    }
}
