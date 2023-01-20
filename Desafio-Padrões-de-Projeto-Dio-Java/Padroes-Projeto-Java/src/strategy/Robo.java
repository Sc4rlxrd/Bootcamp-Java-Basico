package strategy;

public class Robo {
    private Comportamento comportamento;

    public void mover(){
        comportamento.mover();
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    
}

