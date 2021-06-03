package modelo;
public class IcePwd extends Decorator{
    
    IcePwd(Component c){
        super(c);
    }
    
    public int Atacar() {
        return super.getCp().Atacar() + 7;
    }
    
}
