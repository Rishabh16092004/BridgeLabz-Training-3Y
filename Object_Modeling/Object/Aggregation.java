package Object;

import java.util.ArrayList;

class Book{
    private String author;
    private String title;

    Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    void displaybook(){
        System.out.println("Author: "+author);
        System.out.println("Title: "+title);
    }

}
public class Aggregation {
    public static void main(String[] args) {
        Book book1=new Book("james","core-java");
        Book book2=new Book("aristotle","chemistry");
        Book book3=new Book("johnes","python");

        library library1=new library("GeetaLibrary");
        library library2=new library("CentralLibrary");
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2);
        library2.addBook(book3);

        library1.displayLibrary();
        library2.displayLibrary();
    }

}
class library{
    String name;
    private ArrayList<Book> books;

    library(String name){
        this.name=name;
        this.books=new ArrayList<Book>();
    }

    void addBook(Book book){
        books.add(book);
    }
    void displayLibrary(){
        for(Book book:books){
            book.displaybook();
        }
        System.out.println();
    }

}
