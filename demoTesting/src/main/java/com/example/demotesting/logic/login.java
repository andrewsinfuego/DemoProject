package com.example.demotesting.logic;
import com.example.demotesting.model.Login;

import static com.example.demotesting.utilities.dbConnector.getConnection;
import java.sql.*;



public class login {
    public boolean loginQuery(Login userData) throws SQLException {
        boolean init = true;
        Statement stmt=getConnection().createStatement();
        String query = "select * from login where userid = " + userData.getUserID() + " and password = " + userData.getPassword();
        ResultSet rs=stmt.executeQuery(query);
        init = rs.next();
        getConnection().close();
        return init;
    }
}
