/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanForm;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author User
 */
public class DemoGui2 extends JFrame{
//        buat panel
        JPanel jp=new JPanel();
//        buat komponen form
        JTextField jt=new JTextField();
        JLabel jl=new JLabel("contoh label");
 
        public DemoGui2(){
//            menampilkan komponen form dan panel
            add(jl);
            add(jt);
            add(jp);
//            set jarak
            jl.setBounds(15, 20, 80, 25);
            jt.setBounds(120, 20, 80, 25);
        }
 
        public static void main(String[] args){
            DemoGui2 demo2=new DemoGui2();
            demo2.setTitle("form dengan label dan textfield");
            demo2.setSize(300,300);
            demo2.setVisible(true);
 
        }
}
