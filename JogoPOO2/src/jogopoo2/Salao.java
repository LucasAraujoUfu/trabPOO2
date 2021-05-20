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
    public Salao(int inimigo, int deslocamneto, String nome, Fase next1){
        this(inimigo, deslocamneto, nome, next1 , null);
    }
    private List<Fase> next;
    private Personagem jogador;
    private String nome;

}