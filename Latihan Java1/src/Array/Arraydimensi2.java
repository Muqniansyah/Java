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
public class Arraydimensi2 {
    public static void main(String[] args) {
//        buat variabel
      int i, j ;
//        buat variabel array dua dimensi
      int[][]data_jual;
      data_jual = new int[3][3];
//        buat input scanner   
      Scanner input = new Scanner (System.in);
      
      
      for ( i=0; i<3; i++) {
          for (j=0; j<3; j++) {
              System.out.print("Masukkan  Data Jual ke ["+i+"] ["+j+"] =" ); data_jual[i][j]= input.nextInt();   
          }
          System.out.println();
      }
      
      System.out.println("\n\nData Jual Yang Diinput ke Elemen Array \n");
      for (i=0; i<3; i++) {
          for(j=0; j<3; j++) {
              System.out.print("Nilai Data Jual ["+i+"] ["+j+"] ");
              System.out.println(" = " + data_jual[i][j]);
          }
          System.out.println();
      }
    }
}

/*
Array dimensi dua tersusun dalam bentuk baris dan kolom, dimana indeks pertama menunjukan baris dan 
indeks kedua menunjukan kolom. 
*/