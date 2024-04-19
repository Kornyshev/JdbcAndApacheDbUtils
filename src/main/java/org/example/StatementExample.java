package org.example;

import java.sql.*;

public class StatementExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Students";
        String username = "postgres";
        String password = "postgres";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            Statement statement = connection.createStatement();

            int studentId = 600;
            String firstName = "Vasya";
            String lastName = "Petrov";
            int age = 80;
            double gpa = 5.0;

            String sql = "INSERT INTO public.students (studentid, firstname, lastname, age, gpa) " +
                    "VALUES (" + studentId + ", '" + firstName + "', '" + lastName + "', " + age + ", " + gpa + ")";

            // Execute the SQL statement
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println(rowsAffected + " row(s) inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
