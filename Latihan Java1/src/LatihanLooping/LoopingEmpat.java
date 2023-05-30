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
public class LoopingEmpat {
    public static void main(String[] args) {
        int n = 20; // Batas atas untuk mencari bilangan prima

        System.out.println("Bilangan Prima dari 2 hingga " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk memeriksa apakah sebuah bilangan prima
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}


//latihan 4: program untuk menampilkan bilangan prima.