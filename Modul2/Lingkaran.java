/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coba;

/**
 *
 * @author Zefanya A.N
 */
public class Lingkaran {
    double jejari;

       Lingkaran (double a){
       this.jejari = a;
       
    }

void output(){

        double keliling = 2 * 3.14 * this.jejari;
        double luas = 3.14 * this.jejari * this.jejari;
        System.out.println("Luas Lingkaran;"+luas);
        System.out.println("keliling Lingkaran;"+keliling);
        System.out.println("jejari;"+this.jejari);
}
}