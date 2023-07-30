package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/college.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("<html>Developed By: </html>");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel name1 = new JLabel("02 Mamta Yadav");
        name1.setBounds(70, 250, 200, 50);
        name1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(name1);
        
        JLabel name2 = new JLabel("12 Vanshika Bais");
        name2.setBounds(70, 270, 200, 50);
        name2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(name2);
        
        JLabel name3 = new JLabel("22 Aditya Yadav");
        name3.setBounds(70, 290, 200, 50);
        name3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(name3);
        
        JLabel name4 = new JLabel("38 Kapil Pawar");
        name4.setBounds(70, 310, 200, 50);
        name4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(name4);
        
//        JLabel rollno = new JLabel("Roll number: 1533146");
//        rollno.setBounds(70, 280, 550, 40);
//        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
//        add(rollno);
        
        JLabel contact = new JLabel("SE Lab : CSP357           2023-2024");
        contact.setBounds(70, 380, 550, 40);
        contact.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
