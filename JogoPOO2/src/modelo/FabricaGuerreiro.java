package modelo;

public class FabricaGuerreiro extends SimpleFactory {

    private static FabricaGuerreiro fg;

    @Override
    public Personagem fabricar() {
        Guerreiro g = new Guerreiro(Intermediario.getInstance(), Alto.getInstance(), Rapido.getInstance());
        return g;
    }

    private FabricaGuerreiro() {
    }

    public static synchronized FabricaGuerreiro getInstancia() {
        if (fg == null) {
            fg = new FabricaGuerreiro();
        }
        return fg;
    }
}
