package jogopoo2;

import java.util.Random;

public class Inimigo extends Npc implements Observer{

    public Inimigo(){
        super();
    }
    
    public Inimigo(Atacar ataque, Pular pulo, Correr corre) {
        super(ataque, pulo, corre);
    }
    
    public Inimigo(Component ataque){
        super();
        super.setAtaque(ataque);
    }

    @Override
    public void update(Personagem p) {
        this.Atacar(p);
        Random r = new Random();
        if(this.getX()>p.getX()){
            this.setX(this.getX()-Math.abs(r.nextInt()%3));
        }
        else if(this.getX()<p.getX()){
            this.setX(this.getX()+Math.abs(r.nextInt()%3));
        }
        if(this.getY()>p.getY()){
            this.setY(this.getY()-Math.abs(r.nextInt()%3));
        }
        else if(this.getX()<p.getX()){
            this.setY(this.getY()+Math.abs(r.nextInt()%3));
        }
        this.Atacar(p);
    }

    @Override
    public void realoca() {}
   
}
