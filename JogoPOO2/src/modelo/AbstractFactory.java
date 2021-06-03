package modelo;

public abstract class AbstractFactory {

    private SimpleFactory sf;

    public SimpleFactory getSf() {
        return sf;
    }

    public void setSf(SimpleFactory sf) {
        this.sf = sf;
    }

    public abstract Personagem createPersonagem();

    public abstract Escudo createEscudo();

    public abstract Inimigo createInimigo(int n);
}
