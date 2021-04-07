package jogopoo2;

public class Danger implements IHealth {
    
    Danger(Npc n){
        n.setAtaque(new Fraco());
        n.setCorre(new Devagar());
        n.setPulo(new Baixo());
    }
    
    @Override
    public void doBattle(Personagem p) {
        if (p.getHealth() > 70) {
            p.setSttHealth(new Strong(p));

        } else if (p.getHealth() > 30) {
            p.setSttHealth(new Mediano(p));

        } else if (p.getHealth() <= 0) {
            p.setSttHealth(new Morto());
        }

    }

}
