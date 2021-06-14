package modelo;

public class Strong implements IHealth {

    private static Strong strong;

    Strong(Npc n){
        n.setAtaque(Forte.getInstance());
        n.setCorre(Rapido.getInstance());
        //n.setPulo(new Alto());
    }

    @Override
    public void doBattle(Npc p) {
        if (p.getHealth() < 70) {
            p.setSttHealth(Mediano.getInstace());
        } else if (p.getHealth() <= 30) {
            p.setSttHealth(Danger.getInstace());
        } else if (p.getHealth() <= 0) {
            p.setSttHealth(Morto.getInstace());
        }
    }

    public static synchronized Strong getInstace(){
        if(strong == null){
            strong = new Strong();
        }
        return strong;
    }

    private Strong() {
    }
}
