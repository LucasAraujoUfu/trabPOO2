package jogopoo2;

import java.util.List;

public interface Fase {

    public abstract Personagem getJogador();

    public abstract void setJogador(Personagem jogador);

    public abstract String getNome();

    public abstract void setNome(String nome);
}
