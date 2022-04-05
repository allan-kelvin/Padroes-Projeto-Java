
package one.digitalinnovacion.gof;

/**
 * Singleton "Preguiçoso"
 * @author Allan.Kelvin.Santos
 */
public class SingletonLazy {
    private static SingletonLazy instancia;
    
    private SingletonLazy(){
        super();
    }
    
    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    
}
