package modelo;

public class Intermediario extends Atacar {

    private Intermediario() {
    }
    
    @Override
    public int Atacar() {
        return 15;
    }
    
    public static synchronized Atacar getInstance(){
        if(getAtaque()==null){
           setAtaque(new Intermediario());
        }
        return getAtaque();
    }
    
}
