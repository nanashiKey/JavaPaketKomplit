package com.irfan.javafundamental.acceessmodifier.package2;

import com.irfan.javafundamental.acceessmodifier.package1.KelasA;

public class Main {
    public static void main(String[] args) {
        // Kode ini pasti akan mengalami kompiler error
        KelasA kelasA = new KelasA();
//        System.out.println(kelasA.functionB());
//        System.out.println(kelasA.memberB);
//        System.out.println(kelasA.memberC);

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
