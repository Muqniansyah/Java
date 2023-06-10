/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectUas;

/**
 *
 * @author User
 */
public class buku {
    //    inisialisasi variabel
    public String kode="", buku="", nama;
    
    //    fungsi & method
    public String setSeleksiCode(){
        
        if(kode.equalsIgnoreCase("BK001")){
            buku ="Filosofi Teras";
        }
        else if(kode.equalsIgnoreCase("BK002")){
            buku ="Matahari";
        }
        else if(kode.equalsIgnoreCase("BK003")){
            buku = "Automatic Habit";
        }
        else if(kode.equalsIgnoreCase("BK004")){
            buku = "Computer Science";
        }
        else if(kode.equalsIgnoreCase("BK005")){
            buku = "Belajar Java";
        }
        else{
            buku = "";
        }
        return kode;
    }
    
//getter & setter
    public void setCode(String val) {
        kode = val;
    }
    
    public String getCode() {
        return kode;
    }
    
    public String getBuku() {
        return buku;
    }
    
    public void setNama(String val) {
        nama = val;
    }
    
    public String getNama() {
        return nama;
    }
    
    
}
