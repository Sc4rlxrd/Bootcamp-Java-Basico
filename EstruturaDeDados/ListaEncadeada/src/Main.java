public class Main {
    public static void main(String[] args) {
        ListaEncadeadaFile<String> minhaListaEncadeada = new ListaEncadeadaFile<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");
        minhaListaEncadeada.add("teste5");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada.get(4));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(4);

        System.out.println(minhaListaEncadeada);
    }
}