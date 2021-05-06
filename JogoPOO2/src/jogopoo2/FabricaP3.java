package jogopoo2;

public class FabricaP3 extends SimpleFactory{

    private static FabricaP3 advancedFactory;
    @Override
    public Personagem fabricar() {
        return new Personagem3();
    }

    public static synchronized FabricaP3 getInstace(){
        if(advancedFactory == null){
            advancedFactory = new FabricaP3();
        }
        return advancedFactory;
    }

    private FabricaP3() {

    }
}
