package jogopoo2;

public class FabricaP1 extends SimpleFactory{
    @Override
    public Personagem fabricar() {
        return new Personagem1();
    }

}
