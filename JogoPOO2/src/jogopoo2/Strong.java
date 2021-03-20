package jogopoo2;

public class Strong implements IHealth {

    @Override
    public void doBattle(Personagem p) {
     if(p.getHealth() < 70){
        p.setSttHealth(new Mediano());
    }
        else if(p.getHealth() <= 30){
            p.setSttHealth(new Danger());    
}

      else if(p.getHealth() <= 0){
        p.setSttHealth(new Morto()); 
      }
    }
}