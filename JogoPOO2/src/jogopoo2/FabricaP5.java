package jogopoo2;

public class FabricaP5 extends SimpleFactory{
    @Override
    public Personagem fabricar() {
        Personagem3 personagem3 = new Personagem3();
        personagem3.addIcepwd();
        return personagem3;
    }
}
