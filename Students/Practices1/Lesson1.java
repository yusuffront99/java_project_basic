/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practices1;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author myusu
 */
public class Lesson1 extends JFrame {
    JFrame frame = new JFrame("Form");
    JButton btn1 = new JButton("One");    
    JButton btn2 = new JButton("One");
    JButton btn3 = new JButton("One");    
    JButton btn4 = new JButton("One");
    JButton btn5= new JButton("One");    
    JButton btn6 = new JButton("One");

    public Lesson1(){
        super("Hello World");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(3,3));
        add(btn1, BorderLayout.SOUTH);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Lesson1();
    }
}
