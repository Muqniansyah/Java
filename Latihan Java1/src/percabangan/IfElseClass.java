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
public class IfElseClass {
//    buat variabel
    public String nama, ket;
    public int nilaiAkhir;
//    buat input scanner
    Scanner input = new Scanner(System.in);
    
//    fungsi set input data
    public void setInputData(){
        System.out.print("Masukkan Nama Siswa : "); nama=input.nextLine();
        System.out.print("Masukkan Nilai Akhir : "); nilaiAkhir=input.nextInt();
    }
//    fungsi get keterangan
    public String getKeterangan(){
        if(nilaiAkhir > 70){
//            perintah jika kondisi true
            ket="lulus";
        }
        else{
//            perintah jika kondisi false
            ket="gagal";
        }
        return ket;
    }
    
}
