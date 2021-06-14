package modelo;


public class Personagem1 extends Personagem {

     public Personagem1() {
        super(Forte.getInstance() , Medio.getInstance() ,Normal.getInstance());
       
    }

    @Override
    public void realoca() {
        this.setAtaque(Forte.getInstance());
        this.setCorre(Normal.getInstance());
        this.setPulo(Medio.getInstance());
    }
    
}
