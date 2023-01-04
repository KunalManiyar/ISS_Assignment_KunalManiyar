package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
   static final String USER = "root";
   static final String PASS = "0000";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO Registration VALUES (100, 'Kunal', 'Maniyar', 21)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (101, 'Dhruvin', 'Nagda', 25)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (102, 'Virag', 'Shah', 30)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}