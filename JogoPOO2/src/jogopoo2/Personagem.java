package jogopoo2;

import java.util.List;
import java.util.ArrayList;

public abstract class Personagem extends Npc implements Subject {

    protected List<Inimigo> inimigo;

    @Override
    public void registerObserver(Inimigo in) {
        this.inimigo.add(in);
    }

    @Override
    public void removeObserver(Inimigo in) {
        this.inimigo.remove(in);
    }

    @Override
    public void notifyObserver() {
        for (Inimigo i : inimigo) {
            i.update(this);
        }
    }

    public List<Inimigo> getInimigo() {
        return inimigo;
    }

    public void setInimigo(List<Inimigo> inimigo) {
        this.inimigo = inimigo;
    }

    public Personagem(Atacar ataque, Pular pulo, Correr corre) {
        super(ataque, pulo, corre);
        this.inimigo = new ArrayList<>();
    
    }

    @Override
    public void Correr() {
        super.Correr();
        this.notifyObserver();
    }

}
