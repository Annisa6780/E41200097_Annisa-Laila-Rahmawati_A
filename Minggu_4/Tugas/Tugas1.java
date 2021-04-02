/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author Annisa Laila
 */
public class Tugas1 {
   public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("  Menampilkan bilangan genap dari kecil ke besar");
        System.out.println("----------------------------------------------------------");
        
        System.out.print ("Masukkan nilai awal = ");
       int awal = masuk.nextInt();
        System.out.print("Masukkan nilai akhir = ");
       int akhir = masuk.nextInt();
        System.out.println(" ");
        
        System.out.println("Bilangan genap");
        for (int i=awal; i<=akhir; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
  
}
