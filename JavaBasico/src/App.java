public class App {
    public static void main(String[] args){
        String primeiroNome = "Scarlxrd";

        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        
        System.out.println("O nome completo é: "+ nomeCompleto);
  }
  public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(" "+ segundoNome);
  }
        
    
}
