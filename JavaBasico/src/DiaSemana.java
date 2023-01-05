import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um número que corresponde a um dia da semana");
        int numero = entrada.nextInt();
        switch (numero) {
        case 1:
            System.out.println("1. DOMINGO");
        break;
        case 2:
            System.out.println("2. SEGUNDA - FEIRA");
        break;
        case 3:
            System.out.println("3. TERÇA - FEIRA");
        break;
        case 4:
            System.out.println("4. QUARTA - FEIRA");
        break;
        case 5:
            System.out.println("5. QUINTA - FEIRA");
        break;
        case 6:
            System.out.println("6. SEXTA - FEIRA");
        break;
        case 7:
            System.out.println(" 7. SÁBADO");
        break;
        default:
        System.out.println("O número escolhido é inválido! Digite um número entre 1 a 7.");
        }

        }
}
 