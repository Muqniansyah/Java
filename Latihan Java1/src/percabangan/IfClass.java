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
public class IfClass {
//    buat variabel
    public double TotBeli, potongan;
//    fungsi set total beli
    public void setTotalBeli(double a){
        TotBeli =a;
    }
//      fungsi get potongan
    public double getPotongan(){
        if(TotBeli >= 50000){
            potongan = 0.2*TotBeli;
        }
        return potongan;
    }
//    fungsi jumlah bayar
    public double JumlahBayar(){
        return (TotBeli - potongan);
    }
}
