package jogopoo2;

public class Inimigo extends Npc implements Observer{

    public Inimigo(jogopoo2.Atacar ataque, jogopoo2.Pular pulo, jogopoo2.Correr corre) {
        super(ataque, pulo, corre);
    }

    @Override
    public void update() {
    }
   
}
