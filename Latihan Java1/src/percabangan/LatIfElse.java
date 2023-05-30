/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class LatIfElse {
    public static void main(String[] args) {
//        buat input scanner
        Scanner input = new Scanner(System.in);
//        buat variabel
        String keterangan, nama;
        int nilai;
        
        System.out.print("Masukkan Nama Siswa : "); nama = input.nextLine();
        System.out.print("Masukkan Nilai Akhir : "); nilai = input.nextInt();
        
            if(nilai > 70){
//                perintah jika kondisi true
                keterangan="lulus";
            }
            else {
//                perintah jika kondisi false
               keterangan="gagal";
            } 
            
//            OUTPUT
            System.out.println("Hasil Akhir");
            System.out.println("===========================================");
            System.out.println("Nama Siswa              :"+nama);
            System.out.println("Nilai Akhir yang didapat:"+nilai);
            System.out.println("Keterangan              :"+keterangan);
            System.out.println("===========================================");
    }
}
