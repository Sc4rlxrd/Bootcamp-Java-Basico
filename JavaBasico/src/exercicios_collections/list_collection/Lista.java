package exercicios_collections.list_collection;
import java.util.*;

public class Lista{
    
    public static void main(String[] args) {

        List <Double> notas = new ArrayList<>();
        notas.add(5.7d);
        notas.add(7.7d);
        notas.add(8.7d);
        notas.add(9.7d);
        notas.add(5.5d);
        notas.add(6.0d);
        System.out.println(notas.toString());
        LinhaDeDivisão.separacao();
        System.out.println("Qual o tamanho da lista notas: "  +  notas.size());
        LinhaDeDivisão.separacao();
        System.out.println("Qual valor está na posição 3 :  "  + notas.get(3));
        LinhaDeDivisão.separacao();
        System.out.println("Antes de remove valor: " + notas.toString());
        System.out.println("Remova o valor na posição 5: ");
        notas.remove(5);
        System.out.println("Depois de remover o valor:  " + notas.toString());
        LinhaDeDivisão.separacao();
        System.out.println("Qual o index do valor 8,7: " + notas.indexOf(8.7d));
        LinhaDeDivisão.separacao();
        System.out.println("O valor 10 está na lista? " + notas.contains(10d));
        LinhaDeDivisão.separacao();
        System.out.println("Mude o valor 8,7 por 10 :  ");
        notas.set(notas.indexOf(8.7d), 10d);
        System.out.println(notas.toString());
        LinhaDeDivisão.separacao();
        System.out.println("Calcule a soma entre elementos dessa lista: ");
        Iterator < Double > iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            double proximo = iterator.next();
            soma+=proximo;
        }
        System.out.println("A soma deu : " + soma);
        LinhaDeDivisão.separacao();
        System.out.println("O conjunto está vazio? " + notas.isEmpty());
        System.out.println("Apague a lista toda: ");
        notas.clear();
        System.out.println(notas.toString());
    }

}
