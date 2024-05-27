import java.time.LocalDate;
import java.util.Scanner;

public class BookInfo {
    Scanner sc = new Scanner(System.in);
    LocalDate curntDate = LocalDate.now();

    public void info() {
        int id = BookDB.getBookId();
        int BookId = 0;
        BookId = id + 1;
        // System.out.println(BookId);

        // System.out.println("Enter Book ID: ");
        // int id = sc.nextInt();
        // sc.nextLine();
        System.out.println("Enter Book Name: ");
        String bookName = sc.nextLine();
        System.out.println("Enter Author Name: ");
        String authr = sc.nextLine();

        Books book = new Books(bookName, authr, BookId, curntDate);
    }
}