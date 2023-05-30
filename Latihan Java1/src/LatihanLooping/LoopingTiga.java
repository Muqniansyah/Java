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
public class LoopingTiga {
    public static void main(String[] args) {
        int n = 8; // Jumlah angka Fibonacci yang ingin ditampilkan

        System.out.println("Deret Fibonacci dengan " + n + " angka:");
        int angkaSebelum = 1;
        int angkaSaatIni = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(angkaSebelum + " ");

            int next = angkaSebelum + angkaSaatIni; //int next untuk menyimpan nilai angka Fibonacci berikutnya
            angkaSebelum = angkaSaatIni;
            angkaSaatIni = next;
        }
    }
}


//latihan 3:  program untuk menampilkan deret fibonanci.
