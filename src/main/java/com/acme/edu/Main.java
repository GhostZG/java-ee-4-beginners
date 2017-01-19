package com.acme.edu;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Driver Types: 1 (jdbc-odbc bridge), 2 (native), 3 (network), 4 (pure java)
//        Class.forName("driver class");
        try(Connection connection = 
                DriverManager.getConnection("jdbc:derby://localhost/example;create=true", "APP", "APP")) {
                Statement st = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
                
                connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
                connection.getWarnings();
                connection.setAutoCommit(false);
//                st.executeUpdate("INSERT INTO USERS VALUES(9,'9')");
                PreparedStatement psmt = connection.prepareStatement("INSERT INTO USERS VALUES(?,?)");
                psmt.setInt(1, 8);
                psmt.setString(2, "8");
                psmt.executeUpdate();
                psmt.getWarnings();
                
                ResultSet rs = st.executeQuery("SELECT * FROM USERS");
                while(rs.next()) {
//                    rs.previous();
                    System.out.println(
                        rs.getInt(1) + ":" +
                        rs.getString("NAME")
                    );
//                    rs.updateInt("name", 3);
//                    rs.updateRow();
                }
                connection.commit();
        }
    }
}

class MyDriver {
    static  {
//        DriverManager.registerDriver(new MyDriver());
    }
}