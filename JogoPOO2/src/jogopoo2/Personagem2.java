package jogopoo2;


public class Personagem2 extends Personagem {
    
     public Personagem2() {
        super(new Intermediario(), new Alto(), new Rapido());
    }

    @Override
    public void realoca() {
        this.setAtaque(new Intermediario());
        this.setCorre(new Rapido());
        this.setPulo(new Alto());
    }
    
}
