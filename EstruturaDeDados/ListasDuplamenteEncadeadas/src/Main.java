public class Main {
    public static void main(String[] args) {
        ListasDuplamenteEncadeada<String> minhaListaEncadeada = new ListasDuplamenteEncadeada<>();

        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");
        minhaListaEncadeada.add("c8");
        minhaListaEncadeada.add("c9");
        minhaListaEncadeada.add("c10");


        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3); // valor: c4
        minhaListaEncadeada.remove(8); // valor: c9
        minhaListaEncadeada.add(3, "c99");
        minhaListaEncadeada.add(8, "c30");

        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada.get(8));
    }

}