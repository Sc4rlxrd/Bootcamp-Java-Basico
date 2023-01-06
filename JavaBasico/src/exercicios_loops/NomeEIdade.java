package exercicios_loops;

import java.util.Scanner;

public class NomeEIdade{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Informe o nome: ");

            nome = scan.next();

            if (nome.equals("0")) break;

            System.out.println("Informe a idade: ");

            idade = scan.nextInt();
        }
        
        System.out.println("VOLTE SEMPRE!");
    }

}