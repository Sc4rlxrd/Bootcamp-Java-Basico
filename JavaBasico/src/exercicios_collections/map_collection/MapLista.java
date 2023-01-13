package exercicios_collections.map_collection;
import java.util.*;
public class MapLista {
   public static void main(String[] args) {
    
    Map <String, Double > smartPhone = new HashMap<>();
    smartPhone.put("Motorola one macro", 1400d);
    smartPhone.put("Iphone apple 14", 10500d);
    smartPhone.put("Motorola g9 play", 1400d);
    smartPhone.put("Samsung j1 2016", 385d);
    smartPhone.put("Samsung Z fold", 3881d);
    smartPhone.put("OnePlus 10 Pro 5g ", 2837d);
    
    System.out.println(smartPhone.toString());
    LinhaSeparacao.separacao();

    System.out.println("Modifique o valor do aparelho motorola one macro pra 1500");
    smartPhone.put("Motorola one macro", 1500d);
    LinhaSeparacao.separacao();

    System.out.println("Qual o preço do Oneplus 10 Pro?" + smartPhone.containsKey("OnePlus 10 Pro 5g"));
    LinhaSeparacao.separacao();

    System.out.println("Pegue o nome de todos aparelhos do dicionário");
    Set <String> smartPhone2 = new TreeSet<>();
    smartPhone2 = smartPhone.keySet();
    System.out.println(smartPhone2.toString());
    LinhaSeparacao.separacao();

    System.out.println("Pegue todos os preços de aparelhos do dicionário");
    Set <Double> values = new TreeSet<>(smartPhone.values());
    System.out.println(values);
    LinhaSeparacao.separacao();

    System.out.println("Calcule o valores de cada aparelho que compõem esse dicionário");
    Iterator < Double > iterator = smartPhone.values().iterator();
    double soma = 0;
    while (iterator.hasNext()){
        soma+=iterator.next();
    }
    System.out.println("A soma deu: " + soma);
    LinhaSeparacao.separacao();

    System.out.println("Qual é a média de valores desse dicionário");
    System.out.println("R$ "+(soma/smartPhone.size()));
    LinhaSeparacao.separacao();

    System.out.println("Qual é o tamanho desse dicionário?  " + smartPhone.size());
    LinhaSeparacao.separacao();

    System.out.println("Coloque esse dicionário em ordem alfabética ");
    Map <String, Double> smartOrdemAlfatico = new TreeMap<>(smartPhone);
    System.out.println(smartOrdemAlfatico.toString());
    LinhaSeparacao.separacao();

    System.out.println("Dicionário está vazio? " + smartPhone.isEmpty());
    System.out.println("Apague o dicionário todo");
    smartPhone.clear();
    smartPhone2.clear();
    smartOrdemAlfatico.clear();
    System.out.println("O dicionário está vazio? " + smartPhone.isEmpty());
  
   } 
}
