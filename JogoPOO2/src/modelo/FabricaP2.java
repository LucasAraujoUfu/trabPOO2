package modelo;

public class FabricaP2 extends SimpleFactory{

    private static FabricaP2 advancedFactory;
    @Override
    public Personagem fabricar() {
        return new Personagem2();
    }

    public static synchronized FabricaP2 getInstacia(){
        if(advancedFactory == null){
            advancedFactory = new FabricaP2();
        }
        return advancedFactory;
    }

    private FabricaP2() {

    }
}
