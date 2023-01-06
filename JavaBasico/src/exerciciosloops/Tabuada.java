package exerciciosloops;

import java.util.Scanner;

public class Tabuada {
   public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        int tabuada;
        System.out.print("Qual tabuada: ");
        tabuada = scam.nextInt();
        System.out.println("------------------");
        for (int i=1; i <= 10; i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));

        }
   }
}
