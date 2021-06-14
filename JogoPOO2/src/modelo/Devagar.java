package modelo;

import java.util.Random;

public class Devagar extends Correr {

    private Devagar() {
    }
    
    @Override
    public void Correr(Npc n) {
        Random r = new Random();
        n.setX(n.getX()+(r.nextInt()%2));
        n.setY(n.getY()+(r.nextInt()%2));
    }
    
    public static synchronized modelo.Correr getInstance() {
        if(getCorre()==null){
            setCorre(new Devagar());
        }
        return getCorre();
    }
    
}
