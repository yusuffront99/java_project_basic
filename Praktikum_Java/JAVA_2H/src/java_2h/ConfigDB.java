/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_2h;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author myusu
 */
public class ConfigDB {
    
    private String url = "jdbc:mysql://localhost:3306/dbfilm";
    private String user = "root";
    private String pass = "";
    
    //CONSTRUCTOR    
    public ConfigDB(){}

    public Connection getConnect() throws SQLException{
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);
            System.out.println("Connected successfully");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return DriverManager.getConnection(url,user,pass);
    }
   
}
