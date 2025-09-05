public class Book {
    String title;
    String author;
    double price;

    Book(){
        title ="Core java";
        author="jones";
        price=700;
    }

    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("-----------------");
    }

    public static void main(String args[]){
        Book book1=new Book();
        Book book2=new Book("Programming","james bond",1000);
        book1.display();
        book2.display();
    }

}
