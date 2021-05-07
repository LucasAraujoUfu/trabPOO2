package jogopoo2;
public abstract class AbstractFactory {
    private SimpleFactory sf;

    public SimpleFactory getSf() {
        return sf;
    }

    public void setSf(SimpleFactory sf) {
        this.sf = sf;
    }
    
    public abstract Personagem createPersonagem(int n);
    public abstract Escudo createEscudo();
    public abstract Inimigo createInimigo();
}
