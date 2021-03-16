/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

class buku {
    String judul;
    int jumlah;
    
    public void setInfoBuku(String judul, int jumlah) {
        
        this.judul = judul;
        this.jumlah = jumlah;
    }
    
    public void showInfoBuku() {
        System.out.println("Informasi Buku");
        System.out.println("Judul\t: " + judul);
        System.out.println("Jumlah\t: " + jumlah);
    }
}
/**
 *
 * @author Annisa Laila
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        buku b1 = new buku();
        b1.setInfoBuku("Java Tutorial", 200);
        b1.showInfoBuku();
    }
    
}
