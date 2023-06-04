/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPercabangan;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class LatIfClass2 {
//    buat input Scanner
    Scanner input = new Scanner(System.in);
    
//    buat variabel
    String nPekerja, tunjab,tunpend;
    double lembur, gajpok=300000, total;
    double hasil, hasil2;
    
//    fungsi set input data 
    public void setInputData(){
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. DINGIN DAMAI");
        System.out.println("Nama Karyawan           : "); nPekerja = input.nextLine();
        System.out.println("Golongan (1/2/3)        : "); tunjab = input.nextLine();
        System.out.println("Pendidikan (SMU/D3/S1)  : "); tunpend = input.nextLine();
        System.out.println("Jumlah Jam Kerja        : "); lembur = input.nextInt();
    }
    
//    fungsi get golongan
    public void getGolongan(){     
        if (tunjab.equalsIgnoreCase("1")) {
            hasil = 0.5*gajpok;
        }
        else if(tunjab.equalsIgnoreCase("2")){
            hasil = 0.10 * gajpok;
        }
        else if(tunjab.equalsIgnoreCase("3")){
            hasil = 0.15 * gajpok;
        }
        else {
            hasil = 0;
        }
    }
    
//    fungsi get pendidikan
    public void getPendidikan(){
        if (tunpend.equalsIgnoreCase("SMU")) {
            hasil2 = 0.025*gajpok;
        }
        else if(tunpend.equalsIgnoreCase("D3")){
            hasil2 = 0.5 * gajpok;
        }
        else if(tunpend.equalsIgnoreCase("S1")){
            hasil2 = 0.075 * gajpok;
        }
        else {
            hasil2 = 0;
        }
    }
    
//    fungsi get honor lembur
    public void getLembur(){
        if (lembur>=8) {
            lembur = gajpok * 3500;
        }
        else if(lembur>8){
            lembur = gajpok * (3500*2);
        }
        else {
            lembur = 0;
        }
    }
    
//    fungsi get total
    public double getTotal(){
        total = gajpok+(hasil+hasil2)+lembur;
        return total;
    }
}
