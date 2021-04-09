package jogopoo2;

public abstract class Decorator implements Component{
private Component cp; 

    public Component getCp() {
        return cp;
    }

    public void setCp(Component cp) {
        this.cp = cp;
    }
   
}
