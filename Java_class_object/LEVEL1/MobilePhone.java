public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displaymobile(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("---------------");
    }

    public static void main(String args[]){
        MobilePhone mobile1 = new MobilePhone("VIVO","VIVO V29",15999);
        MobilePhone mobile2 = new MobilePhone("ONE PLUS","ONE PLUS nord4",39999);
        MobilePhone mobile3 = new MobilePhone("APPLE","iphone pro16",89999);

        mobile1.displaymobile();
        mobile2.displaymobile();
        mobile3.displaymobile();
    }
}
