/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coba;

/**
 *
 * @author Zefanya A.N
 */
public class PersegiPanjang {
    double panjang ;
    double lebar;
        
PersegiPanjang (double a,double b){
    this.panjang = a;
    this.lebar = b;
}

void hitungKeliling(){
    double keliling = 2*(this.panjang + this.lebar);
    System.out.println("Keliling PersegiPanjang;"+ keliling);
    System.out.println("Panjang Lingkaran;"+ this.panjang);
    System.out.println("Lebar Lingkaran;"+ this.lebar);
}
}
