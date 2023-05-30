/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author User
 */
public class SoalArrayAksi {
    public static void main(String[] args) {
//        buat objek baru dari class SoalArrayClass.java
        SoalArrayClass data = new SoalArrayClass();
        
//        jalankan fungsi
        data.setInputData();
        data.getBarang();
                       
//        OUTPUT
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("\t\t\t PT. PERMATA PRATAMA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Nama Petugas                 : "+ data.namaPetugas);
        System.out.println("\t\t\tTanggal : "+ data.tggl);
        System.out.println("Jumlah Data yang di masukkan : "+ data.jumdat);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Data Ke-    Kode Barang     Nama Barang     Harga Barang     Jumlah Barang    Total Harga");
        System.out.println("--------------------------------------------------------------------------------------------");
        data.getTotal();
        System.out.println("Total Pendapatan Pada tanggal "+" "+ data.tggl +" "+"adalah sebesar Rp."+data.totPendapatan);      
    }
}
