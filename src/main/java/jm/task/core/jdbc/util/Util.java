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
            System.out.println("Connection good!");
        } catch (SQLException e) {
            System.out.println("Connection bad!");
            e.printStackTrace();
        }

        return connection;
    }
}
