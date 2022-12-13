package com.mycompany.tempatduduk;
import java.util.Scanner;

public class TempatDuduk {

    public static void main(String[] args) {
       
        // Membuat Array dan Scanner [baris dan kolom ]
        String[][] kursi = new String[5][3];
        Scanner input = new Scanner(System.in);
        
        // mengisi setiap kursi
        for(int banjar = 0; banjar < kursi.length; banjar++){
            for(int saff = 0; saff < kursi[banjar].length; saff ++){
                System.out.print("Siapa yang akan duduk di kursi ("+banjar+","+saff+") : ");
                kursi[banjar][saff] = input.nextLine();
            }
        }
        
         // menampilkan isi Array
        System.out.println("-------------------------");
        for(int banjar = 0; banjar < kursi.length; banjar++){
            for(int saff = 0; saff < kursi[banjar].length; saff++){
                System.out.print("| "+ kursi[banjar][saff]+" |");
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}
