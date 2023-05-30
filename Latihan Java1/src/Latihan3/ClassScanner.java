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
public class ClassScanner {
    public String nama;
    public double n1;
    public int n2, n3;
    Scanner input = new Scanner(System.in);
    
    public String getnama(){
        return nama;
   }
    
    public void inputScanner() {
        System.out.println("Masukkan Nama Anda :");
        nama = input.nextLine();
        System.out.println("Masukkan Nilai 1 : ");
        n1 = input.nextDouble();
        System.out.println("Masukkan Nilai 2 : ");
        n2 = input.nextInt();
    }
    
    public double rata() {
        return ((n1+n2)/2);
    }
}
