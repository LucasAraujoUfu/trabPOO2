package modelo;
public class Thunder extends Decorator{
    
    Thunder(Component c){
        super(c);
    }
    
    public int Atacar() {
        return super.getCp().Atacar() + 12;
    }
    
}
