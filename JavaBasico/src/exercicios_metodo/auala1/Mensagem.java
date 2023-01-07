package exercicios_metodo.auala1;

public class Mensagem {
    public static void obterMensagem(int hora){

        switch(hora){
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 1:
            case 2:
                mensagemBoaNoite();
                break;
            default:
              System.out.println("INVÁLIDO!! DIGITE UM HORÁRIO VÁLIDO");
              break;
            
        }
    }
    public static void mensagemBomDia(){
        System.out.println("BOM DIA!! ");
        System.out.println("TENHA UM ÓTIMO DIA!!");
    }

    public static void mensagemBoaTarde(){

        System.out.println("BOA TARDE!! ");
        System.out.println("CAFÉ ESTÁ PRONTO?");

    }

    public static void mensagemBoaNoite(){
        System.out.println("BOA NOITE!! ");
        System.out.println("ZZZZZZ");
    }
}
