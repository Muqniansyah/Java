/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DebuggingEror;

/**
 *
 * @author User
 */
public class Rumah {
//    inisialisasi variabel
    public String lokasi,jo,swim,gym,cara;
    public double hrg=0,hrg_j=0,hrg_s=0,hrg_g=0,biaya=0,total=0;
    
//   fungsi & method
    public void setSeleksiLok(){
        if(lokasi.equalIgnoreCase(“BLOK A”)){
            hrg=”20000000”;
        }else if(lokasi.equalIgnoreCase(“BLOK B”)){
            hrg=”30000000”;
        }else if(lokasi.equalIgnoreCase(“BLOK C”)){
            hrg=”40000000”;
        }else{
            hrg=”0”;
        }
    }
//    getter & setter
    public void setLokasi(String val){
        lokasi=val;
    }
    public String getLokasi(){
        return lokasi;
    }
    public double getHrg(){
        return hrg;
    }
    public void setJog(String val){
        Jog=val;
    }
    public double getJog(){
        if(jog.equalIgnoreCase(“Jogging track”)){
            Hrg_j=100000;
        }else{
            Hrg_j=0;
        }
        Return hrg_j;
    }
    
    public void setSwim(String val){
        Swim=val;
    }
    
    public double getSwim(){
        If(swim.equalIgnoreCase(“Swimming pool”)){
            Hrg_s=200000;
        }
        else{
            Hrg_s=0;
        }
        return hrg_s;
    }
    
    public void setGym(string val){
        Gym=val;
    }
    
    public double getGym(){
        if(gym.equalIgnoreCase(“Gymnasium”)){
            Hrg_g=300000;
        }
        else{
            Hrg_g=0;
        }
        return hrg_g;
    }
    
    public void setCara(String val){
        cara=val;
    }

    public String getCara(){
        return cara;
    }
    
    public double getBiaya(){
        return biaya;
    }
    

    public void setSeleksiCara(){
        if(cara.equalIgnoreCase(“BTN”)){
            Biaya=10000;
        }else if(cara.equalIgnoreCase(“Other Bank”)){
            Biaya=5000;
        }else{
            Biaya=0;
        }
    }

    public double getTotal(){
        return(hrg+hrg_j+hrg_s+hrg_g+biaya);
    }
}
