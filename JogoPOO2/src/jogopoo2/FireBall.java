package jogopoo2;
public class FireBall extends Decorator{
    
    FireBall(Component c){
        super(c);
    }
    
    public int Atacar() {
        return super.getCp().Atacar() + 10;
    }
}
