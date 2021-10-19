package project1;
import java.awt.event.*;
import javax.swing.*;

public class FormLogin implements ActionListener {
    
    public FormLogin(){
        Components();
    }

    // Attr Global
    JFrame frame;
    JTextField user;
    JPasswordField pass;
    JLabel lbUser, lbPass, lbTitle, lbNotif;
    JButton bLogin;
    

    public void Components(){
        // Attributes
        frame = new JFrame("Form Login");
        user = new JTextField();
        pass = new JPasswordField();
        lbUser = new JLabel("Username");
        lbPass = new JLabel("Password");
        lbTitle = new JLabel("Form Login");
        lbNotif = new JLabel("");
        bLogin = new JButton("Login");

        // Sets Component
        lbTitle.setBounds(110,25,100,25);
        lbUser.setBounds(25,80,80,25);
        user.setBounds(120,80,120,25);
        lbPass.setBounds(25,120,80,25);
        pass.setBounds(120,120,120,25);
        bLogin.setBounds(120,150,75,30);
        lbNotif.setBounds(25,180,280,30);

        // Merge
        frame.add(lbTitle); frame.add(user); frame.add(lbNotif);
        frame.add(lbUser); frame.add(pass);
        frame.add(lbPass); frame.add(bLogin);

        // Events
        bLogin.addActionListener(this);


        // Components
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,350);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inp1 = ("Pass : "+user.getText());
        String inp = new String(pass.getPassword());
        String inp2 = (" Password : "+inp);
        String data = inp1 + inp2;

        String notif = String.valueOf(data);
        lbNotif.setText(notif);
        
    }

    
    public static void main(String[] args) {
        new FormLogin();
    }

}
