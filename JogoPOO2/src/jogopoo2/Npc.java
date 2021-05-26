package jogopoo2;

import java.util.Random;

public abstract class Npc {

    private int x;
    private int y;

    private Component ataque;
    private Pular pulo;
    private Correr corre;

    private int health;
    private IHealth sttHealth;
    private Handler escudo;

    public Component getAtaque() {
        return ataque;
    }

    public Npc() {
        Random ram = new Random();
        this.health = 70;
        this.ataque = new Intermediario();
        this.pulo = new Medio();
        this.corre = new Normal();
        this.sttHealth = new Mediano(this);
        this.escudo = null;
        this.x = ram.nextInt() % 1024;
        this.y = ram.nextInt() % 768;
    }

    public Npc(Component ataque, Pular pulo, Correr corre) {
        Random ram = new Random();
        this.ataque = ataque;
        this.pulo = pulo;
        this.corre = corre;
        this.health = 70;
        this.sttHealth = new Mediano(this);
        this.escudo = null;
        this.x = ram.nextInt() % 1024;
        this.y = ram.nextInt() % 786;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (sttHealth.getClass() != Morto.class) {
            this.x = Math.max(Math.min(x, 1024), 0);
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (sttHealth.getClass() != Morto.class) {
            this.y = Math.max(Math.min(y, 786), 0);
        }
    }

    public Handler getEscudo() {
        return escudo;
    }

    public void setEscudo(Handler escudo) {
        this.escudo = escudo;
    }

    public void setAtaque(Component ataque) {
        this.ataque = ataque;
    }

    public Pular getPulo() {
        return pulo;
    }

    public void setPulo(Pular pulo) {
        this.pulo = pulo;
    }

    public Correr getCorre() {
        return corre;
    }

    public void setCorre(Correr corre) {
        this.corre = corre;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        this.getSttHealth().doBattle(this);
    }

    public IHealth getSttHealth() {
        return sttHealth;
    }

    public void setSttHealth(IHealth sttHealth) {
        this.sttHealth = sttHealth;
    }

    public void Atacar(Npc n) {
        if (this.sttHealth.getClass() != Morto.class) {
            double dis = Math.sqrt(Math.pow(x - n.x, 2) + Math.pow(y - n.y, 2));
            if (dis <= 10) {
                if (n.escudo == null) {
                    n.setHealth(Math.max(n.getHealth() - this.ataque.Atacar(), 0));
                } else {
                    n.setHealth(Math.max(n.getHealth() - n.escudo.handlerRequest(this.ataque.Atacar()), 0));
                }
            }
        }
    }

    public void Pular() {
        this.pulo.Pular();
    }

    public void Correr() {
        this.corre.Correr(this);
    }

    public void addEscudo() {
        if (this.escudo == null) {
            this.escudo = new Escudo();
        } else {
            this.escudo.addHandler(new Escudo());
        }
    }

    public void addEscudo(int def) {
        if (this.escudo == null) {
            this.escudo = new EscudoPerso(def);
        } else {
            this.escudo.addHandler(new EscudoPerso(def));
        }
    }

    public void removeEscudo() {
        this.escudo = this.escudo.removeFirstHandler();
    }

    public void addFireball() {
        this.ataque = new FireBall(this.ataque);
    }

    public void addIcepwd() {
        this.ataque = new IcePwd(this.ataque);
    }

    public void addThunder() {
        this.ataque = new Thunder(this.ataque);
    }

    public void ganharLife(int n) {
        this.setHealth(Math.min(this.health + n, 100));
    }

    public abstract void realoca();
}
