package modelo;

import java.util.Random;

public class Normal extends Correr {

    private Normal() {
    }
    
    @Override
    public void Correr(Npc n) {
        Random r = new Random();
        n.setX(n.getX()+(r.nextInt()%6));
        n.setY(n.getY()+(r.nextInt()%6));
    }
    
    public static synchronized modelo.Correr getInstance() {
        if(getCorre()==null){
            setCorre(new Normal());
        }
        return getCorre();
    }
    
}
