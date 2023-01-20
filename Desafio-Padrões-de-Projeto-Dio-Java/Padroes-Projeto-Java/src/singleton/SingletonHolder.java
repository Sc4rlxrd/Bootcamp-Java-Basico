package singleton;

public class SingletonHolder {
    private static class InstanceHolder{
        public static SingletonHolder instancia = new SingletonHolder();
        
    }

    private SingletonHolder(){

    }
    public static SingletonHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
