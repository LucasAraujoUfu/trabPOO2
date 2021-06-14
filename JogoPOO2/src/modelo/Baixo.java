package modelo;

import java.util.Random;

public class Baixo extends Pular{

    private Baixo() {
    }
    
    @Override
    public void Pular(Npc n) {
        Random r = new Random();
        n.setY(n.getY()+(r.nextInt()%20));
        n.setX(n.getX()+(r.nextInt()%20));
    }
    
    public static synchronized Pular getInstance(){
        if(getInstance()==null){
           setPulo(new Baixo());
        }
        
        return getPulo();
    }
    
}
