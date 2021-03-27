package jogopoo2;

public class Inimigo extends Npc implements Observer{

    public Inimigo(){
        
    }
    
    public Inimigo(Atacar ataque, Pular pulo, Correr corre) {
        super(ataque, pulo, corre);
    }

    @Override
    public void update() {
    }

    @Override
    public void realoca() {}
   
}
