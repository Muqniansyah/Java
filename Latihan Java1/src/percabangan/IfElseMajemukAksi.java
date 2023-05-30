/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author User
 */
public class IfElseMajemukAksi {
    public static void main(String[] args) {
//        buat objek baru dari class IfElseMajemukClass.java
        IfElseMajemukClass majemuk = new IfElseMajemukClass();
        
//        jalankan fungsi
        majemuk.setInputData();
        majemuk.getPendapatan();
        majemuk.getTotal();
        
//        OUTPUT
        System.out.println("\nUang Jasa Rp. "+ (int) majemuk.jasa);
        System.out.println("Uang Komisi Rp. "+ (int) majemuk.komisi);
        System.out.println("===================================");
        System.out.println("Uang Total Rp. "+ (int) majemuk.total);
    }    
}
