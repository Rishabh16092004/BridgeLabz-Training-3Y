public class CarRental {
    String CustomerName;
    String CarModel;
    int RentalDays;
    double dailyRent;

    CarRental(String CustomerName, String CarModel, int RentalDays, double dailyRent) {
        this.CustomerName = CustomerName;
        this.CarModel = CarModel;
        this.RentalDays = RentalDays;
        this.dailyRent = dailyRent;
    }
    public double calculateTotalCost() {
        return dailyRent * RentalDays;
    }
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Car Model: " + CarModel);
        System.out.println("Rental Days: " + RentalDays);
        System.out.println("Daily Rate: $" + dailyRent);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
    public static void main(String args[]){
        CarRental rental = new CarRental("Red Car", "BMW", 5, 5);
        rental.displayRentalDetails();
    }
}
