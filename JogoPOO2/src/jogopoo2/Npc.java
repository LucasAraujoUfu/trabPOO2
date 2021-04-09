package jogopoo2;

public abstract class Npc {

    private Component ataque;
    private Pular pulo;
    private Correr corre;

    private int health;
    private IHealth sttHealth;
    private Handler escudo;
    
    public Component getAtaque() {
        return ataque;
    }
    
    public Npc(){}
    
    public Npc(Component ataque, Pular pulo, Correr corre) {
        this.ataque = ataque;
        this.pulo = pulo;
        this.corre = corre;
        this.health = 100;
        this.sttHealth = new Strong(this);
        this.escudo = null;
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
    }

    public IHealth getSttHealth() {
        return sttHealth;
    }

    public void setSttHealth(IHealth sttHealth) {
        this.sttHealth = sttHealth;
    }

    public void Atacar(Npc n) {
        if(n.escudo==null)
            n.setHealth(n.getHealth()-this.ataque.Atacar());
        else
            n.setHealth(n.getHealth()-n.escudo.handlerRequest(this.ataque.Atacar()));
    }

    public void Pular() {
        this.pulo.Pular();
    }

    public void Correr() {
        this.corre.Correr();
    }
    
    public void addEscudo(){
        if(this.escudo==null)this.escudo = new Escudo();
        else this.escudo.addHandler(new Escudo());
    }
    
    public void removeEscudo(){
        this.escudo = this.escudo.removeFirstHandler();
    }
    
    public void addFireball(){
        this.ataque = new FireBall(this.ataque);
    }
    
    public void addIcepwd(){
        this.ataque = new IcePwd(this.ataque);
    }
    
    public void addThunder(){
        this.ataque = new Thunder(this.ataque);
    }

    public abstract void realoca();
}
