/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.coba;

/**
 *
 * @author Zefanya A.N
 */
public class Modul02 {
    public static void main(String[] args) {
        //Persegi Panjang
        PersegiPanjang p1 = new PersegiPanjang(17,8);
        p1.hitungKeliling();
   
       PersegiPanjang p2 = new PersegiPanjang(26,14);
       p2.hitungKeliling();
        //Lingkaran
       Lingkaran L1 = new Lingkaran(6);
       Lingkaran L2 = new Lingkaran(12);
    }
}
