package jogopoo2;

public interface Subject {
    
    public abstract void registerObserver(Inimigo in);
    public abstract void removeObserver(Inimigo in);
    public abstract void notifyObserver();
 
    
}
