package com.irfan.javafundamental.methods;

public class InputMethod {
    public static void main(String[] args) {
        // memanggil fungsi
        hitungLuas(7, 6.5);
    }
    public static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
