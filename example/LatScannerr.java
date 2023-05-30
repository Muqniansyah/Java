package TugasScanner;

import java.util.Scanner;

/**
 *
 * @author RANGGA
 */
public class LatScannerr {
    public String nama;
    public String nim;
    public int abs, tgs, uts, uas;
    
    Scanner input = new Scanner(System.in);
    
    public String ambilnama(){
        return nama;
    }
    public String ambilnim(){
        return nim;
    }
    
    public void inputScanner(){
        System.out.println("Masukan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("Masukan Nim Anda : ");
        nim = input.nextLine();
        System.out.println("Masukan Nilai Absen :");
        abs = input.nextInt();
        System.out.println("Masukan NIlai Tugas Anda : ");
        tgs = input.nextInt();
        System.out.println("Masukan Nilai UTS Anda : ");
        uts = input.nextInt();
        System.out.println("Masukan Nilai UAS Anda : ");
        uas = input.nextInt();
    }
    
    public double absen(){
        return abs;
    }
    public double tugas(){
        return tgs;
    }
    public double utees(){
        return uts;
    }
    public double uasges(){
        return uas;
    }
    public double rata(){
        return ((0.1*abs))+((0.2*tgs))+((0.3*uts))+((0.4*uas));
    }
    public String getKet() {
        double rerata = rata();
        String ket;
        if (rerata >= 80){
            ket = "Grade A";
        } else if (rerata >= 70){
            ket = "Grade B";
        } else if (rerata >= 60){
            ket = "Grade C";
        } else if (rerata>= 40){
            ket = "Grade D";
        } else {
            ket = "Grade E";
        }
        return ket;
        
}
    public String isLulus() {
        double rerata = rata();
        String kettt;
        if (rerata >= 60) {
            kettt = "Anda Lulus";
        } else {
            kettt = "Anda Tidak Lulus";
        }
        return kettt;
}
}

    