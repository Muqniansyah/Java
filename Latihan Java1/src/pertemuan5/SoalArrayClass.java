/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class SoalArrayClass {
//    buat input scanner
    Scanner input = new Scanner(System.in);
    
//    buat variabel
    String namaPetugas, tggl;
    int i, jumdat;
    double totPendapatan = 0;
//    buat variabel array
    String[] kode= new String[10];
    int[] jumbel= new int[10];
    String[] jumlah= new String[10];
    String[] nambar= new String[10];
    double[] harga= new double[10];
    double[] totHarga = new double[10];
    
//    fungsi set data
    public void setInputData(){
        System.out.println("\t\t\t PT. PERMATA PRATAMA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Nama Petugas :");namaPetugas = input.nextLine();
        System.out.print("Tanggal               :");tggl = input.nextLine();
        System.out.print("\n");
        System.out.print("Jumlah Data yang akan di masukkan :");jumdat = input.nextInt();
        System.out.println("--------------------------------------------------------------"); 
    }
    
//    fungsi get barang
    public void getBarang(){
         for (i=1; i<=jumdat; i++) {
            System.out.println(" Data Ke- " +i);
            System.out.print(" kode barang :"); kode[i]=input.next();
            System.out.print(" jumlah :"); jumbel[i]=input.nextInt();
            System.out.println("--------------------------------------------------------------");

            if (kode[i].equalsIgnoreCase("P001")){
                nambar[i]="printer";
                harga[i] = 700000;
            }
            else if(kode[i].equalsIgnoreCase("V001")){
                nambar[i]="VGA CARD";
                harga[i] = 75000;
            }
            else if (kode[i].equalsIgnoreCase("M001")){
                nambar[i]="MotherBoard";
                harga[i] = 950000;
            }
            else{
                nambar[i] = "Tidak Terdaftar";
                harga[i] = 0;
            }
        }
    }
    
//    fungsi hitung total
    public void getTotal(){
        for(i=1;i<=jumdat;i++){                
            totHarga[i] = harga[i]*jumbel[i];
            System.out.println( i+"     "+  kode[i]+"    "+  nambar[i]+"    "+ (int)harga[i]+"    "+  jumbel[i]+"    "+  (int)totHarga[i]);
            totPendapatan = totPendapatan+totHarga[i];
            System.out.println("--------------------------------------------------------------------------------------------");
        }
    }
}
