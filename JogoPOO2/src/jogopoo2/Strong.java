package jogopoo2;

public class Strong implements IHealth {

    Strong(Npc n){
        n.setAtaque(new Forte());
        n.setCorre(new Rapido());
        //n.setPulo(new Alto());
    }
    
    @Override
    public void doBattle(Personagem p) {
        if (p.getHealth() < 70) {
            p.setSttHealth(new Mediano(p));
        } else if (p.getHealth() <= 30) {
            p.setSttHealth(new Danger(p));
        } else if (p.getHealth() <= 0) {
            p.setSttHealth(new Morto());
        }
    }
}
