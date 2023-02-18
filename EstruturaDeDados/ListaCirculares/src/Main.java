public class Main {
    public static void main(String[] args) {
        ListaCirculares<String> minhaListaCircular = new ListaCirculares<>();

        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        minhaListaCircular.add("c5");
        minhaListaCircular.add("c6");
        minhaListaCircular.add("c7");
        minhaListaCircular.add("c8");
        minhaListaCircular.add("c9");
        minhaListaCircular.add("c10");

        System.out.println(minhaListaCircular.get(7));
        System.out.println(minhaListaCircular.get(3));
        System.out.println(minhaListaCircular.get(5));
        System.out.println(minhaListaCircular.size());

    }
}