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
public class IfElseMajemukClass {
//       buat variabel
        int pendapatan;
        double jasa, komisi, total;
        
//        buat input scanner
        Scanner input = new Scanner(System.in);
        
//        fungsi set input data
        public void setInputData(){
            System.out.print("Masukkan Pendapatan Sales Rp. "); pendapatan = input.nextInt();
        }
        
//       fungsi untuk mendapatkan hasil pendapatan
        public void getPendapatan(){
            if(pendapatan >= 0 && pendapatan <= 200000){
                jasa=10000;
                komisi=0.1*pendapatan;
            }
            else if(pendapatan <= 500000){
                jasa= 20000;
                komisi=0.15*pendapatan;
            }
            else{
                jasa=30000;
                komisi=0.2*pendapatan;
            }
        }
        
//        fungsi umtuk daptakan total
        public void getTotal(){
            total = komisi+jasa;
        }
}
