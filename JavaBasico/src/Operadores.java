public class Operadores {
    public static void main  (String[] args){
    int numero1 = 1;
    int numero2 = 2;
  
  if(numero1 > numero2)
  	System.out.print("Numero 1 maior que numero 2");
  
  if(numero1 < numero2)
  	System.out.print("Numero 1 menor que numero 2");
  
  if(numero1 >= numero2)
  	System.out.print("Numero 1 maior ou igual que numero 2");
  
  if(numero1 <= numero2)
  	System.out.print("Numero 1 menor ou igual que numero 2");
  
  if(numero1 != numero2)
  	System.out.print("Numero 1 é diferente de numero 2");
  }
   public static void comparacaoAvancada (){
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
    
  }
   public static void comparacaoAvancada2(){
        String numero1 = "130";
        String numero2 = "130";
        System.out.println(numero1 == numero2); //true
        
        //int numero1 = 130;
        //int numero2 = 130;

        //System.out.println(numero1 == numero2); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
        System.out.println(numero1.equals(numero2)); 
   }
   public static void comparacaoLogico(){
     boolean condicao1=true;

    boolean condicao2=false;
      
      /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
      expressões. 
      É como se estivesse escrito:
       "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
      */
      
    if(condicao1 && condicao2)
      	System.out.print("Os dois valores precisam ser verdadeiros");;
      
      //Se condicao1 OU condicao2 for verdadeira, executar código.
    if(condicao1 || condicao2)
      	System.out.print("Um dos valores precisa ser verdadeiro");
   }
}
