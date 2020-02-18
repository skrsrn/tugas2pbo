package tugas2;

import java.util.Scanner; //untuk menginputkan data

public class Tugas2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        int sisi, panjang, lebar, tinggibalok, alas, tinggilimas;
        persegi a = new persegi();
        balok b = new balok();
        limas c = new limas();
        //p e r s e g i
        System.out.print("Masukkan Panjang Sisi   : "); 
            sisi = input.nextInt();
            System.out.println();
        //b a l o k
        System.out.print("Masukkan Panjang Balok  : "); 
            panjang = input.nextInt();
        System.out.print("Masukkan Lebar Balok    : "); 
            lebar = input.nextInt();
        System.out.print("Masukkan Tinggi Balok   : "); 
            tinggibalok = input.nextInt();  
            System.out.println();
        //l i m a s
        System.out.print("Masukkan Alas Limas     : "); 
            alas = input.nextInt();
        System.out.print("Masukkan Tinggi Limas   : "); 
            tinggilimas = input.nextInt();
            System.out.println();
        
        try
        {
            a.setSisi(sisi);
            b.setPanjang(panjang);
            b.setLebar(lebar);
            b.setTinggibalok(tinggibalok);
            c.setSisi(sisi);
            a.getluas();
            b.getvolume();
            c.getvolume();
        }
        
        catch(NumberFormatException nfe)
        {
                System.out.println("Bukan angka");
        }
        
        catch(ArithmeticException nfe)
        {
            System.out.println("Input harus angka, bukan huruf!");
            System.out.println("Masukkan angka : ");
            sisi = input.nextInt();
            a.setSisi(sisi);
        }
        finally
        {
            System.out.println("Luas Persegi : "+a.getluas());
            System.out.println("Volume Balok   : "+b.getvolume());
            System.out.println("Volume Limas   : "+c.getvolume());
        }
    }
}
