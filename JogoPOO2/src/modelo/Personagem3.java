package modelo;


public class Personagem3 extends Personagem {

     public Personagem3() {
        super(Forte.getInstance(), Baixo.getInstance(), Rapido.getInstance());
    }
    
    @Override
    public void realoca() {
        this.setAtaque(Forte.getInstance());
        this.setCorre(Rapido.getInstance());
        this.setPulo(Baixo.getInstance());
    }
}
