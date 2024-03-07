package es1;

import java.util.Scanner;

public class Rettangolo {

   private int altezza;
   private int larghezza;


   public Rettangolo (Scanner myScanner){

       System.out.println("inserisci l'altezza");
       altezza=myScanner.nextInt();
       System.out.println("inserisci larghezza");
       larghezza=myScanner.nextInt();



   }

    public Rettangolo(int alt, int larg) {
       this.altezza=alt;
       this.larghezza=larg;
    }

    public int area(){return altezza * larghezza;}
   public int perimetro(){return (altezza+larghezza)*2;}

}
