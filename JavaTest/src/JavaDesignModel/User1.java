package JavaDesignModel;
/**
 * @author hanshizhe
 * 中介者模式
 */
public class User1 extends AbstracteUser{
    public User1(Mediator mMediator) {
        super(mMediator);
    }
    
    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("user1 work");
    }

}
