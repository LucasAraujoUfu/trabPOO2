package jogopoo2;

public class FabricaP4 extends SimpleFactory{

    private static FabricaP4 advancedFactory;
    @Override
    public Personagem fabricar() {
        Personagem2 personagem2 = new Personagem2();
        personagem2.addFireball();
        return personagem2;
    }

    public static synchronized FabricaP4 getInstace(){
        if(advancedFactory == null){
            advancedFactory = new FabricaP4();
        }
        return advancedFactory;
    }

    private FabricaP4() {

    }
}
