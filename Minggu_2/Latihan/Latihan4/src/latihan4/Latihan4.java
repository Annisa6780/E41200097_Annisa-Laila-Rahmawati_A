/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

import java.util.Scanner;


/**
 *
 * @author Arif w
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai1 =");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai2 =");
        int nilai2 = s1.nextInt();
        
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
    
}
