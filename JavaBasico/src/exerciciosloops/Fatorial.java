package exerciciosloops;

import java.util.Scanner;

public class Fatorial {
   public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        int fatorial;
        System.out.print("Qual fatorial:");
        fatorial = scam.nextInt();
        int multiplicacao = 1;
        System.out.print(fatorial + " != ");
        for(int i = fatorial; i>1; i--){
            multiplicacao = multiplicacao * i ;
        }
        System.out.print( multiplicacao + ":)");
   } 
}
