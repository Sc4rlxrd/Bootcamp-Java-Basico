package singleton;

public class SingletonAnsioso {

    private static SingletonAnsioso instancia = new SingletonAnsioso();

    private SingletonAnsioso(){

    }

    public static SingletonAnsioso getInstancia(){
        return instancia;
    }
}
