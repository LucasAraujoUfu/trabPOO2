package jogopoo2;

import java.util.ArrayList;
import java.util.List;

public class Saida implements Fase {

    public Saida(Personagem j, int inimigo, int deslocamento, String nome) {
        jogador = j;
        this.nome = nome;
        this.nmrInimigo = inimigo;
        this.deslocamento = deslocamento;

    }
    
    public void alocaInimigo(){
        for(int i  = 0 ; i < nmrInimigo; i ++){
            jogador.registerObserver(new Inimigo(this.deslocamento));
            
        }
    }
    
    private int nmrInimigo;
    private int deslocamento;

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

    @Override
    public List<Fase> getNext() {
        return null;
    }
}
