package modelo;

import java.util.List;

public class Saida implements Fase {

    public Saida(Personagem j, int inimigo, int deslocamento, String nome) {
        jogador = j;
        this.nome = nome;
        this.nmrInimigo = inimigo;
        this.deslocamento = deslocamento;

    }
    
    @Override
    public void alocaInimigo(){
        for(int i  = 0 ; i < nmrInimigo; i ++){
            jogador.registerObserver(new Inimigo(this.deslocamento));
            
        }
    }
    
    private int nmrInimigo;
    private int deslocamento;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Personagem getJogador() {
        return jogador;
    }

    @Override
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
