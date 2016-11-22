package JavaDesignModel;

/**
 * @author hanshizhe
 * 装饰者模式.装饰者持有被装饰者的引用。并将被装饰者的方法进行包装
 */
public class DecoratorObject implements SourcEable{
    private SourceObject so = null;
    @Override
    public void method() {
        // TODO Auto-generated method stub
        System.out.println("DecoratorObject method before");
        so.method();
        System.out.println("DecoratorObject method after");
        
    }
    public DecoratorObject(SourceObject so) {
        super();
        this.so = so;
    }
    public static void main(String[] args) {
        SourceObject so = new SourceObject();
        DecoratorObject db = new DecoratorObject(so);
        db.method();
    }

}
