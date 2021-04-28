package jogopoo2;

import java.util.Random;

public abstract class SimpleFactory {

    public abstract Personagem fabricar();
    public Personagem randomFabric(){
        Random random = new Random();
        double N = random.nextDouble();
        SimpleFactory simpleFactory = null;
        if(N<=0.2){
            simpleFactory = new FabricaP1();
        }
        else if(N <= 0.4){
            simpleFactory = new FabricaP2();
        }
        else if(N <=0.6){
            simpleFactory = new FabricaP3();
        }
        else if(N<=0.8){
            simpleFactory = new FabricaP4();
        }
        else {
            simpleFactory = new FabricaP5();
        }

        return simpleFactory.fabricar();
    }
}
