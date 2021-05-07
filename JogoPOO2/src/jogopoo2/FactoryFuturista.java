package jogopoo2;

public class FactoryFuturista extends AbstractFactory {

    private static FactoryFuturista ff;

    private FactoryFuturista() {
    }

    public static FactoryFuturista getInstancia() {
        if (ff == null) {
            ff = new FactoryFuturista();
        }
        return ff;
    }

    @Override
    public Personagem createPersonagem(int n) {
        if (n == 1) {
            this.setSf(FabricaP1.getInstacia());
        } else if (n == 2) {
            this.setSf(FabricaP2.getInstacia());
        } else if (n == 3) {
            this.setSf(FabricaP3.getInstacia());
        } else if (n == 4) {
            this.setSf(FabricaP4.getInstacia());
        } else if (n == 5) {
            this.setSf(FabricaP5.getInstacia());
        }
        return this.getSf().fabricar();
    }

    @Override
    public Escudo createEscudo() {
        return null;
    }

    @Override
    public Inimigo createInimigo() {
        return null;
    }
}
