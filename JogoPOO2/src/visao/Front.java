package visao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import controle.*;
import modelo.Fase;
import modelo.Inimigo;
import modelo.Morto;
import modelo.Personagem;
import modelo.Saida;

public class Front extends JPanel {

    private Fase fase;
    private static Controle c;
    private JLabel jl;

    public Front(Fase fase,Combo a,Combo b,Combo d) {
        this.fase = fase;
        KeyListener listener = new MyKeyListener();
        c = new Controle();
        c.setCommand(new MoverEsquerda(fase.getJogador()), 0);
        c.setCommand(new MoverDireita(fase.getJogador()), 1);
        c.setCommand(new MoverCima(fase.getJogador()), 2);
        c.setCommand(new MoverBaixo(fase.getJogador()), 3);
        c.setCommand(new Atacar(fase.getJogador()), 4);
        c.setCommand(new Pular(fase.getJogador()), 5);
        c.setCommand(a, 6);
        c.setCommand(b, 7);
        c.setCommand(d, 8);
        addKeyListener(listener);
        setFocusable(true);
    }

    public class MyKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            Personagem p = fase.getJogador();
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                c.pressionar(0);
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                c.pressionar(1);
            }

            if (e.getKeyCode() == KeyEvent.VK_UP) {
                c.pressionar(2);
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                c.pressionar(3);
            }

            if(e.getKeyCode() == KeyEvent.VK_Z){
                c.pressionar(5);
            }
            
            if(e.getKeyCode() == KeyEvent.VK_X){
                c.pressionar(6);
            }
            
            if(e.getKeyCode() == KeyEvent.VK_C){
                c.pressionar(7);
            }
            
            if(e.getKeyCode() == KeyEvent.VK_V){
                c.pressionar(8);
            }
            
            if (e.getKeyCode() == KeyEvent.VK_2) {
                if (jl.getText().equals("Deseja ir pra qual fase? 1 ou 2")) {
                    fase = fase.getNext().get(1);
                    fase.alocaInimigo();
                    jl.setText("");

                }
            }

            if (e.getKeyCode() == KeyEvent.VK_1) {
                if (jl.getText().equals("Deseja ir pra qual fase? 1 ou 2")) {
                    fase = fase.getNext().get(0);
                    fase.alocaInimigo();
                    jl.setText("");
                }
            }

            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                c.pressionar(4);
                if (p.getInimigo().size() > 0) {
                    for (Inimigo i : p.getInimigo()) {
                        p.Atacar(i);
                        //System.out.println(i.getHealth());
                        if (i.getSttHealth().getClass() == Morto.class) {
                            p.getInimigo().remove(i);
                        }
                    }
                }
            }
            
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Personagem p = fase.getJogador();

        Graphics2D g2d = (Graphics2D) g;

        for (Inimigo i : p.getInimigo()) {
            if (i.getSttHealth().getClass() != Morto.class) {
                g2d.setColor(Color.RED);
                g2d.fillOval(i.getX(), i.getY(), 20, 20);
            }
        }
        if (p.getSttHealth().getClass() != Morto.class) {
            g2d.setColor(Color.BLUE);
            g2d.fillOval(p.getX(), p.getY(), 20, 20);
        }

    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public void jogar(Front game) throws InterruptedException {
        int x = 1024;
        int y = 768;
        JFrame frame = new JFrame("Arena");

        JLabel label = new JLabel();
        this.jl = label;
        label.setBounds(450, 350, 500, 150);

        game.setLayout(null);
        game.add(label);

        frame.add(game);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Fase head = new Salao(1, 8, "Fase 1", new Saida(5, 10, "Fase 2"), new Saida(7, 8, "Fase 3"));
        Personagem p = fase.getJogador();

        while (true) {
            if (p.getInimigo().size() == 0) {
                if (fase.getClass() == Saida.class) {
                    label.setText("GG boy");
                    label.setVisible(true);
                    break;
                }

                label.setText("Deseja ir pra qual fase? 1 ou 2");
            }
     
            if (p.getHealth() == 0) {
                label.setText("Perdeu Playba ");
                label.setVisible(true);
                break;
            }

            p.notifyObserver();
            game.repaint();
            Thread.sleep(50);
        }
    }
}
