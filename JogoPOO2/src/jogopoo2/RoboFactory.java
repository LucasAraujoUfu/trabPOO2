package jogopoo2;

public class RoboFactory extends SimpleFactory {

    private static RoboFactory Rf;

    private  RoboFactory() {
    }

    public static synchronized RoboFactory getInstancia() {
        if (Rf == null) {
            Rf = new RoboFactory();
        }
        return Rf;
    }

    @Override
    public Personagem fabricar() {
        Robo r = new Robo();
        return r;
    }
}
