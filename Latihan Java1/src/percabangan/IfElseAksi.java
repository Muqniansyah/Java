/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author User
 */
public class IfElseAksi {
    public static void main(String[] args) {
//        buat objek baru dari class IfElseClass.java
        IfElseClass ifclass = new IfElseClass();
        
//        jalankan fungsi
        ifclass.setInputData();
        ifclass.getKeterangan();
        
//        OUTPUT
        System.out.println("Hasil Akhir");
        System.out.println("==================================");
        System.out.println("Nama Siswa              :"+ifclass.nama);
        System.out.println("Nilai Akhir yang didapat:"+ifclass.nilaiAkhir);
        System.out.println("Keterangan              :"+ifclass.getKeterangan());
        System.out.println("==================================");
    }
}
