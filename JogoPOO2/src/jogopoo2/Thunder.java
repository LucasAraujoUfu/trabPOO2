package jogopoo2;
public class Thunder extends Decorator{
    public int Atacar() {
        return super.getCp().Atacar() + 12;}
    
}
