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
public class Tugas5 {
    public static void main(String[] args) {
    System.out.println("------------------------------------");
    System.out.println("             CAFE CERIA             ");
    System.out.println("            ANEKA MINUMAN           ");
    System.out.println("------------------------------------");
    
    System.out.println("            SPECIAL MENU:           ");
    Scanner input = new Scanner(System.in);
    int menu;
    String nama;
    Scanner namaa = new Scanner(System.in);
    
    System.out.print(" 1.Soft drinks\n   2.Mix juice\n   3.Nescafe\n   4.Soda milk\n   5.Tea\n");
    System.out.println("------------------------------------");
    
    System.out.print("Masukkan nama pembeli: ");
    nama = namaa.nextLine();
    System.out.println(" ");
    
    System.out.print("Silahkan masukkan pilihan menu anda: ");
    menu = input.nextInt();
    
    switch(menu){
        case 1 :
            System.out.println("Minuman yang anda pesan adalah Soft drinks ");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terima kasih "+nama +"telah berkunjung di cafe ceria");
        break;
        case 2 :
            System.out.println("Minuman yang anda pesan adalah MIx juice");
            System.out.println("Pesanan akan segara kami antar");
            System.out.println("Terima kasih "+nama +"telah berkunjung di cafe ceria");
        break;
        case 3:
            System.out.println("Minuman yang anda pesan adalah Nescafe");
            System.out.println("Pesanan akan segara kami antar");
            System.out.println("Terima kasih "+nama +"telah berkunjung di cafe ceria");
        break;
        case 4:
            System.out.println("Minuman yang anda pesan adalah Soda milk");
            System.out.println("Pesanan akan segara kami antar");
            System.out.println("Terima kasih "+nama +"telah berkunjung di cafe ceria");
        break;
        case 5:
            System.out.println("Minuman yang anda pesan adalah Tea");
            System.out.println("Pesanan akan segara kami antar");
            System.out.println("Terima kasih "+nama +"telah berkunjung di cafe ceria");
        break;
        default:
            System.out.println("Maaf anda salah memasukkan piliha menu");
            System.out.println("Silahkan Coba Lagi");
    }
    }
}
