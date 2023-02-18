public class Main {
    public static void main(String[] args)
    {
        int intA = 1;
        int intB = intA; // copia exatamente o valor da var
        int intC = intB; // se mudar o valor da primeira var não altera o valor da segunda

        System.out.println("intA=" + intA + " intB=" + intB);
        intA = 2;
        System.out.println("intA=" + intA + " intB=" + intB);
        intB = 3;

        System.out.println("intA =" + intA + " intB =" + intB + " intC =" + intC );
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA; // copia a referencia de memoria do objeto.
        MeuObj objC = objB; // se mudar o valor de objA muda tambem o objB

        System.out.println("objA=" + objA + " objB=" + objB);
        objA.setNum(2);
        System.out.println("objA=" + objA + " objB=" + objB);
        System.out.println("objA=" + objA + " objB=" + objB + "objC =" + objC);

    }
}