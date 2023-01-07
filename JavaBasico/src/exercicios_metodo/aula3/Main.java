package exercicios_metodo.aula3;

public class Main {
   public static void main(String[] args) {

        double quadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + quadrado);

        double retangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo: " + retangulo);

        double trapezio = Quadrilatero.area(5d, 5d, 5d);
        System.out.println("Área do trapézio: " + trapezio);

        float losango = Quadrilatero.area(5f, 5f);
        System.out.println("Área do losango: " + losango);
   } 
}
