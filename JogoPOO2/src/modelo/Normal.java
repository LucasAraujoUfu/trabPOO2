package modelo;

import java.util.Random;

public class Normal implements Correr {

    @Override
    public void Correr(Npc n) {
        Random r = new Random();
        n.setX(n.getX()+(r.nextInt()%6));
        n.setY(n.getY()+(r.nextInt()%6));
    }
    
}
