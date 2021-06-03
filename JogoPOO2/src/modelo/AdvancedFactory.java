package modelo;

import java.util.Random;

public class AdvancedFactory extends SimpleFactory{

    private static AdvancedFactory advancedFactory;
    @Override
    public Personagem fabricar() {
        return null;
    }

    @Override
    public Personagem randomFabric() {
        Random random = new Random();
        double N = random.nextDouble();
        if (N <= 0.2) {
            Personagem1 personagem1 = new Personagem1();
            personagem1.addThunder();
            personagem1.addIcepwd();
            return personagem1;
        } else if (N <= 0.4) {
            Personagem2 personagem2 = new Personagem2();
            personagem2.addEscudo();
            personagem2.addFireball();
            return personagem2;
        } else if (N <= 0.6) {
            Personagem3 personagem3 = new Personagem3();
            personagem3.addFireball();
            personagem3.addIcepwd();
            return personagem3;
        } else if (N <= 0.8) {
            Personagem2 personagem2 = new Personagem2();
            personagem2.addFireball();
            personagem2.addThunder();
            return personagem2;
        } else if (N <= 1.0) {
            Personagem3 personagem3 = new Personagem3();
            personagem3.addIcepwd();
            personagem3.addEscudo(7);
            return personagem3;
        }
        return null;
    }

    public static synchronized AdvancedFactory getInstace(){
        if(advancedFactory == null){
            advancedFactory = new AdvancedFactory();
        }
        return advancedFactory;
    }

    private AdvancedFactory() {

    }
}

