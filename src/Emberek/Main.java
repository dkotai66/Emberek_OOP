package Emberek;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Valaki YYYY", "2002-1-2", "Budapest");
        Ember e2 = new Ember("Valaki XXXX", "2005-5-6", "Eger");
        Ember e3 = new Ember("Valaki ZZZZ", "2001-7-8", "Debrecen");
        Ember e4 = new Ember("Valaki HHHH", "2001-8-10", "Pécs");
        Ember e5 = new Ember("Valaki AAAA", "2001-2-23", "Szigethalom");
        String fajlnev = "emberek.txt";
        try {
            Emberek ek2 = new Emberek(fajlnev);
            System.out.println(ek2);
        } catch (FileNotFoundException e) {
            System.out.println("A sajt.txt NEM TALÁLHATÓ, FOGD FEL");
        } catch (IOException e) {
            System.out.println("Ismeretlen hiba történt");
        }

        Ember[] emberTomb = new Ember[]{e1,e2,e3,e4,e5};
        Emberek ek = new Emberek(emberTomb);

        System.out.println(ek);



        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }
}
