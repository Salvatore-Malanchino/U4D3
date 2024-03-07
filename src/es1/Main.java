package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Rettangolo 1");
        Rettangolo rettangolo1 = new Rettangolo(myScanner);
        stampaRettangolo(rettangolo1);
        System.out.println("Rettangolo 2");
        Rettangolo rettangolo2 = new Rettangolo(myScanner);

        myScanner.close();
    }


    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Area rettangolo: " + rettangolo.area());
        System.out.println("Perimetro rettangolo: " + rettangolo.perimetro());
    }
    public static void stampaRettangolo2(Rettangolo rettangolo1, Rettangolo rettangolo2) {

        System.out.println("Rettangolo 1");
        stampaRettangolo(rettangolo1);
        System.out.println("Rettangolo 2");
        stampaRettangolo(rettangolo2);


        int sommaPerimetro = rettangolo1.perimetro() + rettangolo2.perimetro();

        int sommaArea = rettangolo1.area() + rettangolo2.area();

        System.out.println("somma perimetro" );
        System.out.println(sommaPerimetro);
        System.out.println("somma area");
        System.out.println(sommaArea);
    }

}
