/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Annisa Laila
 */
public class Tugas2a {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) {
        // TODO code application logic here 
        int number = 2;

        System.out.println("         Do_While");
        System.out.println("Bilangan Perkalian 2 (1-100)");
        System.out.println("============================");
        System.out.print("     " + number + " ");
        do {
            number *= 2;
            if (number > 100){
                break;
            }
            System.out.print(number + " ");
        } while (number < 100);
        System.out.println("");
    }
}
