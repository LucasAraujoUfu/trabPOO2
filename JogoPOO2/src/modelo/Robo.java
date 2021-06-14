package modelo;

public class Robo extends Personagem {

    @Override
    public void realoca() {
    }

    public Robo(Atacar ataque, Pular pulo, Correr corre) {
        super(ataque, pulo, corre);
    }

    public Robo() {
        super(Forte.getInstance(), Baixo.getInstance(),Rapido.getInstance());

    }
}
