class HandleBook {
    String title;
    String author;
    int price;

    HandleBook(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displaydetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    public static void main(String args[]){
        HandleBook handleBook1 = new HandleBook("2States","Chetan bhagat",500);
        HandleBook handleBook2 = new HandleBook("Wings of Fire","Abdul kalam A.P.J",500);
        handleBook1.displaydetails();
        handleBook2.displaydetails();
    }
}
