package jogopoo2;
public class FactoryMedieval extends AbstractFactory{

    @Override
    public Personagem createPersonagem(int n) {
       return null; // Cabamo AQUI!!! Dia 06/05/21 Tarb 07 Lucas e Victor
    }

    @Override
    public Escudo createEscudo() {
           Escudo Escd = new Escudo();
        return Escd;
    }
    

    @Override
    public Inimigo createInimigo(int n) {
        if(n==0){
            return new Inimigo();
        }
        else if(n==1){
            return new Inimigo1();
        }
        else if(n==2){
            return new Inimigo2();
        }
        else{
            return new Inimigo3();
        }
    }
    
}
