/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

/**
 *
 * @author User
 */
public class OptLogika {
    public static void main(String[] args) {
/*
Operator logika AND digunakan untuk menghubungkan dua atau lebih ekspresi relasi, akan dianggap 
BENAR, bila semua ekspresi relasi yang dihubungkan bernilai BENAR.
*/
        System.out.println("Operasi AND");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));
/*
Operator logika OR digunakan untuk menghubungkan dua atau lebih ekspresi relasi, akan dianggap 
BENAR, bila salah satu ekspresi relasi yang dihubungkan bernilai BENAR dan bila semua ekspresi relasi 
yang dihubungkan bernilai SALAH, maka akan bernilai SALAH.
*/        
        System.out.println("\nOperasi OR");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        
        System.out.println("\nOperasi XOR");
        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));
/*
Operator logika NOT akan memberikan nilai kebalikkan dari ekspresi yang disebutkan. Jika nilai yang 
disebutkan bernilai BENAR maka akan menghasilkan nilai SALAH, begitu pula sebaliknya.
*/        
        System.out.println("\nOperasi NOT");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));        
    }
}
