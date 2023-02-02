import java.util.ArrayList;

public class LibrarySystem {
        private ArrayList<Librarian> librarians;
        private ArrayList<Books> books;
        private int numberofBooks;
        private int numberofEmployees;
        private int numberofBorrowedBooks;

        public LibrarySystem(ArrayList<Librarian> librarians) {
            this.librarians = librarians;
        }

        public LibrarySystem(Librarian librarian) {
            this.librarians.add(librarian);
        }


    }

