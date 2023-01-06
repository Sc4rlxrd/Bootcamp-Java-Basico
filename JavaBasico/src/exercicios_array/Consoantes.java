package exercicios_array;

import java.util.Scanner;

public class Consoantes {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String [] consoantes = new String[6];
      int quantidadeConsoantes =0;
      int contador = 0;
      do{

        System.out.println("LETRAS: ");
        String letra = scan.next();
        if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i") | letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u") )){
            consoantes[contador] = letra;
            quantidadeConsoantes++;
        }
        contador++;


      }while(contador< consoantes.length);
      System.out.println("Consoantes: ");
      for (String consoante : consoantes){
        if (consoante != null){
            System.out.print(consoante + " ");
        }
      }
   } 
}
