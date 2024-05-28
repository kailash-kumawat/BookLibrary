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

/**import java.util.Collections;
import java.util.List;

public class BookDB {

    // This method should be implemented to retrieve all existing book IDs from your database.
    public static List<Integer> getAllBookIds() {
        // Example data, replace this with actual database call.
        return List.of(1, 2, 4);
    }

    public static int generateNewBookId() {
        List<Integer> ids = getAllBookIds();

        if (ids.isEmpty()) {
            return 1; // Return 1 if there are no IDs in the database.
        }

        // Sort the list to find the first missing ID in sequence.
        Collections.sort(ids);

        for (int i = 0; i < ids.size(); i++) {
            // If the current ID is not equal to the expected sequential ID, return the expected ID.
            if (ids.get(i) != i + 1) {
                return i + 1;
            }
        }

        // If no missing ID in the sequence, return the next ID in the sequence.
        return ids.size() + 1;
    }

    public static void main(String[] args) {
        int newBookId = generateNewBookId();
        System.out.println("The new book ID is: " + newBookId);
    }
}**/
