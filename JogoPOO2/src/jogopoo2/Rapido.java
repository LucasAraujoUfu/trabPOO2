package jogopoo2;

import java.util.Random;

public class Rapido implements Correr {

    @Override
    public void Correr(Npc n) {
        Random r = new Random();
        n.setX(n.getX()+(r.nextInt()%8));
        n.setY(n.getY()+(r.nextInt()%8));
    }
    
}
