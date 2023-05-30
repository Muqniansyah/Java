/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPercabangan;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class LatIfClass {
//    buat input scanner
    Scanner input = new Scanner(System.in);
//    buat variabel
    String namaPembeli, kode;
    int jumbel;
    String namaBarang;
    double harga, totHarga;
    
//    fungsi set input data
    public void setInputData(){
        System.out.print("Masukkan Nama Pembeli : "); namaPembeli = input.nextLine();
        System.out.print("Masukkan Kode [B001|C001|T001] : "); kode = input.nextLine();
        System.out.print("Masukkan Jumlah Beli : "); jumbel= input.nextInt();
    }
    
//    fungsi get kode
    public void getKode(){
        if(kode.equalsIgnoreCase("B001")){
            namaBarang = "Bolu";
            harga = 10000;
        }
        else if(kode.equalsIgnoreCase("C001")){
            namaBarang = "Cake";
            harga = 20000;
        }
        else if(kode.equalsIgnoreCase("T001")){
            namaBarang = "Tart";
            harga = 15000;
        }
        else{
            namaBarang = "Tidak Terdaftar";
            harga = 0;
        }
    }
    
//    fungsi get total
    public void getTotal(){
        totHarga = harga*jumbel;
    }
}
