package jogopoo2;

import java.util.ArrayList;
import java.util.List;

public class Salao implements Fase {

    public Salao(int inimigo, int deslocamneto, String nome, Fase next1, Fase next2) {
        next = new ArrayList<>();
        for (int i = 0; i < inimigo; i++) {
            jogador.registerObserver(new Inimigo());
        }
        this.nome = nome;
        if (next1 != null) {
            next.add(next1);
        }
        if (next2 != null) {
            next.add(next2);
        }
    }

    public List<Fase> getNext() {
        return next;
    }

    public void setNext(List<Fase> next) {
        this.next = next;
    }

    public Personagem getJogador() {
        return jogador;
    }

    public void setJogador(Personagem jogador) {
        this.jogador = jogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Salao(int inimigo, int deslocamneto, String nome, Fase next1) {
        this(inimigo, deslocamneto, nome, next1, null);
    }
    private List<Fase> next;
    private Personagem jogador;
    private String nome;

}
