package JavaDesignModel;

public class MySubject extends AbstractMySubject{

    @Override
    public void operation(Observer ob) {
        // TODO Auto-generated method stub
        notifyObserver();
    }
    
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1("hanshizhe");
        Observer1 observer2 = new Observer1("chendandan");
        MySubject mysub = new MySubject();
        mysub.addObserver(observer1);
        mysub.addObserver(observer2);
        mysub.notifyObserver();
    }

}
