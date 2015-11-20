package ro.ing.ingkey.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Cristina on 20.11.2015.
 */
public class DatabaseConnector {
    private static Connection connection;

    public static Connection getConnection(){
        try {
            connection =
                DriverManager.getConnection("jdbc:mysql://192.168.145.54:3306/ingkey?user=root&password=pumahack15");
            System.out.println("yey");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
