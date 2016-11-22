package JavaDesignModel;

/**
 * @author hanshizhe
 * 代理模式.就像人请律师打官司一样。律师是代理人。律师持有人的对象并替人说话。
 */
public class Proxy implements SourcEable{
    SourceObject so = null;
    @Override
    public void method() {
        // TODO Auto-generated method stub
        before();
        so.method();
        after();
    }
    
    public Proxy() {
        super();
        this.so = new SourceObject();
    }
    
    public void before(){
        System.err.println("before");
    }
    
    public void after(){
        System.err.println("after");
    }
    
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.method();
    }
    
}
