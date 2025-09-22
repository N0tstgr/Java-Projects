package BankManagementSystem;
import javax.swing.*;

public class Login extends JFrame {
    Login(){
        setTitle("AUTOMATED TELLER MACHINE(ATM)");
        ImageIcon i1   = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        JLabel label = new JLabel(i1);
        add(label);
        setSize(810, 490);
        setVisible(true);
        setLocation(400, 150);
    }



    public static void main(String[] args) {
        new Login();

    }
}
