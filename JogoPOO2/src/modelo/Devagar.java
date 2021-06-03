package modelo;

import java.util.Random;

public class Devagar implements Correr {

    @Override
    public void Correr(Npc n) {
        Random r = new Random();
        n.setX(n.getX()+(r.nextInt()%2));
        n.setY(n.getY()+(r.nextInt()%2));
    }
    
}
