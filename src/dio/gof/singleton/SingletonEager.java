package dio.gof.singleton;

/**
 * Singleton "Apressado"
 * @author Symon Lima
 */

public class SingletonEager {

    private static SingletonEager instancia =  new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
                return instancia;
    }

}
