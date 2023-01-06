package exerciciosloops;

import java.util.Scanner;

public class ParImpar {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int quantasVezes;
       int numero;
       int pares=0;
       int impares=0;
       System.out.println("QUANTOS NÚMEROS? ");
       quantasVezes = scan.nextInt();
       int contador = 0;
       do{
        System.out.println("INFORME O NÚMERO: ");
        numero = scan.nextInt();
        if (numero % 2 == 0) pares++;
        else impares++;
        contador++;
       }while(contador<quantasVezes);
       System.out.println("Quantidade de números PARES: " + pares);
       System.out.println("Quantidade de números ÍMPARES: " + impares);
   }
}
