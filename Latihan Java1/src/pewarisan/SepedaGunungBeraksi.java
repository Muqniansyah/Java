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
public class SepedaGunungBeraksi {
    public static void main(String[] args) {
//        buat object
        SepedaGunung sepedaku = new SepedaGunung();
//        memanggil method di object
        sepedaku.tambahKecepatan(10);
        sepedaku.ubahGir(2);
        sepedaku.setSadel(20);
    }
}
