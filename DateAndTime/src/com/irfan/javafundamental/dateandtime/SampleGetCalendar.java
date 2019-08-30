package com.irfan.javafundamental.dateandtime;

import java.util.Calendar;

public class SampleGetCalendar {
    public static void main(String[] args) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
    }
}
