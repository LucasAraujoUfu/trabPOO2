package modelo;

public class Forte extends Atacar {

    private Forte() {
    }
    
    @Override
    public int Atacar() {
        return 20;
    }
    
    public static synchronized Atacar getInstance(){
        if(getAtaque()==null){
           setAtaque(new Forte());
        }
        return getAtaque();
    }
    
}
