/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class penjualanBarang {
    public static void main(String[] args)
    {
            Scanner input=new Scanner(System.in);

        
            int i,j;
            double tpen = 0;
            String np,tgl;
            int jml = 0;
            String[] kb = new String[10];
            String[] nb = new String[10];
            int[] jumbel = new int[10];
            double[] hrg = new double[10];
            double[] thrg = new double[10];
       
            System.out.println("\t\t\t PT. PERMATA PRATAMA");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Masukkan Nama Petugas :");np = input.nextLine();
            System.out.print("Tanggal               :");tgl = input.nextLine();
            System.out.print("\n");
            System.out.print("Jumlah Data yang akan di masukkan :");j = input.nextInt();
            System.out.println("--------------------------------------------------------------"); 
            
            for(i=1;i<=j;i++)
            {
                System.out.println("Data Ke- "+i);
                System.out.print("Kode Barang : ");kb[i] = input.next();
                System.out.print("Jumlah  : ");jumbel[i] = input.nextInt();
                System.out.println("--------------------------------------------------------------");
                
                if(kb[i].equalsIgnoreCase("P001"))
                {
                    nb[i] = "Printer";
                    hrg[i] = 700000;
                }
                else if(kb[i].equalsIgnoreCase("V001"))
                {
                    nb[i] = "VGA Card";
                    hrg[i] = 75000;
                }
                else if(kb[i].equalsIgnoreCase("M001"))
                {
                    nb[i] = "Motherboard";
                    hrg[i] = 950000;
                }
                else 
                {
                    nb[i] = "Tidak Terdaftar";
                    hrg[i] = 0;
                }
            }
            System.out.print("\n");
            System.out.println("\t\t\t PT. PERMATA PRATAMA");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Nama Petugas                 : "+np);
            System.out.println("\t\t\tTanggal : "+tgl);
            System.out.println("Jumlah Data yang di masukkan : "+j);
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Data Ke-    Kode Barang     Nama Barang     Harga Barang     Jumlah Barang    Total Harga");
            System.out.println("--------------------------------------------------------------------------------------------");
            
            for(i=1;i<=j;i++)
            {
                
            thrg[i] = hrg[i]*jumbel[i];
            System.out.println(i+"     "+kb[i]+"    "+nb[i]+"    "+hrg[i]+"    "+jumbel[i]+"    "+thrg[i]);
            tpen = tpen+thrg[i];
            System.out.println("--------------------------------------------------------------------------------------------");
            }
            System.out.println("Total Pendapatan Pada tanggal "+" "+ tgl +" "+"adalah sebesar Rp."+tpen);
                    
    
}
}

