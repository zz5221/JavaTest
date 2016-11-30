package JavaDesignModel;

/**
 * @author hanshizhe
 * 中介者模式
 */
public class MyMediator implements Mediator{
    AbstracteUser user1,user2;
    @Override
    public void creatMediator() {
        // TODO Auto-generated method stub
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        // TODO Auto-generated method stub
        user1.work();
        user2.work();
    }
    public static void main(String[] args) {
        MyMediator myMediator = new MyMediator();
        myMediator.creatMediator();
        myMediator.workAll();
    }
}
