/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author IIN
 */
import java.util.Scanner;
import tugas2.ruang.Balok;
import tugas2.ruang.Tabung;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean cek = false;
        int kembali;
        do{
          int pilih;
          
          double panjang, lebar, tinggibalok, jarijari, tinggitabung;
          Scanner input = new Scanner(System.in);
          
          System.out.println("=====================");
          System.out.println("      Menu Utama     ");
          System.out.println("=====================");
          System.out.println("1. Hitung Balok ");
          System.out.println("2. Hitung Tabung ");
          System.out.println("0. Exit ");
          System.out.println("=====================");
          System.out.print(  "Pilih : "); pilih = input.nextInt();
          System.out.println("");
          
          switch(pilih){
              case 1 :
                  System.out.print("Input Panjang : "); panjang = input.nextInt();
                  System.out.print("Input Lebar   : "); lebar = input.nextInt();
                  System.out.print("Input Tinggi  : "); tinggibalok = input.nextInt();
                  
                  Balok balok = new Balok(tinggibalok, panjang, lebar);
                  
                  System.out.println("-------------------------");
                  System.out.println("Luas Persegi Panjang     : " + balok.luas());
                  System.out.println("Keliling persegi panjang : " + balok.keliling());
                  System.out.println("Volume Balok             : " + balok.volume());
                  System.out.println("Luas Permukaan Balok     : " + balok.luaspermukaan());
                  System.out.println("");
                   
                   break;
                   
              case 2 :
                  System.out.print("Input Tinggi    : "); tinggitabung = input.nextInt();
                  System.out.print("Input jari-jari : "); jarijari = input.nextInt();
                  
                  Tabung tabung = new Tabung(tinggitabung, jarijari);
                  
                  System.out.println("-------------------------");
                  System.out.println("Luas Lingkaran           : " + tabung.luas());
                  System.out.println("Keliling Lingkaran       : " + tabung.keliling());
                  System.out.println("Volume Tabung            : " + tabung.volume());
                  System.out.println("Luas Permukaan Tabung    : " + tabung.luaspermukaan());
                  System.out.println("");
                   
                   break;
                   
              case 0 :
                  System.exit(0);
              default :
                  System.out.println( "Silahkan Input Ulang !!!!");
                  break;
          }
            System.out.print(" Ulangi ? (Ya : 1 || Tidak : 0) = ");
            kembali = input.nextInt();
            if (kembali == 1){
                cek=false;
                System.out.println("\n");
            }
            else if (kembali == 0){
                cek=true;
            }
        }while(cek == false);
    }
}