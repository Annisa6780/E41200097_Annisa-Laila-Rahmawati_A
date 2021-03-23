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
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan panjang Array: ");
        int arLength = scan.nextInt();
        
        int[] nilai = new int[arLength];
        
        for(int i=0; i<arLength; i++) {
            int nilaiNumb = (int)(Math.random()*8+1);
            nilai[i] = nilaiNumb;
            
            System.out.print(nilai[i] + " ");
        }
    }
}
