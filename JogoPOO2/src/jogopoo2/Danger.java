package jogopoo2;

public class Danger implements IHealth {

    private static Danger danger;

    Danger(Npc n){
        n.setAtaque(new Fraco());
        n.setCorre(new Devagar());
        //n.setPulo(new Baixo());
    }
    
    @Override
    public void doBattle(Npc p) {
        if (p.getHealth() > 70) {
            p.setSttHealth(Strong.getInstace());

        } else if (p.getHealth() > 30) {
            p.setSttHealth(Mediano.getInstace());

        } else if (p.getHealth() <= 0) {
            p.setSttHealth(Morto.getInstace());
        }

    }

    public static synchronized Danger getInstace(){
        if(danger == null){
            danger = new Danger();
        }
        return danger;
    }


    private Danger() {
    }

}
