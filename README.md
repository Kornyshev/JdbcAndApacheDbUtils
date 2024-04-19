# JdbcAndApacheDbUtils Project

## Introduction
This project demonstrates the use of JDBC (Java Database Connectivity) and Apache Commons DbUtils to interact with databases in Java. The main objective is to provide clear examples of how to effectively manage database operations using these technologies.

## Project Purpose
The purpose of this project is to:
- Demonstrate how to establish a connection to a database using JDBC.
- Show how to perform CRUD operations (Create, Read, Update, Delete) using JDBC and Apache DbUtils.
- Illustrate best practices in managing database connections and resources.
- Provide examples of how to use ResultSetHandlers to simplify data processing with Apache DbUtils.

## Background Theory

### JDBC
JDBC is a Java API that is used to connect and execute queries with a database. It provides methods to query and update data in a database, and is oriented towards relational databases. JDBC acts as a bridge between databases and Java applications.

### Apache Commons DbUtils
Apache Commons DbUtils is a library that enhances JDBC's productivity-focused simplicity. It abstracts some of the tedious tasks associated with JDBC like connection management, resource cleanup, and exception handling. DbUtils makes it easier to execute SQL queries, update statements, and handle result sets.

## Technologies Used
- **JDBC**: Core Java API for managing database interactions.
- **Apache Commons DbUtils**: A utility library that simplifies JDBC code, reducing the amount of boilerplate code needed.

## Database Setup and Sample Data
Included in this project is a SQL script, `sql_script.sql`, which provides the commands to:
- Drop the existing `students` table if it exists.
- Create a new `students` table.
- Populate the `students` table with sample data.

To run this script, you will need a PostgreSQL database setup. Here's how to install PostgreSQL and create your database:

### Installing PostgreSQL and pgAdmin
1. **Download and Install PostgreSQL**: Visit [PostgreSQL official site](https://www.postgresql.org/download/) and select the appropriate installer for your operating system. Follow the installation prompts, including the setup of the initial database and your PostgreSQL superuser password.
2. **Install pgAdmin**: pgAdmin usually comes with the PostgreSQL installer. It's a web-based administration tool for PostgreSQL. If not included, you can download it separately from [pgAdmin.org](https://www.pgadmin.org/).

### Creating the Database
1. **Open pgAdmin**, connect to your PostgreSQL server using the credentials set during installation.
2. **Create a new database**:
    - Right-click on 'Databases', then 'Create', then 'Database'.
    - Name your database `Students` and click 'Save'.

### Running the SQL Script
- Open the `sql_script.sql` file using pgAdmin's query tool and execute the script to set up your table and insert the sample data.


## Dependencies
This project relies on the following Maven dependencies:
```xml
<dependencies>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.3</version>
    </dependency>
    <dependency>
        <groupId>commons-dbutils</groupId>
        <artifactId>commons-dbutils</artifactId>
        <version>1.8.1</version>
    </dependency>
</dependencies>
```