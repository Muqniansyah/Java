/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormLogika;

/**
 *
 * @author User
 */
public class Barang {
//    inisialisasi variabel
    public String kode, nama;
    public int jml;
    public double hrg, total, ubay, ukem;

//  fungsi set kode
    // val disini adalah variabel yg bersifat immutable reference jadi mirip seperti final variabel
    public void setKode(String val){
        kode = val;
    }
//    fungsi get kode
    public String getKode(){
        return kode;
    }
//    fungsi seleksi kode
    public void setSeleksiKode(){
        if(kode.equalsIgnoreCase("B001")){
            nama = "pensil";
            hrg = 3000;
        }
        else if(kode.equalsIgnoreCase("B002")){
            nama = "Buku";
            hrg = 5000;
        }
        else if(kode.equalsIgnoreCase("B003")){
            nama = "Penggaris";
            hrg = 1000;
        }
        else if(kode.equalsIgnoreCase("B004")){
            nama = "Penghapus";
            hrg = 500;
        }
        else{
            nama = "Barang tidak ditemukan!";
            hrg = 0;
        }
    }
    
//    getter & setter

    public String getNama() {
        return nama;
    }

    public void setNama(String val) {
        this.nama = val;
    }
    
    public double getHrg() {
        return hrg;
    }

    public void setHrg(double val) {
        this.hrg = val;
    }
    
    public int getJml() {
        return jml;
    }

    public void setJml(int val) {
        this.jml = val;
    }

    public double getTot() {
        total = hrg*jml;
        return (total);
    }
    
    public double getUbay() {
        return ubay;
    }

    public void setUbay(double val) {
        this.ubay = val;
    }

    public double getUkem() {
        return (ubay-total);
    }  
}    

