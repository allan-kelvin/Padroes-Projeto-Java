
package one.digitalinnovacion.gof;

/**
 * Singleton apressado
 * @author Allan.Kelvin.Santos
 */
public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();
    
    private SingletonEager(){
        super();
    }
    
    public static SingletonEager getInstancia(){
        
        return instancia;
    }
    
}
