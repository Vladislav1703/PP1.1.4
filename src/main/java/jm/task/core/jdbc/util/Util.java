package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection;
    private static final String url = "jdbc:mysql://localhost:3306/store?autoReconnect=true&useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String pass = "123q123q";


    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Disconnection :(");
            e.printStackTrace();
        }

        return connection;
    }
}
