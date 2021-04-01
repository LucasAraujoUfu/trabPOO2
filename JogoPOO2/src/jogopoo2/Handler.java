package jogopoo2;

public abstract class Handler {
   private Handler handler;
    public abstract int handlerRequest(int dano);

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
   
    
}
