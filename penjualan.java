/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok.pkg7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class penjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //membuat object
        Moge Moge = new Moge();
            
        System.out.println("      Selamat Datang Di Club7 Garage");
        System.out.println("  Silahkan Plih Motor Yang Ingin Anda Beli");
        System.out.println("----------------------------------------------");
        
        System.out.println(Arrays.toString(Moge.merk));
        System.out.println("Masukkan Pilihan Anda : ");
        int pilih = input.nextInt();
        System.out.println("-------------------------------------------");
      switch (pilih){
          case 1 :
              System.out.println("Anda Memilih Kawasaki Ninja H2R");
              Moge.harga = 1000000000;
              System.out.println("\nBerapa Unit yang Inginkan : ");
              Moge.jumlah = input.nextInt();
              Moge.total += Moge.harga * Moge.jumlah;
              break;
          case 2:
              System.out.println("Anda Memilih Suzuki GSX R1000R");
              Moge.harga = 282000000;
              System.out.println("\nBerapa Unit yang Inginkan : ");
              Moge.jumlah = input.nextInt();
              Moge.total += Moge.harga * Moge.jumlah;
              break;
          case 3:
              System.out.println("Anda Memilih Yamaha R1M");
              Moge.harga = 812000000;
              System.out.println("\nBerapa Unit yang Inginkan : ");
              Moge.jumlah = input.nextInt();
              Moge.total += Moge.jumlah * Moge.harga;
              break;
          case 4 :
              System.out.println("Anda Memilih BMW S1000RR");
              Moge.harga = 765000000;
              System.out.println("\nBerapa Unit yang Inginkan : ");
              Moge.jumlah = input.nextInt();
              Moge.total += Moge.harga * Moge.jumlah;
              break;
          case 5:
              System.out.println("Anda Memilih Ducati Panigale V4");
              Moge.harga = 800000000;
              System.out.println("\nBerapa Unit yang Ingin Anda Beli : ");
              Moge.jumlah = input.nextInt();
              Moge.total += Moge.harga * Moge.jumlah;
              break;
          case 6:
              System.out.println("Anda Memilih Honda CB1000R");
              Moge.harga = 12500000;
              System.out.println("\nBerapa Unit yang Inginkan : ");
              Moge.jumlah = input.nextInt();
              Moge.total += Moge.jumlah * Moge.harga;
              break;
          case 7:
              System.out.println("Anda Memilih MV Agusta F4 RC");
              Moge.harga = 590000000;
              System.out.println("\nBerapa Unit yang Inginkan : ");
              Moge.jumlah = input.nextInt();
              Moge.total += Moge.harga * Moge.jumlah;
              break;
          case 8:
              System.out.println("Anda Memilih Aprilia RSV4 RR");
              Moge.harga = 807000000;
              System.out.println("\nBerapa Unit yang Inginkan : ");
              Moge.jumlah = input.nextInt();
              Moge.total += Moge.harga * Moge.jumlah;
              break;
          default:
              System.out.println("Pilihan Tidak Ada");
              break;
      }
        System.out.println("---------------------------------------");
        System.out.println("Total Pembayaran : Rp. " + Moge.total);
    
    }
    
 }
