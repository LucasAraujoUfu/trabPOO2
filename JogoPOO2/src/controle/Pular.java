package controle;
import modelo.*;

public class Pular implements Command{

    private Personagem j;

    public Pular(Personagem j) {
        this.j = j;
    }
    
    
    @Override
    public void execute() {
        j.Pular();
    }
    
}
