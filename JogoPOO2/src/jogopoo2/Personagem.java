package jogopoo2;

import java.util.List;
import java.util.ArrayList;

public abstract class Personagem extends Npc implements Subject {
    protected List<Inimigo> inimigo; 

    @Override
    public void registreObserver(Inimigo in) {
        this.inimigo.add(in);
    }

    @Override
    public void removeObserver(Inimigo in) {
        this.inimigo.remove(in);
    }

    @Override
    public void notifyObserver() {
        for(Inimigo i: inimigo){
            i.update();
        }
    }

    public Personagem(Atacar ataque, Pular pulo, Correr corre) {
        super(ataque, pulo, corre);
        this.inimigo = new ArrayList<>();
    }
    
    @Override
    public void setHealth(int health){
        super.setHealth(health);
        super.getSttHealth().doBattle(this);
        this.notifyObserver();
    }
}
