package modelo;

public abstract class Atacar implements Component{
    
    private static Atacar ataque;

    public static Atacar getAtaque() {
        return ataque;
    }

    public static void setAtaque(Atacar ataque) {
        Atacar.ataque = ataque;
    }
    
    public static synchronized Atacar getInstance(){
        return null;
    }
    
    @Override
    public abstract int Atacar();
     
}

