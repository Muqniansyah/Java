/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanOOP;

/**
 *
 * @author User
 */
public class IsiRumahku {
public static void main(String[] args) {
//    memanggil meja bisa dengan langsung memanggillnya tanpa harus membuat satu objek baru untuk dapat menggunakan/memanggil method karna menggunakan public static
    Rumahku.Meja();
    
//membuat satu objek baru untuk dapat menggunakan/memanggil method pada class lain, seperti method “JamDinding” pada class “RumahKu”
    Rumahku panggil = new Rumahku();
    panggil.JamDinding();
    }
}
