package jogopoo2;

public class Mediano implements IHealth {

    private static Mediano mediano;

    Mediano(Npc n){
        n.realoca();
    }
    
    @Override
    public void doBattle(Npc p) {
        if (p.getHealth() > 70) {
            p.setSttHealth(Strong.getInstace());

        } else if (p.getHealth() <= 0) {
            p.setSttHealth(Morto.getInstace());

        } else if (p.getHealth() <= 30) {
            p.setSttHealth(Danger.getInstace());
        }
    }

    public static synchronized Mediano getInstace(){
        if(mediano == null){
            mediano = new Mediano();
        }
        return mediano;
    }

    private Mediano() {
    }
}
