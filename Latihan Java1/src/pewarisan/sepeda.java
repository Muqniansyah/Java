/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author User
 */
class sepeda {
  int kecepatan = 0;
  int gir = 0;
  
//  method 
   void ubahGir (int pertambahanGir) {
       gir = gir + pertambahanGir;
       System.out.println("Gir : " + gir);
   }
   
   void tambahKecepatan (int pertambahanKecepatan) {
       kecepatan = kecepatan + pertambahanKecepatan;
       System.out.println("Kecepatan : " + kecepatan);
   }
}
