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

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 38));
        cardno.setBounds(100, 160, 180, 40);
        add(cardno);

        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 168, 250, 30);
        add(cardTextField);



        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 38));
        pin.setBounds(100, 220, 250, 40);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 228, 250, 30);
        add(pinTextField);

        JButton login = new JButton("Sign IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        add(login);

        JButton clear = new JButton("Clear");
        clear.setBounds(450, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        add(clear);

        getContentPane().setBackground(Color.lightGray);
        setSize(810, 490);
        setVisible(true);
        setLocation(400, 150);
    }

    public static void main(String[] args) {
        new Login();

    }
}
