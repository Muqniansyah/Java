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
public class LatIf {
//    fungsi dari: public static void main(String[] args),yaitu untuk menjalankan program(sering disebut main class).
    public static void main(String[] args) {
        double tot_beli, potongan=0, jum_bayar=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total pembelian Rp. "); tot_beli = input.nextDouble();
        
        if(tot_beli >= 50000)
            potongan = 0.2*tot_beli;
        System.out.println("Besarnya Potongan RP. " + potongan);
        
        jum_bayar = tot_beli - potongan;
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jum_bayar);
        
    }
}
