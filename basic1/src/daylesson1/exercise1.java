package daylesson1;
import javax.swing.*;

public class exercise1 {
    public static void main(String[] args) {
        JFrame form = new JFrame("Form Perpustakaan");
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // label
        JLabel title = new JLabel("Form Perpustakaan");
        title.setBounds(130,20,130,30);
        form.add(title);

        JLabel sublbl1 = new JLabel("Kode Buku");
        sublbl1.setBounds(50,70,130,30);
        form.add(sublbl1);

        // textfield
        JTextField subinp1 = new JTextField();
        subinp1.setBounds(180, 70,130,30);
        form.add(subinp1);





        form.setSize(400,500);
        form.setLayout(null);
        form.setVisible(true);
    }
}
