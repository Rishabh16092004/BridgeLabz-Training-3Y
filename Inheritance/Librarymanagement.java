class book{
    String title;
    int publicationYear;

    book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo(){
        System.out.println("Book Title: "+title);
        System.out.println("PublicationYear: "+publicationYear);
    }
}

class Author extends book{
    String name;
    String bio;
    Author(String title,int publicationYear, String name, String bio) {
        super(title,publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name: "+name);
        System.out.println("Author Bio: "+bio);
    }
}
public class Librarymanagement {
    public static void main(String[] args) {
        Author a1 = new Author("Effective Java",2018,"joshua Bloch","Expert in java and software engineering");
        a1.displayInfo();
    }
}
