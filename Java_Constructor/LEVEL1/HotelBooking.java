public class HotelBooking {
    String guestName;
    String roomtype;
    int nights;

    HotelBooking(){
        guestName="Rishabh";
        roomtype="A.C";
        nights=3;
    }
    HotelBooking(String guestName,String roomtype,int nights){
        this.guestName=guestName;
        this.roomtype=roomtype;
        this.nights=nights;
    }

    HotelBooking(HotelBooking previous){
        this.guestName=previous.guestName;
        this.roomtype=previous.roomtype;
        this.nights=previous.nights;
    }

    void display(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room Type: "+roomtype);
        System.out.println("Nights: "+nights);
        System.out.println("----------------------");
    }

    public static void main(String args[]){
        HotelBooking booking1=new HotelBooking();
        HotelBooking booking2=new HotelBooking("Aryan","A.C",2);
        HotelBooking booking3=new HotelBooking(booking2);
        booking1.display();
        booking2.display();
        booking3.display();
    }
}
