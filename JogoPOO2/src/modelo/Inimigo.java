package modelo;

public class Inimigo extends Npc implements Observer {

    private int deslocamento;

    public Inimigo(int deslocamento) {
        this.deslocamento = deslocamento;
    }
    
    public void Atacar(Npc n) {
        double dis = Math.sqrt(Math.pow(this.getX() - n.getX(), 2) + Math.pow(this.getY() - n.getY(), 2));
        if (dis <= 5) {
            if (n.getEscudo() == null) {
                n.setHealth(Math.max(n.getHealth() - this.getAtaque().Atacar()+3, 0));
            } else {
                n.setHealth(Math.max(n.getHealth() - n.getEscudo().handlerRequest(this.getAtaque().Atacar()+3), 0));
            }
        }
    }
    
    public Inimigo() {
        super();
    }

    public Inimigo(Atacar ataque, Pular pulo, Correr corre) {
        super(ataque, pulo, corre);
    }

    public Inimigo(Component ataque) {
        super();
        super.setAtaque(ataque);
    }

    @Override
    public void update(Personagem p) {
        this.Atacar(p);
        if(p.getX()>this.getX()){
           this.setX(this.getX()+deslocamento);
        }
        else if(p.getX()<this.getX()){
           this.setX(this.getX()-deslocamento);
        }
        if(p.getY()>this.getY()){
           this.setY(this.getY()+deslocamento);
        }
        else if(p.getY()<this.getY()){
           this.setY(this.getY()-deslocamento);
        }
        this.Atacar(p);
    }

    @Override
    public void realoca() {
    }

}
