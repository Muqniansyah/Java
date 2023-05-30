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
public class OptPenambahPengurang {
    public static void main(String[] args) {
        int a, b;
        a=7;
        b=3;
        
        System.out.println("Nilai A = "+ a);
        System.out.println("Nilai ++A = "+ ++a);
        System.out.println("Nilai A++ = "+ a++);
        System.out.println("Nilai A = "+ a);
        System.out.println("-----------------------");
        System.out.println("Nilai B = "+ b);
        System.out.println("Nilai ++B = "+ ++b);
        System.out.println("Nilai B++ = "+ b++);
        System.out.println("Nilai B = "+ b);
    }
}


/*
A ++ atau ++A dan A–– atau ––A
Kedua bentuk penulisan notasi ini mempunyai arti yang berbeda. Perbedaan penulisan tersebut, yaitu :
a. Jika diletakan didepan variabel, maka proses penambahan atau pengurangan akan dilakukan sesaat 
sebelum atau langsung pada saat menjumpai ekspresi ini, sehingga nilai variabel tadi akan langsung 
berubah begitu ekspresi ini ditemukan, sedangkan
b. Jika diletakan dibelakang variabel, maka proses penambahan atau pengurangan akan dilakukan setelah 
ekspresi ini dijumpai atau nilai variabel akan tetap pada saat ekspresi ini ditemukan
*/