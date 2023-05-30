/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.*;
/**
 *
 * @author User
 */
public class SwitchCase {
    public static void main(String[]args){
//        buat variabel
        int kode;
        String namaBarang="";
//      buat input scanner
        Scanner input=new Scanner(System.in);
        
//        PROSES
        
        System.out.print("masukan kode barang[1..3]:"); kode=input.nextInt();
        
        switch(kode){
            case 1:
                namaBarang="Alat Olah raga";
                break;
            case 2:
                namaBarang="Alat Elektronik";
                break;
            case 3:
                namaBarang="Alat Alat Masak";
                break;
            default:
                namaBarang=" Anda Salah Kode !!!";
                break;
        }
        System.out.println("\nNama Barang :" +namaBarang);
    }
}

/*
Bentuk dari switch - case merupakan pernyataan yang dirancangan khusus untuk menangani pengambilan 
keputusan yang melibatkan sejumlah atau banyak alternatif. 
*/

/*
Setiap cabang akan dijalankan jika syarat nilai konstanta tersebut dipenuhi dan default akan dijalankan jika 
semua cabang diatasnya tidak terpenuhi.
Pernyataan break menunjukan bahwa perintah siap keluar dari switch. Jika pernyataan ini tidak ada, maka 
program akan diteruskan kecabang – cabang yang lainnya.
*/