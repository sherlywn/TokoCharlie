/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class soal3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beli, cashback, tambah, jumlah;
        cashback = 0;
        tambah = 0;
        jumlah = 0;

        System.out.println("Selamat Datang di Toko Charlie");

        System.out.print("Banyak pembelian barang = ");
        beli = scan.nextInt();
        if (beli > 0) {
            tambah = beli / 3;
            if (beli % 7 == 0) {
                cashback = cashback + 5500;
            }
            System.out.println("=================");
            System.out.println("Cashback = " + cashback);
            System.out.println("Tambahan barang = " + tambah);
            System.out.println("Jumlah barang = " + (beli + tambah));
        } else {
            System.out.println("ERROR");
        }
    }
}
