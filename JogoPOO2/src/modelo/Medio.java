package modelo;

import java.util.Random;

public class Medio extends Pular {

    private Medio() {
    }
    
    @Override
    public void Pular(Npc n) {
        Random r = new Random();
        n.setY(n.getY()+(r.nextInt()%30));
        n.setX(n.getX()+(r.nextInt()%30));
    }
    
    public static synchronized Pular getInstance(){
        if(getPulo()==null){
           setPulo(new Medio());
        }
        
        return getPulo();
    }

}
