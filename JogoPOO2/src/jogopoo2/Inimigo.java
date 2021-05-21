package jogopoo2;

import java.util.Random;

public class Inimigo extends Npc implements Observer {

    private int deslocamento;

    public Inimigo(int deslocamento) {
        this.deslocamento = deslocamento;
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
