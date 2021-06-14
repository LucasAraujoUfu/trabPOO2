package modelo;

public class Fraco extends Atacar {

    private Fraco() {
    }
    
    @Override
    public int Atacar() {
       return 8;
    }
    
    public static synchronized Atacar getInstance(){
        if(getAtaque()==null){
           setAtaque(new Fraco());
        }
        return getAtaque();
    }
    
}
