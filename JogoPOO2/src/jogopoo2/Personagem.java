package jogopoo2;

public abstract class Personagem extends Npc implements Subject{
public Inimigo inimigo;

    public Inimigo getInimigo() {
        return inimigo;
    }

    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }

    
    public void registreObserver(){}
    public void removeObserver(){}
    public void notifyObserver(){}
    
    public Personagem(jogopoo2.Atacar ataque, jogopoo2.Pular pulo, jogopoo2.Correr corre) {
        super(ataque, pulo, corre);
    }
        }