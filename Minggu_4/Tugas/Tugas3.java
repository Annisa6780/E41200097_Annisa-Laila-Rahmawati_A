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
public class Tugas3 {
    public static void main(String[] args) {
        int total = 0;
        float rataRata;
        
        Scanner dataInput = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya data nilai = ");
        int dataLength = dataInput.nextInt();
        int data[] = new int[dataLength];
        
        //input
        for (int i = 0; i < dataLength; i++){
            System.out.print("Masukkan data nilai ke-" + (i+1) + " = ");
            data[i] = dataInput.nextInt();
        }
        System.out.println("");
        
        //minimum value
        int Max = data[0];
        int Min = data[0];
        for (int i = 0; i < dataLength; i++){
            if (data[i] > Max){
                Max = data[i];
            }
            if (data[i] < Min){
                Min = data[i];
            }
        }
        System.out.println("Nilai minimum = " + Min);
        System.out.println("Nilai maximum = " + Max);
        
        //average
        for (int i = 0; i < dataLength; i++){
            total += data[i];
        }
        rataRata = total / dataLength;
        System.out.println("Nilai rata ratanya adalah = " + rataRata);
    } 
    
}
