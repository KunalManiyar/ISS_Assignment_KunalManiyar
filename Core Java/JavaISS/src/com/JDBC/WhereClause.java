package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WhereClause {
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
   static final String USER = "root";
   static final String PASS = "0000";
   static final String QUERY = "SELECT id, fname, lname, age FROM Registration";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();) {		      
         System.out.println("Fetching records without condition...");
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First Name: " + rs.getString("fname"));
            System.out.println(", Last Name: " + rs.getString("lname"));
         }
//         Output
//         Fetching records without condition...
//         ID: 100, Age: 21, First Name: Kunal, Last Name: Maniyar
//         ID: 101, Age: 25, First Name: Dhruvin, Last Name: Nagda
//         ID: 102, Age: 30, First Name: Virag, Last Name: Shah
//         ID: 103, Age: 28, First Name: Sumit, Last Name: Mittal

         // Select all records having ID equal or greater than 101
         System.out.println("Fetching records with condition...");
         String sql = "SELECT id, fname, lname, age FROM Registration" +
            " WHERE id >= 101 ";
         rs = stmt.executeQuery(sql);

         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First Name: " + rs.getString("fname"));
            System.out.println(", Last Name: " + rs.getString("lname"));
         }
         rs.close();
         
//         Output
//         Fetching records with condition...
//         ID: 101, Age: 25, First Name: Dhruvin, Last Name: Nagda
//         ID: 102, Age: 30, First Name: Virag, Last Name: Shah
//         ID: 103, Age: 28, First Name: Sumit, Last Name: Mittal
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
