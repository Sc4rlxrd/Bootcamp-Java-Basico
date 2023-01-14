
import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SteamList{
    public static void main(String[] args) {
        List<String> numeroAleatorios = Arrays.asList("1","2","3","4","5","6","7","8","9","10","18");
        System.out.println("Imprima todos os elementos dessa lista de String");
        numeroAleatorios.stream().forEach(System.out::println);    
        // numeroAleatorios.forEach(System.out::println); funciona também
        System.out.println("Pegue os 5 primeiros elementos e coloque dentro de um Set:");
        Set <String > numerosAletorios5Primeiros = numeroAleatorios.stream().limit(5).collect(Collectors.toSet());
        System.out.println(numerosAletorios5Primeiros);
        System.out.println("Transforme a liste de String em uma lista de números inteiros:");
        List <Integer> numerosAleatoriosInteiro = numeroAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteiro);
        System.out.println("Pegue os números pares e maiores que dois que 2 e coloque numa lista: ");
        List <Integer> numerosMaioresQue2 = numeroAleatorios.stream().map(Integer::parseInt).filter(i ->i % 2 ==0 && i>2).collect(Collectors.toList());
        System.out.println("Os números maiores que dois e par: " + numerosMaioresQue2);
        System.out.println("A tamanho da lista: " + numerosAleatoriosInteiro.size());
        
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:"); 
        numerosAleatoriosInteiro.stream().skip(3).forEach(System.out::println); 
        long countNumerosUnicos = numerosAleatoriosInteiro.stream().distinct() .count(); 
         System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos); 
         System.out.print("Mostre o menor valor da lista: "); 
         numerosAleatoriosInteiro.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println); 
         System.out.print("Mostre o maior valor da lista: "); 
         numerosAleatoriosInteiro.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);; 
         int somaDosNumerosPares = numerosAleatoriosInteiro.stream().filter(i -> (i % 2 == 0)).mapToInt(Integer::intValue).sum(); 
         System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares); 
         System.out.println("Mostre a lista na ordem númerica: "); 
         List<Integer> numerosOrdemNatural = numerosAleatoriosInteiro.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()); 
         System.out.println(numerosOrdemNatural); 
         System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:"); 
 //         collect(Collectors.groupingBy(new Function()) 
         Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteiro.stream().collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0))); 
         System.out.println(collectNumerosMultiplosDe3E5);
       
    }
}