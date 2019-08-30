package com.irfan.javafundamental.methods;

public class ReturnMethod {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p,l); //memanggil fungsi
        System.out.println("Hasilnya adalah = " + hasil);
    }
    //fungsi dengan nilai balik
    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
}
