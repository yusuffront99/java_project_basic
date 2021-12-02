/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApkOperasiDuaAngka;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author myusu
 */

public class Filter {
    public static void digitFilter(KeyEvent evt){
        char inp = evt.getKeyChar();
        if(!((Character.isDigit(inp)) || (inp == KeyEvent.VK_BACK_SPACE) || (inp == KeyEvent.VK_DELETE))){
            new JFrame().getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Error");
            evt.consume();
        }
    }
}
