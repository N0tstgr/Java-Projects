package BankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class SignupOne  extends JFrame{
    SignupOne(){
        setLayout(null);

        Random ran = new Random();
        long random = (Math.abs(ran.nextLong() % 9000L) + 1000);

        JLabel formno = new JLabel("APPLICATION FORM NO : " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 35));
        formno.setBounds(147, 80 ,600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Enter your Person details");
        personalDetails.setFont(new Font("Raleway" , Font.BOLD, 30));
        personalDetails.setBounds(250 ,20, 6000, 40);
        add(personalDetails);


        getContentPane().setBackground(Color.gray);
             setSize(850, 800);
             setLocation(350,10);
             setVisible(true);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
