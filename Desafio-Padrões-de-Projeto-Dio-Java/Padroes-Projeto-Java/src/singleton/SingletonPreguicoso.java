package singleton;

public class SingletonPreguicoso {
    private static SingletonPreguicoso instancia;

    private SingletonPreguicoso(){
        
    }

    public static SingletonPreguicoso getIntsancia(){
        if (instancia == null){
            instancia = new SingletonPreguicoso();
        }
        return instancia;
    }
}
