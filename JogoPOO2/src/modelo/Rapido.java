package modelo;

import java.util.Random;

public class Rapido extends Correr {

    private Rapido() {
    }

    
    @Override
    public void Correr(Npc n) {
        Random r = new Random();
        n.setX(n.getX() + (r.nextInt() % 8));
        n.setY(n.getY() + (r.nextInt() % 8));
    }

    public static synchronized Correr getInstance() {
        if(getCorre()==null){
            setCorre(new Rapido());
        }
        return getCorre();
    }

}
