package modelo;

import java.util.List;

public interface Fase {

    public abstract Personagem getJogador();

    public abstract void setJogador(Personagem jogador);

    public abstract String getNome();

    public abstract void setNome(String nome);
    
    public abstract List<Fase> getNext();
    
    public abstract void alocaInimigo();
}
