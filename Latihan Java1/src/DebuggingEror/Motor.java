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
public class Motor {
//    inisialisasi variabel
    public String mMotor, bebek, sport, matic, jBayar;
    public double hrg=0,hrg_beb=0,hrg_s=0,hrg_mat=0,biaya=0,diskon=0,total=0;

//    fungsi & method
    public void setSeleksiMerk(){
        if(mMotor.equalsIgnoreCase("Honda")){
            hrg=8000000;
        }
        else if(mMotor.equalsIgnoreCase("Yamaha")){
            hrg=1000000;
        }
        else{
            hrg=0;
        }
    }
    
//    getter & setter
    public void setmMotor(String val) {
        mMotor = val;
    }
    
    public String getmMotor() {
        return mMotor;
    }
    
    public double getHrg() {
        return hrg;
    }
    
    public void setBebek(String val) {
        bebek = val;
    }
    
    public double getBebek() {
        if(bebek.equalsIgnoreCase("Bebek")){
            hrg_beb=2000000;
        }
        else{
            hrg_beb=0;
        }
        return hrg_beb;
    }
    
    public void setSport(String val) {
       sport = val;
    }
    
    public double getSport() {
        if(sport.equalsIgnoreCase("Sport")){
            hrg_s=8000000;
        }
        else{
            hrg_s=0;
        }
        return hrg_s;
    }

      public void setMatic(String val) {
       matic = val;
    }

    public double getMatic() {
        if(matic.equalsIgnoreCase("Matic")){
            hrg_mat=5000000;
        }
        else{
            hrg_mat=0;
        }
        return hrg_mat;
    }

    public void setjBayar(String val) {
        jBayar = val;
    }
    
    public String getjBayar() {
        return jBayar;
    }


    public double getBiaya() {
        return biaya;
    }
    
    public double getDiskon() {
        if (bebek.equalsIgnoreCase("Bebek")&&mMotor.equalsIgnoreCase("Honda")) {
            diskon = 0.05 * hrg;
        } else if (sport.equalsIgnoreCase("Matic")&&mMotor.equalsIgnoreCase("Honda")) {
            diskon = 0.03 * hrg;
        } else if (matic.equalsIgnoreCase("Sport")&&mMotor.equalsIgnoreCase("Honda")) {
            diskon = 0.01 * hrg;
        }
        
        return diskon;
  }    

//    kemungkinan tidak terpakai karna tidak di set harus mengeluarkan payment something
//    public void setSeleksiBayar(){
//        if(jBayar.equalsIgnoreCase("Cash")){
//            biaya=1000;
//        }
//        else if(jBayar.equalsIgnoreCase("Credit")){
//            biaya=5000;
//        }
//        else{
//            biaya=0;
//        }
//    }
    public double getTotal() {
        return(hrg+hrg_beb+hrg_s+hrg_mat+biaya-diskon);
    } 
}
//buat get seleksi merk
