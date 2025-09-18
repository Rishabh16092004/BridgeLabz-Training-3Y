package OOPs_Piller;

import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getBorrower() { return borrower; }
    public void setBorrower(String borrower) { this.borrower = borrower; }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved;

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 21; }

    public boolean reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !reserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 7; }

    public boolean reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !reserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 14; }

    public boolean reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !reserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B101", "Java Basics", "James"));
        items.add(new Magazine("M202", "Tech Today", "Editor A"));
        items.add(new DVD("D303", "Inception", "Nolan"));

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails() + " | Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                if (r.reserveItem("Alice")) {
                    System.out.println(item.getTitle() + " reserved successfully.");
                } else {
                    System.out.println(item.getTitle() + " is already reserved.");
                }
                System.out.println("Available: " + r.checkAvailability());
            }
        }
    }
}

