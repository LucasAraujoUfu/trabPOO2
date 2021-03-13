package jogopoo2;

public abstract class Personagem {
   private Atacar ataque;
   private Pular pulo;
   private Correr corre;

    public Atacar getAtaque() {
        return ataque;
    }

    public Personagem(Atacar ataque, Pular pulo, Correr corre) {
        this.ataque = ataque;
        this.pulo = pulo;
        this.corre = corre;
    }

    public void setAtaque(Atacar ataque) {
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
   


public void Atacar(){this.ataque.Atacar();}
public void Pular(){this.pulo.Pular();}
public void Correr(){this.corre.Correr();}

       
        }