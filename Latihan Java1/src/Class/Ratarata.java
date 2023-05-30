/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author User
 */
public class Ratarata {
    //    inisialisasi variabel
    public double nilai1, nilai2, nilaiRata;
    
//    klik kanan lalu insert code dan pilih getter setter

    public double getNilai1() {
        return nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public double getNilaiRata() {
        return ((nilai1+nilai2)/2);
    }

    public void setNilaiRata(double nilaiRata) {
        this.nilaiRata = nilaiRata;
    }
    
}
