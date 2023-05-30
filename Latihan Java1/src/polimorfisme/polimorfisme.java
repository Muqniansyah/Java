/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author User
 */
class hewan {
    public void suara(){
        System.out.println("Hewan Bersuara : ");
    }
}

class kuda extends hewan {
    public void suara() {
        System.out.println("kuda mengikik");
    }
}

class kucing extends hewan {
    public void suara() {
        System.out.println("kucing mengeong");
    }
}

class ayam extends hewan {
    public void suara() {
        System.out.println("ayam berkokok");
    }
}

public class polimorfisme {
    public static void main(String[] args) {
        hewan HEWAN = new hewan();
        kuda KUDA = new kuda();
        kucing KUCING = new kucing();
        ayam AYAM = new ayam();
        
        HEWAN.suara();
        
        HEWAN = KUDA;
        HEWAN.suara();
        
        HEWAN = KUCING;
        HEWAN.suara();
        
        HEWAN = AYAM;
        HEWAN.suara();
    }
}

