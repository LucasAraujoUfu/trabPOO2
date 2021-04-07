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
   
    public void addHandler(Handler h){
        if(this.handler==null) this.handler = h;
        else this.handler.addHandler(h);
    }
    
    public Handler removeFirstHandler(){
        if(this.handler==null)return null;
        else return this.handler;
    }
}
