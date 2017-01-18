/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author eugene
 */

public class Main {
    public static void main(String[] args) {
        //JDBC Drivers: Type 1 (jdbc-odbc bridge), 2 (native), 3 (network), 4 (pure java)
        try (Connection connection = 
                DriverManager.getConnection("jdbc:derby://localhost:1527/example;create=true", "APP", "APP");) {
          
            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
//            Statement s = connection.createStatement();
//            s.executeUpdate("INSERT INTO USERS VALUES(6, '" + 6 + "')");

            connection.getWarnings();
            PreparedStatement s = connection.prepareStatement("INSERT INTO USERS VALUES(?, ?)");
            
            s.setInt(1, 5);
            s.setString(2, "5");
            s.executeUpdate();
            
            s.getWarnings();
            ResultSet rs = s.executeQuery("SELECT * FROM USERS");

            while(rs.next()) { 
//                rs.previous();
//                rs.deleteRow();
//                rs.updateByte(1, (byte)7);
               
                System.out.println(rs.getInt(1) + ":" + rs.getString("NAME"));
            }
            
            connection.commit();
            
        } catch (SQLException ex) {
            SQLException n = null;
            while((n = ex.getNextException()) != null) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
             
    }
}

class MySuperDriver {
    static {
        DriverManager.registerDriver(new MySuperDriver());
    }
}
