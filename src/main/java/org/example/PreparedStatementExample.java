package org.example;

import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Students";
        String username = "postgres";
        String password = "postgres";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            int studentId = 700;
            String firstName = "Alice";
            String lastName = "Smith";
            int age = 21;
            double gpa = 3.8;

            String sql = "INSERT INTO public.students (studentid, firstname, lastname, age, gpa) VALUES (?, ?, ?, ?, ?)";

            // Use PreparedStatement to safely insert data
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentId);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setInt(4, age);
            preparedStatement.setDouble(5, gpa);

            // Execute the prepared statement
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
