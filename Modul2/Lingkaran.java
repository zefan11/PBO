/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectluasbangunkomplek;

/**
 *
 * @author Zefanya A.N
 */
public class Lingkaran {
    double jejari;
    
Lingkaran(double a){
 this.jejari = a;   
}

void outPut(){
    double luas = 3.14 * this.jejari * this.jejari;
    System.out.println("Hitung Luas Lingkaran"+luas);
    System.out.println("Hitung jejari"+this.jejari);   
}
}


