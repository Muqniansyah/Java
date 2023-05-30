/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Arraydimensi1 {
    public static void main(String[] args) {
//        buat variabel
        int i;
        int[] nil_akhir;       
//        deklarasi variabel array
        nil_akhir = new int[6];
//        buat input scanner
        Scanner input = new Scanner(System.in);
        
        for (i=0; i<6;  i++) {
            System.out.println("Masukkan Array ke " + i + "=");  nil_akhir[i] = input.nextInt();   
        }
        
        System.out.println("\n\nData Yang Diinput ke Elemen Array \n");
        for (i=0; i<6; i++) {
            System.out.print("Nilai Akhir Index " + i);
            System.out.println(" = " + nil_akhir[i]);
        }
    }
}


/*
Variabel Larik atau lebih dikenal dengan ARRAY adalah adalah Tipe terstruktur yang terdiri dari sejumlah 
komponen-komponen yang mempunyai tipe yang sama. Sebelum digunakan, variabel array perlu 
dideklarasikan terlebih dahulu. Cara mendeklarasikan variabel array sama seperti deklarasi variabel yang 
lainnya, hanya saja diikuti oleh suatu indek yang menunjukan jumlah maksimum data yang disediakan.
*/