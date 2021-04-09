package jogopoo2;

public class JogoPOO2 {

   
    public static void main(String[] args) {
        Personagem[] p = new Personagem[3];
        p[0] = new Personagem1();
        p[1] = new Personagem2();
        p[2] = new Personagem3();
       
        p[0].Atacar(p[1]);
        System.out.println(p[1].getHealth());
        
        p[1].addEscudo();
        p[1].addEscudo();
        
        p[0].Atacar(p[1]);
        System.out.println(p[1].getHealth());
        
        p[1].removeEscudo();
        
        p[0].Atacar(p[1]);
        System.out.println(p[1].getHealth());
        
        p[1].addFireball();
        
        p[1].Atacar(p[0]);
        System.out.println(p[0].getHealth());
        
        p[1].addIcepwd();
        
        p[1].Atacar(p[0]);
        System.out.println(p[0].getHealth());
    }
    
}
