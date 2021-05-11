package jogopoo2;

public class FactoryFuturista extends AbstractFactory {

    private static FactoryFuturista ff;

    private FactoryFuturista() {
    }

    public static synchronized FactoryFuturista getInstancia() {
        if (ff == null) {
            ff = new FactoryFuturista();
        }
        return ff;
    }
    

    @Override
    public Personagem createPersonagem() {
        return RoboFactory.getInstancia().fabricar();
    }

    @Override
    public Escudo createEscudo() {
        CampoDeForca Cf = new CampoDeForca();
        return Cf;
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
