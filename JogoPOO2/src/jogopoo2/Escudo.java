package jogopoo2;

public class Escudo extends Handler{

    public Escudo() {
    }

    @Override
    public int handlerRequest(int dano) {
        if(dano<=0){
        return 0;
        }
        else if(super.getHandler() != null)
        return super.getHandler().handlerRequest(dano-5);
        return Math.max(0,dano-5);
        
    }
}

