package modelo;

public class EscudoPerso extends Escudo{
    int forca;

    public EscudoPerso(){
        this.forca = 5;
    }
    
    public EscudoPerso(int forca) {
        this.forca = forca;
    }

    @Override
    public int handlerRequest(int dano) {
        if(dano<=0)
            return 0;
        else if(super.getHandler() != null)
            return super.getHandler().handlerRequest(dano-this.forca);
        return Math.max(0,dano-this.forca);
    }
    
    
    
}
