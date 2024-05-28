import java.util.*;

class ManageLibrry {
    Scanner sc = new Scanner(System.in);
    BookDB createDB = new BookDB();
    BookInfo book = new BookInfo();

    public void Librry(int option) {
        switch (option) {
            case 1:
                book.info();
                createDB.createBook();
                createDB.getLibrry();
                break;

            case 2:
                System.out.println("Enter the book ID to publish:  ");
                int bookId = sc.nextInt();
                createDB.dlteBook(bookId);
                createDB.getLibrry();
                break;

            case 3:
                System.out.println("Enter Book id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter new book name: ");
                String bookName = sc.nextLine();
                createDB.updteBookName(bookName, id);
                createDB.getLibrry();
                break;

            case 4:
                System.out.println("Enter Book id: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter new author name: ");
                String authrName = sc.nextLine();
                createDB.updteAuthr(authrName, id);
                createDB.getLibrry();
                break;

            case 5:
                createDB.getLibrry();
                break;

            case 0:
                System.out.println("You Exit!!");
                System.exit(0);
                // book.info();

                break;

            default:
                System.out.println("Invalid Choice!!");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageLibrry opt = new ManageLibrry();

        while (true) {
            System.out.println("\nEnter 1 to add a book");
            System.out.println("Enter 2 to Delete a book");
            System.out.println("Enter 3 to update a book name");
            System.out.println("Enter 4 to update a author name");
            System.out.println("Enter 5 to see collection of books");
            System.out.println("Enter 0 to exit!!");
            int choice = sc.nextInt();
            opt.Librry(choice);
        }

    }
}
// WHAT TO FIX NEXT
// Book id always genrt in the form of n+1