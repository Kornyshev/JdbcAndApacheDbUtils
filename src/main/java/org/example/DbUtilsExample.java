package org.example;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.*;
import java.util.List;

public class DbUtilsExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Students";
        String username = "postgres";
        String password = "postgres";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            QueryRunner queryRunner = new QueryRunner();
            BeanListHandler<Student> handler = new BeanListHandler<>(Student.class);
            String query = "SELECT * FROM public.students WHERE age < ? AND gpa < ?";
            List<Student> students = queryRunner.query(connection, query, handler, 30, 3.5);
            students.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
