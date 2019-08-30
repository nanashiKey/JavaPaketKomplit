package com.irfan.javafundamental.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleSampleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal dengan format : " + dateFormated);
    }
}
