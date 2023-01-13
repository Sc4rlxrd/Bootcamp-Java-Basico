import java.util.Scanner;
import exercicios_collections.map_collection.LinhaSeparacao;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double numero1;
        double numero2;
        int menu;
        double resultado;
        while(true){
        System.out.print("Informe o primeiro número: ");
        numero1 = scan.nextDouble();
        System.out.print("Informe o segundo número: ");
        numero2 = scan.nextDouble();
        LinhaSeparacao.separacao();
        System.out.print("Qual opção você deseja:");
        System.out.println("\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Resto da divisão\n6-Parar");
        menu =scan.nextInt();
        LinhaSeparacao.separacao();
        switch(menu){
            case 1:
                resultado = Calculadora.somar(numero1, numero2);
                System.out.println("A soma entre " + numero1 + " e " +  numero2 + " deu: " + resultado);
                break;
            case 2:
                resultado =  Calculadora.subtracão(numero1, numero2);
                System.out.println("A subtração entre " + numero1 + " e " + numero2 + " deu: " + resultado);
                break;
            case 3:
                resultado = Calculadora.multiplicacao(numero1, numero2);
                System.out.println("A multiplicação entre " + numero1 + " e " + numero2 + " deu " + resultado);
                break;
            case 4: 
                resultado = Calculadora.divisao(numero1, numero2);
                System.out.println("A divisão entre " + numero1 + " e " + numero2 + " deu " + resultado);
                break;
            case 5:
                resultado = Calculadora.restoDivisao(numero1, numero2);
                System.out.println("O resto da divisão  entre " + numero1 + " e " + numero2 + " deu "  + resultado);
            case 6:
                System.out.println("Estamos encerrando os processos.....");
                System.out.println("Volte sempre!!");
                break;
            default:
                System.out.println("Opção inválida... Digite uma opção válida");
                break;
            } 
            if (menu == 6){
                break;
            }      
        }
       

    }
}
