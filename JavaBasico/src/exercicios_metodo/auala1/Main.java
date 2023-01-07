package exercicios_metodo.auala1;

public class Main {
   public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("Método calculadora");
        System.out.println("---------------------------------");
        Calculadora.soma(5, 2);
        Calculadora.subtracão(5, 2);
        Calculadora.multiplicacao(5, 2);
        Calculadora.divisao(5, 2);
        //System.out.println("---------------------------------");


        System.out.println("---------------------------------");
        System.out.println("Método Mensagem");
        System.out.println("---------------------------------");
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(20);
        System.out.println("---------------------------------");

        System.out.println("Método Emprestimo");
        System.out.println("---------------------------------");
        Emprestimo.calcular(1500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500, 5);




   } 
}
