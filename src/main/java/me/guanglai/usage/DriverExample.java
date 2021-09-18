package me.guanglai.usage;

import me.guanglai.driver.ToyDriver;

import java.sql.*;

public class DriverExample {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new ToyDriver());
            Connection connection = DriverManager.getConnection("jdbc:txt:~/toyDriver");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM toy_db");
            String result = resultSet.getString(1);
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
