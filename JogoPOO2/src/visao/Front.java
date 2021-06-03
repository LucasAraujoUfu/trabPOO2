package visao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import controle.*;
import modelo.Fase;
import modelo.Inimigo;
import modelo.Morto;
import modelo.Personagem;
import modelo.Saida;

public class Front extends JPanel {

    private Fase fase;
    private static Controle c;

    public Front(Fase fase) {
        this.fase = fase;
        KeyListener listener = new MyKeyListener();
        c = new Controle();
        c.setCommand(new MoverEsquerda(fase.getJogador()),0);
        c.setCommand(new MoverDireita(fase.getJogador()),1);
        c.setCommand(new MoverCima(fase.getJogador()),2);
        c.setCommand(new MoverBaixo(fase.getJogador()),3);
        c.setCommand(new Atacar(fase.getJogador()),4);
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

        label.setBounds(0, 0, x, y);

        game.setLayout(null);
        game.add(label);

        frame.add(game);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Fase head = new Salao(1, 8, "Fase 1", new Saida(5, 10, "Fase 2"), new Saida(7, 8, "Fase 3"));
        Personagem p = fase.getJogador();

        while (true) {
            if(p.getInimigo().size() == 0 ){
                if(fase.getClass() == Saida.class){
                    System.out.println("GG Malandro");
                    break;
                }
                int opc;
                Scanner sc = new Scanner(System.in);
                opc = sc.nextInt();
                fase = fase.getNext().get(opc);
                fase.alocaInimigo();
            }
            
            if(p.getHealth() == 0){
                System.out.println("Perdeu Play ");
                break;
            }
            
            p.notifyObserver();
            game.repaint();
            Thread.sleep(50);
        }
    }
}
