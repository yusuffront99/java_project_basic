/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkbiodatamahasiswa;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author myusu
 */
public class Methods {
    
    DefaultTableModel dtm = new DefaultTableModel();
    public Methods(){}
   
    public void setTitleTable(JTable table, String[] titles){
        try {
            table.setModel(dtm);
            dtm.getDataVector().removeAllElements();
            dtm.fireTableDataChanged();
            
            
            for (int i = 0; i < titles.length; i++) {
                dtm.addColumn(titles[i]);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void printFile(String FileName, StringBuffer FileTable) throws IOException{
        BufferedWriter output = new BufferedWriter(new FileWriter(FileName));
        output.write(FileTable.toString());
        output.newLine();
        output.flush();
        output.close();
    }
    
    public void Hapus(String tbl, String split, String command){
        try {
            int delRows = JOptionPane.showConfirmDialog(null, "Are you sure deleted the data?", "Notif--Delete",JOptionPane.NO_OPTION);
            
            if(delRows == JOptionPane.YES_OPTION){
                int x = Integer.parseInt("tbl"+"split"+"command");
                dtm.removeRow(x);
                JOptionPane.showMessageDialog(null, "Data Deleted Successfully","Alert--Delete",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
   
}
