package org.example;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Students";
        String username = "postgres";
        String password = "postgres";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM Students"))
        {
            while (resultSet.next()) {
                int id = resultSet.getInt("studentId");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: "
                        + firstname + " " + lastname + ", Age: " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
