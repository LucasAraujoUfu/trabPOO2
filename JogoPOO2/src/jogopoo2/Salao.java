package jogopoo2;

import java.util.ArrayList;
import java.util.List;

public class Salao implements Fase {

    public Salao(Personagem j, int inimigo, int deslocamento, String nome, Fase next1, Fase next2) {
        jogador = j;
        next = new ArrayList<>();
        for (int i = 0; i < inimigo; i++) {
            jogador.registerObserver(new Inimigo(deslocamento));
        }
        this.nome = nome;
        if (next1 != null) {
            next.add(next1);
        }
        if (next2 != null) {
            next.add(next2);
        }
    }
    private List<Fase> next;
    private Personagem jogador;
    private String nome;

    public void alocaInimigo() {
        for (int i = 0; i < nmrInimigo; i++) {
            jogador.registerObserver(new Inimigo(this.deslocamento));
        }
    }
    private int nmrInimigo;
    private int deslocamento;

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

    public Salao(Personagem p, int inimigo, int deslocamneto, String nome, Fase next1) {
        this(p, inimigo, deslocamneto, nome, next1, null);
    }

}
