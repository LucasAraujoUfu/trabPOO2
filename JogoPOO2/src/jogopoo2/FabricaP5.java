package jogopoo2;

public class FabricaP5 extends SimpleFactory{

    private static FabricaP5 advancedFactory;
    @Override
    public Personagem fabricar() {
        Personagem3 personagem3 = new Personagem3();
        personagem3.addIcepwd();
        return personagem3;
    }

    public static synchronized FabricaP5 getInstace(){
        if(advancedFactory == null){
            advancedFactory = new FabricaP5();
        }
        return advancedFactory;
    }

    private FabricaP5() {

    }
}
