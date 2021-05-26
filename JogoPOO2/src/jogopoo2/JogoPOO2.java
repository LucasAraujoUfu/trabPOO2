package jogopoo2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JogoPOO2 {

    public static void main(String[] args) {
        /*        Personagem[] p = new Personagem[3];
        p[0] = new Personagem1();
        p[1] = new Personagem2();
        p[2] = new Personagem3();

        ///Testes Ataques
        Npc n = new Inimigo();
        ///Este codigo foi adicionado para garantir que os personagem estejam proximos para atacar o npc
        p[0].setX(0);
        p[1].setX(0);
        p[2].setX(0);
        p[0].setY(0);
        p[1].setY(0);
        p[2].setY(0);
        n.setX(1);
        n.setY(0);

        n.setHealth(100); ///colocar o npc com vida maxima para receber os ataques

        System.out.println("Testes ataques:\n");

        p[0].Atacar(n);
        System.out.println(n.getHealth());
        p[1].Atacar(n);
        System.out.println(n.getHealth());
        p[2].Atacar(n);
        System.out.println(n.getHealth());

        ///testes states
        System.out.println("\nTestes troca de estados:\n");

        p[2].ganharLife(40);
        System.out.println(p[2].getSttHealth().getClass());
        p[2].setHealth(60);
        System.out.println(p[2].getSttHealth().getClass());
        p[2].setHealth(25);
        System.out.println(p[2].getSttHealth().getClass());
        p[2].setHealth(0);
        System.out.println(p[2].getSttHealth().getClass());

        ///Testes Observer;
        System.out.println("\nTestes Observer:\n");

        Inimigo in = new Inimigo();
        p[0].registerObserver(in);
        System.out.println(in.getX() + " " + in.getY());
        p[0].Correr();
        System.out.println(in.getX() + " " + in.getY());
        p[0].Correr();
        System.out.println(in.getX() + " " + in.getY());

        ///Teste Escudos;
        System.out.println("\nTestes Escudos:\n");

        p[0].Atacar(p[1]);
        System.out.println(p[1].getHealth());

        p[1].addEscudo();
        p[1].addEscudo();

        p[0].Atacar(p[1]);
        System.out.println(p[1].getHealth());

        p[1].removeEscudo();

        p[0].Atacar(p[1]);
        System.out.println(p[1].getHealth());

        ///Testes poderes Decorator
        p[0].setX(0);
        p[1].setX(0);
        p[0].setY(0);
        p[1].setY(0);
        p[0].ganharLife(100);

        System.out.println("\nTestes decorator:\n");

        p[1].addFireball();

        p[1].Atacar(p[0]);
        System.out.println(p[0].getHealth());

        p[1].addIcepwd();

        p[1].Atacar(p[0]);
        System.out.println(p[0].getHealth());

        p[1].addThunder();
        p[1].Atacar(p[0]);
        System.out.println(p[0].getHealth());

        Personagem[] boneco = new Personagem[5];
        SimpleFactory sf = FabricaP1.getInstacia();
        boneco[0] = sf.randomFabric();
        boneco[1] = sf.randomFabric();
        boneco[2] = sf.randomFabric();
        boneco[3] = sf.randomFabric();
        boneco[4] = sf.randomFabric();
    
        for (int i = 0; i < 5; i++) {
            System.out.println(boneco[i].getClass() + " " + boneco[i].getAtaque().getClass());
        }
        Personagem guerreiro = FactoryMedieval.getInstancia().createPersonagem();
        Personagem robo = FactoryFuturista.getInstancia().createPersonagem();
        System.out.println(guerreiro.getClass());
        System.out.println(robo.getClass());*/
        Front f = new Front();
        Personagem p = FactoryMedieval.getInstancia().createPersonagem();
        p.addFireball();p.addThunder();p.addIcepwd();
        Fase head = new Saida(p,3, 8, "Fase 1");
        //Fase head = new Salao(p,1, 8, "Fase 1", new Saida(p,5, 10, "Fase 2"), new Saida(p,7, 8, "Fase 3"));
        f.setFase(head);
        try {
            f.jogar(f);
        } catch (InterruptedException ex) {
            Logger.getLogger(JogoPOO2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
