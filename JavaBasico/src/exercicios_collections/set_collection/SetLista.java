package exercicios_collections.set_collection;

import java.util.*;

public class SetLista{
    public static void main(String[] args) {

        Set < Double > notas = new HashSet<>();
        notas.add(7d);
        notas.add(5d);
        notas.add(6d);
        notas.add(4d);
        notas.add(10d);
        notas.add(0d);
        notas.add(1d);
        notas.add(4d);
        notas.add(2d);
        
        System.out.println(notas.toString()); 
        SeparacaoLinha.linha();

        System.out.println("O valor 9 está na lista? " + notas.contains(9d));
        SeparacaoLinha.linha();

        System.out.println("Qual é o tamanho a lista? " + notas.size());
        SeparacaoLinha.linha();

        System.out.println("Remova o valor 0 da lista");
        notas.remove(0d);
        SeparacaoLinha.linha();

        System.out.println("Mostre a ordem de inserção dos valores: ");
        Set < Double > notas2 = new HashSet<>();
        notas2.addAll(notas);
        System.out.println(notas2.toString());

        SeparacaoLinha.linha();
        System.out.println("Mostre a ordem cresente dos elementos que compõem essa lista: ");
        Set < Double > notas3 = new TreeSet<>(notas2);
        //notas.addAll(notas2); não é necessario mais funciona também.
        System.out.println(notas3.toString());
        SeparacaoLinha.linha();

        System.out.println("A lista está vazia? " + notas3.isEmpty());
        SeparacaoLinha.linha();

        System.out.println("Apague a lista toda ");
        notas3.clear();
        System.out.println("A lista está vazia? " + notas3.isEmpty());



    }
}