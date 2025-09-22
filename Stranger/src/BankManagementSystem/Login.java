package BankManagementSystem;
import javax.swing.*;
import java.awt.*;


public class Login extends JFrame {
    Login(){
        setTitle("AUTOMATED TELLER MACHINE(ATM)");
        setLayout(null);
        ImageIcon i1   = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));

        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        setSize(810, 490);
        setVisible(true);
        setLocation(400, 150);
    }

    public static void main(String[] args) {
        new Login();

    }
}
