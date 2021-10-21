package Practices1;
import javax.swing.*;

public class Table {
    
    JFrame frame = new JFrame("Table");

    public Table(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String data[][] = {{"1","Ahmad","Teknik Informatika"},{"2","Arya","Sistem Komputer"}, {"3","Indah","Teknik Sipil"}};
        String column[] = {"No","Name","Major"};

        JTable table = new JTable(data,column);
        table.setBounds(10,40,100,300);
        JScrollPane scroll = new JScrollPane(table);
        frame.add(scroll);
        frame.setSize(300,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Table();
    }
}
