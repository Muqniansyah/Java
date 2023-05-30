/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanForm;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.* digunakan jika menggunakan event listener
import java.awt.event.*;
/**
 *
 * @author User
 */
public class GuiSwing extends JFrame{
//    buat panel dan buat komponen form untuk menyusun komponen form
    JPanel pl = new JPanel();
    JLabel lbl1 = new JLabel("String I");
    JLabel lbl2 = new JLabel("String II");
    JLabel lbl3 = new JLabel("Hasil");
    
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    
    JButton b1 = new JButton("PROSES");
    JButton b2 = new JButton ("HAPUS");
    
    public GuiSwing() { 
        add(lbl1);
        add(lbl2);
        add(lbl3);

        add(t1);
        add(t2);
        add(t3);

        add(b1);
        add(b2);
        add(pl);
        
        setTitle("GUI Swing");
        setBounds(100,100,300,300);
        lbl1.setBounds(15, 20, 80, 25);
        lbl2.setBounds(15, 55, 125, 25);
        lbl3.setBounds(15, 90, 125, 25);
        
        t1.setBounds(120,20,80,25);
        t2.setBounds(120,50,110,25);
        t3.setBounds(120,80,150,25);
        
        b1.setBounds(15,190,100,25);
        b2.setBounds(120,190,80,25);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            kirimdata();}
            });
        
    
        b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            hapusdata();}
            });
    }
    
    public void hapusdata() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
    
    public static void main(String[] args) {
        GuiSwing demo = new GuiSwing();
        demo.setVisible(true);
    }
}