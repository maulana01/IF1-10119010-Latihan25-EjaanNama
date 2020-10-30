/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan nama secara
 *                     tereja/perlahan
 */
public class IF110119010Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.next();
        System.out.println();
        System.out.printf("Ejaan untuk %s adalah : %n", nama);
        for (int i = 0; i < nama.length(); i++) {
            System.out.printf("Huruf ke-%d : %c%n", i+1, nama.charAt(i));
        }
    }
    
}
