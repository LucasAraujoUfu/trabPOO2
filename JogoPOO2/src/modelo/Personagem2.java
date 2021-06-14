package modelo;


public class Personagem2 extends Personagem {
    
     public Personagem2() {
        super(Intermediario.getInstance(), Alto.getInstance(),Rapido.getInstance());
    }

    @Override
    public void realoca() {
        this.setAtaque(Intermediario.getInstance());
        this.setCorre(Rapido.getInstance());
        this.setPulo(Alto.getInstance());
    }
    
}
