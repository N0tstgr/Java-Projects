package BankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class SignupOne  extends JFrame{
    SignupOne(){
        Random ran = new Random();
        System.out.println(Math.abs(ran.nextLong() % 9000L) + 1000);
        JLabel formno = new JLabel("Application FORM NO");
        getContentPane().setBackground(Color.gray);
             setSize(850, 800);
             setLocation(350,10);
             setVisible(true);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
