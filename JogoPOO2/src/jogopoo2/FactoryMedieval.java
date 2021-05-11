package jogopoo2;

public class FactoryMedieval extends AbstractFactory {

    private static FactoryMedieval fm;
    
    public static synchronized FactoryMedieval getInstancia() {
        if (fm == null) {
            fm = new FactoryMedieval();
        }
        return fm;
    }

    private FactoryMedieval() {
    }
    
    @Override
    public Personagem createPersonagem() {
        return FabricaGuerreiro.getInstancia().fabricar();
    }

    @Override
    public Escudo createEscudo() {
        Escudo Escd = new Escudo();
        return Escd;
    }

    @Override
    public Inimigo createInimigo(int n) {
        if (n == 0) {
            return new Inimigo();
        } else if (n == 1) {
            return new Inimigo1();
        } else if (n == 2) {
            return new Inimigo2();
        } else {
            return new Inimigo3();
        }
    }

}
