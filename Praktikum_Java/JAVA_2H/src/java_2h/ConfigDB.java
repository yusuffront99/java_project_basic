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
import java.sql.Statement;

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
    
    //SEMI MANUAL 
    public void SimpanFilmStatement(String KodeFilm, String Judul, String Genre, String Tahun, String Asal, String Stok){
        try {
            String SQLSimpan = "INSERT INTO film (KodeFilm, Judul, Genre, Tahun, Asal, Stok) VALUES ('"+KodeFilm+"','"+Judul+"','"+Genre+"','"+Tahun+"', '"+Asal+"','"+Stok+"')";
            Statement perintah = getConnect().createStatement();
            int i = perintah.executeUpdate(SQLSimpan);
            System.out.println(i);
            perintah.close();
            getConnect().close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
   
}
