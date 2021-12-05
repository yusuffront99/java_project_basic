/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkbiodatamahasiswa;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author myusu
 */
public class Methods {
    public Methods(){}
   
    public void setTitleTable(JTable table, String[] titles){
        try {
            DefaultTableModel model = new DefaultTableModel();
            table.setModel(model);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            
            
            for (int i = 0; i < titles.length; i++) {
                model.addColumn(titles[i]);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
