package equalshashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("BMW"));
        listaCarros.add(new Carro("Volkswagen"));
        listaCarros.add(new Carro("Bugatti"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("BMW").hashCode());
        System.out.println(listaCarros);
    }
}
