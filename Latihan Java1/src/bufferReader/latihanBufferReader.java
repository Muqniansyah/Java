/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferReader;
import java.io.*;
/**
 *
 * @author User
 */
public class latihanBufferReader {
    public static void main(String[] args)throws Exception {
//        buat objek baru
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);
        
//        deklarasi variabel
        String kata1,kata2;
        
        System.out.print("Masukkan Kata Pertama : ");
        kata1 = input.readLine();
        System.out.print("Masukkan Kata Kedua : ");
        kata2 = input.readLine();
        System.out.println("\nHasil Input String "+ kata1 + " " + kata2);
    }
}
/*
Kelas BufferedReader membaca masukan Stream karakter dan penyangga tersebut untuk efisiensi. Pada 
penggunaannya harus mempunyai Reader Object untuk membuat versi buffered. 
*/

/*
dapat juga membaca baris dari teks dengan menggunakan readLine ().
metoda readLine (), digunakan untuk kembalikan String objek yang berisi next line dari teks pada stream, 
tidak termasuk karakter atau karakter-karakter yang merepresentasikan end-of-line. Jika akhir stream 
dicapai, maka nilai string yang ingin dikembalikan bernilai dengan null. 
*/