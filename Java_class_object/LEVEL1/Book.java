class Book {
    String title;
    String author;
    int price;

    Book(String title,String author,int price){
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
        Book book1 = new Book("2States","Chetan bhagat",500);
        Book book2 = new Book("Wings of Fire","Abdul kalam A.P.J",500);
        book1.displaydetails();
        book2.displaydetails();
    }
}
