package database;

import model.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbEngine {

    private Connection connection;

    public DbEngine() {
        connection = connect();
    }

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/rpgdb"  +
                "?" +
                "useUnicode = yes" +
                "&" +
                "characterEncoding = UTF-8";


        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASS"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error");
        }
        return null;
    }

    public boolean isConnected() {
        return (connection != null);
    }

    public List<Player> listPlayers() {
        String query = "SELECT * FROM player;";
        List<Player> temp = new ArrayList<>();
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(query);
            while(rs.next()) {
                temp.add(new Player(
                        rs.getString("username"),
                        rs.getString("email_address"),
                        rs.getTimestamp("reg_date")
                ));
            }
        }catch (SQLException e) {
            System.out.println("error");
        }
        return temp;
    }
}
