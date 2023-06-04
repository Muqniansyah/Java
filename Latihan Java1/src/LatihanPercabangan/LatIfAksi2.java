/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPercabangan;

/**
 *
 * @author User
 */
public class LatIfAksi2 {
    public static void main(String[] args) {
//    buat objek baru dari class LatIfClass2.java
    LatIfClass2 data = new LatIfClass2();
    
//    jalankan fungsi 
    data.setInputData();
    data.getGolongan();
    data.getPendidikan();
    data.getLembur();
    data.getTotal();
    
//    OUTPUT
    System.out.println("\t\t    Program Hitung Honor Karyawan Kontrak ");
        System.out.println("\t\t PT. DINGIN DAMAI");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Karyawan yang bernama           : " + data.nPekerja);
        System.out.println("Honor yang diterima");
        System.out.println("Honor Tetap                     : Rp.  " + data.gajpok);
        System.out.println("Tunjangan Jabatan               : Rp.  " + data.hasil);
        System.out.println("Tunjangan Pendidikan            : Rp. " + data.hasil2);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Honor yang diterima             : Rp.  " + data.total);
        System.out.println("--------------------------------------------------------------");
    }
}
