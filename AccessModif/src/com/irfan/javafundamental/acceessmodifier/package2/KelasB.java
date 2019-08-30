package com.irfan.javafundamental.acceessmodifier.package2;

import com.irfan.javafundamental.acceessmodifier.package1.KelasA;

public class KelasB extends KelasA {
    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
