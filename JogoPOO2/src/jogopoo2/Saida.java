package jogopoo2;

import java.util.ArrayList;
import java.util.List;

public class Saida implements Fase {

    public Saida(int inimigo, int deslocamneto, String nome) {
        for (int i = 0; i < inimigo; i++) {
            jogador.registerObserver(new Inimigo());
        }
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Personagem getJogador() {
        return jogador;
    }

    public void setJogador(Personagem jogador) {
        this.jogador = jogador;
    }

    private String nome;

    private Personagem jogador;
}
