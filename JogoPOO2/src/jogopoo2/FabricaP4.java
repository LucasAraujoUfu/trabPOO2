package jogopoo2;

public class FabricaP4 extends SimpleFactory{
    @Override
    public Personagem fabricar() {
        Personagem2 personagem2 = new Personagem2();
        personagem2.addFireball();
        return personagem2;
    }
}
