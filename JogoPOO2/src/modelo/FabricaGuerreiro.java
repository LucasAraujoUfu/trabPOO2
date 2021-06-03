package modelo;

public class FabricaGuerreiro extends SimpleFactory {

    private static FabricaGuerreiro fg;

    @Override
    public Personagem fabricar() {
        Guerreiro g = new Guerreiro(new Intermediario(), new Alto(), new Rapido());
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
