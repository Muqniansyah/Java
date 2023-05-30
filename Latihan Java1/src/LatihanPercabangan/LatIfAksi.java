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
public class LatIfAksi {
    public static void main(String[] args) {
//        buat objek baru dari class LatIfClass.java
        LatIfClass data = new LatIfClass();
        
//        jalankan fungsi
        data.setInputData();
        data.getKode();
        data.getTotal();
        
//        OUTPUT
        System.out.println("\t\t    PENJUALAN KUE PADA TOKO KUE 'LEZAT' ");
        System.out.println("\t\t Jl. Sagu No.27A Kebagusan, Jakarta Selatan");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("PEMBELI             : " + data.namaPembeli);
        System.out.println("KODE KUE            : " + data.kode);
        System.out.println("NAMA KUE            : " + data.namaBarang);
        System.out.println("HARGA               : Rp.  " + data.harga);
        System.out.println("JUMLAH BELI         : " + data.jumbel);
        System.out.println("--------------------------------------------------------------");
        System.out.println("TOTAL               : Rp.  " + data.totHarga);
        System.out.println("--------------------------------------------------------------");
    }
}
