package jogopoo2;

public class Mediano implements IHealth {

    Mediano(Npc n){
        n.realoca();
    }
    
    @Override
    public void doBattle(Personagem p) {
        if (p.getHealth() > 70) {
            p.setSttHealth(new Strong(p));

        } else if (p.getHealth() <= 0) {
            p.setSttHealth(new Morto());

        } else if (p.getHealth() <= 30) {
            p.setSttHealth(new Danger(p));
        }
    }
}
