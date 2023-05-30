/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanLooping;
/**
 * 
 * @author User
 * 
 */

public class LoopingSatu {
    public static void main(String[] args) {
        int n = 10; // Jumlah bilangan genap yang ingin dihitung
        int number = 2; // Bilangan genap awal
        int sum = 0; // untuk jumlah bilangan genap

        System.out.println("Deret 10 bilangan genap:");
        for (int i = 1; i <= n; i++) {
            System.out.println(number);
            sum += number; // Menambahkan bilangan genap ke variabel sum
            number += 2; // Melakukan penambahan 2 pada setiap iterasi untuk mendapatkan bilangan genap berikutnya
        }
        
        System.out.println(" = ");
        System.out.println(sum);
    }
}


//latihan 1: program untuk menghitung 10 deret bilangan genap dengan hasilnya.