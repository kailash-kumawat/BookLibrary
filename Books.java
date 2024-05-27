import java.time.LocalDate;

public class Books {
    static String bookName;
    static String authrName;
    static int bookId;
    static LocalDate date;

    public Books(String bookName, String authrName, int bookId, LocalDate curntDate) {
        Books.bookName = bookName;
        Books.authrName = authrName;
        Books.bookId = bookId;
        Books.date = curntDate;
    }

    public static String getBook() {
        return bookName;
    }

    public static String getAuthr() {
        return authrName;
    }

    public static int getId() {
        return bookId;
    }

    public static LocalDate getDate() {
        return date;
    }
}