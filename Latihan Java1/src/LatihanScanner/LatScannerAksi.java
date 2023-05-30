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
public class LatScannerAksi {
    public static void main(String[] args) {
//    membuat objek baru 
        ClassScanner scan = new ClassScanner();
        
        scan .inputScanner();
        System.out.println("------Program Nilai Mahasiswa--------------");
        System.out.println("\nNIM : " + scan.getnim());
        System.out.println("\nNama Mahasiswa : " + scan.getnama());
        System.out.println("\nNilai Absen : " + scan.absen());
        System.out.println("\nNilai Tugas : " + scan.tugas());
        System.out.println("\nNilai UTS : " + scan.utees());
        System.out.println("\nNilai UAS : " + scan.uasges());
        System.out.println("-----------------------------------------");
        System.out.println("Rata-rata : " + scan.rata());
        System.out.println("Passing Grade Anda : " + scan.getKet());
        System.out.println("Keterangan : " + scan.isLulus());

    }
}
