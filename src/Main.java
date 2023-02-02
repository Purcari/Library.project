import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Librarian> librarians = new ArrayList<>();

        Librarian librarian = new Librarian("Sabina Bedeu", " monday and tuesday " );
        Librarian librarian1 = new Librarian("olivia Arnaut", " friday and sunday");

        librarians.add(librarian);

        System.out.println(librarian);
        System.out.println(librarian1);

    }
}