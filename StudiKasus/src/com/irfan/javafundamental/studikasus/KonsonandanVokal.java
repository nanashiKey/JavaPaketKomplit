package com.irfan.javafundamental.studikasus;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class KonsonandanVokal {
    private static int num_vokal(@NotNull String word){
        int i;
        int jumlah_vokal = 0;
        String x = word.toLowerCase();
        for(i=0; i<word.length(); i++){
            if(x.charAt(i) == 'a' || x.charAt(i) == 'i' || x.charAt(i) == 'u' || x.charAt(i) == 'e' || x.charAt(i) == 'o'){
                jumlah_vokal ++;
            }
        }

        return jumlah_vokal;

    }

    private static int num_konsonan(@NotNull String word){
        int i;
        int jumlah_konsonan = 0;
        String x = word.toLowerCase();
        for(i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(x.charAt(i) != 'a' && x.charAt(i) != 'i' && x.charAt(i) != 'u' && x.charAt(i) != 'e' && x.charAt(i) != 'o' && x.charAt(i) != ' '){
                jumlah_konsonan ++;

            }
        }

        return jumlah_konsonan;
    }

    public static void main(String[] args){
        /*contoh penggunaan String dengan perulangan*/

        /*Kamus*/
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        /*Program*/

        //masukan kalimat
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        //memanggil prosedur yang mengembalikan nilai int
        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal : " +vokal);
        System.out.println("Jumlah huruf konsonan : " +konsonan);

    }

}
