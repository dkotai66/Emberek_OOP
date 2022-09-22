package Emberek;



public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Valaki YYYY", "2002-1-2", "Budapest");
        Ember e2 = new Ember("Valaki XXXX", "2005-5-6", "Eger");
        Ember e3 = new Ember("Valaki ZZZZ", "2001-7-8", "Debrecen");


        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
