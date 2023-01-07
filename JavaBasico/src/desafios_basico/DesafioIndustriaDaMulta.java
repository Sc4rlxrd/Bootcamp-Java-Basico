package desafios_basico;
import java.util.Scanner; 
public class DesafioIndustriaDaMulta {
    // Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        String resultado;
        if  (velocidadeAtual <=60){
          resultado = "Nao foi multado";
          System.out.println(resultado);
        } else{
          resultado = "Foi multado";
          System.out.println(resultado);
        }
        
        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

    }

}
