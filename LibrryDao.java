import java.sql.Connection;
import java.sql.DriverManager;

public class LibrryDao {
    static Connection con = null;

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "BookLibrry_DB";
            String userName = "root";
            String password = "root";

            con = DriverManager.getConnection(url + db, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}