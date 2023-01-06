package exercicios_array;

public class OrdemInversa {
   public static void main(String[] args) {
        
        int[] vetor ={ -5, 6, 8, 9, 10, -25 };
        System.out.print("Vetor:");
        int contador = 0;
        while(contador < (vetor.length)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1 ); i >=0; i--){
            System.out.print(vetor[i] + " ");
        }

   } 
}
