package jogopoo2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Front extends JPanel {

    private Fase fase;

    public Front() {
        KeyListener listener = new MyKeyListener();
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
                p.setX(p.getX() - 10);
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                p.setX(p.getX() + 10);
            }

            if (e.getKeyCode() == KeyEvent.VK_UP) {
                p.setY(p.getY() - 10);
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                p.setY(p.getY() + 10);
            }

            /*if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                p.chuta(bola);
            }*/
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
            g2d.setColor(Color.RED);
            g2d.fillOval(i.getX(), i.getY(), 20, 20);

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
            p.notifyObserver();
            game.repaint();
            Thread.sleep(50);
        }
    }
}
