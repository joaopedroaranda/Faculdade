package main.java.biblioteca.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection getConnection() throws SQLException(

        return DriverManager.getConnection(URL, USER, PASSWORD);
    )


    
}
