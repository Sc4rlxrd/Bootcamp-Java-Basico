package exercicios_metodo.aula1;

public class Calculadora {

    public static void soma(double numero1, double numero2){
        double resultado = numero1+numero2;
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " deu: " + resultado );

    } 

    public static void subtracão(double numero1, double numero2){
        double resultado = numero1-numero2;
        System.out.println("A subtração entre " + numero1 + " e " + numero2 + " deu: " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação entre " + numero1 + " e " + numero2 + " deu: " + resultado);

    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A divisão entre " + numero1 + " e " + numero2 + " deu: " + resultado);
    }


}
