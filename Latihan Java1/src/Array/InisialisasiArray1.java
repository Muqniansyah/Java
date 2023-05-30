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
public class InisialisasiArray1 {
    public static void main(String[] args) {
//        buat variabel
      int i;
//      buat dan inisialisasi variabel array satu dimensi
      double[] nil_akhir = {56.5, 66.7, 87.6, 98.5, 78.9, 85.4};
      
      System.out.println("\nData Yang Diinput ke Elemen Array \n");
      
//      menampilkan data dari elemen array
      for (i=0; i<6; i++) {
          System.out.print("Nilai Akhir Indexs " + i);
          System.out.println(" = " + nil_akhir[i]);
      }
    }
}
