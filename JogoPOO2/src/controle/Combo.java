package controle;

import java.util.List;
import java.util.ArrayList;

public class Combo implements Command{
    private List<Command> c = new ArrayList<>();
    
    public void addComando(Command c){
       this.c.add(c);
    }

    @Override
    public void execute() {
        for(Command i : c){
           i.execute();
        }
    }
}
