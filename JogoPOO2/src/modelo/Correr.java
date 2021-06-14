package modelo;

public abstract class Correr {
    
    private static Correr corre;
    
    public static synchronized Correr getInstance(){
        return null;
    }
    
    public abstract void Correr(Npc n);

    protected static Correr getCorre() {
        return corre;
    }

    protected static void setCorre(Correr corre) {
        Correr.corre = corre;
    }
    
    
}
