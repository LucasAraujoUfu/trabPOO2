package jogopoo2;

import java.util.ArrayList;
import java.util.List;

public class Saida implements Fase {

    public Saida(Personagem j, int inimigo, int deslocamento, String nome) {
        jogador=j;
        for (int i = 0; i < inimigo; i++) {
            jogador.registerObserver(new Inimigo(deslocamento));
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
