package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection;
    private static final String url = "jdbc:mysql://localhost:3306/store";
    private static final String user = "root";
    private static final String pass = "123q123q";


    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("All good!");
        } catch (SQLException e) {
            System.out.println("All bad!");
            e.printStackTrace();
        }

        return connection;
    }
}
