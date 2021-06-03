package modelo;


public class Personagem1 extends Personagem {

     public Personagem1() {
        super(new Forte() , new Medio() , new Normal());
       
    }

    @Override
    public void realoca() {
        this.setAtaque(new Forte());
        this.setCorre(new Normal());
        this.setPulo(new Medio());
    }
    
}
