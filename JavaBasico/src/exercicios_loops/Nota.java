package exercicios_loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("INFORME A NOTA: ");
        nota = scan.nextInt();
        while(nota < 0  | nota > 10 ){
            System.out.println("NOTA INVÁLIDA!!! INFORME NOVA NOTA");
            nota = scan.nextInt();

        }
        System.out.println("VOLTE SEMPRE!!");
    } 
}
