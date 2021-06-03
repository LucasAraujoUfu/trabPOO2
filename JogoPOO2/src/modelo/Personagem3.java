package modelo;


public class Personagem3 extends Personagem {

     public Personagem3() {
        super(new Forte (), new Baixo(), new Rapido());
    }
    
    @Override
    public void realoca() {
        this.setAtaque(new Forte());
        this.setCorre(new Rapido());
        this.setPulo(new Baixo());
    }
}
