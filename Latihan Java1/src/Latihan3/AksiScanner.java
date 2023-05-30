/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class AksiScanner {
    public static void main(String[] args) {
//    membuat objek baru 
        ClassScanner scan = new ClassScanner();
        
        scan .inputScanner();
        System.out.println("\nNama Anda : " + scan.getnama());
        System.out.println("Nilai Anda : " + scan.rata());
    }
}
