/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanScanner;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class LatScanner {
    public static void main(String[] args) {
//     membuat objek baru
        Scanner input = new Scanner(System.in);

//        Deklarasi Variabel
        String nama;
        String nim;
        int Na,Nt,Uts,Uas;

        
        System.out.println("----------Masukkan Input Anda --------");
        System.out.println("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("Masukkan NIM Anda : ");
        nim = input.nextLine();
        System.out.println("Masukkan Nilai Absen : ");
        Na = input.nextInt();
        System.out.println("Masukkan Nilai Tugas : ");
        Nt = input.nextInt();
        System.out.println("Masukkan Nilai UTS : ");
        Uts = input.nextInt();
        System.out.println("Masukkan Nilai UAS : ");
        Uas = input.nextInt();
        
        
    }
}
