package jogopoo2;

import java.util.Random;

public abstract class SimpleFactory {

    public abstract Personagem fabricar();

    public Personagem randomFabric() {
        Random random = new Random();
        double N = random.nextDouble();
        SimpleFactory simpleFactory = null;
        if (N <= 0.2) {
            simpleFactory = FabricaP1.getInstace();
        } else if (N <= 0.4) {
            simpleFactory = FabricaP2.getInstace();
        } else if (N <= 0.6) {
            simpleFactory = FabricaP3.getInstace();
        } else if (N <= 0.8) {
            simpleFactory = FabricaP4.getInstace();
        } else {
            simpleFactory = FabricaP5.getInstace();
        }

        return simpleFactory.fabricar();
    }
}
