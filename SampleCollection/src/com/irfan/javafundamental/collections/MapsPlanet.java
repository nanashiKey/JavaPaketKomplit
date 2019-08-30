package com.irfan.javafundamental.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsPlanet {
    public static void main(String[] args) {
        // menggunakan HashMap
        Map<String, Planets> planets = new HashMap();
        planets.put("key-1", new Planets("Mercury", 0.06)); // method put() untuk menambahkan objek ke Map
        planets.put("key-2", new Planets("Venus", 0.82));
        planets.put("key-3", new Planets("Earth", 1.00));
        planets.put("key-4", new Planets("Mars", 0.11));
        planets.put("key-4", new Planets("Mars-X", 0.11)); // menambahkan ke Map dengan key yang sama

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Map planets awal: (size = "+ planets.size() +")");
        for (String key : planets.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        planets.remove("key-2"); // method remove() untuk mengeluarkan objek dari Map

        System.out.println("Map planets akhir: (size = "+ planets.size() +")");
        for (Planets planet : planets.values()) { // looping value dari Map
            System.out.println("\t " + planet);
        }
    }
}
