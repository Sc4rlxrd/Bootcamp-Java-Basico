class Usuario{
    public static void main(String[] args) {

        System.out.println("------------------------");

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual:  " + smartTv.volume);

        System.out.println("------------------------");

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("------------------------");

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual:  " + smartTv.volume);
        System.out.println("------------------------");
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual:  " + smartTv.volume);

        System.out.println("------------------------");        
        smartTv.aumentandoCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("------------------------");
        smartTv.diminuindoCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("------------------------");
        smartTv.mudarCanal(49);
        System.out.println("Canal atual: " + smartTv.canal);


    
 }
}