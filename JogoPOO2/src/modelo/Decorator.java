package modelo;

public abstract class Decorator implements Component{
private Component cp; 

    Decorator(Component c){
       this.cp = c;
    }

    public Component getCp() {
        return cp;
    }

    public void setCp(Component cp) {
        this.cp = cp;
    }
   
}
