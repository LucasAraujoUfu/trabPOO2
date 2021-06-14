package modelo;

public abstract class Pular {
    
    private static Pular pulo;

    public static Pular getPulo() {
        return pulo;
    }

    public static void setPulo(Pular pulo) {
        Pular.pulo = pulo;
    }
    
    public abstract void Pular(Npc n);
    
    public static synchronized Pular getInstance(){
        return null;
    }
    
}
