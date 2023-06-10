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
    public String mMotor;
    public double hrg=0,hrg_beb=0,hrg_s=0,hrg_mat=0;

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
    
    public double getBebek() {
        setSeleksiMerk();
        hrg_beb= hrg +20000;
        return hrg_beb;
    }
    
    public double getSport() {
        setSeleksiMerk();
        hrg_s= hrg +40000;
        return hrg_s;
    }

    public double getMatic() {
        setSeleksiMerk();
        hrg_mat= hrg +60000;
        return hrg_mat;
    } 
}

