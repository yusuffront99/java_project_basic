package Practices1;
import javax.swing.*;

public class List {
    
    public List(){
        JFrame frame = new JFrame("List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultListModel<String>lists = new DefaultListModel<>();
        lists.addElement("Java");
        lists.addElement("Javascript");
        lists.addElement("Python");
        lists.addElement("php");

        JList<String> list = new JList<>(lists);
        list.setBounds(100,100,75,75);
        frame.add(list);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new List();
    }
}
