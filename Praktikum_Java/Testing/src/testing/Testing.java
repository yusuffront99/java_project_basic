/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import java.sql.SQLException;

/**
 *
 * @author myusu
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        new ConfigDB().getKoneksi();
    }
    
}
