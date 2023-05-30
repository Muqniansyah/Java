/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quisPraUTS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author User
 */
public class quis extends JFrame implements ActionListener {    
//          buat komponen form dan buat panel untuk menyusun komponen form
        JPanel panel = new JPanel();
        JLabel judull = new JLabel("Welcome");       
        JLabel labelUsername = new JLabel("Username");
        JLabel labelPassword = new JLabel("Password");       
        JTextField textUsername = new JTextField();
        JPasswordField textPassword = new JPasswordField();   
        JButton b1 = new JButton("Login");

        public quis() {
//            menampilkan komponen form dan panel
            add(judull);           
            add(labelUsername);
            add(labelPassword);           
            add(textUsername);
            add(textPassword);       
            add(b1);           
            add(panel);
            
//            set jarak
           judull.setBounds(80, 10, 60, 50);
           labelUsername.setBounds(15, 50, 80, 25);
           labelPassword.setBounds(15, 80, 125, 25);           
           textUsername.setBounds(120,50,110,25);
           textPassword.setBounds(120,80,110,25);           
           b1.setBounds(15,190,100,25);
           
//              action listener           
           b1.addActionListener(this);   
           
//            untuk close window
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           
//            set warna login button
           b1.setBackground(Color.BLUE);    
           b1.setForeground(Color.WHITE);

        }
        
        public void actionPerformed(ActionEvent event) {
            String username = textUsername.getText();
            String password = new String (textPassword.getPassword());
            
            if (username.equals("admin")&& password.equals("admin")){
               JOptionPane.showMessageDialog(this, "login Successfull");
               textUsername.setText("");
               textPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "login failed");
            }
        }
    
        public static void main(String[] args){
            quis login=new quis();
            login.setTitle("Login page");
            login.setSize(300,300);
            login.setVisible(true);
        }
}
