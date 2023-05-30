/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class LatScanner {
    public static void main(String[] args) {
//       membuat objek baru
        Scanner input = new Scanner(System.in);
        
//        deklarasi variabel
        String nama;
        int n2;
        double n1, n3;
        
        System.out.println("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("Masukkan Nilai 1 :");
        n1 = input.nextDouble();
        System.out.println("Masukkan Nilai 2 :");
        n2 = input.nextInt();
        
        n3 = n1 + n2;
        System.out.println("\nNama Anda :" + nama);
        
        System.out.println("Nilai Anda : " + n3);
    }
}

/*
Untuk membaca baris dari text yang diinputkan dengan menggunakan metoda next(). Supaya
string yang dibaca utuh termasuk spasi, dengan menggunakan nextLine(). Untuk membaca data berupa 
nilai integer atau tipe data angka lainnya, sebagai contoh bisa menggunakan metode,
seperti dibawah ini :
NextInt() untuk membaca nilai integer
NextDouble() untuk membaca nilai double.
NextFloat() untuk membaca nilai float.

*/

