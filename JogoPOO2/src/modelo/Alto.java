package modelo;

import java.util.Random;

public class Alto extends Pular {

    private Alto() {
    }
    
    @Override
    public void Pular(Npc n) {
        Random r = new Random();
        n.setY(n.getY()+(r.nextInt()%40));
        n.setX(n.getX()+(r.nextInt()%40));
    }
    
    public static synchronized Pular getInstance(){
        if(getPulo() ==null){
           setPulo(new Alto());
        }
        
        return getPulo();
    }
    
    
}
