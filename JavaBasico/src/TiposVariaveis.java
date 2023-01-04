public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;  // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L;  // se começar com zero, talvez tenha que ser outro tipo, precisa colocar L para indentificar o tipo
        float pi = 3.14F; // precisa colocar o f no  final pode ser  maiúsculas ou  minúsculas
        double salario = 1275.33;
        final double Pi =3.14;
    
  
        System.out.println("tipo: byte, Idade: "+ idade);
        System.out.println("tipo: short, Ano: "+ ano);
        System.out.println("Tipo: int, Cep: "+ cep); 
        System.out.println("Tipo:long CPF: "+ cpf);
        System.out.println("Tipo: float, Pi: "+ pi);
        System.out.println("Tipo: double, Salário: " + salario);
        System.out.println("Não sera modificado o valor com final na frente do tipo exemplo PI: " + Pi);
  }
}
