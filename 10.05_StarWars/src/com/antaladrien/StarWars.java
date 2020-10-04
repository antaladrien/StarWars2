package com.antaladrien;

import java.io.*;
import java.util.ArrayList;

public class StarWars {

    public static ArrayList<Hiperhajtomu> lista = new ArrayList<Hiperhajtomu>();

    public static void urhajok(String path) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while (line != null) {
            String[] szavak = line.split(" ");
            if (szavak[0].equals("XWing")) {
                XWing a = new XWing();
                for (int i = 0; i < Integer.parseInt(szavak[1]); i++) {
                    a.hiperUgras();
                }
                lista.add(a);
            } else if (szavak[0].equals("MilleniumFalcon")) {
                MilleniumFalcon a = new MilleniumFalcon();
                for (int i = 0; i < Integer.parseInt(szavak[1]); i++) {
                    a.hiperUgras();
                }
                lista.add(a);
            } else {
                System.out.println("Rossz sor");
            }
            line = br.readLine();
        }
        br.close();
    }

    public static void hangar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }

    public static void main(String[] args) {
        try {
            urhajok("input.txt");
            hangar();
        } catch (Exception ex) {
            System.out.println("Hiba történt.");
        }
    }
}
