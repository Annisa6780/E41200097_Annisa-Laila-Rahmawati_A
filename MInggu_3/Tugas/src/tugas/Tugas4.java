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
public class Tugas4 {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("  Kharisma Ageng Plaza <KAP> ");
        System.out.println("   Promo Belanja Berhadiah   ");
        System.out.println("Khusus Pembelian 5 Barang Pertama");
        System.out.println(" Dengan harga minimum Rp 100000,00 ");
        System.out.println("------------------------------------");
        
        Scanner input = new Scanner(System.in);
        String nama;
        int harga1,harga2,harga3,harga4,harga5;
        double hasil;
        Scanner namaa = new Scanner(System.in);
        
        System.out.print("Masukkan nama pembeli: ");
        nama = namaa.nextLine();
        System.out.println(" ");
        
        System.out.print("Masukkan harga barang ke-1: ");
        harga1 = input.nextInt();
        System.out.print("Masukkan harga barang ke-2: ");
        harga2 = input.nextInt();
        System.out.print("Masukkan harga barang ke-3: ");
        harga3 = input.nextInt();
        System.out.print("Masukkan harga barang ke-4: ");
        harga4 = input.nextInt();
        System.out.print("Masukkan harga barang ke-5: ");
        harga5 = input.nextInt();
        
        hasil = harga1+harga2+harga3+harga4+harga5;
        System.out.println("Total Harga Pembelian Atas Nama "+ nama +" adalah Rp"+ hasil);
        System.out.println(" ");
        
        if(hasil >= 100000) {
            System.out.println("Selamat.....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        } else {
            System.out.println("Maaf anda belum beruntung");
            System.out.println("Coba lagi nanti");
        }
            System.out.println(" ");
            System.out.println("------------------------------------");
            System.out.println("             Terima Kasih           ");
            System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
    }
}
