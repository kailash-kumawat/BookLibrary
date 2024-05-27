public class query {
    static String create = "INSERT INTO Librry_Book (bookId, bookName, authorName, bookDate) VALUES(?, ?, ?, ?)";
    static String read = "SELECT * FROM Librry_Book";
    static String getBookId = "SELECT bookId FROM Librry_Book";
    static String updteBook = "UPDATE Librry_Book set bookName = ? where bookId = ?";
    static String updteAuthr = "UPDATE Librry_Book set authorName = ? where bookId = ?";
    static String dlte = "DELETE FROM Librry_Book WHERE bookId = ?";
}