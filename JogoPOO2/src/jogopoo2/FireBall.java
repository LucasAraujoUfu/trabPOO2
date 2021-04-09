package jogopoo2;
public class FireBall extends Decorator{
    public int Atacar() {
        return super.getCp().Atacar() + 10;
    }
}
