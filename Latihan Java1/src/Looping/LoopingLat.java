/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

/**
 *
 * @author User
 */
public class LoopingLat {
    public static void main(String[] args) {
      int a, b;
      
      for (a=1; a<=5; a++){ 
          for (b=a; b<=5; b++){
              System.out.print(""+a);
          }
//          jika pakai printIN maka akan menjadi baris/turun kebawah
          System.out.println("");
        }
    }
}
