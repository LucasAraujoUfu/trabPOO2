package jogopoo2;

public class FabricaP3 extends SimpleFactory{
    @Override
    public Personagem fabricar() {
        return new Personagem3();
    }
}
