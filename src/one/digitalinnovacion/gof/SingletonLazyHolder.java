
package one.digitalinnovacion.gof;

/**
 * Singleton apressado
 * @author Allan.Kelvin.Santos
 */
public class SingletonLazyHolder {
    
    private static class InstanceHolder{
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    
    public static SingletonLazyHolder getInstancia(){
        
        return InstanceHolder.instancia;
    }
    
}
