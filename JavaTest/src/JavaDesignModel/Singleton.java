package JavaDesignModel;

/**
 * @author hanshizhe
 * 单例模式
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        super();
        // TODO Auto-generated constructor stub
    }

    private synchronized static Singleton syncInit() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

}
