public class LibrarySystem {
    String title;
    String author;
    double price;
    boolean availability;
    LibrarySystem(String title,String author,double price,boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    public boolean borrow() {
        if (availability) {
            availability = false;
            System.out.println("You successfully borrowed \"" + title + "\".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available.");
            return false;
        }
    }
    public static void main(String args[]){
        LibrarySystem book1 = new LibrarySystem("Java","James",700,true);
        book1.borrow();
        book1.borrow();
    }
}
