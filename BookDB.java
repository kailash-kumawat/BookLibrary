import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class BookDB {
    public void createDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/";

            String databaseName = "BookLibrry_DB";
            String userName = "root";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, userName, password);

            String query = "CREATE DATABASE " + databaseName;

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            JOptionPane.showMessageDialog(null, databaseName + " Database has been created successfully",
                    "System Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTableBook() {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "BookLibrry_DB";

            String userName = "root";
            String password = "root";

            Connection connection = DriverManager.getConnection(url + db, userName,
                    password);

            String query = "CREATE TABLE Librry_Book (bookId int(200) PRIMARY KEY, bookName varchar(200), authorName varchar(200), bookDate varchar(50))";

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            // JOptionPane.showMessageDialog(null, " Table has been created successfully",
            // "System Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createBook() {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = LibrryDao.connect();
            String q = query.create;

            Connection connection = conn;
            preparedStatement = connection.prepareStatement(q);

            preparedStatement.setInt(1, Books.getId());
            preparedStatement.setString(2, Books.getBook());
            preparedStatement.setString(3, Books.getAuthr());
            preparedStatement.setObject(4, Books.getDate());

            int rowsAffected = preparedStatement.executeUpdate();

            preparedStatement.close();
            if (rowsAffected > 0) {
                System.out.println("Book Added successfully");
            } else {
                System.out.println("Book Not Added");
            }
        } catch (Exception e) {
            System.out.println("BOOK ID ALREADY EXISTS!! ");
            // e.printStackTrace();
        }

    }

    public void getLibrry() {
        try {
            Connection con = LibrryDao.connect();
            String q = query.read;
            Connection connection = con;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(q);
            while (rs.next()) {
                ArrayList<String> List = new ArrayList<String>();

                List.add(" Id = " + rs.getInt(1));
                List.add(" Book = " + rs.getString(2));
                List.add(" Author = " + rs.getString(3));
                List.add(" Date = " + rs.getString(4));
                System.out.println(List);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updteBookName(String name, int id) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = LibrryDao.connect();
            String q = query.updteBook;
            Connection connection = conn;
            preparedStatement = connection.prepareStatement(q);
            preparedStatement.setInt(2, id);
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " Book Updated.");
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updteAuthr(String authrName, int id) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = LibrryDao.connect();
            String q = query.updteAuthr;
            Connection connection = conn;
            preparedStatement = connection.prepareStatement(q);
            preparedStatement.setInt(2, id);
            preparedStatement.setString(1, authrName);
            preparedStatement.executeUpdate();

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " Book Updated.");
            preparedStatement.close();
            // JOptionPane.showMessageDialog(null, " Data Updated successfully",
            // "System Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dlteBook(int idBook) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = LibrryDao.connect();
            String q = query.dlte;

            Connection connection = conn;

            preparedStatement = connection.prepareStatement(q);
            preparedStatement.setInt(1, idBook);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " Book Published.");

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getBookId() {
        int id = -1;
        try {
            Connection con = LibrryDao.connect();
            String q = query.getBookId;
            Connection connection = con;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(q);
            while (rs.next()) {
                id = rs.getInt(1);
                // System.out.println(" Id = " + id);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
}