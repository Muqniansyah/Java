/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanLooping;

/**
 *
 * @author User
 */
public class LoopingDua {
    public static void main(String[] args) {
        int n = 20; // Jumlah bilangan ganjil yang ingin dihitung
        int number = 1; // Bilangan ganjil awal
        int sum = 0; // untuk jumlah bilangan ganjil

        System.out.println("Deret 10 bilangan ganjil:");
        for (int i = 1; i <= n; i+=2) {
            System.out.println(number);
            sum += number; // Menambahkan bilangan ganjil ke variabel sum
            number += 2; // Melakukan penambahan 2 pada setiap iterasi untuk mendapatkan bilangan ganjil berikutnya
        }
        
        System.out.println(" = ");
        System.out.println(sum);
    }
}


//latihan 2: program untuk menghitung 10 deret bilangan ganjil dengan hasilnya.