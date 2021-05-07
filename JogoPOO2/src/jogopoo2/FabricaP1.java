package jogopoo2;

public class FabricaP1 extends SimpleFactory{

    private static FabricaP1 advancedFactory;
    @Override
    public Personagem fabricar() {
        return new Personagem1();
    }

    public static synchronized FabricaP1 getInstacia(){
        if(advancedFactory == null){
            advancedFactory = new FabricaP1();
        }
        return advancedFactory;
    }

    private FabricaP1() {

    }
}
