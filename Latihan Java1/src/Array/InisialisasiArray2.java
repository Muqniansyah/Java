/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author User
 */
public class InisialisasiArray2 {
    public static void main(String[] args) {
//        buat variabel
        int i, j;
//        buat dan inisialisasi variabel array dua dimensi
        int[][] nil_akhir = {{150, 159, 230}, {100, 125, 150}, {210, 125, 156}};
        
        System.out.println("Data yang diinput ke elemen array \n");
        
//        Menampilkan data dari elemen array
        for (i=0; i<3; i++) {
            for (j=0; j<3; j++) {
                System.out.print("Nilai Akhir Index ["+i+"]["+j+"] = ");
                System.out.println(" = " + nil_akhir[i][j]);
            }
        }
    }
}
