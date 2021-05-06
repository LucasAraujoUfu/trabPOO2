package jogopoo2;

public class Morto implements IHealth {

    private static Morto morto;

    @Override
    public void doBattle(Personagem p) {

    }

    public static synchronized Morto getInstace(){
        if(morto == null){
            morto = new Morto();
        }
        return morto;
    }

    private Morto() {
    }
}
