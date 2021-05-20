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
    private String nome;

    private Personagem jogador;
}
