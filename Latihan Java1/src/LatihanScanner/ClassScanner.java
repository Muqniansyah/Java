/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanScanner;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ClassScanner {
    public String nama;
    public String nim;
    public int Na,Nt,Uts,Uas;
    Scanner input = new Scanner(System.in);
    
    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }
    
    public void inputScanner() {
     System.out.println("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("Masukkan NIM Anda : ");
        nim = input.nextLine();
        System.out.println("Masukkan Nilai Absen : ");
        Na = input.nextInt();
        System.out.println("Masukkan Nilai Tugas : ");
        Nt = input.nextInt();
        System.out.println("Masukkan Nilai UTS : ");
        Uts = input.nextInt();
        System.out.println("Masukkan Nilai UAS : ");
        Uas = input.nextInt();
    }
 
    public double absen(){
        return Na;
    }
    public double tugas(){
        return Nt;
    }
    public double utees(){
        return Uts;
    }
    public double uasges(){
        return Uas;
    }
    public double rata(){
        return ((0.1*Na))+((0.2*Nt))+((0.3*Uts))+((0.4*Uas));
    }
    public String getKet() {
        double rerata = rata();
        String ket;
        if (rerata >= 80){
            ket = "Grade A";
        } else if (rerata >= 70){
            ket = "Grade B";
        } else if (rerata >= 60){
            ket = "Grade C";
        } else if (rerata>= 40){
            ket = "Grade D";
        } else {
            ket = "Grade E";
        }
        return ket;
        
}
    public String isLulus() {
        double rerata = rata();
        String kettt;
        if (rerata >= 60) {
            kettt = "Anda Lulus";
        } else {
            kettt = "Anda Tidak Lulus";
        }
        return kettt;
}
    
}
