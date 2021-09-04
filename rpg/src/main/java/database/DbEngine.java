package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbEngine {

    private Connection connection;

    public DbEngine() {
        connection = connect();
    }

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/rpgdb";


        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASS"));

        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error");
        }
        return null;
    }

    public boolean isConnected() {
        return (connection != null);
    }
}
