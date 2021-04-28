package jogopoo2;

public class FabricaP2 extends SimpleFactory{
    @Override
    public Personagem fabricar() {
        return new Personagem2();
    }
}
