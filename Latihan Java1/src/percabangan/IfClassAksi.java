/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class IfClassAksi {
    public static void main(String[] args) {
//        buat variabel
        double tot_beli;
//      buat objek baru dari class IfClass.java        
        IfClass fungsiIf = new IfClass();
//        buat input Scanner
        Scanner input = new Scanner(System.in);
       
        System.out.print("Total Pembelian Rp. "); fungsiIf.TotBeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan Rp. " + fungsiIf.getPotongan());
        System.out.println("Jumlah yang harus dibayarkan Rp. " + fungsiIf.JumlahBayar());
    }
}
