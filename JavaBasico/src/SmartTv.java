public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++; // convenção mais usada é a mesma coisa que volume = volume + 1;
        System.out.println("aumentando o volume para:  "+ volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo o volume para:  "+ volume);
    }
    public void aumentandoCanal(){
        canal++;
        System.out.println("aumentando de canal ");
    }
    public void diminuindoCanal(){
        canal--;
        System.out.println("diminuindo de canal");

    }
    public void mudarCanal(int novoCanal){
        canal= novoCanal;

    }
}
