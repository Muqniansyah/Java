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
public class NestedAksi {
    public static void main(String[] args) {
//        buat objek baru dari class NestedClass.java
        NestedClass nested = new NestedClass();
        
//        jalankan fungsi
        nested.setInputData();
        nested.getPendapatan();
        nested.getTotal();
        
//        OUTPUT
        System.out.println("\nUang Jasa Rp. "+ (int) nested.jasa);
        System.out.println("Uang Komisi Rp. "+ (int) nested.komisi);
        System.out.println("===================================");
        System.out.println("Uang Total Rp. "+ (int) nested.total);
    }
}
